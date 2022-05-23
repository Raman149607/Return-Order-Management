package com.packaging.api.utils;

import com.packaging.api.entity.ComponentType;
import com.packaging.api.entity.Delivery;
import com.packaging.api.entity.Pack;

public class CalculatePackageAndDeliveryCharge {

	public float calcPackagingCharges(ComponentType componentType) {
		int result = 0;
		if (componentType.equals(ComponentType.INTEGRAL)) {
			result = Pack.INTEGRAL.getPackVal();
			;
		} else if (componentType.equals(ComponentType.ACCESSORY)) {
			result = Pack.ACCESSORY.getPackVal();
		}
		return result;
	}

	public float calcDeliveryCharges(ComponentType componentType) {
		int result = 0;
		if (componentType.equals(ComponentType.INTEGRAL)) {
			result = Delivery.INTEGRAL.getDelVal();
		} else if (componentType.equals(ComponentType.ACCESSORY)) {
			result = Delivery.ACCESSORY.getDelVal();
		}
		return result;
	}

	public float getPackageAndDeliveryCharges(ComponentType componentType, int quantity) {

		return (calcPackagingCharges(componentType) * quantity) + calcDeliveryCharges(componentType);

	}

}
