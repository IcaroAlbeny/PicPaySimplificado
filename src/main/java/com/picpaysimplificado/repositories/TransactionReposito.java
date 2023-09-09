package com.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.picpaysimplificado.doman.transaction.Transaction;

public interface TransactionReposito extends JpaRepository<Transaction, Long> {
    
}
