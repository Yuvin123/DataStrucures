package com.basic.ganesh.hasingExamples;

public class HelloWorld {
	
	public void foo(StringBuffer sb){
		sb.append("zzzzz");
		sb= new StringBuffer();
		sb.append("xxxx");
		
	}

	public static void main(String[] args) {
		HelloWorld world = new HelloWorld();
		StringBuffer a=new StringBuffer("Hello");
		world.foo(a);
		System.out.println(a);
		
		System.out.println(-5 + 8 * 6);
		  System.out.println((55+9) % 9);
		  System.out.println(20 + -3*5 / 8);
		  System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}

}
