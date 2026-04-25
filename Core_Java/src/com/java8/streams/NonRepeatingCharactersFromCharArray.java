package com.java8.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonRepeatingCharactersFromCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'v','i','n','v','d'};
		Set<Character> set = new HashSet<Character>();
		List<Integer> list = IntStream.range(0, ch.length).filter(i->set.add(ch[i])))
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
		//new String(ch).chars().mapToObj(c->(char)c).f

	}

}
