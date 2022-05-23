package com.packaging.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packaging.api.entity.PackageDeliveryRequest;
import com.packaging.api.entity.PackageDeliveryResponse;
import com.packaging.api.utils.CalculatePackageAndDeliveryCharge;

@RestController
@RequestMapping("/api/pack")
public class PackagingController {
	
	

	@GetMapping("/GetPackagingDeliveryCharge")
	public PackageDeliveryResponse packagingAndDeleveringCharges(@RequestBody PackageDeliveryRequest delivery) {
		CalculatePackageAndDeliveryCharge charge = new CalculatePackageAndDeliveryCharge() ;
		PackageDeliveryResponse pckDeliveryresponse = new PackageDeliveryResponse();
		pckDeliveryresponse.setPackageDeliveryCharge(charge.getPackageAndDeliveryCharges(delivery.getType(), delivery.getQuantity()));
		return pckDeliveryresponse;

	}

	

}
