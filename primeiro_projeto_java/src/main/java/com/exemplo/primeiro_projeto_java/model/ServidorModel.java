package com.exemplo.primeiro_projeto_java.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "servidor" )
public class ServidorModel {
    @Id
    @Column(name = "Id", unique=true, nullable = false )
    private Integer idServidor;
    
    @Column(name = "Nome")
    private String nome;
    
    @Column(name = "CPF")
    private String cpf;
    
    @Column(name = "Matricula")
    private String matricula;
}
