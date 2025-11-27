#include <iostream>
#include <string.h>
#include <vector>
#include <fstream>
#include <sstream>
#include <ctime>
#include "Card.h"
#include "Deck.h"
#include "CardFactory.h"
#include "DiscardPile.h"
#include "Hand.h"
#include "Chain.h"
#include "Player.h"
#include "Table.h"
#include "TradeArea.h"

using namespace std;

int main() {
    cout << "-------------------------------------------" << endl;
    cout << "(FALL2023) - CSI2772 -  Project (Card Game)" << endl;
    cout << " > Student name : Gbegbe Decaho " << endl;
    cout << " > Student number: 300094197 " << endl;
    cout << "-------------------------------------------" << endl << endl;

    string p1_name;
    string p2_name;
    string winner_name;

    const int MAX_NUM_PLAYER = 2;
    Player* player1 = nullptr;
    Player* player2 = nullptr;
    Player** pArr = new Player * [MAX_NUM_PLAYER];
    DiscardPile* dp = new DiscardPile;
    CardFactory* cf = CardFactory::getFactory();
    Deck* deck = nullptr;
    TradeArea* trAr = new TradeArea;
    Table* tb = nullptr;

    char user_input[2];
    bool savedGame;

    cout << "Do you want to reload a previous game?(y/n)" << endl;
    cin >> user_input;
    cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n'); 


    if (user_input[0] == 'y') {
        tb->reloadDeck();
        deck = tb->getDeck();

        tb->reloadPlayer(1);
        tb->reloadPlayer(2);

        player1 = tb->getPlayer(1);
        player2 = tb->getPlayer(2);

        tb->reloadDiscardPile();
        dp = tb->getDiscardPile();

        tb->reloadTradeArea();
        trAr = tb->getTradeArea();
    }
    else {
        cout << endl << "Enter the name of the first player : ";
        getline(cin, p1_name);
        cout << endl << "Enter the name of the second player : ";
        getline(cin, p2_name);

        player1 = new Player(p1_name);
        player2 = new Player(p2_name);

        pArr[0] = player1;
        pArr[1] = player2;

        tb = new Table(*player1, *player2, *dp, *trAr, *deck, *cf);

        deck = tb->getDeck();
        dp = tb->getDiscardPile();
        trAr = tb->getTradeArea();

        cout << "Player 1 is : " << p1_name << endl;
        cout << "Player 2 is : " << p2_name << endl;
        

        cout << "Initializing  each player with 5 cards. " << endl;
        cout << "Current size of the deck : " << deck->size() << endl;

        for (int player = 0; player < MAX_NUM_PLAYER; player++) {
            for (int card = 0; card < 5; card++) {
                pArr[player]->takeCard(deck->draw());
            }
        }
    }

    while (deck->size() != 0) {
        cout << "Number of card left in Deck : " << deck->size() << endl;
        cout << endl << ">>>>>>>>>>> Do you want to pause and save the game ? (y/n)" << endl;
        cin >> user_input;

        if (user_input[0] == 'y') {
            tb->saveTable();
            cout << "Game saved. Bye." << endl;
            break;
        }
        else {
            for (int i = 0; i < MAX_NUM_PLAYER; i++) {
                cout << endl << ">>>> Table information: <<<<" << endl << endl << *tb << endl;
                cout << endl;
                cout << ">>>> Player " << i + 1 << " turn. " << endl;
                cout << endl;

                Player* p = tb->getPlayer(i);

                cout << "> Drawing top card from deck..." << endl;
                p->takeCard(deck->draw());

                cout << endl << "> Player " << i + 1 << " Hand: " << endl;
                p->printHand(cout, true);
                cout << endl;

                if (trAr->numCards() > 0) {
                    bool cardAdded = false;

                    for (Card* card : trAr->getListOfCards()) {
                        for (Chain_Base* chain : *(p->getChains())) {
                            if (card->getName() == chain->getChainType()) {
                                *chain += trAr->trade(card->getName());
                                cardAdded = true;
                            }
                        }

                        if (!cardAdded) {
                            cout << "> Card : ";
                            card->print(cout);
                            cout << " added to the discard pile " << endl;
                            *dp += trAr->trade(card->getName());
                        }
                    }
                }

                cout << endl << "> Playing topmost card from Hand (" << p->getHand()->top()->getName()[0] << ")" << endl;
                p->playCard();

                cout << endl << *p << endl;

                cout << endl << "> Player " << i + 1 << " Hand: " << endl;
                p->printHand(cout, true);
                cout << endl;

                cout << endl << "> Play top most card ? (y) or Discard card to Discard Pile? (n) " << endl;
                cin >> user_input;

                if (user_input[0] == 'y') {
                    cout << "> Playing topmost card from Hand (" << p->getHand()->top()->getName()[0] << ")" << endl;
                    p->playCard();

                    cout << endl << *p << endl;

                    cout << endl << "> Player " << i + 1 << " Hand: " << endl;
                    p->printHand(cout, true);
                    cout << endl;
                }
                else {
                    int idx;
                    Card* card = nullptr;

                    cout << endl << "> Player " << i + 1 << " Hand: " << endl;
                    p->printHand(cout, true);

                    cout << "Current size of the hand : " << p->getNumCards() << endl;
                    cout << "Enter the index of the card you would like to remove : " << endl;
                    cin >> idx;

                    card = p->removeCard(idx);

                    while (card == nullptr) {
                        cout << "Current size of the hand : " << p->getNumCards() << endl;
                        cout << "Enter the index of the card you would like to remove : " << endl;
                        cin >> idx;

                        card = p->removeCard(idx);
                    }

                    cout << "> Card : ";
                    card->print(cout);
                    cout << " added to the discard pile " << endl;
                    *dp += card;
                }

                cout << endl << "> Drawing three cards from the deck to the trade area. " << endl << endl;

                for (int drw = 0; drw < 3; drw++) {
                    *trAr += (deck->draw());
                }

                cout << "> Trade Area : " << *trAr << endl;

                if (dp->size() > 0) {
                    while (trAr->legal(dp->top())) {
                        *trAr += (dp->pickUp());
                    }
                }

                cout << endl;

                for (Card* card : trAr->getListOfCards()) {
                    cout << endl << "> Do you want to chain the card [";
                    card->print(cout);
                    cout << "]? (y/n) " << endl;
                    cin >> user_input;

                    if (user_input[0] == 'y') {
                        p->playCard(trAr->trade(card->getName()), true);

                        cout << endl << *p << endl;

                        cout << endl << "> Player " << i + 1 << " Hand: " << endl;
                        p->printHand(cout, true);
                        cout << endl;
                    }
                    else {
                        cout << endl << "> card left in the trade area." << endl;
                    }
                }

                for (int i = 0; i < 2; i++) {
                    if (deck->size() > 0)
                        p->takeCard(deck->draw());
                }

                cout << endl << "> Player " << i + 1 << " Hand: " << endl;
                p->printHand(cout, true);
                cout << endl;

                cout << endl << "> Discard Pile all cards : ";
                dp->print(cout);
                cout << endl;
            }
        }
    }

    if (deck->size() == 0) {
        cout << endl << ">>>> Table information: <<<<" << endl << endl << *tb << endl;
        cout << "> No card left in deck. Deck size = " << deck->size() << endl;
        tb->win(winner_name);
        cout << endl << "> The winner is : " << winner_name << endl;
    }

    return 0;
}

