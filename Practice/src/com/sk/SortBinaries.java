package com.sk;

public class SortBinaries {

	public String sortBinaries(int n){
		
		int a;
		StringBuffer sb = new StringBuffer();
		while(n>0){
			a=n%10;
			n=n/10;
			if(a==1)
				sb.insert(0, a);
			else
				sb.append(a);
		}
		return sb.toString();
	}
	
	public static void main(String args[]){
		
		SortBinaries sb = new SortBinaries();
		System.out.println(sb.sortBinaries(10001101));
	}
}
