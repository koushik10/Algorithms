package com.sk;

public class Fibonacci {

	
	StringBuilder sb = new StringBuilder();
	
	public String fib(int n){
		
		int a=0, b=1, c;
		if(n==0){
			sb=sb.append(-1);
		}
		if(n>=1){
			sb=sb.append(0);
		}
		if(n>=2){
			sb=sb.append(1);
		}

		while(n>1){	
			c=a+b;
			a=b;
			b=c;
			n--;
			sb = sb.append(c);
		}
		return sb.toString();
	}
	
	public static void main(String args[]){
		
		String s;
		Fibonacci f = new Fibonacci();
		s= f.fib(5);
		System.out.println(s);
	}
}
