package com.basic.ganesh.bitwise;

public class RotateBitsOfNumbers {
	private static final int INT_BITS = 32;

	static int leftRotate(int n, int d)
	{
	   /* In n<<d, last d bits are 0. To put first 3 bits of n at 
	     last, do bitwise or of n<<d with n >>(INT_BITS - d) */
	   return (n << d)|(n >> (INT_BITS - d));
	}
	 
	/*Function to right rotate n by d bits*/
	static int rightRotate(int n, int d)
	{
	   /* In n>>d, first d bits are 0. To put last 3 bits of at 
	     first, do bitwise or of n>>d with n <<(INT_BITS - d) */
	   return (n >> d)|(n << (INT_BITS - d));
	}
	 
	/* Driver program to test above functions */
	public static void main(String args[])
	{
	  int n = 16;
	  int d = 2;
	  System.out.println(leftRotate(n, d));
	  System.out.println(rightRotate(n, d));
	} 
}
