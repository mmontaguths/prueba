package com.practica.ingenio.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name ="productos")

public class Productos {


    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idProd;
    private String nombre_producto;
    private String descripcion_producto;
    private long valor_producto;
    private String observaciones;

    @ManyToOne
    private Empleado empleado;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Productos(Integer idProd, String nombre_producto, String descripcion_producto, long valor_producto, String observaciones, Empleado empleado) {
        this.idProd = idProd;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.valor_producto = valor_producto;
        this.observaciones = observaciones;
        this.empleado = empleado;
    }

    public Integer getIdProd() {
        return idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public long getValor_producto() {
        return valor_producto;
    }

    public void setValor_producto(long valor_producto) {
        this.valor_producto = valor_producto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

