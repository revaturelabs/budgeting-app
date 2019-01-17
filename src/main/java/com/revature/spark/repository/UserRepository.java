package com.revature.spark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spark.beans.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
