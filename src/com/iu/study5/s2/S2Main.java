package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setMaker("APPLE");
		computer.setModel("맥북프로");
		computer.setCpu("i9");
		computer.setColor("SILVER");
		computer.setPrice(3000000);
		computer.setPoint(30);
		
		Tv tv = new Tv();
		tv.setMaker("LG");
		tv.setModel("좋은tv");
		tv.setInch(100);
		tv.setColor("BLACK");
		tv.setPrice(5000000);
		tv.setPoint(50);
		
		Phone phone = new Phone();
		phone.setMaker("APPLE");
		phone.setModel("IPHONE15");
		phone.setOs("IOS");
		phone.setColor("WHITE");
		phone.setPrice(1800000);
		phone.setPoint(15);
		
		Customer winter = new Customer();
		
		Product[] products= {computer,tv,phone};
		winter.buy(products);
		
	}

}
