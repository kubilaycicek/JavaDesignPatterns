package com.kubilaycicek.interfaces;

import com.kubilaycicek.models.BritishShorthair;
import com.kubilaycicek.models.ScottishFold;

public class CatFactory {

	public Cat getCatType(String catType) {
		if (catType == null) {
			return null;
		}
		if (catType.equalsIgnoreCase("ScottishFold")) {
			return new ScottishFold();
		} else if (catType.equalsIgnoreCase("BritishShorthair")) {
			return new BritishShorthair();
		}
		return null;
	}
}
