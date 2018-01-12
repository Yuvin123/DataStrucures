package com.basic.ganesh.Amazon;

import java.util.LinkedHashSet;

public class UniqueCharFromTwoStrings {


	static void checkUniqueCharFromTwoStrings(String s1, String s2) {


		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();

		LinkedHashSet<Character> s1CharSet = new LinkedHashSet<Character>();
		LinkedHashSet<Character> s2CharSet = new LinkedHashSet<Character>();

		for(char kc : s1Array){
			s1CharSet.add(kc);
		}

		for(char c: s2Array){
			s2CharSet.add(c);
		}

		s1CharSet.retainAll(s2CharSet);

		if(s1CharSet.size()==0){
			System.out.println("There are no common characters between the two strings");
		}
		else{
			System.out.println(s1CharSet);
		}

	}

	public static void main(String args[]) {

		String s1 = "I am living in india";
		String s2 = "india is a beautiful country";
		checkUniqueCharFromTwoStrings(s1, s2);


	}
}

