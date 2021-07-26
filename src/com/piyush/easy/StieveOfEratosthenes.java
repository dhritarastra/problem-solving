package com.piyush.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
