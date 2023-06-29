package com.iu.study2;

import java.util.Random;

public class Array5 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random random = new Random();
		//중복안되는 랜덤숫자6개
		for(int i=0;i<nums.length;i++) {
			nums[i]=random.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
			}
		}
		//정렬
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int a=nums[i];
					nums[i]=nums[j];
					nums[j]=a;
				}
			}
		}
		//출력
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
