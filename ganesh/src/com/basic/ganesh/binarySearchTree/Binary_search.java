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
}
