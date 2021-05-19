package com.piyush.easy;

/**
 * @author Piyush
 *
 */
public class LargestProductOfThreeIntegersInAnArray 
{
	public static int findLargestSumOfThreeInts(int[] nums) 
	{
		int result = 0;
		int min_1 = Integer.MAX_VALUE, min_2 = Integer.MIN_VALUE;
		int max_1 = Integer.MIN_VALUE, max_2 = Integer.MIN_VALUE, max_3 = Integer.MIN_VALUE;
		
		//	iterating over the numbers in the array
		for(int n: nums) 
		{
			/*
			 * finding out the max 3 and least 2 numbers (-ve only) the combination of
			 * either max 3 numbers or max and least 2 -ve numbers can be the largest
			 * product
			 */
			if(n < min_1) 
			{
				min_2 = min_1;
				min_1 = n;
			}else if(n < min_2) 
			{
				min_2 = n;
			}else if(n > max_1) 
			{
				max_3 = max_2;
				max_2 = max_1;
				max_1 = n;
			}else if(n > max_2) 
			{
				max_3 = max_2;
				max_2 = n;
			}else if(n > max_3) 
			{
				max_3 = n;
			}
			
			result = Math.max((min_1 * min_2 * max_1), (max_3 * max_2 * max_1));
		}
		return result;
	}
	
	//	Driver code
	public static void main(String[] args) 
	{
		int[] nums = {1, 3, -11, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 8};
		int largestProduct = findLargestSumOfThreeInts(nums);
		System.out.println(largestProduct);
	}
}
