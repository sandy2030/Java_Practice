package com.bst;

public class BinarySearchTree {

    Node node;

    public BinarySearchTree(int data) {
        this.node = new Node(data);
    }

    public Node insert(Node node,int data){
        if (null==node){
            return new Node(data);
        }
        if (data < node.data){
            node.left=insert(node.left,data);
        }

        if (data > node.data){
            node.right=insert(node.right,data);
        }
        return node;
    }

    public void inOrder(Node node){
        if (null != node){
            inOrder(node.left);
            System.out.print(node.data+", ");
            inOrder(node.right);
        }
    }

    class Node{
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

}

}
