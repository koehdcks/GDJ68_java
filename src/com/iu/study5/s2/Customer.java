package com.iu.study5.s2;

public class Customer {
	
	private int money;
	private int point;
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Customer() {
		this.money = 10000000;
		this.point = 50;
	}
	public void buy(Product product) {
		
		this.money = this.money-product.getPrice();
		this.point = this.point+product.getPoint();
		
		System.out.println(this.getMoney());
		System.out.println(this.getPoint());
	}
	
	public void buy(Product[] products) {
		for(int i=0;i<products.length;i++) {
			this.buy(products[i]);
		}
	}
	
}
