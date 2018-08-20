package com.cg.spring.plpmod37.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.plpmod37.bean.Cart;
import com.cg.spring.plpmod37.bean.Products;
import com.cg.spring.plpmod37.repo.ICartrepo;
import com.cg.spring.plpmod37.repo.IProductsRepo;

@Service
public class ProductsService implements IProductsService {
	static Iterable<Cart> list;
	 static Iterable<Products> list1;
   static int b,c,a,k,g,quant;
	@Autowired 
	private IProductsRepo Productsrepo;
	
	@Autowired 
	private ICartrepo  Cartrepo;
	
	@Override
public int  getAllCartProducts(int c_id) {
		
		
		if(Cartrepo.existsById(c_id)) {
			
			Optional<Cart> c =  Cartrepo.findById(c_id);
			Cart c1=c.get();
			
	 g=c1.getP_id();
	 
	
		   
		if(	Productsrepo.existsById(g)){
			
			k=checkAval(g,quant);
			
			
			return k;
			
		}
			
			
		}
		return 0;
	}
		
		
	


	@Override
	public int checkAval(int p_id, int p_quantity) {
		// TODO Auto-generated method stub
		if(	Productsrepo.existsById(p_id)) {
		Optional<Products> p = Productsrepo.findById(p_id);
	Products p1 = p.get();
	if(p1.getQuantity() >=p_quantity) {
		return 1;
	}
		
		
		return 0;
	}
		return 0;
	}
	
	@Override
	public void updateInventory(Products p,int p_id) {
		
		Productsrepo.save(p);
	
		
	}

	
	
	
	
	
	

/*
	@Override
	public int checkAval(int p_id) {
		// TODO Auto-generated method stub
		Iterable<Cart> list = Cartrepo.findAll();
		for (Cart cart : list) {
			c=cart.getP_id();
			a=cart.getP_quantity();
		}
	
	if(	Productsrepo.existsById(c)) {
		
		Optional<Products> p = Productsrepo.findById(c);
	Products p1 = p.get();
	if(p1.getQuantity()>a) {
		return 1;
	}
	}
		return 0;
	}
*/





	

}
