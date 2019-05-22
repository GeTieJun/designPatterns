package com.tiejun.ge.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.server.Space;

public class EmptySpace implements Space {
	
	private static final Logger logger = LoggerFactory.getLogger(EmptySpace.class);

	@Override
	public void draw() {
		logger.info("This is empty space........");
	}

}
