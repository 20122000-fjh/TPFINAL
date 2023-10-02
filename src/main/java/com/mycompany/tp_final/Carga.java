/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_final;
import java.time.LocalDate;
/**
 *
 * @author Lenovo
 */
public class Carga {
    private long id;
    private LocalDate fechaPartida;
    private String observacion;
    private String destino;
    private Almacen almacen;

    public Carga(long id, LocalDate fechaPartida, String observacion, String destino,Almacen almacen) {
        this.id = id;
        this.fechaPartida = fechaPartida;
        this.observacion = observacion;
        this.destino = destino;
        this.almacen = almacen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Almacen getId_almacen() {
        return almacen;
    }

    public void setId_almacen(Almacen almacen) {
        this.almacen = almacen;
    }
    
}
