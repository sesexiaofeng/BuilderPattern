package com.feng.main.impl;

import com.feng.main.Item;
import com.feng.main.Packing;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
