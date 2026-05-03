package com.test;

import java.util.List;
import java.util.Optional;

public class SumofNumbersGreaterthan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(100,2,3,4,765,231);
		Optional<Integer> result = nums.stream().filter(a->a>100).reduce((i,j)->i+j);
		if(!result.isEmpty()) 
		System.out.println(result.get());
		

	}

}
