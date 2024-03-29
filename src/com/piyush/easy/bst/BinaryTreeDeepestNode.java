package com.piyush.easy.bst;

/**
 * @author Piyush
 * 
 * Given the root of a binary tree, return a deepest node. 
 * 
 * For example, in the following tree, return d.
 * 		    a
 * 		   / \
 * 		  b   c
 * 		 /
 * 		d
 *
 */
public class BinaryTreeDeepestNode 
{
	//	Node class definition
	static class Node
	{
		int data;
		Node left, right;
		
		Node(int key)
		{
			data = key;
			left = null;
			right = null;
		}
	}

	//	maxLevel maintains the maximum level reached so far
	static int maxLevel = -1;
	//	res contains the data for maxLevel above
	static int res = -1;
	
	/*this function does an in-order traversal and
	 * sets the maxLevel and res at runtime checking each
	 * and every node in the BST
	 * */ 
	static int findDeepestNode(Node root, int level) 
	{
		if(root != null) 
		{
			findDeepestNode(root.left, ++level);
			if(level > maxLevel) 
			{
				maxLevel = level;
				res = root.data;
			}
			findDeepestNode(root.right, level);
		}
		return res;
	}
	
	//	Driver code
	public static void main(String[] args) 
	{
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.left.right.right = new Node(9);
        root.right.left.right.right.left = new Node(10);
        root.right.left.right.right.left.right = new Node(11);
        System.out.println(findDeepestNode(root, 0));
	}
}
