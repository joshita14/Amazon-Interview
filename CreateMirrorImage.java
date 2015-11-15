package com.interview.prep.amazon;


public class CreateMirrorImage {

	
	Node parent;
	Node current;
	static Node head;
	static Node head1;

	void addNodesInBST(int data){
		
		System.out.println("Adding Data");
		
		Node node = new Node(data);
		
		if(head == null){
			head = node;
		}else{
			current = head;
			
			while(true){
				
				parent = current;
				 
				if(data <= current.data) {
					current = current.left;
					
					if(current == null){
						parent.left = node;
						return;
					}
				}else{
					
					current = current.right;
					
					if(current == null){
						
						parent.right = node;
						return;
					}
				}
			}
		}
	}
	
	void traversal(Node root){
		
		if(root != null){
			
			System.out.println(root.data);
			traversal(root.left);
			traversal(root.right);
		}
	}
	
	void createAMirrorImage(Node root){
		
		if(root != null){
			
			Node t = root.left;
			root.left = root.right;
			root.right = t;
			
			createAMirrorImage(root.left);
			createAMirrorImage(root.right);
		}
	}
	
	void checkMirror(Node tree1, Node tree2){
		
		System.out.println("Check if the image is the mirror image");
		
		if(tree1 !=null && tree2 != null){
			
			if(tree1.data == tree2.data){
				System.out.println("These are the data  : "+ tree1.data +"  "+tree2.data);
			}
			checkMirror(tree1.left, tree2.right);
		}
	}
	
	
	public static void main(String[] args) {
		
		CreateMirrorImage bst = new CreateMirrorImage();
		
		bst.addNodesInBST(10);
		bst.addNodesInBST(6);
		bst.addNodesInBST(4);
		bst.addNodesInBST(8);
		bst.addNodesInBST(6);
		bst.addNodesInBST(4);
		bst.addNodesInBST(8);
		
		head1 = head; 
		
		bst.traversal(head);
		bst.createAMirrorImage(head1);
		bst.traversal(head1);
		
		bst.checkMirror(head, head1);
		
	}
}


//search a pattern in a file.  

//You are given a fixed number of 5 rupee, 10 rupee, 20 rupee and 50 rupee stamps. 
//Now given an amount for sending a parcel, you should design an algorithm to come out with the minimum number of stamps that should be used for attaining that amount.
//For example, if the parcel costed 30 rupees, it could be attained using one 20 rupee stamp and one 10 rupee stamp OR using three 10 rupee stamps OR using one 20 rupee stamp and two 5 rupee stamps OR using one 10 rupee stamp and four 5 rupee stamps OR using two 10 rupee stamps and two 5 rupee stamps. 
//However, the minimum number of stamps is the case of one 20 rupee stamp and one 10 rupee stamp where only two stamps are used. 
//The case where no solution is possible should also be handled, for example, a parcel amount of exactly 33 rupees cannot be attained.  
