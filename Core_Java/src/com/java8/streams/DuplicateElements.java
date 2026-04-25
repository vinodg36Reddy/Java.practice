package com.java8.streams;

import java.util.HashSet;
import java.util.stream.IntStream;


public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,28,87,10,20,76,28,80};
		//Arrays.stream(arr).di
		//duplicateElements(arr);
		duplicateElementsWithStreams(arr);
	}

	private static void duplicateElementsWithStreams(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		IntStream
		
		Arrays.stream(arr).filter(a->!set.add(a)).forEach(System.out::println);
	}

	private static void duplicateElements(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

}
