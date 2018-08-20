package com.cg.spring.plpmod37.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.plpmod37.bean.Products;
import com.cg.spring.plpmod37.service.IProductsService;

@Controller
public class PlaceTheOrder {
	
	@Autowired
	IProductsService  service;
	
@RequestMapping("/place/{c_id}")  
	public  String  checkavailable(@PathVariable int   c_id ) {
		
		
		// TODO Auto-generated method stub
		int a = service.getAllCartProducts(c_id);
		if(a==1) {
			return "success";
		}else {
			return "Error";
		}
		
	}
	
	
	
	@RequestMapping("/products/{id}")
	public String gecheckProduct(Products p,@PathVariable int  id ){
		 
		int b=service.checkAval(id,1);
		
	
		if(b==1) {
			return "success";
		}else {
			return "Error";
		}
	
	
	}
}
