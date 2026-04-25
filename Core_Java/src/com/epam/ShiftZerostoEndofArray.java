package com.epam;

import java.util.Arrays;

public class ShiftZerostoEndofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,0,1,0};
		int onesIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[onesIndex++]=a[i];
			}
		}
		while(onesIndex<a.length)a[onesIndex++]=0;
		System.out.println(Arrays.toString(a));
	}

}
