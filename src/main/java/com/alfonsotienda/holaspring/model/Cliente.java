package com.alfonsotienda.holaspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id //k y 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String nombre;

    @NotNull
    @Column(name = "apellido",nullable = false)
    private String apellido;

    @NotNull
    @Min(value = 16)    //limita edad a más de 15
    @Max(value = 65)    //y menos de 65 saltará error 500
    private Integer edad;

    @OneToMany(mappedBy = "cliente")
    private List<Factura> facturas;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente [apellido=" + apellido + ", edad=" + edad + ", id=" + id + ", nombre=" + nombre + "]";
    }
    
}