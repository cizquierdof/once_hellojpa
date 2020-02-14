package com.alfonsotienda.holaspring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Productos
 */
@Entity
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Double precio;
    private Double iva;

    @ManyToMany(mappedBy = "productos")
    private Set<Factura> students = new HashSet<>();

    public Productos() {
    }

    public Productos(String nombre, Double precio, Double iva) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Set<Factura> getStudents() {
        return students;
    }

    public void setStudents(Set<Factura> students) {
        this.students = students;
    }
    
    
    

}