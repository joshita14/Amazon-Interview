package com.interview.prep.amazon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PathWithSpecifiedSumQueueVersion {
	
	
	//Queue follows BST, at each level we traverse and then move on to the next level
	Node parent;
	Node current;
	static Node head;
	int sum = 0;
	int subsum = 0;
	
	static Stack<Node> nodes = new Stack<Node>();
	static Stack<Integer> sumOfNodes = new Stack<Integer>();

	void addNodesInBST(int data) {

		Node node = new Node(data);

		if (head == null) {

			head = node;
		} else {

		current = head;
		
			while (true) {

				parent = current;

				if (data <= current.data) {

					System.out.println("To Left");

					current = current.left;
					if (current == null) {

						parent.left = node;
						System.out.println("Inserted Value to the left");
						return;
					}
				} else {

					current = current.right;

					if (current == null) {

						parent.right = node;
						System.out.println("Inserted value to the right");
						return;
					}
				}
			}
		}
	}

	// preorder traversal
	void preOrderTraversal(Node root) {

		if (root != null) {
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	boolean findPathQueueTraversal(Node node, int number){
		
		//Queue basic principle is to first in first out:
		
		Queue <Node> queuenode = new LinkedList<Node>();
		Queue <Integer> sumqueue = new LinkedList<Integer>();
		
		queuenode.add(node);
		sumqueue.add(node.data);
		
		while(!queuenode.isEmpty()){
			
			Node current = queuenode.remove();
			int sum = sumqueue.remove();
			System.out.println("This is the current node : "+ current.data);
			
			if(current.left == null && current.right == null && sum == number){
				return true;
			}
			if(current.left != null){
				
				System.out.println("we are on the left");
				queuenode.add(current.left);
				sumqueue.add(sum + current.left.data);
			}
			
			if(current.right != null){
				
				System.out.println("we are on the right");
				queuenode.add(current.right);
				sumqueue.add(sum + current.right.data);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		PathWithSpecifiedSumQueueVersion path = new PathWithSpecifiedSumQueueVersion();
		
		path.addNodesInBST(10);
		path.addNodesInBST(5);
		path.addNodesInBST(4);
		path.addNodesInBST(7);
		path.addNodesInBST(12);
		
		path.preOrderTraversal(head);
		path.findPathQueueTraversal(head, 19);
	}
	
	//http://codereview.stackexchange.com/questions/105136/path-sum-in-binary-tree

}
