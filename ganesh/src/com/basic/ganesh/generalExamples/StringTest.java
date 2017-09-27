package com.basic.ganesh.generalExamples;

public class StringTest {
	
	
	public static void main(String[] args){
		final StringBuffer a=new StringBuffer("Hello");
		a.append(" Welcome");
		System.out.println(a);
		
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Ganesh");
		String s2 = foo(sb1);
		System.out.println(sb1);
		System.out.println(s2);
	}

	private static String foo(StringBuffer sb1) {
		sb1.append(" weds");
		sb1 = new StringBuffer();
		sb1.append("Neelima");
		return sb1.toString();
	}
	
}
