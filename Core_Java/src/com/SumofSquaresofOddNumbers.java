package com.test;

import java.util.Arrays;
import java.util.List;

public class SumofSquaresofOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = List.of(-1,2,-3,4,-5,6,-7,8);

		int result = nums.stream().filter(a->a%2!=0).map(n->n*n).reduce(0,(k,l)->k+l);
		System.out.println(result);
	}

}
