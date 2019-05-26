package com.tiejun.ge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.model.InternalSingle;

public class InternalSingleTest extends SingletonPatterApplicationTests{

	Logger logger = LoggerFactory.getLogger(InternalSingleTest.class);
	
	@Test
	public void test() {
		
		InternalSingle instance = InternalSingle.getInstance();
		if(null == instance) {
			logger.info(">>InternalSingle object is null..");
		}else {
			logger.info(">>InternalSingle object is not null..");
		}
	}
}
