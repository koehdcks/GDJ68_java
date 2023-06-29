package com.iu.study3;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {1,2,3,4,5};
		int[] copyNums = new int[nums.length-1];
		System.out.println("지울려고하는 index번호를 입력하세요");
		int idx=sc.nextInt(nums.length);
		
		for(int i=0,j=0;j<copyNums.length;i++,j++) {
			if(i==idx) {
				i++;
			}
			copyNums[j]=nums[i];
		}
		nums=copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		
		
	}
}
