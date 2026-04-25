package com.blackbaud;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "invigilator";
		String output = removeDuplicatesUsingStreams(S);
		System.out.println(output);
	}

	private static String removeDuplicates(String s) {
		String output = new String("");
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.get(ch)==null) {
				map.put(ch, 1);
				output=output+ch;
			}
		}
		return output;
	}
	
	private static String removeDuplicates2(String s) {
		String output = new String("");
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(set.add(ch)) {
				output=output+ch;
			}
		}
		return output;
	}
	
	private static String removeDuplicatesUsingStreams(String s) {
		String output = s.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		
		return output;
	}

}
