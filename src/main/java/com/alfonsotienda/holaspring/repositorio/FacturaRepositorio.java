package com.alfonsotienda.holaspring.repositorio;

import com.alfonsotienda.holaspring.model.Factura;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//genera internamente una clase FacturaRepositorio operaciones de datos apra el objeto Facuras
@Repository     
public interface FacturaRepositorio extends CrudRepository<Factura, Integer>{

}

    
