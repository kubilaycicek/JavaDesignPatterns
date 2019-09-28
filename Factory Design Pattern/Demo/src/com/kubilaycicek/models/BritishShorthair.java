package com.kubilaycicek.models;

import com.kubilaycicek.interfaces.Cat;

public class BritishShorthair implements Cat {

	@Override
	public void speak() {
		System.out.println("British Shorthair is speaking.");
		
	}

}
