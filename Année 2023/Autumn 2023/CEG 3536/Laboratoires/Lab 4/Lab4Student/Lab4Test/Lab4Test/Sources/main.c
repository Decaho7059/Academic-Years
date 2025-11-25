/*----------------------------------------------
File: Lab4Prog1.c
Description:  Simple program to test out modules.
--------------------------------------------------*/
#include <mc9s12dg256.h>
/* Notes on mc9s12dg256.h:
   1) the type "byte" is defined as "unsigned char"
*/
#include <stdtypes.h>
#include <ctype.h>
#include <stdio.h>
#include "main_asm.h"
#include "keyPad_asm.h"
#include "SegDisp.h"
#include "lcdDisp.h"
#include "delay.h"
#include "siren.h"

// Prototypes
void doDownCount(void); 
void displayNum(int); 


/*----------------------------------------------------
Main program
 Local Variables: 
   ch character returned by readKeyPoll
   displayNum - the display number
Description:
  Program that reads a key presses from the keypad
  and displays the corresponding characters on the
  7 segment displays.
  Uses the Keypad Module and the Segment 
  Display Module
  (will also require the Delay Module);
  Displays on the LCD messages.
  Use following characters to turn on/off features:
  * - turn on the siren
  # - turn off the siren
  9 - perform a downcount on the displays
---------------------------------------------------*/
void main()
{
   byte displayNum=0; // 7-segement number
   byte ch;
   char line2[16];  // for second line on LCD display
   
   PLL_init();        // set system clock frequency to 24 MHz
   initKeyPad();
   initDisp();
         // Setup the timer
   TSCR1 = 0b10010000;  // Enable the timer and enable fast clear
   TSCR2 = 0b00000101;  // Setup prescaler to 32, for 1 1/3 micro-sec. tick
   initSiren();
   initDelay();
   asm cli;     // Allow interrupts for control during debugging
   initLCD();   // need to initialise with interrupts running
                // since delay module is used.

   printLCDStr("Test Lab4 Mods",0);
   for(;;)
   {
      ch = pollReadKey();
      if(ch != NOKEY)
      {
         // On the LCD
         sprintf(line2,"Key: %c, Disp: %d",ch,displayNum);
         printLCDStr(line2,1);
         // On the 7-segment display
         if(displayNum == 0) clearDisp();  // Clear the display
         setCharDisplay(ch, displayNum);
         displayNum = ((byte)(displayNum+1))%4;
         // Turn on/turn off siren
         if(ch == (byte)'*') turnOnSiren();
         if(ch == (byte)'#') turnOffSiren();
         if(ch == (byte)'9') doDownCount();
      }
   }
}

void doDownCount() 
{
   volatile int delayCount;

   clearDisp();
   printLCDStr("Testing Counter",1);
   setCounter(&delayCount);
   delayCount = 10000;  //10sec delay
   while(delayCount)  // loop if delayCount not zero
   {
        // Update Display
        if(delayCount%1000 == 0) // every 1000 ms (1 sec)   
           displayNum(delayCount/1000);
        delayms(1);
    }
    setCounter(NULL);
    clearDisp();  
}

void displayNum(int num) 
{
   char dig1, dig2, ch;
   if(num > 99) return; // display nothing if number not valid
   dig2 = num%10;   // units
   dig1 = num/10;   // tens
   ch = 0x30+dig1;
   if(dig1 == 0) setCharDisplay(' ',2);
   else setCharDisplay(ch,2);
   ch = 0x30+dig2; 
   setCharDisplay(ch,3);  
}
