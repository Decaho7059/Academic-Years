package com.Labo_8_ITI_1521;

/**
 * Teste les m�thodes size et add
 */

class Test2 {
    public static void main( String[] args ) {

    ListNode node = new ListNode();
    if ( node.size() != 0 )
     System.out.println( "List not empty " );
    for ( int i=1; i<=10; i++ ) { // add 
     node.add( new Integer( i ) );

     if ( node.size() == i )
    System.out.println( "size =" + i );
     
 }

 System.out.println( "tested!" );
    }
}
