package com.iu.study4;

public class StudentView {

	//Student 정보를 출력
	//view
	
	public void view(Student s) {
		System.out.println(s.name);
		System.out.println(s.gender);
	}
	
	//viewAll
	//모든 student 정보를 출력
	//단, viewALL 매개변수는 딱 한개만 선언
	
	public void viewAll(Student[] stds) {
		for(int i=0;i<stds.length;i++) {
			System.out.println(stds[i].name);
			System.out.println(stds[i].gender);
		}
	}
}
