package com.frauddetection.frauddetection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frauddetection.frauddetection.Models.Transaction;

@Repository
public interface  TransactionRepository extends  JpaRepository<Transaction, Long>{
    
}
