package com.jimsun.sort;

import com.jimsun.implement.sortabstract;

public class shellSort<T extends Comparable<T>> extends sortabstract<T> {

	@Override
	public void sortDesc() {
		// TODO Auto-generated method stub
		T[] arr = getElement();
		int length=arr.length;
		int gap=length;
		while(gap>1) {
			gap=gap/3+1;
			for(int i = gap;i<length;i++) {
				T temp=arr[i];
				int j;
				for(j=i;j-gap>=0 && temp.compareTo(arr[j-gap])<0;j=j-gap) {
					arr[j]=arr[j-gap];
				}
				arr[j]=temp;
			}
		}
	} 

	@Override
	public void sortAsc() {
		// TODO Auto-generated method stub
		
	}

}
