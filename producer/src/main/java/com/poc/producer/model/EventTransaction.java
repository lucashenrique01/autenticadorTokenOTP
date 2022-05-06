package com.poc.producer.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="eventTransaction")
@Table(name="eventTransaction")
public class EventTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String token;
    @Column(name="idClient")
    private String idClient;
    @Column(name="idTransacao")
    private String idTransacao;
    @Column(name="canalSolicitante")
    private String canalSolicitante;
    @Column(name="duracaoToken")
    private LocalDateTime duracaoToken;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getCanalSolicitante() {
        return canalSolicitante;
    }

    public void setCanalSolicitante(String canalSolicitante) {
        this.canalSolicitante = canalSolicitante;
    }

    public LocalDateTime getDuracaoToken() {
        return duracaoToken;
    }

    public void setDuracaoToken(LocalDateTime duracaoToken) {
        this.duracaoToken = duracaoToken;
    }
}
