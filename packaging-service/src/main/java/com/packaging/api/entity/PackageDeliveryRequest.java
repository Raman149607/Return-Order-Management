package com.packaging.api.entity;

public class PackageDeliveryRequest {
	
	private ComponentType type;
	private int quantity;

	public ComponentType getType() {
		return type;
	}

	public void setType(ComponentType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
