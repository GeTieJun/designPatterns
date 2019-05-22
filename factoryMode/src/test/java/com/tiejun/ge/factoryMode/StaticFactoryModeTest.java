package com.tiejun.ge.factoryMode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.model.StaticSpaceFactory;
import com.tiejun.ge.server.Space;

public class StaticFactoryModeTest extends FactoryModeApplicationTests{
	
	private static final Logger logger = LoggerFactory.getLogger(StaticFactoryModeTest.class);

	@Test
	public void staticFactoryModeTest() {
		Space space = StaticSpaceFactory.getCircleSpace();
		space.draw();
	}
}
