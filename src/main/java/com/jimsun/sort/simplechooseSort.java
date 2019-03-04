package com.jimsun.sort;

import com.jimsun.implement.sortabstract;

public class simplechooseSort<T extends Comparable<T>> extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr=getElement();
		int length=arr.length;
		for(int i=0;i<length;i++) {
			int max=findMax(arr, 0, length-i-1);
			swap(arr,max,length-i-1);
		}
	}

	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}
    protected int findMax(T[] arr,int start,int end) {
    	if((end-start)<0) {
    		return end;
    	}
    	int max=start;
    	int index=start;
    	while(++index<=end) {
    		if(arr[max].compareTo(arr[index])<0) {
    			max=index;
    		}
    	}
    	return max;
    }
}
