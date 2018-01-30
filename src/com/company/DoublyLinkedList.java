package com.company;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length=0;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }
    public void push(int data){
        Node n= new Node(data);
        if(isEmpty()) {
            tail=n;
            head=n;
        }
        else {
            head.prev = n;
            n.next=head;
            head=n;
        }
        length++;

    }

    public void insertAtEnd(int data){
        Node n= new Node(data);
        if(isEmpty()) {
            tail=n;
            head=n;
        }
        else {
            tail.next= n;
            n.next=null;
            n.prev=tail;
            tail=n;
        }
        length++;
    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.getData());
            n=n.getNext();
        }
    }

    public void deleteHead(){
        Node n =head;
        head=n.getNext();
        head.setPrev(null);
        System.out.println("list is now:");
        printList();
        length--;

    }
    public void deleteTail(){
        Node n= tail;
        n.getPrev().setNext(null);
        length--;

    }
    public void printReverse(){
        Node n=tail;
        while (n!=null){
            System.out.println(n.getData());
            n=n.getPrev();
        }
    }
}
