package com.jimsun.sort;

import com.jimsun.implement.sortabstract;

public class directInsert<T extends Comparable<T>> extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr=getElement();
		
		for(int i=1;i<arr.length;i++) {
			T temp = arr[i];
			int j;
			for(j=i;j>0 && temp.compareTo(arr[j-1])<0 ;j--) {
				arr[j]=arr[j-1];
			}
			arr[j] = temp;
		}
	}

	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}



}
