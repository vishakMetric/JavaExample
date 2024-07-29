package com.java.ds;

public class LinkedList {

    public Node head;
    public Node tail;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    public void display() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data+ "-> ");
            currentNode = currentNode.next;
        }
    }

    public int findElement(int data) {
        Node currentNode = head;
        int index = 0;
        while(currentNode != null) {
            if(currentNode.data == data) {
                return index;
            } else {
                index = index + 1;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void set(int index, int data) {
        Node currentNode = head;
        Node insertNode = new Node(data);
        int listIndex = 1;
        while(currentNode != null) {
            if(index == 0) {
                head = insertNode;
                head.next = currentNode;
                break;
            } else {
                if(listIndex == index) {
                    currentNode.data = insertNode.data;
                }
                listIndex = listIndex + 1;
                currentNode = currentNode.next;
            }
        }
    }

    public int getSize() {
        Node currentNode = head;
        int size = 0;
        while(currentNode != null) {
            size = (size + 1);
            currentNode = currentNode.next;
        }
        return size;
    }

    public int get(int index) {
        Node currentNode = head;
        int i = 0;
        while(currentNode != null) {
            if(i == index) {
                return currentNode.data;
            }
            currentNode = currentNode.next;
            i = i+1;
        }
        return -1;
    }

    public void remove(int index) {
        Node currentNode = head;
        int i = 0;
        while(currentNode != null) {
            if(i == index) {
                currentNode.data = currentNode.next.data;
                currentNode.next =  currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
            i = i + 1;
        }
    }

    public static void main(String[]args) {
        LinkedList list = new LinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.insert(10);
        list.insert(12);
        list.insert(14);
        //list.display();
        list.set(3,16);
        list.display();
       int index =  list.findElement(2);
        System.out.println("Element found in::"+index);
       int size = list.getSize();
       System.out.println("Size of the List::"+size);
       int value = list.get(1);
       System.out.println("Value is::"+value);
       list.remove(6);
        list.display();
    }
}
