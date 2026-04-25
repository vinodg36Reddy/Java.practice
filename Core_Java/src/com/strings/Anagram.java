package com.strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String []args) {
		String s1 = "vinod";
		String s2 = "inodvf";
		//System.out.println(anagramCheckUsingSort(s1,s2));
		System.out.println(anagramCheckUsingoutSort(s1,s2));
	}

	private static boolean anagramCheckUsingoutSort(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean result = true;
		if(s1.length()!=s2.length()) return false;
		
		return result;
	}
	
	private static boolean anagramCheckUsingSort(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean result = true;
		if(s1.length()!=s2.length()) return false;
		char[] ch1 = s1.toCharArray();
		char[] ch2= s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i])
				return false;
		}
		return result;
	}

}
