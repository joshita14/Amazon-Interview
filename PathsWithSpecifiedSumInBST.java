package com.interview.prep.amazon;

public class PathsWithSpecifiedSumInBST {
	
	/*
	 * For instance, if inputs are the binary tree in Figure 1 and a number 22, two paths with be printed: 
	 * One is the path contains node 10 and 12, and the other contains 10, 5 and 7.
	 */
	
	Node parent;
	Node current;
	static Node head;
	int sum = 0;
	int subsum = 0;
	
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
	
	
	boolean pathWithSpecifiedSum(Node root, int sum){
		
		if (root == null) {                               
            return false;
        }
        if(root.left == null && root.right == null && root.data == sum) { 
              return true;  
        }     
        return pathWithSpecifiedSum(root.left, sum - root.data) ||
        		pathWithSpecifiedSum(root.right, sum - root.data);
	}
	
	public static void main(String[] args) {
		
		PathsWithSpecifiedSumInBST bst = new PathsWithSpecifiedSumInBST();

		bst.addNodesInBST(10);
		bst.addNodesInBST(5);
		bst.addNodesInBST(4);
		bst.addNodesInBST(7);
		bst.addNodesInBST(12);
		
		bst.preOrderTraversal(head);
		boolean result = bst.pathWithSpecifiedSum(head, 22);
		System.out.println(result);
	}

}
