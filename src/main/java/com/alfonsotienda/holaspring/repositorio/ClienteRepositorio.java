package com.alfonsotienda.holaspring.repositorio;

import com.alfonsotienda.holaspring.model.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Integer>{
    Iterable<Cliente> findAll();
}