package com.tiejun.ge.AbstractFactoryMode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tiejun.ge.AbstractFactoryMode.factory.server.impl.DessertFoodFactory;
import com.tiejun.ge.AbstractFactoryMode.factory.server.impl.PizzaFoodFactory;
import com.tiejun.ge.AbstractFactoryMode.server.FoodProvider;

public class FactoryTest extends AbstractFactoryModeApplicationTests{

	Logger logger = LoggerFactory.getLogger(FactoryTest.class);
	
	@Test
	public void test() {
		// pizza food
		FoodProvider pizzaProvider = new PizzaFoodFactory();
		pizzaProvider.providerFood().taste();
		
		// dessert food
		FoodProvider dessertProvider = new DessertFoodFactory();
		dessertProvider.providerFood().taste();
	}
}
