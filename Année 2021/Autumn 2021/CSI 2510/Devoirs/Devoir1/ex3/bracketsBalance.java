/*  CSI2114 Lab 3 - lab3.java
 *
 *  Class to check balanced brackets in math expressions
 *
 *  Usage: java bracketsBalance <exp>
 *
 *  by Jeff Souza
 *
 */

class bracketsBalance {

	private boolean bBalance( String exp ) {

		// INSERT YOUR CODE HERE

		 final String ouvert = "(";
		 final String fermer = ")";

		 Stack NStack = new ArrayStack();

		for (char i = 0; i < exp.length(); i++) {
			if (ouvert.indexOf(i) != -1){
				NStack.push(i);
			}
			if (fermer.indexOf(i) != -1){
				if (NStack.isEmpty()==true){
					return false;
				}
			}
			if (fermer.indexOf(i) != ouvert.indexOf((char) NStack.pop())){
				return false;
			}
		}
		return NStack.isEmpty();

	} /* bBalance */


	public static void main( String [] args ) {

		bracketsBalance    b      = new bracketsBalance();
		boolean            result = b.bBalance ( args [ 0 ] );

		if( result ) System.out.println ( "The expression is balanced." );
		else System.out.println ( "The expression is NOT balanced." );
	} /* main */


}
