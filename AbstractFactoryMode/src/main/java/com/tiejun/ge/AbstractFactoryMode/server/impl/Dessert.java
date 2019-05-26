package com.tiejun.ge.AbstractFactoryMode.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.AbstractFactoryMode.server.Food;

public class Dessert implements Food{

	Logger logger = LoggerFactory.getLogger(Food.class);
	
	@Override
	public void taste() {
		logger.info(">> this is dessert food.");
	}

}
