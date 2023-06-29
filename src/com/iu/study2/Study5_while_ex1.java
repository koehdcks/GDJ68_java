package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean check=true;
		//while
		//1.로그인 시도 2. 프로그램 종료
		boolean play=false;
		while(check) {
			System.out.println("아이디를 입력하세요");
			int input_id=sc.nextInt();
			System.out.println("패스워드를 입력하세요");
			int input_pw=sc.nextInt();
			if(input_id==id && input_pw==pw) {
				System.out.println("로그인성공");
				check=!check;
				play=!play;
			}else {
				System.out.println("로그인실패");
				System.out.println("1. 로그인시도 2. 프로그램 종료");
				int select=sc.nextInt();
				if(select==2) {
					check=!check;
					System.out.println("프로그램을 종료합니다.");
				}
			}
		
		}
		
		//로그인 성공 했을 때만 진행
		//MMORPG
		//시작레벨:1
		//모든 몬스터의 경험치는 동일
		//최대레벨:15
		//GOLD : 0 
		//5레벨 달성시 : 1000G지급
		//10레벨 달성시 : 2000G지급
		//15레벨 달성시 : 3000G지급
		//1 -> 2 : 3 (사냥성공)
		//2 -> 3 : 6
		//3 -> 4 : 9
		//....
		//14 -> 15 : 42
		//레벨업메세지
		//렙업시 게임을 계속할지 종료할 지 선택
		//종료시 현재레벨, GOLD가 출력
		int GOLD=0;
		if(play) {
			System.out.println("1. 사냥시작 2. 종료");
			int start=sc.nextInt();
			if(start==1) {
				for(int level=1;level<15;level++) {
					for(int monster=1;monster<=level*3;monster++) {
						System.out.println(monster+"마리 사냥성공");
					}
					switch(level+1) {//5레벨당 골드 누적
					case 5:
						System.out.println("5랩 달성 축하합니다");
						GOLD+=1000;
						break;
					case 10:
						System.out.println("10랩 달성 축하합니다");
						GOLD+=2000;
						break;
					case 15:
						System.out.println("15랩 달성 축하합니다");
						GOLD+=3000;
					}
					System.out.println("레벨업 했습니다. 현재레벨 "+(level+1));
					//렙업시 게임을 계속할지 종료할지
					System.out.println("1.계속하기 2.종료하기");
					int number=sc.nextInt();
					if(number==2) {
						System.out.println("게임을 종료합니다. 현재레벨: "+ (level+1) + " 현재골드: " + GOLD);
						break;
					}
				}
		}
			
	}
}
}