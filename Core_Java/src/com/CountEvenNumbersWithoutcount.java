package com.test;

import java.util.List;

public class CountEvenNumbersWithoutcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10,2,3,5);
		final int n=0;
		int result = nums.stream().filter(a->a%2==0).reduce(0,(i,j)->i+1);
		//int result = nums.stream().filter(a->a%2==0).map(b->1).reduce((i,j)->i+j).get();

		System.out.println(result);
	}

}
