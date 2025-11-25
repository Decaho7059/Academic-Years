/**
 * Queue Abstract Data Type. 
 *
 */

public interface Queue<E> {

 /**
  * Tests if this Queue is empty.
  *
  * @return true if this Queue is empty; and false otherwise.
  */

 boolean isEmpty();

 /**
  * Removes and returns the front element of the Queue.
  *
  * @return the front element of the Queue.
  */

 E dequeue();

 /**
  * Puts an element at the rear of this Queue.
  *
  * @param the element to be put at the rear of this Queue.
  */

 void enqueue( E element );

}
