package com.alfonsotienda.holaspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Factura
 */
@Entity //si el objeto no existe en la base de datos la crea
public class Factura {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String fecha;
    private Double total;

    public Factura() {
    }

    public Factura(String fecha,Integer id ,Double total) {
        this.id=id;
        this.fecha = fecha;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [fecha=" + fecha + ", id=" + id + ", total=" + total + "]";
    }


    
}