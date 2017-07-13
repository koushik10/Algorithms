package com.sk;


/* Armstrong Number 
 * 153 = 1*1*1 + 5*5*5 + 3*3*3
 */
public class ArmstrongNumber {

	
	public String armsStrong(int n){
		
		int temp =n,sum =0, r;
		while(n>0){	
			r=n%10;
			n=n/10;
			sum += r*r*r;
		}
		
		if(sum==temp)
		return "ArmstrongNumber";
		else
			return "Not a ArmstrongNumber";
	}
	
	
	static { System.out.println("Inside sattic");}
	public static void main(String args[]){
		
		ArmstrongNumber a = new ArmstrongNumber();
		System.out.println(a.armsStrong(121));
		
	}

}

