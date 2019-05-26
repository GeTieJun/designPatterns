package com.tiejun.ge.AbstractFactoryMode.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.AbstractFactoryMode.server.Space;

public class Circle implements Space{
	
	Logger logger = LoggerFactory.getLogger(Circle.class);

	@Override
	public void draw() {
		logger.info(">> This is Circle space");
	}
}
