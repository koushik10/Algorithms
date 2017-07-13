package com.sk;

public class BinaryToDecimal {
	
	
	
	public int BinToDec(int a){
		
	int result =0, remainder, c=0;
	
	while(a>=1){
		
		remainder=a%10;
		a=a/10;
		
		if(remainder==1){
			
		result += Math.pow(2, c);
		}
		c++;	
		
	}
	
	return result;
	}
	
	public static void main(String args[]){
		
		BinaryToDecimal b = new BinaryToDecimal();
		System.out.print(b.BinToDec(1111));

		
	}
}
