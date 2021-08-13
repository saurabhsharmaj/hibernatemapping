package com.ebit.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.mapping.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
