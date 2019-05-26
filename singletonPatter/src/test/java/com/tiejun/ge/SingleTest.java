package com.tiejun.ge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.model.SingleOrderNum;

public class SingleTest extends SingletonPatterApplicationTests{
	
	Logger logger = LoggerFactory.getLogger(SingleTest.class);

	@Test
	public void test() {
		SingleOrderNum instance = SingleOrderNum.getInstance();
		if(null == instance) {
			logger.info(">>SingleOrderNum object is null..");
		}else {
			logger.info(">>SingleOrderNum object is not null..");
		}
	}
}
