package com.epam;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Hashtag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello world java";
		System.out.println(hashTag(input));

	}

	private static String hashTag(String input) {
		// TODO Auto-generated method stub
		
		String result = '#'+Arrays.stream(input.split(" ")).map(word->word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase()).collect(Collectors.joining(""));
		return result;
	}

}
