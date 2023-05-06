package com.company.springbootcrudproject2.repository;

import com.company.springbootcrudproject2.entity.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    @Modifying
    @Transactional
    @Query(
            value = "UPDATE cart a SET a.count = ?1  where a.id = ?2",
            nativeQuery = true
    )
    int updateCategoryNameById(Long count , Long id);
}
