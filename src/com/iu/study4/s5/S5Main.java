package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
//		//static
//		StaticTest st = new StaticTest();
//		st.instanceNum=50;
		//객체생성없이 사용가능
		//클래스명.클래스변수명
//		StaticTest.staticNum=20;
		
//		StaticTest st = new StaticTest();
//		st.instanceMethod();
		
		//클래스명.메서드명();
//		StaticTest.staticMethod();
		
		MyCar.company="KIA";
		
		MyCar myCar = new MyCar();
		myCar.brand="A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar.brand="SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
	}


}
