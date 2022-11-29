package com.ds;

public class LinkedList {
    //  1 -> 2 -> 3 -> 4 ->
    private Node head;

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(7);
        list.insert(10);
        list.print(list);
    }

    void insert(int data){
        Node newNode=new Node(data);
        if (this.head==null){
            this.head=newNode;
        }else{
            Node last = this.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
    }

    void print(LinkedList list){
        Node p=list.head;
        while (p!=null){
            System.out.print(p.data + " , ");
            p=p.next;
        }
    }

}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
