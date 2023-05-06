package com.company.springbootcrudproject2.repository;

import com.company.springbootcrudproject2.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {





}
