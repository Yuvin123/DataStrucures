package com.basic.ganesh.generalExamples;

import java.util.Arrays;

public class TrickyJavaExamples {

	public static void main(String[] args) {
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		char[] chars = new char[] {'\u0097'}; 
		String str = new String(chars); 
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes));

		
	}
}



