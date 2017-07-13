package com.sjsu;

import java.util.ArrayList;

public class FindTargetCombination {
	
	 static ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
	public void findCombo(ArrayList<Integer>yetToProcess, ArrayList<Integer> processed, int target){
		
		int tempSum=0;
		for(int i=0;i<processed.size();i++)
			tempSum+=processed.get(i);
		
		if(tempSum==target)
			solution.add(processed);
		else if(yetToProcess.size()==0)
			return;
		else{
			
			
			ArrayList<Integer> newYetToProcess = (ArrayList<Integer>) yetToProcess.clone();
			ArrayList<Integer> newProcessed = (ArrayList<Integer>) processed.clone();
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
		//input.add(7);
		//input.add(10);
		ArrayList<Integer> processed = new ArrayList<Integer>();
		FindTargetCombination obj = new FindTargetCombination();
		obj.findCombo(input,processed,6);
		System.out.println(solution);
	}

}
