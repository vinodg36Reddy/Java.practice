package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class VowelPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Mahendar Daripelli";

		IntStream.range(0, input.length())
				.filter(i -> isVowel(input.charAt(i)))
				.forEach(System.out::println);

		//System.out.println("Vowel positions: " + vowelPositions);

	}

	private static boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}

}
