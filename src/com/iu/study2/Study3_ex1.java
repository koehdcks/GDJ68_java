package com.iu.study2;

import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산(평균은 int)
		//90:A 80:B 70:C 60:D 그외:F
		//switch 사용
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 영어 수학 점수를 입력하세요.");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int total = kor+eng+math;
		int avg = total/3;
		String grade = "";
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		switch(avg/10) {
		case 10:
		case 9:
			grade ="A";
			break;
		case 8:
			grade ="B";
			break;
		case 7:
			grade ="C";
			break;
		case 6:
			grade ="D";
			break;
		default:
			grade ="F";
		}
		System.out.println(grade);
	}

}
