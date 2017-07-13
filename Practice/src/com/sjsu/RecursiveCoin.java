package com.sjsu;

import java.util.ArrayList;

public class RecursiveCoin {
	
	 static ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
	public void findCombo(ArrayList<Integer>yetToProcess, ArrayList<Integer> processed, int target){
		
		int tempSum=0;
		for(int i=0;i<processed.size();i++)
			tempSum+=processed.get(i);
		
		if(tempSum==target)
			//solution.add(processed);
			System.out.println(processed.toString());
		else if(yetToProcess.size()==0)
			return;
		else if(tempSum>target)
			return;
		else{
			
			
			ArrayList<Integer> newYetToProcess = (ArrayList<Integer>) yetToProcess.clone();
			ArrayList<Integer> newProcessed = (ArrayList<Integer>) processed.clone();
			ArrayList<Integer> newExtraProcessed = (ArrayList<Integer>) processed.clone();
			
			newExtraProcessed.add(newYetToProcess.get(0));
			findCombo(newYetToProcess, newExtraProcessed, target);
			int processedEle = newYetToProcess.remove(0);
			
			findCombo(newYetToProcess, newProcessed, target);
			newProcessed.add(processedEle);
			findCombo(newYetToProcess, newProcessed, target);
		}
		
	}
	
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(5);
		input.add(10);
		input.add(25);
		ArrayList<Integer> processed = new ArrayList<Integer>();
		RecursiveCoin obj = new RecursiveCoin();
		obj.findCombo(input,processed,15);
		System.out.println(solution);
	}

}
