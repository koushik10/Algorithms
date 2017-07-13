package com.sjsu;

public class StringPermutaion {
	
	public static void main(String args[]){
		
		String input ="ABC";
		
		StringPermutaion obj = new StringPermutaion();
		obj.allPossiblePerm("", input);
	}
	
	public void allPossiblePerm(String done, String left){
		
		//base case
		if (left.isEmpty())
		{
			System.out.println(done);
	
		}
		
		for (int i=0;i<left.length();i++)
		{
		
			 allPossiblePerm(done+left.charAt(i), left.substring(0, i)+left.substring(i+1, left.length()));
		}
		
		
		
	}

}
