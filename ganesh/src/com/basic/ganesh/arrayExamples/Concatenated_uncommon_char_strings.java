package com.basic.ganesh.arrayExamples;

import java.util.HashMap;

public class Concatenated_uncommon_char_strings {

	static String concatenetedString(String s1, String s2)

	{

		String res = ""; // result

		// store all characters of s2 in map

		HashMap<Character, Integer> m = new HashMap<Character, Integer>();

		for (int i = 0; i < s2.length(); i++)

			m.put(s2.charAt(i), 1);

		// Find characters of s1 that are not

		// present in s2 and append to result

		for (int i = 0; i < s1.length(); i++)

		{

			if (!m.containsKey(s1.charAt(i)))

				res += s1.charAt(i);

			else

				m.put(s1.charAt(i), 2);

		}

		// Find characters of s2 that are not

		// present in s1.

		for (int i = 0; i < s2.length(); i++)

			if (m.get(s2.charAt(i)) == 1)

				res += s2.charAt(i);

		return res;

	}

	/* Driver program to test above function */

	public static void main(String[] args)

	{

		String s1 = "abcs";

		String s2 = "cxzca";

		String s = concatenetedString(s1, s2);

		System.out.println(s);

	}

}