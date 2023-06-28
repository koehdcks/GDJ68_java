package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study4_for2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//구구단
//		for(int dan=2;dan<10;dan++) {
//			for(int i=1;i<10;i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//		}
		
		//종료할 분, 초를 입력받아서
		//해당 분초가 되면 종료
		System.out.println("종료할 분 초를 입력하세요");
		int min=sc.nextInt();
		int sec=sc.nextInt();
		for(int i=0;i<=min;i++) {
			for(int j=0;j<60;j++) {
				System.out.println(i+"분 "+j+"초");
				if(i==min&&j==sec) {
					break;
				}
			}
		}
	
		
	}
}
