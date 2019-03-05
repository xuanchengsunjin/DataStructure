package com.jimsun.sort;

import com.jimsun.implement.sortabstract;

public class heapSort<T extends Comparable<T>> extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr = getElement();
		int length = arr.length;	
		for(int i=length-1;i>0;i--) {
			buildHeap(arr,0,i);
			swap(arr,0,i);
		}
	}
	private void buildHeap(T[] arr,int start,int end) {
		for(int i = (end+1)/2;i>=start;i--) {
			ajdustHeap(arr,i,end+1);
		}
	}
	private void ajdustHeap(T[] arr,int parent,int length) {
		T temp = arr[parent];
		for(int i=2*parent+1;i<length;i=2*i+1) {
			if(i+1<length && arr[i].compareTo(arr[i+1])<0) {
				++i;
			}
			if(arr[i].compareTo(temp)<0) {
				break;
			}else {
				arr[parent] = arr[i];
				parent = i;
				//swap(arr,a,i);
			}
		}
		arr[parent] = temp;
	}
	
	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}

}
