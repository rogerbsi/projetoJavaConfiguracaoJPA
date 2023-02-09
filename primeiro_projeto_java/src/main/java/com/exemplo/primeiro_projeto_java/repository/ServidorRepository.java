package com.exemplo.primeiro_projeto_java.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.exemplo.primeiro_projeto_java.model.ServidorModel;

public interface ServidorRepository extends CrudRepository<ServidorModel,Integer> {
    List<ServidorModel> findAll();
}
