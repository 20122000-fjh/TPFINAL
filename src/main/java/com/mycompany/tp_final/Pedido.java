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
public class Pedido {
    private long codigo;
    private String destino;
    private String estado;
    private LocalDate fechaEntrega;
    private LocalDate fechaCreacion;
    private MetodoDePago metodoDePago;
    private Transportista transportista;

    public Pedido(long codigo, String destino, String estado, LocalDate fechaEntrega, LocalDate fechaCreacion) {
        this.codigo = codigo;
        this.destino = destino;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        this.fechaCreacion = fechaCreacion;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }
    
    
}
