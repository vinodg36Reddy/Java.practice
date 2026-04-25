package com.blackbaud;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ArrayShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7,8};
		shuffle(arr);

	}

	private static void shuffle(int[] arr) {
		Random rand = new Random();
		for(int i=0;i<arr.length;i++) {
			int r = rand.nextInt(i,i+1);
			int t = arr[i];
			arr[i]=arr[r];
			arr[r]=t;
			Arrays.stream(arr).forEach(System.out::print);
			System.out.println();
			
		}
		
		
	}

}
