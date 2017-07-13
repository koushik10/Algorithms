package com.sjsu;

public class MergeSort {

	public int[] split(int[] arr){
		if(arr.length==1)
			return arr;
		int mid = (arr.length/2);
		System.out.println("mid" + mid);
		int[] tempArr1 = new int[mid];
		int[] tempArr2 = new int[arr.length-mid];
		for(int i=0;i<mid;i++)
			tempArr1[i]=arr[i];
		int k=0;
		for(int i=mid;i<arr.length;i++){
			tempArr2[k]=arr[i];
			k++;
		}
		int[] left=split(tempArr1);
		for(int i=0;i<left.length;i++)
		System.out.println("Before left" + left[i] + "index"+i);
		int[] right=split(tempArr2);
		for(int i=0;i<left.length;i++)
		System.out.println("left" + left[i] + "index"+i);
		for(int i=0;i<right.length;i++)
		System.out.println("right" + right[i]+"index"+i);
		return merge(left,right);
	}
	
	public int[] merge(int[] left, int[] right){
		int[] merged= new int[left.length+right.length];
		int leftIndex=0,rightIndex=0,mergeIndex=0;
		while(leftIndex<left.length && rightIndex<right.length){
			if(left[leftIndex]<=right[rightIndex]){
				merged[mergeIndex] = left[leftIndex];
				mergeIndex++;
				leftIndex++;
			}
			else{
				merged[mergeIndex] = right[rightIndex];
				mergeIndex++;
				rightIndex++;
			}	
		}
		if(leftIndex<left.length){
			while(leftIndex<left.length){
				merged[mergeIndex] = left[leftIndex];
				mergeIndex++;
				leftIndex++;
			}
		}
		else{
			while(rightIndex<right.length){
				merged[mergeIndex] = right[rightIndex];
				mergeIndex++;
				rightIndex++;
			}
		}
		return merged;
	}
	
	public static void main(String args[]){
			int[] array = {4,5,2,1,9,3};
			MergeSort mergeObj = new MergeSort();
			int[] mergedArray= mergeObj.split(array);
			for(int i=0;i<mergedArray.length;i++)
				System.out.println(mergedArray[i]);
			
			
	}
}
