package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumofAbsoluteValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10,-2,-3,4,7,21);
		int result = nums.stream().map(Math::abs).reduce(0,(a,b)->a+b);
		System.out.println(result);
		
		System.out.println(nums.stream().min(Comparator.naturalOrder()).get());
		
		Map<Integer,List<Integer>> map= new HashMap<>();
		map.put(0, List.of(3,4,4,5));
		map.put(1, List.of(4,4,5,5));
		map.put(2, List.of(5,4,4,3));
		map.put(3, List.of(6,5,6));
		System.out.println(map);
		
		int result2 = map.entrySet().stream().mapToInt(run -> {
			return run.getValue().stream().mapToInt(t->t).min().getAsInt();
		}).sum();
		System.out.println(result2);

	}

}
