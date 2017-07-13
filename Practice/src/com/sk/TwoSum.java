package com.sk;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int target, int[] nums){
		
		Map<Integer, Integer> map = new HashMap<>();
		int a[] = new int[2];
		for(int i=0; i<nums.length;i++){
			if(map.containsKey(target - nums[i])){
				a[1]=i;
				a[0]=map.get(target-nums[i]);
			}
			else
				map.put(nums[i], i);
		}
		return a;
	}
	
	public static void main(String args[]){
		TwoSum t = new TwoSum();
		int[] nums = {1,2,6,7,8,4};
		int target =3;
		System.out.println(t.twoSum(target, nums));
	}
}
