/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class Descarga {
    long id;
    LocalDate fecha_llegada;
    String observacion;

    public Descarga(long id, LocalDate fecha_llegada, String observacion) {
        this.id = id;
        this.fecha_llegada = fecha_llegada;
        this.observacion = observacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(LocalDate fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}
