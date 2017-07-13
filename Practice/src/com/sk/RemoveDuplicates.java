package com.sk;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Remove Duplicates from a string */

public class RemoveDuplicates {
	
	public String removeDuplicates(String s){
		
	Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length();i++){
			Character c = s.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	public static void main(String args[]){
		
		RemoveDuplicates rd = new RemoveDuplicates();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		System.out.println(rd.removeDuplicates(str));
	}

}
