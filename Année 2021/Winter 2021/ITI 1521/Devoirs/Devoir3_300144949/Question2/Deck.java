package com.Devoir_3_ITI_1521;

/**  Deck represents a deck of playing cards and contains 52 regular cards*/

public class Deck {
    private Card[] deck;  //an array of 52 cards.
    private int number;   //the number of cards that have been dealt from the desk

/** Constructs a regular 52-card poker deck.
     * Initially, the cardsare in a sorted order.*/

    public Deck() {
        deck = new Card[52];
        number = 0;
        for (int value = 1; value< 14; value++){
            for (int color=0; color<4; color++){
                deck[value+13*color-1] = new Card(value,color);
            }
        }
    }

/** Put all the used cards back into the deck (if any),
     * andshuffle the deck into a random order. */

    public void shuffle() {
        number = 0;
        for (int i = 0; i < 52; i++) {
            int ordre = (int)(Math.random()*52);
            Card temp = deck[i];
            deck[i] = deck[ordre];
            deck[ordre] = temp;
        }
    }

/** Returns the number of cards left in the deck. */

    public int numberLeft() {
        return 52 - number;
    }

/** Removes the next card from the deck and return it.
     * It is illegal to call this method if there are no*more cards in the deck.
     * You can check the number of cards remaining by calling the numberLeft() *
     * function.
     * * @return the card which is removed from the deck.*
     * @throws IllegalStateException if there are no cards left in the deck*/

    public Card take() {
        if (number > 51){
            throw new IllegalArgumentException(" nombre out of range");
        }
        Card temp = deck[number];
        number++;
        return temp;
    }

}
