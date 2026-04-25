package com.realpage;

public class LargestSquareinNonDecreasingHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] A= {1,2,2,4,5};
		//int [] A= {1,2,2,2,4,4,5};
		int [] A= {10,10,10,10};
		int b = solution(A);
		System.out.println(b);
	}

	private static int solution(int[] A) {
		// TODO Auto-generated method stub
		int n = A.length;
	    int result = 0;
	    for (int i = 1; i <= n; i++) {
	        // Check if there are 's' columns with height at least 's'
	        // Since it's non-decreasing, we check the s-th element from the end
	        if (A[n - i] >= i) {
	            result = i;
	        } else {
	            //break; // Since it's sorted, larger s won't work
	        }
	    }
	    return result;
    }
	
	private static int solution2(int[] A) {
		int n = A.length;
		int maxSquareSide = 0;

		for (int i = 0; i < n; i++) {

			int currentPossibleSide = Math.min(A[i], i + 1);

			if (currentPossibleSide > maxSquareSide) {
				maxSquareSide = currentPossibleSide;
			}
		}

		return maxSquareSide;
    }

}
