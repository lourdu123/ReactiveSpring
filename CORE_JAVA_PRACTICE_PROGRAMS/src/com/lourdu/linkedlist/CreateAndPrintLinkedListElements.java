package com.lourdu.linkedlist;
import java.util.LinkedList;

import com.lourdu.Node;


public class CreateAndPrintLinkedListElements {

	 private static Node head;
	 
	 
	 public void push(int data){
		 
		 Node n1 = new Node(data);
		 if(head == null){
			 head = n1;
		 }else{
			 // set n1 next to point to head
			 n1.setNext(head);
			 // set n1 as head now
			 head = n1;
		 }
	 }
	 
	public void append(int data){
			 
			 Node n1 = new Node(data);
			 if(head == null){
				 head = n1;
			 }else{
				 
				 // go to the last node and point that last node "next()" to the current inserting node
				 Node n = head;
				 while(n.getNext() != null){
					 n = n.getNext();
				 }
				 n.setNext(n1);
			 }
		 }
	
	public static void main(String[] args) {
		
		CreateAndPrintLinkedListElements createAndPrintLinkedListElements = new CreateAndPrintLinkedListElements();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		createAndPrintLinkedListElements.head = node1;
		createAndPrintLinkedListElements.head.setNext(node2);
		createAndPrintLinkedListElements.head.getNext().setNext(node3);
		
		createAndPrintLinkedListElements.push(0);
		createAndPrintLinkedListElements.append(4);
		//createAndPrintLinkedListElements.appendAfter(2,9);
		//createAndPrintLinkedListElements.deleteFront();
		//createAndPrintLinkedListElements.deleteAfter(9);
		
		Node n = head;
		while(n != null){
			System.out.println( n.getData());
			n = n.getNext();
		}
		
		// rotating linked list by k nodes
		
//		createAndPrintLinkedListElements.rotate(1);
//		
//		Node n1 = head;
//		while(n1 != null){
//			System.out.println( n1.getData());
//			n1 = n1.getNext();
//		}
		
	}

	private void rotate(int i) {

		
		Node mainHead = head;
		Node h1 = head;
		int count = 0;
		Node kNode = null;
		Node kthNextNode = null;
		Node lastNode = null;
		Node previous = null;
		while(h1 != null){
			count = count + 1;
			if(count == i){
				kNode = h1.getNext();
				kthNextNode = h1.getNext().getNext();
			}
			previous = h1;
			h1 = h1.getNext();
			if(h1 == null){
				lastNode = previous;
			}
		}
		
		System.out.println(kNode);
		System.out.println(kthNextNode);
		System.out.println(lastNode);
		System.out.println(mainHead);
		
		lastNode.setNext(mainHead);
		head = kthNextNode;
		kNode.setNext(null);
		
	}

	private void deleteAfter(int i) {

		Node n = head;
		Node temp1;
		Node temp2;
		while(n != null){
			if(n.getData() == i){
				temp1 = n.getNext();
				temp2 = temp1.getNext();
				n.setNext(temp2);
				
			}
			n = n.getNext();
		}
	}

	private void deleteFront() {

		if(head == null){
			System.out.println("underflow");
		}else{
			Node temp = head.getNext();
			head.setData(0);
			head.setNext(null);
			head = temp;
		}
	}

	private void appendAfter(int i, int j) {

		Node nodeData = new Node(j);
		Node temp ;
		Node n = head;
		while(n != null){
			if(n.getData() == i){
				temp = n.getNext();
				nodeData.setNext(temp);
				n.setNext(nodeData);
			}
			n = n.getNext();
		}
	}
}
