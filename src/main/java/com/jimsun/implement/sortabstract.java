package com.jimsun.implement;

public abstract class sortabstract<T extends Comparable<T>> implements Sort<T> {
	private T[] element;
	public  void setElement(T[] a) {
		if(a == null) {
			throw new ElementIsNullException();
		}
		// TODO Auto-generated method stub
		this.element=a;
	}
	public abstract void sortDesc();
	public abstract void sortAsc();
	public void sortAndprint(boolean desc) {
		// TODO Auto-generated method stub
		if (this.element == null)
			throw new ElementIsNullException();
		if(desc == true) {
			sortDesc();
		}else {
			sortAsc();
		}
		System.out.println("排序后：");
		for(int i=0;i<this.element.length;i++) {
			System.out.print("  "+this.element[i]);
		}
	}
	
	public void sort(boolean desc) {
		// TODO Auto-generated method stub
		if (this.element == null)
			throw new ElementIsNullException();
		if(desc == true) {
			sortDesc();
		}else {
			sortAsc();
		}
	}
	protected void swap(T[] arr,int a,int b) {
		if((a == b)) {
			return;
		}
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public T[] getElement() {
		// TODO Auto-generated method stub
		return this.element;
	}
     
}	
