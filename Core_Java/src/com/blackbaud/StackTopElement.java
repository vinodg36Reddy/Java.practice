package com.blackbaud;

import java.util.Stack;

public class StackTopElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Apple", "Banana", "ui"};
		System.out.println(stackTopElement(words));

	}

	private static String stackTopElement(String[] words) {
		// TODO Auto-generated method stub
		String result = new String();
		Stack<String> stackTest = new Stack<String>();
		for(int i=0;i<words.length;i++) {
			if(words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i'
					 || words[i].charAt(0)=='o' || words[i].charAt(0)=='u') {
				if (!stackTest.isEmpty()) stackTest.pop();
			}else {
				stackTest.push(words[i]);
			}
		}
		if(stackTest.isEmpty()) return "-1";
		else result = stackTest.peek();
		return result;
	}

}
