package com.company.springbootcrudproject2.repository;

import com.company.springbootcrudproject2.entity.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Long> {

}
