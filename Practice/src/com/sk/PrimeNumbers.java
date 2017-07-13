package com.sk;

/*Display prime number from 1 to 100 */

public class PrimeNumbers {
	
public void prime(){
	
	int n =100;
	for(int i=2;i<n;i++){
		for(int j=2;j<=i;j++){
			
			if(j==i){
				System.out.println(i);
			}
			if(i%j==0){
				break;
			}
		}
	}
}
	
public static void main(String args[]){
	
	PrimeNumbers p = new PrimeNumbers();
	p.prime();
}
}
