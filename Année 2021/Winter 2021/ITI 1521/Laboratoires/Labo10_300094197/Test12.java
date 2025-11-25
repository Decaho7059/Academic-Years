public class Test1 {

    public static void main( String[] args ) {

        IterList list1 = new IterList( );
        
        list1.addFirst( 1 );
        list1.addFirst( 0 );
        list1.addFirst( 1 );
        list1.addFirst( 0 );
        list1.addFirst( 1 );
        list1.addFirst( 1 );
        list1.addFirst( 1 );

        System.out.println( "list1 is " + list1 );

        IterList list2 = new IterList( "1010111" );

        System.out.println( "list2 is " + list2 );

    }
}
