package com.poc.producer.services;

import com.poc.producer.model.EventTransaction;
import com.poc.producer.repository.EventTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

@Component
public class EventTransactionService {

    @Autowired
    private EventTransactionRepository sharesRepository;

    public Boolean validToken(String token, String idClient){
        LocalDateTime currentData = LocalDateTime.now();
        EventTransaction evento = sharesRepository.findByTokenAndIdClientAndDuracaoTokenGreaterThanEqual(token, idClient, currentData);
        return !Objects.isNull(evento);
    }
}
