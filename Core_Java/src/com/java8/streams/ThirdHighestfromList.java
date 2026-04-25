package com.java8.streams;

import java.util.Comparator;
import java.util.List;

public class ThirdHighestfromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(4,5);
		list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).findFirst().ifPresent(System.out::println);;
	}

}
