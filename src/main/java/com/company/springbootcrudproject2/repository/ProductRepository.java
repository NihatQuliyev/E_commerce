package com.company.springbootcrudproject2.repository;

import com.company.springbootcrudproject2.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {



}
