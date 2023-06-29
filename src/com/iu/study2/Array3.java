package com.iu.study2;

public class Array3 {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		
		int [] copyNums = new int[nums.length+1];
		//nums 5칸만들기
		for(int i=0;i<nums.length;i++) {
			copyNums[i]=nums[i];
		}
		copyNums[nums.length]=5;
		
		nums = copyNums;
		
		//nums 4칸만들기
		copyNums = new int[nums.length-1];
		
		for(int i=0;i<copyNums.length;i++) {
			copyNums[i]=nums[i];
		}
		nums=copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
