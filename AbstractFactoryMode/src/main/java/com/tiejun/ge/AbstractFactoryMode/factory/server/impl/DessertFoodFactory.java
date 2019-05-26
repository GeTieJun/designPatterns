package com.tiejun.ge.AbstractFactoryMode.factory.server.impl;

import com.tiejun.ge.AbstractFactoryMode.server.Food;
import com.tiejun.ge.AbstractFactoryMode.server.FoodProvider;
import com.tiejun.ge.AbstractFactoryMode.server.impl.Dessert;

public class DessertFoodFactory implements FoodProvider{

	@Override
	public Food providerFood() {
		return new Dessert();
	}

}
