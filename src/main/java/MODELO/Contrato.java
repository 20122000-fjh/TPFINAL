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
public class Contrato {
    private int id;
    private String descripcion;
    private String condiciones;
    private float valor;
    private LocalDate fecha_finalizacion;
    private LocalDate fecha_inicio;

    public Contrato(int id, String descripcion, String condiciones, float valor, LocalDate fecha_finalizacion, LocalDate fecha_inicio) {
        this.id = id;
        this.descripcion = descripcion;
        this.condiciones = condiciones;
        this.valor = valor;
        this.fecha_finalizacion = fecha_finalizacion;
        this.fecha_inicio = fecha_inicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(LocalDate fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
}
