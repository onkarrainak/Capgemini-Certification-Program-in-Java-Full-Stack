package com.springcrudprojectst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrudprojectst.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
