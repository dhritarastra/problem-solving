package com.piyush.medium;

import java.util.Arrays;

/**
 * @author Piyush
 * 
 * Given an array of numbers N and an integer k, your task is to split N into k 
 * partitions such that the maximum sum of any partition is minimized. Return this sum.
 * 
 * For example, given N = [5, 1, 2, 7, 3, 4] and k = 3, you should return 8, since the 
 * optimal partition is [5, 1, 2], [7], [3, 4].
 * 
 */
public class MaxSumOfSubArrayIsMin 
{
	public static int maxSumOfSubArray(int[] arr, int k)
	{
		Arrays.sort(arr);
		int arrLen = arr.length;
		
		//	array length cannot be less than the number of partitions to be formed
		if(arrLen<k)
		{
			return 0;
		}
		
		//	get the largest int in the array
		int max = arr[arrLen-1];
		
		/*
		 * assuming the maximum size of partition to be the largest number, the sum of
		 * remaining numbers should be divided among the remaining partition such that
		 * each partition should be less than the largest number (max)
		 */
		int remainingAverage = sumOfRemainingArray(arr, arrLen)/(k-1);
		
		/*
		 * if remainingAverage is greater than max, therefore the largest number stored
		 * in a partition would be greater than max, and this larger number would be
		 * equal to the remaining average
		 */
		if(remainingAverage > max)
		{
			max = remainingAverage;
		}
		
		return max;
	}
	
	/*
	 * simply calculates the sum of the remaining integers in the array (apart from the
	 * largest element of the array)
	 */
	private static int sumOfRemainingArray(int[] arr, int arrLen) 
	{
		int sum = 0;
		for(int i=0; i<arrLen-1; i++) 
		{
			sum += arr[i];
		}
		return sum;
	}

	//	Driver code
	public static void main(String[] args) 
	{
		int[] arr = {5, 2, 1, 4, 5};
		int k = 3;
		System.out.println(maxSumOfSubArray(arr, k));
	}

}
