package com.jimsun.sort;

import org.junit.Test;

import com.jimsun.implement.Sort;

public class TestUntil {
	Integer[] arr = new Integer[10];
	{ 
		for(int i=0;i<arr.length;i++) {
			  arr[i] = new Integer((int)(Math.random()*100))	;
			  System.out.println(" "+arr[i]);
		}
	}
	@Test
	public void test0(){
		Sort<Integer> test0=new directInsert<Integer>();
		test0.setElement(arr);
		test0.sortAndprint(true);
	}
}