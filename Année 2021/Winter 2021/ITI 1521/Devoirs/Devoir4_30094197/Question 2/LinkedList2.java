package com.Devoir_4_ITI_1521;


public class LinkedList2 {
    /***
     * Objects of type Node are linked together into linked lists.
     */
    private static class Node {
        int value;        // value of an item in the list.
        Node next;      // Pointer to the next node in the list.
    }

    /***
     * Return a new list containing the same items as the list,
     * but in the reverse order.
     */
    static Node reverse(Node obj) {
        Node reverse = null;     // reverse will be the reversed lis
        Node p = obj;      // For traversing the list.
        Node next = null;
        while (p != null) {
            // Push the next node of list onto the front of reverse.
            next = p.next;
            p.next = reverse;
            reverse = p;
            p = next;
            //p = reverse;

        }
        obj = reverse;
        reverse = obj;
        return reverse;
    }
    // end reverse()

    /***
     * Displays the items in the list to which the parameter, first, points.
     * They are printed on one line, separated by spaces
     */
    static void display (Node first){
        Node p;  // For traversing the list.
        p = first;
        String List = new String();
        while(p != null){
            List += String.valueOf(p.value + " ");
            p = p.next;
        }
        //p = p.next;
        System.out.println(List + " ");

    } // end of display()

    /***
     * Return the number of zeros that occur in a given linked list of int.
     */
    static int count (Node head ){
        int count = 0;
        while(head != null){
            if (head.value == 0){
                count ++;
            }
            head = head.next;
        }
        return count;
    }// end of count()
    /***
     *Return the number of zeros that occur in a given linked list of int.Uses recursion
     */
    static int countRecursive (Node head ){
        int sum = 0;
        if (head == null) {
            return sum;
        }
        //int sum = countRecursive(head.next);
        if (head.value == 0){
            sum++;
        }
        return countRecursive(head.next);

    } // end countRecursive()

    public static void main(String[] args) {

        Node list = null; // A list, initially empty
        Node reverseList; // The reversed list

        int count = 0; //The number of elements in the list

        while(true){
            //add a new node onto the head of the list before repeating
            count++;
            if (count == 10){
                break;
            }
            Node head = new Node();  //A new node to add to the list
            head.value = (int)(Math.random()*100); // A random value
            head.next = list;
            list = head;
        }
        // Print the current list ;its reverseandthe number of zeros in the listusing both methods
        System.out.print("The list: ");
        display(list);
        System.out.println();
        reverseList = reverse(list);
        System.out.print("The reversed list: ");
        display(reverseList);
        System.out.println();
        System.out.println();
        System.out.print("The number of zeros in the list : ");
        System.out.println(count(list));
        System.out.print("The number of zeros in the list, using recursion: ");
        System.out.println(countRecursive(list));
    }
}
