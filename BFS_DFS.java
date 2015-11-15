package com.interview.prep.amazon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

	/*
	 * Spiral order traversal : is the traversal that we have traversal in form of bst , the printing is from right to left
	 * 
	 * Level order traversal is the traversal where we have : each level we traverse BFS
	 */

public class BFS_DFS {

	Node parent;
	Node current;
	static Node head;
	int sum = 0;
	int subsum = 0;

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
	

	void bfsTraversal(Node node){
		
		System.out.println("This is bfs traversal");
		
		Queue <Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(! queue.isEmpty()){
			
			Node current = queue.poll();
			
			System.out.println("Node : "+current.data);
			
			if(current.left != null){
				
				queue.add(current.left);
				
			}
			
			if(current.right != null){
				
				queue.add(current.right);
				
			}
		}
	}
	
	
	void dfs(Node node){
		
		Stack<Node> stack = new Stack<Node>();
		
		if(node == null){
			System.out.println("Tree Empty");
		}
		
		stack.add(node);
		
		while( ! stack.isEmpty()){
			
			Node current = stack.pop();
			
			System.out.println("Node : "+current.data);
			
			
			if(current.right != null){
				stack.add(current.right);
			}
			
			if(current.left != null){
				stack.add(current.left);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		BFS_DFS bst = new BFS_DFS();
		
		bst.addNodesInBST(10);
		bst.addNodesInBST(5);
		bst.addNodesInBST(4);
		bst.addNodesInBST(7);
		bst.addNodesInBST(12);
		
		bst.preOrderTraversal(head);
		
		//bst.bfsTraversal(head);
		bst.dfs(head);
		
	}

}