package com.tiejun.ge.factoryMode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tiejun.ge.model.SpaceFactory;
import com.tiejun.ge.server.Space;
import com.tiejun.ge.server.impl.Circle;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryModeApplicationTests {

	@Test
	public void contextLoads() {
		SpaceFactory spaceFactory = new SpaceFactory();
		Space space = spaceFactory.CreateSpace("Circle");
		space.draw();
		Space spaceAAA = spaceFactory.CreateSpace("AAAAA");
		spaceAAA.draw();
	}
}
