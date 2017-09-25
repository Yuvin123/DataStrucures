package com.basic.ganesh.hasingExamples;

import java.util.HashSet;

public class PrintpairsAndCheckDuplicates {
	
	
	    private static final int MAX = 100000; // Max size of Hashmap

	    static void printpairs(int arr[],int sum)
	    {
	        // Declares and initializes the whole array as false
	        boolean[] binmap = new boolean[MAX];

	        for (int i=0; i<arr.length; ++i)
	        {
	            int temp = sum-arr[i];

	            // checking for condition
	            if (temp>=0 && binmap[temp])
	            {
	                System.out.println("Pair with given sum " +
	                                    sum + " is (" + arr[i] +
	                                    ", "+temp+")");
	            }
	            binmap[arr[i]] = true;
	        }
	    }
	    
	    static boolean checkDuplicatesWithinK(int arr[], int k)
	    {
	        // Creates an empty hashset
	        HashSet<Integer> set = new HashSet<>();
	 
	        // Traverse the input array
	        for (int i=0; i<arr.length; i++)
	        {
	            // If already present n hash, then we found 
	            // a duplicate within k distance
	            if (set.contains(arr[i]))
	               return true;
	 
	            // Add this item to hashset
	            set.add(arr[i]);
	 
	            // Remove the k+1 distant item
	            if (i >= k)
	              set.remove(arr[i-k]);
	        }
	        return false;
	    }
	 

	    // Main to test the above function
	    public static void main (String[] args)
	    {
	        int A[] = {1, 4, 45, 6, 10, 8};
	        int n = 16;
	        printpairs(A,  n);
	        
	       /////////////////////////////////////// 
	        
	        int arr[] = {10, 5, 3, 4, 3, 5, 6};
	        if (checkDuplicatesWithinK(arr, 3))
	           System.out.println("Yes");
	        else
	           System.out.println("No");
	    }
	}


