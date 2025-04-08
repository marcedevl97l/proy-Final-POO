/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import java.util.Date;

/**
 *
 * @author Marcee
 */
public class Producto {
/*private int id;
    private String nombre;

    public Producto() {}

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    private String lote;
    private Date fechaIngreso;

    public Producto() {}

    public Producto(String nombre, double precio, int cantidad, String lote, Date fechaIngreso) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.lote = lote;
        this.fechaIngreso = fechaIngreso;
    }
}
