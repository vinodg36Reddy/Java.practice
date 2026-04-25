package com.arrays;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		Arrays.fill(a, 6);// fill all values with 6
		int b[]= new int[5];
		Arrays.fill(b, 6);
		b[0]=5;
		a[0]=5;
		System.out.println(Arrays.equals(a, b));// checks for equality including the order
		//System.out.println(a[4]);
		System.out.println(Arrays.binarySearch(a, 6));// search for element but it should be sorted and no duplicates in the array
		int c[]= {6,5,4,3,1,2};
		Arrays.sort(c,3,6);
		for(int i:c)
		{
			System.out.println(i);
		}

	}

}
