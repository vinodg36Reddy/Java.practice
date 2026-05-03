package com.test;

import java.util.List;

public class SumofIntegersasString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = List.of("5","4","2","1");
		int result = str.stream().mapToInt(a->Integer.parseInt(a)).reduce((a,b)->a+b).getAsInt();
		System.out.println(result);
	}

}
