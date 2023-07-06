package com.iu.study4.s3;

public class Test {
	
	int num1;
	double num2;
	
	//메서드 오버로딩 : 메서드명을 같게하고 매개변수의 갯수나 타입을 다르게한다.
	
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}
	public void hap(int n1, int n2, int n3) {
		
	}
	
	public void hap(int num1) {  //멤버변수와 지역변수를 더하는법
		System.out.println(this.num1+num1);
	}
	
	public boolean same(Test t) {
		//num1 과 다른 객체의 num1이 같고
		//num2 와 다른 객체의 num2가 같으면 true 리턴, 아니면 false 리턴
		boolean result=false;
		if(this.num1 == t.num1 && this.num2 == t.num2) {
			result=true;
		}
		
		
		return result;
	}
	
	public void method1() {
		//참조변수명.멤버변수명
		System.out.println(this.num1+this.num2);
		System.out.println(this);
		method2();
		this.method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
}
