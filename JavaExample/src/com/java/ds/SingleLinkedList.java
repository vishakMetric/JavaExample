package com.java.ds;

public class SingleLinkedList {

    private int data;

    private SingleLinkedList next;

    public SingleLinkedList() {}
    public  SingleLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    private SingleLinkedList head; // List that has the details of the header.

    public SingleLinkedList insert(int data) {
        System.out.println(head == null);
        if(head == null) {
            head = new SingleLinkedList(data);
            System.out.println(head.data);
            return head;
        }
        SingleLinkedList insertNode = new SingleLinkedList(data);
        while(head.next == null) {
            System.out.println(insertNode.data);
            head.next = insertNode;
        }
        return head;
    }

    public void printData() {

        while(head.next != null) {
            System.out.println(head.data+"->");
        }

    }

    public static void main(String[]args) {

        SingleLinkedList list = new SingleLinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
       // list.printData();

    }
}

//class Node {
//     int data;
//     Node next;
//
//    Node(int data) { this.data = data; next = null; }
//}
