package com.revature.spark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spark.beans.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>{

}
