package com.poc.producer.controller;


import com.poc.producer.repository.EventTransactionRepository;
import com.poc.producer.services.EventTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/event")
@EnableAutoConfiguration
public class EventController {

    @Autowired
    EventTransactionService eventTransactionService;

    @GetMapping("/validarToken/{token}/{idClient}")
    public ResponseEntity getEvents(@PathVariable String token,
                                    @PathVariable String idClient){

        Boolean validToken = eventTransactionService.validToken(token, idClient);
        if(validToken){
            return ResponseEntity.status(200).body(validToken);
        }else {
            return ResponseEntity.status(403).build();
        }
    }
}
