package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
	
		Student[] students = ss.makeStudents();
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].total);
			System.out.println(students[i].avg);
		}
		
	}

}
