package com.iu.study2;

import java.util.Scanner;

public class Study4_for_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		boolean check = false;
		
		//로그인 시도 최대 5번까지
		for(int i=0;i<5;i++) {
			System.out.println("ID를 입력하세요");
			int input_id=sc.nextInt();
			System.out.println("PW를 입력하세요");
			int input_pw=sc.nextInt();
			
			if(input_id==id && input_pw==pw) {
				System.out.println("로그인 성공");
				check=!check;
				break;
				
			}else {
				System.out.println("아이디 또는 패스워드가 틀렸습니다.");
			}
			if(i==4) { // 5회틀리면 시스템 종료
				System.out.println("시스템을 종료합니다.");
			}
		}
		
		//로그인 성공시 급여계산 출력
		if(check) {
			System.out.println("급여 계산");
		}
		
		
	}
}
