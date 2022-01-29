package com.data;

import com.data.tree.BST;


public class Main {

    public static void main(String[] args) {
	// write your code here
        BST root = BST.insert(null, new BST(2));
        root = BST.insert(root, new BST(1));
        root = BST.insert(root, new BST(5));
        root = BST.insert(root, new BST(9));
        root = BST.insert(root, new BST(3));
        root = BST.insert(root, new BST(4));
        BST.inorderTraversal(root);
        System.out.println("\n"+BST.height(root));
    }
}
