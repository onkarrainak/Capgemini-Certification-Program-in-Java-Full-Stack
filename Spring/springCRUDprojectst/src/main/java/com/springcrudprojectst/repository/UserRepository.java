package com.springcrudprojectst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrudprojectst.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public List<User> findByFullName(String fullName);

}
