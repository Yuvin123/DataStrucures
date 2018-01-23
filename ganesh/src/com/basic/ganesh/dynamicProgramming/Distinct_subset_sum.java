package com.basic.ganesh.dynamicProgramming;

import java.util.HashSet;

public class Distinct_subset_sum {
	// Java program to print distinct
	// subset sums of a given array.

	// sum denotes the current sum 
	// of the subset currindex denotes 
	// the index we have reached in
	// the given array
	static void distSumRec(int arr[], int n, int sum,
			int currindex, HashSet<Integer> s)
	{
		if (currindex > n)
			return;

		if (currindex == n) {
			s.add(sum);
			return;
		}

		distSumRec(arr, n, sum + arr[currindex],
				currindex + 1, s);
		distSumRec(arr, n, sum, currindex + 1, s);
	}

	// This function mainly calls 
	// recursive function distSumRec() 
	// to generate distinct sum subsets.
	// And finally prints the generated subsets.
	static void printDistSum(int arr[], int n)
	{
		HashSet<Integer> s = new HashSet<>();
		distSumRec(arr, n, 0, 0, s);

		// Print the result
		for (int i : s)
			System.out.print(i + " ");
	}
	
	
	
	
	// Uses Dynamic Programming to
    // find distinct subset sums
    static void printDistSum_2(int arr[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
 
        // dp[i][j] would be true if arr[0..i-1] 
        // has a subset with sum equal to j.
        boolean[][] dp = new boolean[n + 1][sum + 1];
 
        // There is always a subset with 0 sum
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;
 
        // Fill dp[][] in bottom up manner
        for (int i = 1; i <= n; i++) 
        {
            dp[i][arr[i - 1]] = true;
            for (int j = 1; j <= sum; j++) 
            {
                // Sums that were achievable
                // without current array element
                if (dp[i - 1][j] == true) 
                {
                    dp[i][j] = true;
                    dp[i][j + arr[i - 1]] = true;
                }
            }
        }
 
        // Print last row elements
        for (int j = 0; j <= sum; j++)
            if (dp[n][j] == true)
                System.out.print(j + " ");
    }

	//Driver code
	public static void main(String[] args)
	{
		int arr[] = { 2, 3, 4, 5, 6 };
		int n = arr.length;
		printDistSum(arr, n);
		printDistSum_2(arr, n);
	}
}
