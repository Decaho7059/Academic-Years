package com.Labo_8_ITI_1521;

import org.w3c.dom.Node;

public class ListNode implements InterfaceNode{
    //Implementation of the doubly linked nodes (nested-class)
    private static class Node{
        private Comparable value;
        private Node prev; // precedent
        private Node next; // suivant

        private Node (Comparable value, Node prev, Node next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
    //Instance variables
    private Node head;

    //Constructor: Empty list
    public ListNode(){
        //a dummy node is created
        head = new Node(null, null, null);
        head.next = head;
        head.prev = head;
    }

    //Instance methods
    public int size(){
        int count = 0;
        Node current = head.next;
        while(current != head){
            count++;
            current = current.next;
        }
        return count;
    }
    public Object get(int pos){
        throw new UnsupportedOperationException("error!");
    }
    public boolean add(Comparable obj){
        throw new UnsupportedOperationException("error!");
    }
    public void remove(int pos){
        throw new UnsupportedOperationException("error!");
    }
}
