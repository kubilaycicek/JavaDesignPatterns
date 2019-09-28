package com.kubilaycicek.demo;

import com.kubilaycicek.interfaces.Cat;
import com.kubilaycicek.interfaces.CatFactory;

public class Demo {
	public static void main(String[] args) {
		CatFactory catFactory = new CatFactory();
		Cat cat1 = catFactory.getCatType("BritishShorthair");
		cat1.speak();
		Cat cat2 = catFactory.getCatType("ScottishFold");
		cat2.speak();
	}
}
