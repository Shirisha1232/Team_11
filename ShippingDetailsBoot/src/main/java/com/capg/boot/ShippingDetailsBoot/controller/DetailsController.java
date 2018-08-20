package com.capg.boot.ShippingDetailsBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.boot.ShippingDetailsBoot.beans.ShippingDetails;
import com.capg.boot.ShippingDetailsBoot.service.IDetailsService;


@RestController
public class DetailsController {
	
	@Autowired
	private IDetailsService service;
	
	@RequestMapping(method=RequestMethod.POST, value = "/add_details")
	public String addDetails(ShippingDetails d) {
		service.addDetails(d);
		return "success";
	}

}
