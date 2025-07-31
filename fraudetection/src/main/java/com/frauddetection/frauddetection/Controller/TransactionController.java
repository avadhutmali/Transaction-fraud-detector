package com.frauddetection.frauddetection.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frauddetection.frauddetection.Models.Transaction;
import com.frauddetection.frauddetection.Service.TransactionService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    
    @PostMapping("/create")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        
        return transactionService.saveTransaction(transaction);
    }
    
}
