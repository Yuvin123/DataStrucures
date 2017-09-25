package com.basic.ganesh.hasingExamples;

public class StringTest {
	
	
	public static void main(String[] args){
		final StringBuffer a=new StringBuffer("Hello");
		a.append(" Welcome");
		System.out.println(a);
		
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Ganesh");
		foo(sb1);
		System.out.println(sb1);
	}

	private static void foo(StringBuffer sb1) {
		sb1.append(" weds");
		sb1 = new StringBuffer();
		sb1.append("Neelima");
	}
	
}
