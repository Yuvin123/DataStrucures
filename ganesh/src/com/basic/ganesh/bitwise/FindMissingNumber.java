package com.basic.ganesh.bitwise;

public class FindMissingNumber {

	// Function to ind missing number
	static int getMissingNo_1 (int a[], int n)
	{
		int i, total;
		total  = (n+1)*(n+2)/2;   
		for ( i = 0; i< n; i++)
			total -= a[i];
		return total;
	}


	// Function to find missing number
	static int getMissingNo_2 (int a[], int n)
	{
		int i;
		int x1 = a[0]; 
		int x2 = 1; 

		/* For xor of all the elements 
	           in array */
		for (i = 1; i< n; i++)
			x1 = x1^a[i];

		/* For xor of all the elements 
	           from 1 to n+1 */        
		for ( i = 2; i <= n+1; i++)
			x2 = x2^i;         

		return (x1^x2);
	}  


	/* program to test above function */
	public static void main(String args[])
	{
		int a[] = {1,2,4,5,6};
		int miss = getMissingNo_1(a,5);

		int miss2 = getMissingNo_2(a,5);
		System.out.println(miss);  
		System.out.println(miss2);
	}
}

