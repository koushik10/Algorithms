package com.sk;

import java.util.Scanner;

public class DecimalToBinary {
	
	public String DecToBin(int n){
		
		//String str;
		int b, temp = n;
		StringBuffer sb = new StringBuffer();
		while(n>0){
			b = n%2;
			n = n/2;
			sb.insert(0, b);
		}
		
		return sb.toString();
	}

	public static void main(String args[]){
		
		int n;
		DecimalToBinary dtob = new DecimalToBinary();
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println(dtob.DecToBin(n));
		
		
	}
}
