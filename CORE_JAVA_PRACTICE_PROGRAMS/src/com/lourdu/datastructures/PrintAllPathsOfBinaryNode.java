package com.lourdu.datastructures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lourdu.Node6;

class Node5{
	
	int data;
	Node5 left,right;
	
	public Node5(int data){
		this.data = data;
		left = right = null;
	}
}

public class PrintAllPathsOfBinaryNode {

	static Node5 root;
	static int[] arr = new int[1000]; 
	static int len = 0 ;
	
	public static void main(String[] args) {
		
		PrintAllPathsOfBinaryNode papbn = new PrintAllPathsOfBinaryNode();
		papbn.root = new Node5(10);
		papbn.root.left = new Node5(8);
		papbn.root.right = new Node5(2);
		papbn.root.left.left = new Node5(3);
		papbn.root.left.right = new Node5(5);
		papbn.root.right.left = new Node5(2);
		
		findAllPaths(root,arr,len);
	}

	private static void findAllPaths(Node5 root2,int[] arr,int len) {

		if(root2 == null){
			return;
		}
		
		arr[len] = root2.data;
		len++;
		
		if(root2.left == null && root2.right == null){
			printPath(arr,len);
		}
		
		findAllPaths(root2.left, arr, len);
		findAllPaths(root2.right, arr, len);
	}

	private static void printPath(int[] arr2, int len2) {
		

		
		for(int i = 0 ; i < len2 ; i++){
			System.out.println(arr[i]+ "");
		}
		System.out.println("");
	
	}		
		
}
