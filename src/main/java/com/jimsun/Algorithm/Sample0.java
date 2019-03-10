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
		if(arr[n]<0 && n-2>=0) {
			return max(arr[n-1],arr[n-1]+F(n-2,arr));
		}
		else {
			return max(arr[n],arr[n]+F(n-1,arr));
		}
	}
}
