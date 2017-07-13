package com.sjsu;

import java.util.*;
import java.lang.*;
import java.io.*;

class ProductArray {
	public static void main (String[] args) {
		int[] input={10, 3, 5, 6, 2};
		int[] prod= new int[input.length];
		for(int i=0;i<prod.length;i++)
			prod[i]=1;
		
		for(int i=0;i<input.length-1;i++){
			prod[i] = prod[i]*input[i+1];
		}
	}
}