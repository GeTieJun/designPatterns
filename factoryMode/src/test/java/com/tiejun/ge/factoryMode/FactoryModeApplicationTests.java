package com.tiejun.ge.factoryMode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tiejun.ge.model.SpaceFactory;
import com.tiejun.ge.model.StaticSpaceFactory;
import com.tiejun.ge.server.Space;
import com.tiejun.ge.server.impl.Circle;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryModeApplicationTests {
	
	private static final Logger logger = LoggerFactory.getLogger(FactoryModeApplicationTests.class);

	@Before
	public void init() {
		logger.info("The junit test start.....................................");
	}
	
	@After
	public void after() {
		logger.info("The junit test end........................................");
	}
	
}
