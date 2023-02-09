package com.exemplo.primeiro_projeto_java.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.primeiro_projeto_java.model.ServidorModel;
import com.exemplo.primeiro_projeto_java.services.ServidorServices;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/servidor")
public class ServidorController {
    private final ServidorServices servidorServices;
    @GetMapping
    public String get(){return "teste";}


    @GetMapping(value = "/findAll")
    public List<ServidorModel> findAll(){
        return servidorServices.findAll();
        
    } 

}
