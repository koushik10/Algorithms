package com.sjsu;

public class MaximumSumSubArray {
	
	public static void main(String args[]){
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int maxSoFar=arr[0], max=arr[0], i=1;
		while(i<arr.length)
		{
		if((maxSoFar+arr[i])>maxSoFar)
			if(arr[i]>(maxSoFar+arr[i]))
					maxSoFar=arr[i];
		    else
			maxSoFar+=arr[i];
		else
		{
			if(maxSoFar<arr[i])
				maxSoFar = arr[i];
		}
		if(maxSoFar>max)
			max=maxSoFar;
		i++;
		
	}
		System.out.println(max);
	}
}
