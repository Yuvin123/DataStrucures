package com.basic.ganesh.binaryTree;

import com.basic.ganesh.hasingExamples.Node;

public class SumLeftNodesTree {
	
	// Root of Binary Tree
	 Node root;
	int sum = 0;
	
	public SumLeftNodesTree() {
		root = null;
	}

	/* Given a binary tree, print its nodes in inorder*/
	public void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		sum+=node.data;

		if(node.right != null){
			node = node.right;
			while(node!=null){
				node= node.left;
				if(node!= null){
					sum+=node.data;
				}

			}
		}
	}



	// Driver method
	public static void main(String[] args)
	{
		SumLeftNodesTree tree = new SumLeftNodesTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		tree.sumOfLeftNodes();
	}

	private void sumOfLeftNodes() {
		printInorder(root);
		System.out.println("sum of the leftnodes in a tree = " + sum);
		
	}
}
