package com.iu.study4;

public class Soldier {
	
	String grade;
	int num;
	int[] ar;
	
	
	public void attack(int d) {
		Rifle rifle = new Rifle();
		rifle.shoot1(d);
	}

}
