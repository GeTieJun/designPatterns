package com.tiejun.ge.factoryMode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.model.SpaceFactory;
import com.tiejun.ge.server.Space;

public class FactoryModeTest extends FactoryModeApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(FactoryModeTest.class);
	/**
	 * 工厂测试方法
	 */
	@Test
	public void factoryModeTest() {
		SpaceFactory spaceFactory = new SpaceFactory();
		Space space = spaceFactory.CreateSpace("Circle");
		space.draw();
		Space spaceAAA = spaceFactory.CreateSpace("AAAAA");
		spaceAAA.draw();
	}
}
