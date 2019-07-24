package com.lourdu.datastructures;
import com.lourdu.Node6;


public class CountTheNumberOfLeafNodesInBinaryTree {

	static Node6 root;
	int count = 0;
	
	public static void main(String[] args) {
		
		CountTheNumberOfLeafNodesInBinaryTree tree = new CountTheNumberOfLeafNodesInBinaryTree();
		tree.root = new Node6(10);
		tree.root.left = new Node6(2);
		tree.root.right = new Node6(5);
		tree.root.left.left = new Node6(3);
		tree.root.left.right = new Node6(4);
		tree.root.right.left = new Node6(6);
		tree.root.right.right = new Node6(7);
		
		System.out.println("the number of leaf nodes:"+ tree.getLeafNodes(root));
		
	}

	private int getLeafNodes(Node6 root) {
		
		if(root == null){
			return 0;
		}
		
		if(root.left == null && root.right == null){
			count = count + 1;
		}
		getLeafNodes(root.left);
		getLeafNodes(root.right);
		return count;
		
	}
}
