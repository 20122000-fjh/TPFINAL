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
public class Envio {
    private int codigo;
    private LocalDate fecha_pedido;
    private LocalDate fecha_entrega;
    private int num_ordencompra;

    public Envio(int codigo, LocalDate fecha_pedido, LocalDate fecha_entrega, int num_ordencompra) {
        this.codigo = codigo;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.num_ordencompra = num_ordencompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDate fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public int getNum_ordencompra() {
        return num_ordencompra;
    }

    public void setNum_ordencompra(int num_ordencompra) {
        this.num_ordencompra = num_ordencompra;
    }
    
    
}
