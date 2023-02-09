package com.exemplo.primeiro_projeto_java.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exemplo.primeiro_projeto_java.model.ServidorModel;
import com.exemplo.primeiro_projeto_java.repository.ServidorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServidorServices {
    private final ServidorRepository servidorRepository;
     

    public List<ServidorModel> findAll(){
        return servidorRepository.findAll();
    }
}
