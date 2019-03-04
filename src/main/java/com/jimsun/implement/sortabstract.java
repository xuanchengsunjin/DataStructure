package com.jimsun.implement;

public abstract class sortabstract<T extends Comparable<T>> implements Sort<T> {
	private T[] element;
	public  void setElement(T[] a) {
		// TODO Auto-generated method stub
		this.element=a;
	}	
	public void sortAndprint(boolean desc) {
		// TODO Auto-generated method stub
		sort(desc);
		System.out.println("排序后：");
		for(T a:this.element) {
			System.out.print("  "+a.toString());
		}
	}
     
}	
