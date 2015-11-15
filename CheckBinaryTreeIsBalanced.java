package com.interview.prep.amazon;

public class CheckBinaryTreeIsBalanced {

	/*
	 * Takes input as root of the binary tree and checks if the binary tree is balanced
	 * The difference in height of let and right subtree is atmost one
	 */
	
	Node parent;
	Node current;
	static Node head;
	
	void addNodesInBST(int data){
		
		Node node = new Node(data);
		
		if(head == null){
			
			head = node;
		}
		else{
			
			current = head;
			
			while(true){
			
				parent = current;
				
				if(data <= current.data){
					
					System.out.println("To Left");
					
					current = current.left;
					if(current == null){
						
						parent.left = node;
						System.out.println("Inserted Value to the left");
						return ;
					}
				}else{
					
					current = current.right;
					
					if(current == null){
						
						parent.right = node;
						System.out.println("Inserted value to the right");
						return;
					}
					
				}
			}
			
		}
	}
	
	 void inOrdertraverseInTree(Node root){
		 
		 if(root != null){
			 
			 inOrdertraverseInTree(root.left);
			 System.out.println(root.data);
			 inOrdertraverseInTree(root.right);
		 }
	 }
	
	public static void main(String[] args) {
		
		CheckBinaryTreeIsBalanced bst = new CheckBinaryTreeIsBalanced();
		
		bst.addNodesInBST(10);
		bst.addNodesInBST(6);
		bst.addNodesInBST(4);
		bst.addNodesInBST(8);
		bst.addNodesInBST(14);
		bst.addNodesInBST(12);
		bst.addNodesInBST(16);
		
		bst.inOrdertraverseInTree(head);
	}
}
