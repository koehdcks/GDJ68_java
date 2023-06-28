package com.iu.study2;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args) {
//		for(int i=0;i<5;i++){
//			System.out.println("hello");
//		}
//		
//		int j=567;
//		for(j=3;j>0;j--) {
//			System.out.println("www");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		//hello 출력
		//키보드로부터 출력 횟수를 입력받음
		System.out.println("횟수를 입력");
		int count = sc.nextInt();
		for(int k=0;k<count;k++) {
			System.out.println("hello");
		}
		
//		System.out.println("횟수를 입력");
//		int count = sc.nextInt();
//		for(int k=count;k>0;k--) {
//			System.out.println("hello");
//		}
//		
	}
}
