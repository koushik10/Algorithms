package com.sk;

public class StringPalindrome {

	
	public String palindrome(String s){
		
		String reverse = "";
		
		for(int i= s.length()-1;i>=0;i--){
			reverse += s.charAt(i);
		}
		
		if(reverse.equalsIgnoreCase(s))
			return "Palindrome";
		else
			return "Not a Palindrome";
	}
	
	public static void main(String args[]){
		
		StringPalindrome sp = new StringPalindrome();
		System.out.println(sp.palindrome("malayalam"));
	}
}
