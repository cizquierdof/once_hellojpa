package com.alfonsotienda.holaspring.model;

<<<<<<< HEAD:src/main/java/com/alfonsotienda/holaspring/model/Productos.java
import java.util.HashSet;
import java.util.Set;
=======
import java.util.*;
>>>>>>> 14/02 modificaciones varias:src/main/java/com/alfonsotienda/holaspring/model/Producto.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Productos
 */
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private Double precio;
    private Double iva;

<<<<<<< HEAD:src/main/java/com/alfonsotienda/holaspring/model/Productos.java
    @ManyToMany(mappedBy = "productos")
    private Set<Factura> students = new HashSet<>();

    public Productos() {
=======
    @ManyToMany(mappedBy = "producto")
    private List<Factura> facturas = new ArrayList<>();

    public Producto() {
>>>>>>> 14/02 modificaciones varias:src/main/java/com/alfonsotienda/holaspring/model/Producto.java
    }

    public Producto(String nombre, Double precio, Double iva) {
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

<<<<<<< HEAD:src/main/java/com/alfonsotienda/holaspring/model/Productos.java
    public Set<Factura> getStudents() {
        return students;
    }

    public void setStudents(Set<Factura> students) {
        this.students = students;
    }
=======
	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
/* 
    public void adProducto(Producto p){
        this.productos= p;

    } */
>>>>>>> 14/02 modificaciones varias:src/main/java/com/alfonsotienda/holaspring/model/Producto.java
    
    
    

}