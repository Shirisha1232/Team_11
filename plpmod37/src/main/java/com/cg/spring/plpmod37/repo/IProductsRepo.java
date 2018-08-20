package com.cg.spring.plpmod37.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cg.spring.plpmod37.bean.Products;


@Repository
public interface IProductsRepo  extends CrudRepository<Products, Integer>{
	


}
