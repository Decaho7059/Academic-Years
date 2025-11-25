package com.Q4;

public class Test {
	public static void main( String[] args ) {

        PostalCode[] codes = new PostalCode[100];
        int count=0, n=10;

        codes[ 0 ] = new CanadaCode( "K1N 6N5" );
        codes[ 1 ] = new CanadaCode( "95014" );
        codes[ 2 ] = new CanadaCode( "N1N6N5" );
        codes[ 3 ] = new CanadaCode( "M1N N65" );
        codes[ 4 ] = new CanadaCode( "S1N 6N55" );

        codes[ 5 ] = new USCode( "US 45647" );
        codes[ 6 ] = new USCode( "014" );
        codes[ 7 ] = new USCode( "95014 CA" );
        codes[ 8 ] = new USCode( "US 4714" );
        codes[ 9 ] = new USCode( "US 4-48-4" );

        for ( int i=0; i<n; i++ ) {
            if ( codes[ i ].isValid() ) {
                count++;
            }
        }

        System.out.println( count + " codes sont valides");
    }
}