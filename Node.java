package com.interview.prep.amazon;

public class Node {
	
	Node nextNode;
	Node left;
	Node visisted;
	Node isLeaf;
	Node right;
	int data;
	
	Node(int d){
		this.data = d;
	}
	
	public Node getVisisted() {
		return visisted;
	}

	public void setVisisted(Node visisted) {
		this.visisted = visisted;
	}

	public Node getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Node isLeaf) {
		this.isLeaf = isLeaf;
	}

	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	
	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
