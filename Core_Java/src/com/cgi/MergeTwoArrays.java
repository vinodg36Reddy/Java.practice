package com.cgi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,6,8};
		int b[]= {2,3,5,7};
		//int c[] = mergeTwoArrays(a,b);
		
		int c[] = mergeTwoArraysUsingStreams(a,b);
		for(int i:c) {
			System.out.print(i+" ");
		}

	}

	private static int[] mergeTwoArraysUsingStreams(int[] a, int[] b) {
		// TODO Auto-generated method stub
		return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		
		
	}

	private static int[] mergeTwoArrays(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int c[]= new int[a.length+b.length];
		int aIndex=0,bIndex=0,cIndex=0;
		while(aIndex<a.length && bIndex<b.length) {
			if(a[aIndex]<b[bIndex]) {
				c[cIndex++]=a[aIndex++];
			}else
			{
				c[cIndex++]=b[bIndex++];
			}
		}
		while(aIndex<a.length) {
			c[cIndex++]=a[aIndex++];
		}
		while(bIndex<b.length) {
			c[cIndex++]=b[bIndex++];
		}
		
		return c;
	}

}
