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
        if (pos < 0){
        throw new IndexOutOfBoundsException(Integer.toString(pos)+"error!");
        }
        Node current = head.next;
        for (int i = 0; i < pos; i++) {
            if (current.next == head){
                throw new IndexOutOfBoundsException(Integer.toString(pos));
            }
            current = current.next;
        }
        return current.value;
    }
    public boolean add(Comparable obj) {
        //boolean res;
        if ((obj == null)/* || (head==null)*/) {
            throw new UnsupportedOperationException("error!");
        }
        Node bef = head;
        while(bef.next != head && bef.next.value.compareTo(obj) > 0){
            bef = bef.next;
        }

        Node apr = bef.next;

        bef.next = new Node (obj, bef, apr);
        apr.prev = bef.next;

        return true;
    }
    public void remove(int pos){
        if (pos < 0) {
            throw new UnsupportedOperationException("error!");
        }

        Node bef = head;
        for (int i = 0; i < pos; i++) {
            if (bef.next == head){
                throw new IndexOutOfBoundsException(Integer.toString(pos));
            }
            bef = bef.next;
        }
        Node apr = bef.next.next;

        bef.next = apr;

        apr.prev = bef;
    }
}
