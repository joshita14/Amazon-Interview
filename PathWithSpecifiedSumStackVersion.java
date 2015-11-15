package com.interview.prep.amazon;

import java.util.Stack;

public class PathWithSpecifiedSumStackVersion {

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
	
	boolean usingTwoStacks(Node node, int number){
		
		if (node == null) {
            return false;
        }
		
		nodes.push(node);
		sumOfNodes.push(node.data);  //initial condition
		
		while(!nodes.isEmpty()){
			
			Node current = nodes.pop();
			int sum = sumOfNodes.pop();
			
			if(current.left == null && current.right == null && sum == number){
				//This is the base condition to specify that we have the leaf node and the end node as true
				return true;
			}
			
			if(current.left != null){
				System.out.println("There are values in the left");
				nodes.push(current.left);
				sumOfNodes.push(sum + current.left.data);
			}
			
			if(current.right != null){
				System.out.println("These values are in right");
				nodes.push(current.right);
				sumOfNodes.push(sum + current.right.data);
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
       
		PathWithSpecifiedSumStackVersion bst = new PathWithSpecifiedSumStackVersion();

		bst.addNodesInBST(10);
		bst.addNodesInBST(5);
		bst.addNodesInBST(4);
		bst.addNodesInBST(7);
		bst.addNodesInBST(12);
		
		bst.preOrderTraversal(head);
		boolean result = bst.usingTwoStacks(head, 19);
		
		if(result){
			
			System.out.println("The result is true :  ");
			
			while(nodes.iterator().hasNext()){
				System.out.println("This is the path value  : "+ nodes.iterator().next().data);
			}
			
		}
	}

}
