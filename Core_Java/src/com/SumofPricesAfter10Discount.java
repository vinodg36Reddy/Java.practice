package com.test;

import java.util.List;

public class SumofPricesAfter10Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> prices = List.of(1000.0,2000.0);
		Double result = prices.stream().map(a->a-(a/10)).reduce((a,b)->a+b).get();
		System.out.println(result);

	}

}
