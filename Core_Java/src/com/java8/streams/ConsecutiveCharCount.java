package com.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsecutiveCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbbcddb";
		//String output = countChar(s);
		String output = countCharUsingStreams(s);
		System.out.println(output);

	}

	private static String countCharUsingStreams(String s) {
		// TODO Auto-generated method stub
		final int[] lastIndex= {0};
		return IntStream.range(0, s.length()).filter(i->i==s.length()-1||s.charAt(i)!=s.charAt(i+1))
		.mapToObj(i->{
			int count = i-lastIndex[0]+1;
			lastIndex[0]=i+1;
			return ""+s.charAt(i)+count;
		}).collect(Collectors.joining());
	}

	private static String countChar(String s) {
		// TODO Auto-generated method stub
		char ch = s.charAt(0);
		int count=1;
		String output="";
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}else
			{
				output= output+ch+count;
				ch=s.charAt(i);
				count=1;
			}
		}
		output= output+ch+count;
		return output;
	}

}
