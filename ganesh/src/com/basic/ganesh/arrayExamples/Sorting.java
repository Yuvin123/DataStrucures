package com.basic.ganesh.arrayExamples;

public class Sorting {

	
	public static void  remove(int[] buffer, int length) {
		
		int insert =0;
		for(int i =1; i<length; i++) {
			if(buffer[i] != buffer[i-1]) {
				buffer[insert] = buffer[i];
				insert++;
			}
			
		}
		
	}
	
	
	 public static void main (String[] args)
	    {
	        int arr[] = {1, 1, 1, 5, 7, 7,9};
	        int n = arr.length;
	        remove(arr, n);
	        System.out.println(arr);
	    }
}
