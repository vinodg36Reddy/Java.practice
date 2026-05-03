package com.test;

import java.util.Arrays;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8};
		int b = Arrays.stream(a).filter(i->i%2==0).reduce(0,(k,l)->k+l);
		System.out.println(b);
	
	}

}
