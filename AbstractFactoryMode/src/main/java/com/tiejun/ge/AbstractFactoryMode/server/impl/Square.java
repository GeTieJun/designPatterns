package com.tiejun.ge.AbstractFactoryMode.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.AbstractFactoryMode.server.Space;

public class Square implements Space{
	
	Logger logger = LoggerFactory.getLogger(Square.class);

	@Override
	public void draw() {
		logger.info(">> This is square space");
	}

}
