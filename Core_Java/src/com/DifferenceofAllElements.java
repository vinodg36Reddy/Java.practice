package com.test;

import java.util.List;

public class DifferenceofAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10,2,3,5);
		int result = nums.stream().reduce((a,b)->a-b).get();
		System.out.println(result);
	}

}
