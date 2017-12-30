package com.basic.ganesh.bitwise;

public class CountNoOfBitsFromAtoB {


	// Function that count set bits
	static int countSetBits(int n)
	{
		int count = 0;
		while (n!=0)
		{
			count += n & 1;
			n >>= 1;
		}
		return count;
	}

	// Function that return count of
	// flipped number
	static int FlippedCount(int a, int b)
	{
		// Return count of set bits in
		// a XOR b
		return countSetBits(a^b);
	}

	// Driver code
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		System.out.println(FlippedCount(a, b));
	}
}
