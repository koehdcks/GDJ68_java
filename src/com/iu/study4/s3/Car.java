package com.iu.study4.s3;

public class Car {
	
	String company; //접근지정자 생략 = default = 같은 패키지 내에서만 사용가능
	String brand;
	public String color;
	int price;
	
	//생성자(Constructor)
	//객체가 생성될때 한번 호출되는 메서드
	//클래스 내에 생성자가 없으면 컴파일러가 기본 생성자를 만들어 줌
	//접근지정자 클래스명과동일한이름([매개변수들 선언]){}
	public Car() {
		//매개변수가 비어있는 생성자
		//기본생성자
		this("A7"); //생성자 내에서 또다른 생성자를 호출 할 때 사용 생성자 범위내의 맨 윗줄에 있어야함
		System.out.println("자동차를 만듭니다.");
//		this.company="AUDI";
//
//		this.color="PINK";
//		this.price=9985;
	}
	
	public Car(String brand) {
		this("A7","BLACK");
//		this.company="AUDI";
//		this.brand=brand;
//		this.color="PINK";
//		this.price=9985;
	}
	public Car(String brand, String color) {
		this("A7","BLACK",10000);
//		this.company="AUDI";
//		this.brand=brand;
//		this.color=color;
//		this.price=9985;
	}
	public Car(String brand, String color,int price) {
		this.company="AUDI";
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Wheel : " + this.price);
	}
}
