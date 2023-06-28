package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//TRPG
		int hp=40;//유저의 HP
		int monsterHp=60;//몬스터의 HP
		int monsterPower=40;//몬스터의 공격력
		boolean game=true;
		
		//유저정보
		//1.평타 2.스킬 3.HP회복 4.도망
		//평타 : 0~10 미만의 공격이 몬스터에게 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용(최대3번까지만)
		//회복 : 0~40 까지 회복(HP최대치는40)
		//도망 : 50%확률로 성공, 실패
		
		//몬스터
		//1 : 유저 공격 0~40의 공격을 유저에게
		while(hp>0 && monsterHp>0) {
			int mattack= random.nextInt(monsterPower+1);
			int uattack= random.nextInt(10);
			int uskill= random.nextInt(30);
			int uheal= random.nextInt(40+1);
			int urun= random.nextInt(2);
			System.out.println("시작합니다");
			System.out.println("유저HP: " + hp + " 몬스터HP: " + monsterHp);
			System.out.println("1.평타 2.스킬 3.HP회복 4.도망");
			int select = sc.nextInt();
			//유저턴
			System.out.println("유저턴");
			if(select==1) {
				monsterHp=monsterHp-uattack;
				System.out.println("몬스터가 "+uattack+"의 데미지를 입습니다.");
				if(monsterHp<0) {
					monsterHp=0;
				}
				System.out.println("몬스터의체력 " + monsterHp);
			}else if(select==2) {
				monsterHp=monsterHp-uskill;
				System.out.println("몬스터가 "+uskill+"의 데미지를 입습니다.");
				if(monsterHp<0) {
					monsterHp=0;
				}
				System.out.println("몬스터의체력 " + monsterHp);
			}else if(select==3) {
				hp=hp+uheal;
				System.out.println("유저가 "+uheal+"의 체력을 회복합니다");
				if(hp>40) {
					hp=40;
				}
				System.out.println("유저의체력 " + hp);
			}else {
				if(urun==1) {
					System.out.println("도망에 성공합니다");
					break;
				}else {
					System.out.println("도망에 실패합니다");
				}
			}
			//몬스터턴
			if(hp>0 && monsterHp>0) {
				System.out.println("몬스터턴");
				hp=hp-mattack;
				System.out.println("유저가 "+mattack+"의 데미지를 입습니다.");
				if(hp<0) {
					hp=0;
				}
				System.out.println("유저의 체력 " + hp);
			}
			if(hp<=0) {
				System.out.println("유저가 죽었습니다.");
			}else if(monsterHp<=0) {
				System.out.println("몬스터가 죽었습니다.");
			}
			
		}
	}

	
}
