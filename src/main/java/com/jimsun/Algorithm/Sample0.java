package com.jimsun.Algorithm;

import com.jimsun.implement.FindMaxInt;

public class Sample0 extends FindMaxInt{
	public static int findMaxArraychild(int[] arr) {
		return F(arr.length-1,arr);
	}
	private  static int F(int n,int[] arr) {
		if(n == 0) {
			return arr[0];
		}
		else {
			return max(arr[n],arr[n]+F(n-1,arr));
		}
	}
}
