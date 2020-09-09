package com.LLBCorp.repository;

import org.springframework.data.repository.CrudRepository;

import com.LLBCorp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
  
}