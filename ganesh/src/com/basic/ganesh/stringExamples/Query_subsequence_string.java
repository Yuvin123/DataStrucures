package com.basic.ganesh.stringExamples;

public class Query_subsequence_string {
	// Java program to answer subsequence queries for
	// a given string.

	static final int MAX = 10000;
	static final int CHAR_SIZE = 26;

	// Precompute the position of each character from
	// each position of String S
	static void precompute(int mat[][], String str, int len) {
		for (int i = 0; i < CHAR_SIZE; ++i)
			mat[len][i] = len;

		// Computing position of each character from
		// each position of String S
		for (int i = len - 1; i >= 0; --i) {
			for (int j = 0; j < CHAR_SIZE; ++j)
				mat[i][j] = mat[i + 1][j];

			mat[i][str.charAt(i) - 'a'] = i;
		}
	}

	// Print "Yes" if T is subsequence of S, else "No"
	static boolean query(int mat[][], String str, int len) {
		int pos = 0;

		// Traversing the string T
		for (int i = 0; i < str.length(); ++i) {
			// If next position is greater than
			// length of S set flag to false.
			if (mat[pos][str.charAt(i) - 'a'] >= len)
				return false;

			// Setting position of next character
			else
				pos = mat[pos][str.charAt(i) - 'a'] + 1;
		}
		return true;
	}

	// Driven Program
	public static void main(String args[]) {
		String S = "geeksforgeeks";
		int len = S.length();

		int[][] mat = new int[MAX][CHAR_SIZE];
		precompute(mat, S, len);

		String get = query(mat, "gg", len) ? "Yes" : "No";
		System.out.println(get);
		get = query(mat, "gro", len) ? "Yes" : "No";
		System.out.println(get);
		get = query(mat, "gfg", len) ? "Yes" : "No";
		System.out.println(get);
		get = query(mat, "orf", len) ? "Yes" : "No";
		System.out.println(get);

	}
}
