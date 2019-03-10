package com.jimsun.implement;

public class FindMaxInt {
	public static int max(int a,int b) {
		return (a>b) ? a:b;
	}
	public static int max(int a,int b,int c) {
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		return max;
	}
}
