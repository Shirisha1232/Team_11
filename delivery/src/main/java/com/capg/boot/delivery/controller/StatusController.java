package com.capg.boot.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.boot.delivery.bean.Products;
import com.capg.boot.delivery.service.ISttatusService;

@RestController
public class StatusController {
	@Autowired
	private ISttatusService service;
	int a;
	@RequestMapping("/place")
	public String getProductsStatus() {
		 a = service.getProductsStatus();
		 
		if(a == 1)
			return "success";
		else
			return "error";
	}
	
	
	

}
