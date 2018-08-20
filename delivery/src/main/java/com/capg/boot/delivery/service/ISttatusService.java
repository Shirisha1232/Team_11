package com.capg.boot.delivery.service;

import com.capg.boot.delivery.bean.Products;

public interface ISttatusService {
	public int updateInventory(int id, int quantity);
	public int getProductsStatus();

}
