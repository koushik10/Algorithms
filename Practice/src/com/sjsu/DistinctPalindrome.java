package com.sjsu;

import java.util.HashSet;
import java.util.Set;

public class DistinctPalindrome {

	static Set<String> output = new HashSet<>();
	public static void main(String args[]){
		String input="geek";
		DistinctPalindrome obj = new DistinctPalindrome();
		obj.FindSubsets("",input);
		System.out.println(output);
		
	}
	
	public void FindSubsets(String processed, String yetToProcess){
		
		if(yetToProcess.length()==0)
		{
			
			if(processed==null || processed.equals(""))
				return;
			StringBuilder strBld = new StringBuilder(processed);
			strBld = strBld.reverse();
			if (processed.equals(strBld.toString()))
			{ 
				if(!output.contains(processed))
				 output.add(processed);
			}
			
			return ;
		}
		FindSubsets(processed,yetToProcess.substring(1));
		FindSubsets(processed+yetToProcess.charAt(0),yetToProcess.substring(1));
		return ;
	}

}
