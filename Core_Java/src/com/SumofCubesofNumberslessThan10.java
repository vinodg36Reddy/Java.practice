package com.test;

import java.util.List;

public class SumofCubesofNumberslessThan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10,-2,-3,4,7,2);
		int result = nums.stream().filter(a->a<10).map(n->n*n*n).reduce((i,j)->i+j).get();
		System.out.println(result);


	}

}
