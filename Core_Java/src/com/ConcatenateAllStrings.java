package com.test;

import java.util.List;


public class ConcatenateAllStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = List.of("Vinod","Kumari","Ashish");
		String result = str.stream().reduce((a,b)->a+b).get();
		System.out.println(result);
		//length of all the strings
		String str3 = str.stream().map(a->a.substring(0,1)).reduce("",(str1,str2)->str1+str2);
		System.out.println(str3);
	}

}
