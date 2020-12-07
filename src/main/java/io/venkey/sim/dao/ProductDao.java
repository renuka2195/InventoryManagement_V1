package io.venkey.sim.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.venkey.sim.model.Product;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer>{
}
