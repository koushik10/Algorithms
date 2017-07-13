package com.sjsu;
import java.util.ArrayList;

import com.sjsu.Node;

public class BinaryTree {

	Node root;
	
	public void AddNode(int insertValue){
		
		if(root==null)
		{
			Node newNode = new Node();
			newNode.value=insertValue;
			root = newNode;
		}
		else{
		
			Node currentNode = root;
			Node newNode = new Node();
			newNode.value=insertValue;
			while(currentNode!=null){
				if(insertValue<currentNode.value)
				{	
					if(currentNode.left==null){
						currentNode.left=newNode;
						break;
					}
					else
						currentNode= currentNode.left;
				}
				else{
					
					if(currentNode.right==null)
					{
						currentNode.right=newNode;
						break;
					}
					else
						currentNode= currentNode.right;	
				}
			}
			
		}
		
	}
	
	public void dfsInOrder(Node node){
		
		if(node==null)
			return;
		else{
			dfsInOrder(node.left);
			System.out.println(node.value);
			dfsInOrder(node.right);
		}
	}
	
public void dfsPreOrder(Node node){
		
		if(node==null)
			return;
		else{
			System.out.println(node.value);
			dfsPreOrder(node.left);
			dfsPreOrder(node.right);
		}
	}

public void dfsPostOrder(Node node){
	
	if(node==null)
		return;
	else{
		
		dfsPostOrder(node.left);
		dfsPostOrder(node.right);
		System.out.println(node.value);
	}
}

public void bfs(Node node){
	ArrayList<Node> list = new ArrayList<Node>();
	list.add(node);
	while(!list.isEmpty()){
		Node firstNodeInList = list.get(0);
		System.out.println(firstNodeInList.value);
		if(firstNodeInList.left!=null)
			list.add(firstNodeInList.left);
		if(firstNodeInList.right!=null)
			list.add(firstNodeInList.right);
		list.remove(0);
	}
	
}

public void mirror(Node node){
	if(node==null)
		return ;
	else{
		Node temp = node.left;
		node.left= node.right;
		node.right=temp;
		mirror(node.left);
		mirror(node.right);
	}
}
		
	 public static void main(String args[]){
		 
		 BinaryTree bt = new BinaryTree();
		 bt.AddNode(9);
		 bt.AddNode(4);
		 bt.AddNode(12);
		 bt.AddNode(1);
		
		 bt.AddNode(5);
		 bt.AddNode(15);

		 bt.AddNode(10);
		 bt.AddNode(14);
		 
		 bt.mirror(bt.root);
		 bt.dfsPostOrder(bt.root);
	 }
		
	
}
