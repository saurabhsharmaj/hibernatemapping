package com.ebit.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebit.mapping.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
