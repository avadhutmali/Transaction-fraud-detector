package com.frauddetection.frauddetection.Service;

import org.springframework.stereotype.Service;

import com.frauddetection.frauddetection.Models.Transaction;
import com.frauddetection.frauddetection.Repository.TransactionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public Transaction saveTransaction(Transaction transaction){
        return transactionRepository.save(transaction);
    }

}
