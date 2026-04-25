package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthofLongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};
		//int length = Arrays.stream(strings).mapToInt(s->s.length()).max().getAsInt();
		//System.out.println(length);
		System.out.println(Arrays.stream(strings).max(Comparator.comparingInt(String::length)).get());
	}

}
