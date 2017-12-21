package com.basic.ganesh.stringExamples;

import java.util.LinkedHashSet;

public class StringRemoveDuplicates {




	public static void main(String args[]){
		
		StringRemoveDuplicates StrDup = new StringRemoveDuplicates();
		String str = "geeksforgeeks";
		
		StrDup.removeDup(str);

	}

	private void removeDup(String str) {
		LinkedHashSet<Character> lsh = new LinkedHashSet<Character>();
		for(int i =0; i<=str.length()-1;i++){
			lsh.add(str.charAt(i));
		}
		
		 // print string after deleting duplicate elements
        for(Character ch : lsh)
            System.out.print(ch);
		
	}
}
