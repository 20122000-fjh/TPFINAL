/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;
import java.time.LocalDate;
import java.util.List;
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
    private int id_centrodistribucion;
    private List<Producto> productos;

    public Pedido(long codigo, String destino, String estado, LocalDate fechaEntrega, LocalDate fechaCreacion, MetodoDePago metodoDePago, Transportista transportista, int id_centrodistribucion,List<Producto> productos) {
        this.codigo = codigo;
        this.destino = destino;
        this.estado = estado;
        this.fechaEntrega = fechaEntrega;
        this.fechaCreacion = fechaCreacion;
        this.metodoDePago = metodoDePago;
        this.transportista = transportista;
        this.id_centrodistribucion = id_centrodistribucion;
        this.productos = productos;
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

    public int getId_centrodistribucion() {
        return id_centrodistribucion;
    }

    public void setId_centrodistribucion(int id_centrodistribucion) {
        this.id_centrodistribucion = id_centrodistribucion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
