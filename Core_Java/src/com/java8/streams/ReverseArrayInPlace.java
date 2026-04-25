package com.java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInPlace {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		IntStream.range(0,a.length/2).forEach(i->{
			int temp = a[i];
			a[i]= a[a.length-i-1];
			a[a.length-i-1] = temp;
		});
		System.out.println(Arrays.toString(a));
	}
}
