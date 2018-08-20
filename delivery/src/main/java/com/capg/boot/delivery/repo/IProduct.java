package com.capg.boot.delivery.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.boot.delivery.bean.Products;

@Repository
public interface IProduct extends CrudRepository<Products, Integer>{

}
