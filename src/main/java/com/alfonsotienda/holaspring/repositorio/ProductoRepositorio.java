package com.alfonsotienda.holaspring.repositorio;

import com.alfonsotienda.holaspring.model.Productos;

import org.springframework.data.repository.CrudRepository;

/**
 * ProductoRepositorio
 */
public interface ProductoRepositorio extends CrudRepository<Productos, Long>{

    
}