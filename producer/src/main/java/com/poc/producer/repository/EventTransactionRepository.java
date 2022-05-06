package com.poc.producer.repository;

import com.poc.producer.model.EventTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface EventTransactionRepository extends JpaRepository<EventTransaction, Integer> {

    EventTransaction findByTokenAndIdClientAndDuracaoTokenGreaterThanEqual(String token, String idClient, LocalDateTime currentData);
}
