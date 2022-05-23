package com.packaging.api.entity;

public enum Delivery {

	INTEGRAL(200), ACCESSORY(100);

	private int delVal;

	Delivery(int delVal) {
		this.delVal = delVal;

	}

	public int getDelVal() {
		return delVal;
	}

}
