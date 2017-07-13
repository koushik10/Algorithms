package com.sk;

/*Print Duplicates in a given String*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

	
	public void displayDupliates(String s){
		
		Map<Character,Integer> map = new HashMap<>();
		char [] characters = s.toCharArray();
		
		for(char c : characters){
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.printf("%s : %d  %n", entry.getKey(), entry.getValue());
			}
		}
	}

	public static void main(String args[]){
		
		PrintDuplicates pp = new PrintDuplicates();
		pp.displayDupliates("hello");
		
	}
}
