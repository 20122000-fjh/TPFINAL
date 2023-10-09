/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public class Almacen {
    private long id;
    private String ubicacion;
    private List<UbicacionDeAlmacenamiento> ubicacion_almacenamiento;
    private List<Producto> productos;

    public Almacen(long id, String ubicacion,List<UbicacionDeAlmacenamiento> ubicacion_almacenamiento,List<Producto> productos) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.ubicacion_almacenamiento = ubicacion_almacenamiento;
        this.productos = productos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<UbicacionDeAlmacenamiento> getUbicacion_almacenamiento() {
        return ubicacion_almacenamiento;
    }

    public void setUbicacion_almacenamiento(List<UbicacionDeAlmacenamiento> ubicacion_almacenamiento) {
        this.ubicacion_almacenamiento = ubicacion_almacenamiento;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
