package com.capg.boot.ShippingDetailsBoot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.boot.ShippingDetailsBoot.beans.ShippingDetails;

@Repository
public interface DetailsRepo extends CrudRepository<ShippingDetails, Integer>{

}
