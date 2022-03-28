package com.example.progv.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String cpf;

    @Column
    private String birth;

    public void setClientName(String clientName) { this.name = clientName; }

    public String getClientName() { return name; }

    public void setClientId(Long clientId) { this.id = clientId; }

    public Long getClientId() { return id; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public void setBirth(String birth) { this.birth = birth; }

    public String getBirth() { return birth; }

}
