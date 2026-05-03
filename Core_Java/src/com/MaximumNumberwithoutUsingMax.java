package com.test;

import java.util.Comparator;
import java.util.List;

public class MaximumNumberwithoutUsingMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10,2,4,2);
		//int result = nums.stream().reduce((a,b)->a>b?a:b).get();
		int result = nums.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(result);
		
		boolean allpostive = nums.stream().map(a->a>0).reduce((a,b)->a&&b).get();
		System.out.println(allpostive);
		
		boolean isdivisibleby7 = nums.stream().map(a->a%7==0).reduce((a,b)->a||b).get();
		System.out.println(isdivisibleby7);

		//atleast one even and atleast one add
		boolean evenAndOdd = nums.stream().map(a->a%2==0?1:2).reduce((i,j)->i | j).get()==3;
		System.out.println(evenAndOdd);
	}

}
