package com.wh.test;

//单项链表反转
public class Node {

	public Node next;
	public int value;

	public static void main(String[] args) {
		Node node = getLinkedList();
		while (node != null) {
			System.out.print(node.value + "--->");
			node = node.next;
		}
		System.out.println("");

		// 反转单项链表
		node = reverseLinkedList(getLinkedList());
		while (node != null) {
			System.out.print(node.value + "--->");
			node = node.next;
		}
	}

	public static Node reverseLinkedList(Node head) {
		Node currentNode = head.next;
		head.next = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;// 得到N3
			currentNode.next = head;// 把N2的next指向N1
			head = currentNode;
			currentNode = nextNode;
		}
		return head;
	}

	public static Node getLinkedList() {
		Node head = new Node();
		head.value = 0;
		Node node1 = new Node();
		node1.value = 1;
		Node node2 = new Node();
		node2.value = 2;
		Node node3 = new Node();
		node3.value = 3;
		Node node4 = new Node();
		node4.value = 4;

		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		return head;
	}
}
