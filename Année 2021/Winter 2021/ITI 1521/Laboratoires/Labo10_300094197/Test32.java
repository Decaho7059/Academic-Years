public class Test3 {

    public static void main( String[] args ) {

 CircularQueue<String> maFile;
 maFile = new CircularQueue<String>( 7 );

 maFile.enqueue( "A" );
 maFile.enqueue( "B" );
 maFile.enqueue( "C" );
 maFile.enqueue( "D" );
 

 System.out.println( maFile );

 Iterator<String> i;
 i = maFile.iterator();

 while (i.hasNext()) {
     System.out.print( i.next() );
     if ( i.hasNext() ) {
  System.out.print( ", " );
     }
 }
 System.out.println();

 i = maFile.iterator();

 while (i.hasNext()) {
     System.out.print( i.next() );
     if ( i.hasNext() ) {
  System.out.print( ", " );
     }
 }
 System.out.println();


 maFile.dequeue();
 maFile.dequeue();
 maFile.dequeue();

 maFile.enqueue( "E" );
 maFile.enqueue( "F" );
 maFile.enqueue( "G" );
 

 System.out.println( maFile );

 i = maFile.iterator();

 while (i.hasNext()) {
     System.out.print( i.next() );
     if ( i.hasNext() ) {
  System.out.print( ", " );
     }
 }
 System.out.println();

 i =maFile.iterator();

 while (i.hasNext()) {
     System.out.print( i.next() );
     if ( i.hasNext() ) {
  System.out.print( ", " );
     }
 }
 System.out.println();

    }
}

