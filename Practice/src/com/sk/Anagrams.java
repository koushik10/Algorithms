package com.sk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagrams {

	public void anagrams(String s1, String s2){
		
		String temp1 = s1, temp2 = s2;
		Map<Character, Integer> map = new HashMap<>();
		//List<String> ar = new ArrayList<>();
		//ar.add(1, "sta");
		boolean b = false;
			for(int i=0; i<s1.length();i++){
				if(!map.containsKey(s1.charAt(i)))
					map.put(s1.charAt(i), 1);
				else
					map.put(s1.charAt(i), map.get(s1.charAt(i))+1);		
			}
			
			for(int i=0; i<s2.length();i++){
				if(map.containsKey(s2.charAt(i)))
					map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
				else
					System.out.println("Not an Anagram");
			}
			System.out.println(map);
			Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
			
			for(Map.Entry<Character,Integer> entry: entrySet){
				System.out.printf("%s : %d %n",entry.getKey(), entry.getValue());
				if(entry.getValue()==null || entry.getValue()!=0){
					System.out.println("Not an Anagram");
					break;
				}
				else {
					b = true;
					continue;		
				}
			
			}
			if(b){
				System.out.println("Anagram");
			}
				
		}
			//System.out.printf("%s : %d %n",entry.getKey(), entry.getValue());
	
	public static void main(String args[]){
		
		Anagrams a = new Anagrams();
		a.anagrams("godr","dorgr");
		
		
	}
}
