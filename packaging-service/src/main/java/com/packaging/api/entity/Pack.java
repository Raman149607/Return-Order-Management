package com.packaging.api.entity;

public enum Pack {
	INTEGRAL(100), ACCESSORY(50);

	private int packVal;

	Pack(int packVal) {
		this.packVal = packVal;

	}

	public int getPackVal() {
		return packVal;
	}

	

}
