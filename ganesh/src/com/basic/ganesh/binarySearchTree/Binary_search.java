package com.basic.ganesh.binarySearchTree;

import com.basic.ganesh.hasingExamples.Node;

public class Binary_search {
	// A utility function to search a given key in BST
	public Node search(Node root, int key)
	{
	    // Base Cases: root is null or key is present at root
	    if (root==null || root.data==key)
	        return root;
	 
	    // val is greater than root's key
	    if (root.data > key)
	        return search(root.left, key);
	 
	    // val is less than root's key
	    return search(root.right, key);
	}
	
	
	// Driver Program to test above functions
    public static void main(String[] args) {
    	
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
        Binary_search binary_search = new Binary_search();
        
        int i = 6;
        Node x = binary_search.search(root,i);
        System.out.println(x.data);
        
    }
}
