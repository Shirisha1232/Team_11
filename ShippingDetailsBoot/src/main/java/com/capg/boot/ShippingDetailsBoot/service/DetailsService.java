package com.capg.boot.ShippingDetailsBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.boot.ShippingDetailsBoot.beans.ShippingDetails;
import com.capg.boot.ShippingDetailsBoot.repo.DetailsRepo;

@Service
public class DetailsService implements IDetailsService{
	
	
	@Autowired
	private DetailsRepo repo;

	@Override
	public int addDetails(ShippingDetails s) {
	    repo.save(s);
		return 0;
	}
	

}
