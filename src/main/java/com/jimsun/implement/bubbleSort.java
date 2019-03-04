package com.jimsun.implement;

public class bubbleSort<T  extends Comparable<T>> extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr=getElement();
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-i-1;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					swap(arr,j,j+1);
				}
			}
		}
	}

	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}

}
