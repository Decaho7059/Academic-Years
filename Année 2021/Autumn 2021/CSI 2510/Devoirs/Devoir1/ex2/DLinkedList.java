/**
 *  Class doubly linked list.
 *  @author Jeff Souza
 */
class DLinkedList {

	// First node of the list.
	ListNode firstNode;

	// Last node of the list.
	ListNode lastNode;

	/**
	 * Appends a node to the end of the list.
	 * @param ListNode nNode Node to append.
	 */
	void AppendNode( ListNode nNode ) {
		InsertNode ( nNode, lastNode );
	} /* AppendNode */


	/**
	 * Inserts a node into the list after pAfter node.
	 * @param ListNode nNode  Node to insert.
	 * @param ListNode pAfter Node after which the insertion is done.
	 */
	void InsertNode( ListNode nNode, ListNode pAfter ) {

		// INSERT YOUR CODE HERE

	} /* InsertNode */


	/**
	 * Removes the specified node from the list.
	 * @param ListNode nNode Node to remove.
	 */
	void RemoveNode( ListNode nNode ) {

		// INSERT YOUR CODE HERE

	} /* RemoveNode */


	/**
	 * Prints the content of the list.
	 */
	void print() {
		ListNode    nNode = null;

		System.out.print ( "Current list: " );

		for( nNode = firstNode; nNode != null; nNode = nNode.next ) {
			System.out.print ( nNode.data + " " );
		}
		System.out.println ( "" );
	} /* print */


}
