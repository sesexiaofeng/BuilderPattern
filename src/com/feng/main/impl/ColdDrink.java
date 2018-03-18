package com.feng.main.impl;

import com.feng.main.Item;
import com.feng.main.Packing;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
