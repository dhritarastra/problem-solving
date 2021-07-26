package com.piyush.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * The Sieve of Eratosthenes is an algorithm used to generate all prime numbers smaller than N. 
 * The method is to take increasingly larger prime numbers, and mark their multiples as composite. 
 * For example, to find all primes less than 100, we would first mark [4, 6, 8, ...] 
 * (multiples of two), then [6, 9, 12, ...] (multiples of three), and so on. 
 * Once we have done this for all primes less than N, the unmarked numbers that remain will be prime.
 * 
*/

public class StieveOfEratosthenes {

	public static void main(String[] args) {

		System.out.println(getAllPrimesWithin(100));
		
	}
	
	private static List<Integer> getAllPrimesWithin(int num){
		
		List<Integer> res = new ArrayList<>();
		boolean[] stieve = new boolean[num+1];
		Arrays.fill(stieve, true);
		
		for(int i=2; i*i<=num; i++) {
			if(stieve[i]) {
				for(int j = 2*i; j<=num; j=j+i) {
					stieve[j] = false;
				}
			}
		}
		
		for(int i=2; i<=num; i++) {
			if(stieve[i]) {
				res.add(i);
			}
		}
		return res;
	}
	
}
