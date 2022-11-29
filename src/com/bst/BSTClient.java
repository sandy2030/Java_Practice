package com.bst;

/**
 * Created by sande on 16-11-2022.
 */
public class BSTClient {
    public static void main(String[] args) {
        int [] bstArray={125,78,895,5,44,79,362,78};
        BinarySearchTree bst=new BinarySearchTree(bstArray[0]);
        for (int data: bstArray) {
            bst.insert(bst.node, data);
        }

        System.out.println("after sorting ...");

        bst.inOrder(bst.node);

    }
}
