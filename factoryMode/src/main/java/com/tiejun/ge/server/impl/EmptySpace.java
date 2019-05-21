package com.tiejun.ge.server.impl;

import com.tiejun.ge.server.Space;

public class EmptySpace implements Space {

	@Override
	public void draw() {
		System.out.println("This is empty space...");
	}

}
