package com.threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<>();
		cMap.put(1,"Vinod");
		cMap.put(2, "Kumar");
		
		for(Map.Entry<Integer, String> entrySet : cMap.entrySet()) {
			cMap.put(3, "Sachin");
			System.out.println(entrySet.getKey() + " -> " + entrySet.getValue());
		}
	}

}
