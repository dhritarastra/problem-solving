package com.piyush.easy;

import java.util.Arrays;

/**
 * @author Piyush
 * 
 *         Given an integer, find the next permutation of it in absolute order.
 *         For example, given 48975, the next permutation would be 49578.
 *
 */
public class NextPrmutation {

	public static int getNextPermutation(int num) {

		String strNum = String.valueOf(num);
		char[] charNum = strNum.toCharArray();
		int i;

		for (i = charNum.length - 1; i > 0; i--) {
			if (charNum[i] > charNum[i - 1]) {
				i = i - 1;
				break;
			}
		}

		if (i == 0) {
			return 0;
		}

		int low = Integer.MAX_VALUE, indexLow = 0;

		for (int j = i + 1; j < charNum.length; j++) {
			if (charNum[j] < low && charNum[j] >= charNum[i]) {
				low = charNum[j];
				indexLow = j;
			}
		}

		swap(charNum, i, indexLow);

		Arrays.sort(charNum, i + 1, charNum.length);

		strNum = String.valueOf(charNum);
		num = Integer.parseInt(strNum);

		return num;

	}

	private static void swap(char[] charNum, int i, int indexLow) {
		
		char temp = charNum[i];
		charNum[i] = charNum[indexLow];
		charNum[indexLow] = temp;
		
	}

	public static void main(String[] args) {
		
		System.out.println(getNextPermutation(534976));
		
	}

}
