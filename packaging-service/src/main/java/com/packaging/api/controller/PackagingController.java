package com.packaging.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packaging.api.entity.PackageDeliveryResponse;
import com.packaging.api.entity.ProcessRequest;
import com.packaging.api.utils.CalculatePackageAndDeliveryCharge;

@RestController
@RequestMapping("/api/pack")
public class PackagingController {

	@PostMapping
	public PackageDeliveryResponse get(@RequestBody ProcessRequest processRequest) {
		CalculatePackageAndDeliveryCharge charge = new CalculatePackageAndDeliveryCharge();
		PackageDeliveryResponse pckDeliveryresponse = new PackageDeliveryResponse();
		pckDeliveryresponse.setPackageDeliveryCharge(
				charge.getPackageAndDeliveryCharges(processRequest.getComponentDetail().getComponentType(),
						processRequest.getComponentDetail().getQuantity()));
		return pckDeliveryresponse;
	}

}
