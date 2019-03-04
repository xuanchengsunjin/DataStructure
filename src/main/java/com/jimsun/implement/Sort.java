package com.jimsun.implement;

public interface Sort <T>
{
	public void setElement(T[] element);
	public void sort(boolean desc);
	public void sortAndprint(boolean desc);
	public T[] getElement();
}