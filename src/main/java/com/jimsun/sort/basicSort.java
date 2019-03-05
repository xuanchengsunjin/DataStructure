package com.jimsun.sort;

import java.lang.reflect.Array;

import com.jimsun.implement.sortabstract;

public class basicSort<T extends Comparable<T>>extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr=getElement();
		@SuppressWarnings("unchecked")
		T[] tempArr = (T[]) Array.newInstance(arr[0].getClass(), arr.length);
		int maxbit=getMaxBit(arr);
		int length = arr.length;
		for(int i = 1,k=1;i<=maxbit;i++,k=k*10) {
			int[] temp = new int[10];
			int index = 0;
			while(index<length) {
				int a = (Integer)arr[index++];
				temp[(a/k)%10]++;
			}
			for(int e = 1;e<10;e++) {
				temp[e] = temp[e] + temp[e-1];
			}
			index=length-1;
			while(index>=0) {
				int a = ((Integer)arr[index]/k)%10;
				tempArr[--temp[a]] = arr[index--];
			}
			index=0;
			while(index<length) {
				arr[index]=tempArr[index];
				index++;
			}
		}
		//setElement(tempArr);
	}
	private int getMaxBit(T[] arr) {
		int  max=0;
		int index;
		for(index=1;index<arr.length;index++) {
			if(arr[index].compareTo(arr[max])>0) {
				max=index;
			}
		}
		index=0;
		int i=(Integer)arr[max];
		while(i>0) {
			index++;
			i=i/10;	
		}  
		return index;
	}
	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}

}
