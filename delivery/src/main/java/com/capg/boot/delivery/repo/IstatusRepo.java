package com.capg.boot.delivery.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.boot.delivery.bean.ProductStatus;

@Repository
public interface IstatusRepo extends CrudRepository<ProductStatus, Integer>{

}
