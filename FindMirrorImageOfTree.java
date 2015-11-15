package com.interview.prep.amazon;

import java.util.HashSet;

public class FindMirrorImageOfTree {
	
	
	/*
	 * a tree is said to be mirror image, if the left subtree is the mirror image of the right subtree
	 * 
	 */
	
	Node parent;
	static Node head;
	Node current;
	HashSet hashset = new HashSet();
	
	void addNodesInBST(int data){
		
		Node node = new Node(data);
		
		if(head == null){
			
			head = node;
		}else{
			
			current = head;
			
			while(true){
				parent = current;
				
				if(data <= current.data){
					
					System.out.println("On the left side");
					
					current = current.left;
					if(current == null){
						parent .left = node;
						return;
					}
				}else{
					
					System.out.println("On the right side");
					
					current = current.right;
					if(current == null){
						parent.right = node;
						return;
					}
				}
			}
		}
	}
	
	
	void traverseInBST(Node node){
		
			
		if(node != null){
			
			traverseInBST(node.left);
			System.out.println(node.data);
			
			hashset.add(node.data);
			
			traverseInBST(node.right);
		}
	}
	
	public static void main(String[] args) {
		
		FindMirrorImageOfTree bst = new FindMirrorImageOfTree();
		
		bst.addNodesInBST(10);
		bst.addNodesInBST(6);
		bst.addNodesInBST(4);
		bst.addNodesInBST(8);
		bst.addNodesInBST(14);
		bst.addNodesInBST(12);
		bst.addNodesInBST(16);
		
		bst.traverseInBST(head);
	}

}
