package com.interview.prep.amazon;

import java.util.Iterator;
import java.util.Stack;

public class PathsInABST {
	
	
	Node parent;
	Node current;
	static Node head;
	int sum = 0;
	int subsum = 0;
	Stack<Node> stack = new Stack<Node>();
	
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
	
	//preorder traversal
	void preOrderTraversal(Node root){
		
		if(root != null){
			System.out.println(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	boolean checkPath(Node root, int number){
	
	  while(true){
		  
		    if(root == null){
		    	
		    	//check sum here :
		    	if(sum == number){
					
		    		System.out.println("We have found the value and path");
					
					//print stack here to show the path
					Iterator<Node> iterate = stack.iterator();
					
					while(iterate.hasNext()){
						System.out.println(iterate.next().data);
					}
					break;
				}else{
					
					System.out.println(stack.peek());
					stack.pop();
					root = stack.lastElement();
				}
				
			}
		
		    if(root != null && !stack.contains(root)){
			    stack.push(root);
			    sum = sum + root.data;
	 	    }	
			
			boolean rest1 = checkPath(root.left, number);
			boolean res2 = checkPath(root.right, number);
	    }
	  return true;
	 }
	
	
	public static void main(String[] args) {
		PathsInABST bst = new PathsInABST();
		
		bst.addNodesInBST(10);
		bst.addNodesInBST(5);
		bst.addNodesInBST(4);
		bst.addNodesInBST(7);
		bst.addNodesInBST(12);
		
		bst.preOrderTraversal(head);
		bst.checkPath(head, 22);
		
	}

}
