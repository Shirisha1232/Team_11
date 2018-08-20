package com.capg.boot.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.boot.delivery.bean.ProductStatus;
import com.capg.boot.delivery.bean.Products;
import com.capg.boot.delivery.repo.IProduct;
import com.capg.boot.delivery.repo.IstatusRepo;


@Service
public class StatusService implements ISttatusService {
	
	
	@Autowired
	private IstatusRepo repo;
	
	
	@Autowired
	private IProduct repo1;
	static int id;
	static String status;
	static int quantity;
	int k = 0;
	public int getProductsStatus() {
		
		Iterable<ProductStatus> list = repo.findAll();
		for (ProductStatus productStatus : list) {
			id = productStatus.getPid();
			status = productStatus.getPstatus();
			quantity = productStatus.getQuantity();
			if(status.equalsIgnoreCase("delivered")) {
				k =updateInventory(id, quantity);
			}
		}
		return k;
		
	}
	
    
	@Override
	public int updateInventory(int id, int quantity) {
		Iterable<Products> list = repo1.findAll();
		for (Products products : list) {
		
			if(id == products.getPid()) {
				products.setQuantity(products.getQuantity() - quantity);
				repo1.save(products);
				return 1;
			}
			
		  
		}
		return 0;
		
	}
		
		
		
	
	
		
		
	

}
