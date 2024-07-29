package com.java.singlelist;

public class LinkedList<T> {
    private Node<T> head;

    public void push(T value) {

        if(this.head == null) {
            this.head = new Node();
            this.head.setData(value);
        } else {
            Node<T> newNode = new Node<>();
            newNode.setData(value);
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void traverse() {
        Node<T> currentNode = this.head;

        while(currentNode != null) {
            System.out.print(currentNode.getData()+"->");
            currentNode = currentNode.getNext();
        }
    }

    public void delete(T value) {
        if(this.head != null) {

            Node<T> currentNode = this.head;
            Node<T> prevNode = this.head;

            while(currentNode != null) {
                if(currentNode.getData() == value) {
                    prevNode.setNext(currentNode.getNext());
                    System.out.println("Data deleted successfully::"+value);
                    this.head = prevNode;
                    break;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.getNext();
                }
            }
        }
    }

    public void addToTail(T value) {

        if(this.head == null) {
            this.head = new Node<T>();
            this.head.setData(value);
        } else {
            Node<T> lastNode = this.head;
            while(lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            Node<T> newNode = new Node<>();
            newNode.setData(value);
            lastNode.setNext(newNode);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(10);
        linkedList.push(11);
        linkedList.push(12);
        linkedList.push(13);
        linkedList.push(14);

        System.out.println("Traversing linked list");
        linkedList.traverse();
        System.out.println("After deleting the data from linked list");
        linkedList.delete(13);
        linkedList.traverse();
        System.out.println("Add data to tail.");
        linkedList.addToTail(22);
        linkedList.traverse();
    }

}
