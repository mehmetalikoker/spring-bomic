package com.sha.microservice1product.repository;

import com.sha.microservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {

}
