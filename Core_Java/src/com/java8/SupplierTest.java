package com.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> sTest = () -> new Date();
		System.out.println(sTest.get());
	}

}
