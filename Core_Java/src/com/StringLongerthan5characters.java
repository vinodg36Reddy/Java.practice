package com.test;

import java.util.List;

public class StringLongerthan5characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str = List.of("Vinod","Kumari","Ashish");
		int result = str.stream().filter(a->a.length()>5).map(b->1).reduce((i,j)->i+j).get();
		System.out.println(result);

	}

}
