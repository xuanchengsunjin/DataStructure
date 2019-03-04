package com.jimsun.implement;

@SuppressWarnings("serial")
public class ElementIsNullException extends RuntimeException {

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("不能设置null的元素");
		super.printStackTrace();
	}
	
}
