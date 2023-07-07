package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Magician magician = new Magician();
		Warrior warrior = new Warrior();
		
		warrior.getItem();
		magician.getItem();
		
		warrior.hit();
		
		//warrior.axe.name
		Character character = magician;
		
		magician.setMp(20);
		
		
		
		character = warrior;
		
		Character [] w = new Character[2];
		w[0] = warrior;
		w[1] = magician;
		
		warrior = (Warrior)w[0];
		magician = (Magician)w[1];
		
		//-----------------------------------------

	}

}
