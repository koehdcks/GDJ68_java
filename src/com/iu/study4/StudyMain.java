package com.iu.study4;

import java.util.Iterator;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
//		
//		Card card = new Card();
//		
//		Card card2 = new Card();
//		
//		System.out.println(card.cvc);
//		System.out.println(card.name);
//		
		Student std1 = new Student();
		
		std1.name="Winter";
		std1.gender='F';
		
		Student std2 = new Student();
		std2.name="iu";
		std2.gender='F';
		
		
		//출력
		StudentView sv = new StudentView();
//		sv.view(std1);
		//
		Student[] stds= {std1,std2};
		sv.viewAll(stds);
		
		
		
//		Student std2 = new Student();
//		
//		std2.name="iu";
//		
//		Student[] students = new Student[3];
//		students[0]=std1;
//		students[1]=std2;
//		
//		
//		for(int i=0;i<students.length;i++) {
//			System.out.println(students[i].name);
//			System.out.println(students[i].id);
//		}
//		
//		Student std3 = new Student();
//		std3.name="ccc";
////		std2=std1;
////		
////		System.out.println(std2.name);
////		
		System.out.println("프로그램 종료");
		
	}

}
