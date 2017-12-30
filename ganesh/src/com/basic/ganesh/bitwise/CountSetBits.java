package com.basic.ganesh.bitwise;

public class CountSetBits {
	    
	 
	/* Function to get no of set bits in binary
	   representation of positive integer n */
	public static int countSetBits_1(int n)
	{
	   int count = 0;
	  while (n!=0)
	  {
	    count += n & 1;
	    n >>= 1;
	  }
	  return count;
	}
	
	
	
	public static int countSetBits_2(int n)
	{
	     int count = 0;
	    while (n!=0)
	    {
	      n &= (n-1) ;
	      count++;
	    }
	    return count;
	}
	 
	 
	/* Program to test function countSetBits */
	public static void main(String args[])
	{
	    int i = 9;
	   System.out.println(countSetBits_1(i));
	   System.out.println(countSetBits_2(i));
	}
}
