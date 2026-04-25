package com.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> test1 = s->s=="hello";
		System.out.println(test1.test("hello"));
		BiPredicate<String,String> test2 = (a,b)->a==b;
		System.out.println(test2.test("hello", "hello"));
	}

}
