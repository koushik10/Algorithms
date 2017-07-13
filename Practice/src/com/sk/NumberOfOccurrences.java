package com.sk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* find the number of occurrences of each element in a sting */
public class NumberOfOccurrences {
	
		public void numberOfOccurrences(String s){
			
			Map<Character, Integer> map = new HashMap<>();
			char [] characters = s.toCharArray();
			
			for(char c: characters){
				if(!map.containsKey(c))
					map.put(c, 1);
				else
					map.put(c, map.get(c)+1);
			}
			
			Set<Map.Entry<Character, Integer>> entrySet = map.entrySet(); 
				for(Map.Entry<Character, Integer> entry: entrySet){
					System.out.printf("%s : %d %n", entry.getKey(),entry.getValue());
				}
		}
		
		public static void main(String args[]){
				
				NumberOfOccurrences occurrences = new NumberOfOccurrences();
				occurrences.numberOfOccurrences("koushik");
		}
}
