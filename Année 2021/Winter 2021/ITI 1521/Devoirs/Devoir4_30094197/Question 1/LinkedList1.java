package com.Devoir_4_ITI_1521;

public class LinkedList1 {
    /**
     * The nested class Node
     */
    private static class Node{
        String value;
        Node next;
    }
    //Instance
    /**
     * A pointer to the first node in the linked list.
     * if the list is empty. the value is null
     */
    private Node head;

    //Instance variable
    /**
     * Searches the list for a specified item
     * @param obj the item tht is to be searched for
     * @return true if obj is one of the items in the list or false if not
     */
    public boolean find(String obj){
        Node p;   // A pointer for travelling the list
        p = head; // Start by looking at the head of the listà

        while (p != null){
            if (p.value.equals(obj)){
                return true;
            }
           p = p.next;
        }
        return false;
    }
    /**
     * Remove a specified item(obj)from the list, if that item is present.
     */
    public boolean remove(String obj) {
        boolean result = true;
        if ( head == null ) {
            //The list is empty.
            throw new NullPointerException("List vide");

        }
        else if ( head.value.equals(obj) ) {
            // obj is the first item of the list.
            //head.value = null;
            head = head.next;
        }
        else{
            Node current = head;
            while(current.next != null && !current.next.value.equals(obj)){
                current = current.next;
            }
            if (current.next == null){
                result = false;
            }
            else {
                current.next = current.next.next;
            }
            return result;
        }
        return (String.valueOf(head.value) == obj);
    }
    /***
     * Add a specified item (obj ) to the list, keeping the list in order.
     */
    public void add(String obj) {
        Node newNode;          // A Node to contain the new item.
        newNode = new Node();
        newNode.value = obj;  // newNode.next is null.

        if( head == null ) {
            // The new item is the first (and only) one in the list.
            head=newNode;

        }
        else if ( head.value.compareTo(obj) > 0 ) {
            // The new item is less than the first item in the list,
            // sot has to be inserted at the head of the list.
            Node current = head;
            head = newNode;
            head.next = newNode.next;
            newNode.next= current;
        }
        else{
            Node previous = head;
            Node current = head;
            while (current != null && current.value.compareTo(newNode.value) <= 0){
                previous = current;
                current = current.next;
            }
            newNode.next = previous.next;
            previous.next = newNode;
            current = newNode;
        }
    }
    // end of add()
    /***
     * Returns an array that contains all the elements in the list.*
     * If the list is empty, the return value is an array of length zero.
     */
    public String[] getList() {
        int count;          // For counting elements in the list.
        Node p;   // For traversing the list.
        String[] elements;  // An array to hold the list elements.

        // First, go through the list and count the number
        // of elements that it contains.
        count = 0;
        p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        // Create an array just large enough to hold all the
        // list elements.  Go through the list again and
        // fill the array with elements from the list.
        elements = new String[count];
        Node as=head;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = as.value;
            as=as.next;
        }
        return elements;
    }

}