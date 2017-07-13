package com.sjsu;

public class HashTable<K,V> {
	
	class Node<K,V>{
		
		K key;
		V value;
		Node<K,V> next;
		
		Node(K key, V value){
			this.key= key;
			this.value=value;
			this.next=null;
		}
	}
	
	Node<K,V>[] hashTable = new Node[10];
	
	public void put(String key, String value){
		
		if(key==null || key.trim()==""){
			System.out.println("Invalid Key");
			return;
		}
			
		
		int bucketLocation = key.hashCode()%10;
		
		if(hashTable[bucketLocation]==null)
		{
			Node node = new Node(key,value);
			hashTable[bucketLocation]=node;
		}
		else{
			
			Node node = hashTable[bucketLocation];
			//Node previousNode = null;
			while(node!=null) {
				if(node.key==key){
					node.value=value;
					return;
				}
				//previousNode = node;
				if(node.next!=null)
					node = node.next;
				else
					break;
			}
			Node newNode = new Node(key,value);
			node.next=newNode;
			return;
			
		}
		
	}
	
	public String get(String key){
		
		if(key==null || key.trim()==""){
			System.out.println("Invalid Key");
			return null;
		}
		
		int bucketLocation = key.hashCode()%10;
		
		Node node = hashTable[bucketLocation];
		
		while(node!=null){
			
			if(node.key==key)
				return (String) node.value;
			node=node.next;
		}
		
		return "Key doesn't exist";
		
	}
	
	public void remove(String key){
		
		if(key==null || key.trim()==""){
			System.out.println("Invalid Key");
			return ;
		}
		
		int bucketLocation = key.hashCode()%10;
		
		Node node = hashTable[bucketLocation];
		Node previousNode = null;
		
		if(node.key==key)
		{
			hashTable[bucketLocation]= node.next;
			System.out.println("Key removed");
			return;
		}

		while(node!=null){
			
			if(node.key==key)
			{
				if(node.next!=null){
				previousNode.next = node.next;
				node.next=null;
				}
				else{
					previousNode.next=null;
				}
				System.out.println("Key removed");
				return;
				
			}
			previousNode=node;
			node=node.next;
		}
		System.out.println("Key doesn't exist");
		return ;
		
	}
	
	
	public static void main(String args[]){
		
		HashTable ht = new HashTable();
		ht.put("1", "One");
		ht.put("5", "Five");
		ht.put("15", "Fifteen");
		ht.put("25", "25");
		System.out.println(ht.get("1"));
		System.out.println(ht.get("5"));
		System.out.println(ht.get("25"));
		System.out.println(ht.get("15"));
		ht.put("6", "Six");
		System.out.println(ht.get("6"));
		ht.put("6", "Six Update");
		System.out.println(ht.get("6"));
		ht.remove("25");
		System.out.println(ht.get("25"));
	}

}


