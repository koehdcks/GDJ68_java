package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student findByNum(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을려는 학생의 번호를 입력하세요");
		int num = sc.nextInt();
		Student student = null;
		for(int i=0;i<students.length;i++) {
			if(students[i].getNum()==num) {
				student = students[i];
				break;
			}
		}
		return student;
	}
	
	public Student[] makeStudents() {
		//학생수 입력
		//학생수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어, 수학 점수입력
		//총점, 평균 계산
		//학생들을 리턴
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		
		Student[] students = new Student[count];
		
		for(int i=0;i<count;i++) {
			Student student = new Student();
			System.out.println("이름");
			student.setName(sc.next());
			
			System.out.println("번호");
			student.setNum(sc.nextInt());
			
			System.out.println("국어점수");
			student.setKor(sc.nextInt());
			
			System.out.println("영어점수");
			student.setEng(sc.nextInt());
			
			System.out.println("수학점수");
			student.setMath(sc.nextInt());
			
//			student.total = student.kor+student.eng+student.math;
//			
//			student.avg = student.total/3;
			student.cal(); // 총점과 평균을 구하는 메서드
			
			students[i]=student;
			
		}
		return students;
		
	}
	
}
