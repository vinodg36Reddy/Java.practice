package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="vinodv";
		//Map<Character,Long> map =s.chars().mapToObj(c->(char)c)
		//.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		/*Map<Character,Long> map =IntStream.range(0, s.length())
				.mapToObj(c->s.charAt(c))
				.collect(Collectors.groupingBy(
					Function.identity(),
					LinkedHashMap::new,
					Collectors.counting()));*/
		IntStream.range(0, s.length())
		.mapToObj(c->s.charAt(c))
		.collect(Collectors.groupingBy(
			Function.identity(),
			LinkedHashMap::new,
			Collectors.counting()))
		.entrySet()
		
		//System.out.println(map);
		/*for(Map.Entry<Character, Long> map2:map.entrySet()) {
			if(map2.getValue()==1) {
				System.out.println("char "+map2.getKey());
				break;
			}
		}*/
		
	}

}
