package com.tiejun.ge.model;

public class SingleOrderNum {
	
	private static SingleOrderNum instance = new SingleOrderNum();
	
	private SingleOrderNum() {}
	
	public static SingleOrderNum getInstance() {
		return instance;
	}

}
