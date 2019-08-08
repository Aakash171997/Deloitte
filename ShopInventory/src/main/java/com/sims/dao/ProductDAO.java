package com.sims.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sims.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

}
