package com.basic.ganesh.binaryTree;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

import com.basic.ganesh.hasingExamples.Node;

public class PrintBinaryTreeVerticalOrder {

	// Utility function to store vertical order in map 'm'
	// 'hd' is horizontal distance of current node from root.
	// 'hd' is initially passed as 0
	public static void getVerticalOrder(Node root, int hd,
			TreeMap<Integer,Vector<Integer>> m)
	{
		// Base case
		if(root == null)
			return;

		//get the vector list at 'hd'
		Vector<Integer> get =  m.get(hd);

		// Store current node in map 'm'
		if(get == null)
		{
			get = new Vector<>();
			get.add(root.data);
		}
		else
			get.add(root.data);

		m.put(hd, get);

		// Store nodes in left subtree
		getVerticalOrder(root.left, hd-1, m);

		// Store nodes in right subtree
		getVerticalOrder(root.right, hd+1, m);
	}

	// The main function to print vertical oder of a binary tree
	// with given root
	static void printVerticalOrder(Node root)
	{
		// Create a map and store vertical oder in map using
		// function getVerticalOrder()
		TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
		int hd =0;
		getVerticalOrder(root,hd,m);

		// Traverse the map and print nodes at every horigontal
		// distance (hd)
		for (Entry<Integer, Vector<Integer>> entry : m.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}

	// Driver program to test above functions
	public static void main(String[] args) {

		// TO DO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		System.out.println("Vertical Order traversal is");
		printVerticalOrder(root);
	}
}
