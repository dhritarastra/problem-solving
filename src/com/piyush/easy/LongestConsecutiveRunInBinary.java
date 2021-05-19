package com.piyush.easy;

/**
 * @author Piyush
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
		int result = findLongestConsecutive1s(63);
		System.out.println(result);
	}
}
