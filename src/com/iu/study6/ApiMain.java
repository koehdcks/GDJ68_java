package com.iu.study6;

public class ApiMain {

	public static void main(String[] args) {
		
		Object obj = new Object();
		boolean check = obj.equals(null);
		String str = obj.toString();
		
		int r=obj.hashCode();
		String st = "hello";
		char ch = st.charAt(4);
		
		System.out.println(ch);

	}

}
