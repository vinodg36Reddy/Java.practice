package com.test;

import java.util.List;

public class StringsStartWithVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = List.of("Vinod","Kumari","Ashish","Java");
		int result = str.stream().filter(a->"aeiou".indexOf(Character.toLowerCase(a.charAt(0)))!=-1).map(b->1).reduce((i,j)->i+j).orElse(-1);
		System.out.println(result);
		//str.add("");
		List<String> str2 = List.of("Vinod","Kumari","Ashish","");

		//all strings are non-empty
		boolean allStringsnonempty = str2.stream().map(a->!a.isEmpty()).reduce((a,b)->a&&b).orElse(false);
		System.out.println(allStringsnonempty);
		
		//any string contains "java"
		boolean anyStringcontainsJava = str.stream().map(a->a.contains("java")).reduce((a,b)->a||b).orElse(false);
		System.out.println(anyStringcontainsJava);
	}

}
