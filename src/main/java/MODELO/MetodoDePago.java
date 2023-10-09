/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Lenovo
 */
public class MetodoDePago {
    private long codigo_pedido;
    private String numeroTarjeta;
    private String tipo;

    public MetodoDePago(long codigo_pedido, String numeroTarjeta, String tipo) {
        this.codigo_pedido = codigo_pedido;
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
    }


    public long get_Codigopedido() {
        return codigo_pedido;
    }

    public void setCodigopedido(long codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
