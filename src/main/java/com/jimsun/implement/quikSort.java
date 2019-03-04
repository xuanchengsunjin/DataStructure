package com.jimsun.implement;

public class quikSort<T extends Comparable<T>> extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr=getElement();
		 //partition(arr,0,arr.length-1);
		quiksort(arr,0,arr.length-1);
	}
	private void quiksort(T[] arr,int left,int right) {
		if((right-left)<=1) {
			if(arr[left].compareTo(arr[right])>0) {
				swap(arr,left,right);
			}
			return;
		}
		int mid = partition(arr,left,right);   
		if((right-left == 2)) {
			return;
		}
		int i=left;
		int j=mid;
		T temp = arr[mid];
		while(i<=j) {
			while(arr[++i].compareTo(temp)<0 ) {
			}
			while(j>i && arr[--j].compareTo(temp)>0 ) {		
			}
			if(i<j) {
				swap(arr,i,j);
			}else {
				break;
			}
		}
		if(arr[i].compareTo(temp)>0) {
			swap(arr,i,mid);
		}
		quiksort(arr,left,i-1);
		quiksort(arr,i+1,right);
	}
	
	private int partition(T[] arr,int low,int hight) {
		int mid=low + (hight-low)/2;
		if(arr[low].compareTo(arr[mid])>0) {
			swap(arr,low,mid);
		}
		if(arr[mid].compareTo(arr[hight])>0) {
			swap(arr,hight,mid);
		}
		if(arr[low].compareTo(arr[mid])>0) {
			swap(arr,low,mid);
		}
		swap(arr,mid,hight-1);
		return hight-1;
	}
	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}
	

}
