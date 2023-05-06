package com.company.springbootcrudproject2.repository;

import com.company.springbootcrudproject2.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
