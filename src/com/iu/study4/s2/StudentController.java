package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		//1. 학생정보 생성-- makeStudents 호출 
		//2. 학생정보 출력-- StudentView에서 출력 
		//3. 프로그램 종료-- 종료를 누르기전까지 반복
		
		     /*            Main
		      * 			|	
		      * 	SS   -  SC   -  SV
		      * 
		      */
		Scanner sc = new Scanner(System.in);
		int select = 0;
		StudentService ss = new StudentService();
		Student[] students = null;
		StudentView sv = new StudentView();                                                                                                                                             
		
		do{
		
			System.out.println("1.학생정보생성");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			select = sc.nextInt();
			
			if(select==1) {// 1.학생정보생성
				students = ss.makeStudents();
			}else if(select==2) {// 2.학생정보출력
				sv.view(students);
			}else if(select==3) {// 3.학생정보검색
				//1. findBynum
				//2. viewOne
				Student student = ss.findByNum(students);
				sv.view(student);
			}else if(select==4) {// 4.프로그램종료
				System.out.println("종료 합니다");
				break;
			}else {// 그 외의 번호
				System.out.println("1~4번의 번호만 입력하세요");
			}
		}while(true);
	}
}
