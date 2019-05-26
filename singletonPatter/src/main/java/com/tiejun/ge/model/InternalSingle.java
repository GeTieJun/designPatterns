package com.tiejun.ge.model;

public class InternalSingle {

	private static class InternalSingleHolder{
		private static final InternalSingle instance = new InternalSingle();
	}
	
	private InternalSingle() {}
	
	public static InternalSingle getInstance() {
		return InternalSingleHolder.instance;
	}
}
