public class Test4 {

    public static void main( String[] args ) {

 LinkedList<String> list1;
 list1 = new LinkedList<String>( );

 list1.addLast( "A" );
 list1.addLast( "B" );
 list1.addLast( "C" );
 list1.addLast( "D" );
 list1.addLast( "E" );

 System.out.println( "list1 is : " +list1 );
 
 LinkedList<String> list2;
 list2 = new LinkedList<String>( );

 list2=list1.remove(2, 3);
 System.out.println( "list1 is now: " +list1 );

 System.out.println();

 list1.addFirst( "F" );
 list1.addFirst( "G" );
 list1.addFirst( "H" );
 list1.addFirst( "I" );


  System.out.println( "list1 is now: " +list1 );
  System.out.println( "list2 is : " +list2 );

    }
}

