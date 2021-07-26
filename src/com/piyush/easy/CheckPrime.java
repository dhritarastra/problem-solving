package com.piyush.easy;

/*
 * This programs takes an int as input and returns boolean if the number is
 * prime or not, the tie complexity is O(n^1/2)
 * 
*/
public class CheckPrime {

	public static void main(String[] args) {

		System.out.println(isPrime(5));
		
	}

	private static boolean isPrime(int i) {
		if(i==0 || i==1) return false;
		if(i==2 || i==3) return true;
		if(i%2==0 || i%3==0) return false;
		for(int j=5; j*j<=i; j=j+6) {
			if(i%j==0 || i%(j+2)==0) {
				return false;
			}
		}
		return true;
	}

}
