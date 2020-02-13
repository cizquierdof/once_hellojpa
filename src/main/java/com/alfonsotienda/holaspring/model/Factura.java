package com.alfonsotienda.holaspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Factura
 */
@Entity // si el objeto no existe en la base de datos la crea
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String fecha;
    @NotNull
    @ManyToOne
    //private String cliente;
    private Cliente cliente;
    @NotNull
    private String concepto;
    @NotNull
    private Double total;


    public Factura() {
    }

    //Versión con objeto cliente como atributo
    public Factura(String fecha, Cliente cliente, String concepto, Double total) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.concepto = concepto;
        this.total = total;
    }
    //Versión con cliente String
/*     public Factura(String fecha, String cliente, String concepto, Double total) {
        this.fecha = fecha;
        this.cliente=cliente;
        this.concepto=concepto;
        this.total = total;
    } */

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

    public String getConcepto() {
        return concepto;
    }

/*     public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    } */

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    
}