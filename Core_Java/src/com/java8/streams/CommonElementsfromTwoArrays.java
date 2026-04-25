package com.java8.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementsfromTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b= {3,4,7,8,9};
		//IntStream aArray = Arrays.stream(a);
		
		Arrays.stream(b).filter(i->Arrays.stream(a).anyMatch(j->j==i))
		//.boxed()
		//.collect(Collectors.toList())
		.forEach(System.out::println);;
	}

}
