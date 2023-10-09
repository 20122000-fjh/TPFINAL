/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Lenovo
 */
public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private boolean preferido;
    private float precio;
    private int stock;
    private int id_proveedor;

    public Producto(int id, String nombre, String categoria, boolean preferido, float precio, int stock, int id_proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.preferido = preferido;
        this.precio = precio;
        this.stock = stock;
        this.id_proveedor = id_proveedor;
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
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(boolean preferido) {
        this.preferido = preferido;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    
    
}
