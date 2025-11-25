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

    public void merge(ListNode other){
        Node node = head.next;
        Node nodeNext = other.head.next;

        while(nodeNext != other.head){
            if (node == head){
             node.next = new Node(nodeNext.value, node, node.next);
             node = node.next;
             node.next.prev = node;
             nodeNext = nodeNext.next;
            }
            else if (nodeNext.value.compareTo(node.value) > 0){
                //insert before
                node.prev = new Node(nodeNext.value, node.prev, node);
                node.prev.prev.next = node.prev;
                nodeNext = nodeNext.next;
            }
            else if (node.next == head){
                //insert after
                node.next = new Node(nodeNext.value, node, head);
                node = node.next;
                node.next.prev = node;
                nodeNext = nodeNext.next;
            }
            else{
                node = node.next;
            }
        }
    }
}
