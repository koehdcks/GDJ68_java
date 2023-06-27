package com.iu.study2;

import java.util.Scanner;

public class Study3_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 Data
		int id = 1234;
		int pw=5678;
		
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인 성공, 로그인 실패 메세지 출력
		//--- 로그인 처리 후 작성
				//로그인이 성공한 사람만 실행 가능
				//1. 정규직, 2. 계약직
				//급여 입력
				//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재보험 1%
				//계약직 : 3.3%
				//실급여 출력
		System.out.println("아이디를 입력하세요.");
		int input_id=sc.nextInt();
		System.out.println("비밀번호를 입력하세요");
		int input_pw=sc.nextInt();
		
		if(input_id==id && input_pw==pw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		int rank = 0;
		int money = 0;
		
		if(input_id==id && input_pw==pw) {
			System.out.println("1. 정규직 2. 계약직");
			rank=sc.nextInt();
			System.out.println("급여를 입력하세요.");
			money=sc.nextInt();
			switch(rank) {
			case 1:
				money = (int)(money*0.93);
				System.out.println("정규직 : " + money );
				break;
			case 2:
				money = (int)(money*0.967);
				System.out.println("계약직 : " + money);
				break;
			default:
				System.out.println("1번또는 2번을 눌러주세요");
			}
		}
		
		
		
	}
}
