package com.jimsun.implement;

import java.lang.reflect.*;
public class mergeSort <T extends Comparable<T>>extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr = getElement();
		int length = arr.length;
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) Array.newInstance(arr[0].getClass(), length);
		mergesort(arr,0,length-1,temp);
		//setElement(temp);
	}
	private void mergesort(T[] arr,int left,int right,T[] temp){
		if(left<right) {
			int mid = (right+left)/2;
			mergesort(arr,left,mid,temp);
			mergesort(arr,mid+1,right,temp);
			mergeArray(arr,left,mid,right,temp);
		}
	} 
	private void mergeArray(T[] arr,int left,int mid,int right,T[] temp) {
		int i=left;
		int j=mid+1;
		int index=left;
		while(i<=mid && j<=right) {
			if(arr[i].compareTo(arr[j])<0) {
				temp[index++] = arr[i++];
			}else {
				temp[index++] = arr[j++];
			}
		}
		while(i<=mid){		
			temp[index++]=arr[i++];
		}
		while(j<=right){		
			temp[index++]=arr[j++];
		}
		for(int k=left;k<=right;k++) {
			arr[k]= temp[k];
		}
	}
	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}

}
