package com.iu.study5.s1;

public class Warrior extends Character {
	
	Axe axe;
	
	public Warrior() {
		super();//부모의 생성자 호출 생략가능
	}
	
	
	@Override
	public void hit() {
		System.out.println("칼로 공격");
	}
	
	


	
}
