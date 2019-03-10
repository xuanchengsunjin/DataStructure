package com.jimsun.sort;

import org.junit.Test;

import com.jimsun.Algorithm.Sample0;
import com.jimsun.implement.Sort;

public class TestUntil {
	int[] arr = new int[4];
	{ 
		for(int i=0;i<arr.length;i++) {
			 // arr[i] = (int)(Math.random()*100)	;
			  System.out.println(" "+arr[i]);
		}
	}
	@Test
	public void test1(){
		arr[0]=4;
		arr[1]=-3;
		arr[2]=34;
		arr[3]=92;
		System.out.println(Sample0.findMaxArraychild(arr));
		
	}
	public void test0(){
		
		//Sort<Integer> test0=new directInsert<Integer>();
		//Sort<Integer> test0=new shellSort<Integer>();
		//Sort<Integer> test0=new simplechooseSort<Integ
		//Sort<Integer> test0=new quikSort<Integer>();
		//Sort<Integer> test0=new heapSort<Integer>();
		//Sort<Integer> test0=new bubbleSort<Integer>();
		//Sort<Integer> test0=new mergeSort<Integer>();
		//Sort<Integer> test0=new basicSort<Integer>();
		//test0.setElement(arr);
		//test0.sortAndprint(true);
	}
}
