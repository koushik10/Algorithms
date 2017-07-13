package com.sjsu;

import java.util.ArrayList;

public class PrintNodePath {

	static ArrayList<Integer> path = new ArrayList<Integer>();

	public Node findNodePathInBst(Node node, int target) {

		if (node == null)
			return null;
		if (node.value == target) {
			path.add(node.value);
			return node;
		}
		Node temp;
		if (target > node.value) {
			temp = findNodePathInBst(node.right, target);

		} else {
			temp = findNodePathInBst(node.left, target);

		}
		path.add(node.value);
		return node;

	}

	public static void main(String args[]) {

		Node root = new Node(8);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.right = new Node(9);
		root.right.right = new Node(12);
		root.right.right.left = new Node(11);
		PrintNodePath pnp = new PrintNodePath();
		pnp.findNodePathInBst(root,3);
		System.out.print(path);
	}

}
