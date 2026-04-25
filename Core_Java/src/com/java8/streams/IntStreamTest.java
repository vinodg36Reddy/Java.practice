package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,5,2,3,3};
		Arrays.stream(a).filter(i->i%2==0).forEach(System.out::println);
		Arrays.stream(a).filter(i->i%2==0).map(i->i*i).forEach(System.out::println);
		Arrays.stream(a).mapToObj(i->i+new String()).forEach(System.out::println);
		//Arrays.stream(a).flatMap(i->Arrays.stream(i)).
		System.out.println("distinct");
		Arrays.stream(a).distinct().forEachOrdered(System.out::println);
		Arrays.stream(a).sorted().forEachOrdered(System.out::println);
		System.out.println("limit");
		Arrays.stream(a).limit(2).forEach(System.out::println);
		System.out.println("skip");
		Arrays.stream(a).skip(2).forEach(System.out::println);
		System.out.println("reduce");
		System.out.println(Arrays.stream(a).reduce(5,Integer::sum));
		System.out.println(Arrays.stream(a).map(i->i*i).sum());
		Arrays.stream(a).collect(ArrayList::new, List::add, List::addAll);
		Arrays.stream(a).mapToObj(ArrayList::add)
		//aArray.forEach(System.out::println);
		System.out.println(Arrays.stream(a).anyMatch(i->i%2==0));// any match of the condition
		System.out.println(Arrays.stream(a).allMatch(i->i%2==0));// all match of the condition
		System.out.println(Arrays.stream(a).noneMatch(i->i%2==0));// none match of the condition
	}

}
