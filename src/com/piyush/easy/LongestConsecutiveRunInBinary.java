package com.piyush.easy;

/**
 * @author Piyush
 *
 *Given an integer n, return the length of the longest consecutive 
 *run of 1s in its binary representation.
 *
 *For example, given 156, you should return 3.
 *
 */
public class LongestConsecutiveRunInBinary 
{
	//	using bit magic
	public static int findLongestConsecutive1s(int num)
	{
		int count = 0;
		
		while (num!=0)
		{
			num = (num & (num << 1));
			count++;
		}
		return count;
	}
	
	//	Driver code
	public static void main(String[] args)
	{
		int result = findLongestConsecutive1s(901);
		System.out.println(result);
	}
}
