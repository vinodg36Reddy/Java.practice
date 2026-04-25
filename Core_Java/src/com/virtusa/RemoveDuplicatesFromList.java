package com.virtusa;

import java.util.List;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(3,4,7,2,3,5,4);
		list.stream().distinct().forEach(System.out::println);
		

	}

}
