package com.cg.spring.plpmod37.service;

import com.cg.spring.plpmod37.bean.Cart;
import com.cg.spring.plpmod37.bean.Products;

public interface IProductsService {
	public int getAllCartProducts(int c_id);
	public int checkAval(int p_id ,int  p_quantity );
	public void updateInventory(Products p,int p_id);
}
