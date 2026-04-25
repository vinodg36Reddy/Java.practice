package com.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> fTest = i->i*i;
		System.out.println(fTest.apply(5));
		System.out.println(Function.identity());
		
		BiFunction<Integer,Integer,Integer> fTest2 = (i,j)->i*j;
		System.out.println(fTest2.apply(5,4));
	}

}
