package com.test;

import java.util.List;

public class MultipleAllNumbersDivisibleby3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(100,2,3,4,5,21);
		int result = nums.stream().filter(n->n%3==0).reduce(1,(a,b)->a*b);
		System.out.println(result);
		

	}

}
