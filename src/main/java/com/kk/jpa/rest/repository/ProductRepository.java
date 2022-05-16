package com.kk.jpa.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kk.jpa.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
