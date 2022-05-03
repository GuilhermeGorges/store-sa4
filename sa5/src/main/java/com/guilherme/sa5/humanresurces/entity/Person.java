package com.guilherme.sa5.humanresurces.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @DateTimeFormat(style = "yyyy-MM-dd")
    private LocalDate bornDate;
    private String cpf;
    private String email;
    private String telefone;

}
