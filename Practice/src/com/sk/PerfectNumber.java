package com.sk;

/* perfect Number 
 * 6 = 1 + 2+ 3 
 * 28 = 1 + 2 + 4 + 7 + 14 // add the factors and it should be equal to the input number
 */
public class PerfectNumber {

	
	public String perfectNo(int n){
	int sum =0;
	int temp=n;
	
		for(int i=1;i<n;i++){
				if(n%i==0)
				sum+=i;	
		}
		if(temp==sum)
			return "perfect Number";
		else
			return "Not a perfect Number";
		}
		
	public static void main(String args[]){
		PerfectNumber p = new PerfectNumber();
		System.out.println(p.perfectNo(7));
	
	}
}