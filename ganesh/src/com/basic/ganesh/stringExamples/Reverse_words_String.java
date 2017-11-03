package com.basic.ganesh.stringExamples;

import java.util.StringTokenizer;

public class Reverse_words_String {

	static String Reverse(String str) {
		StringBuilder result = new StringBuilder();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			StringBuilder thisToken = new StringBuilder(st.nextToken());
			result.append(thisToken.reverse() + " ");
			
		}
		return result.toString();
	}
	
	private static String Reverse_method2(String str) {
	      char charArray[] = str.toCharArray();
	    for (int i = 0; i <str.length(); i++){
	        if(charArray[i] == ' ')
	        return Reverse(str.substring(i + 1)) + str.substring(0, i) + " ";
	    }

	    return str + " ";
	}
	
	
	public static void main(String args[]){
		
		String str = "My name is Ganesh";
		
		System.out.println(Reverse_words_String.Reverse(str));
		System.out.println(Reverse_words_String.Reverse_method2(str));
		
		
		String str2[] = "He is the one".split(" ");
	    String finalStr="";
	        for(int i = str2.length-1; i>= 0 ;i--){
	            finalStr += str2[i]+" ";
	        }
	        System.out.println(finalStr);
	    }
		
	}

