package Model;
// Generated 09-23-2018 06:43:41 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * DetalleCompra generated by hbm2java
 */
public class DetalleCompra  implements java.io.Serializable {


     private BigDecimal dcompIddetallecompra;
     private Compra compra;
     private Producto producto;
     private BigDecimal dcompCantidad;
     private BigDecimal dcompCosto;

    public DetalleCompra() {
    }

    public DetalleCompra(BigDecimal dcompIddetallecompra, Compra compra, Producto producto, BigDecimal dcompCantidad, BigDecimal dcompCosto) {
       this.dcompIddetallecompra = dcompIddetallecompra;
       this.compra = compra;
       this.producto = producto;
       this.dcompCantidad = dcompCantidad;
       this.dcompCosto = dcompCosto;
    }
   
    public BigDecimal getDcompIddetallecompra() {
        return this.dcompIddetallecompra;
    }
    
    public void setDcompIddetallecompra(BigDecimal dcompIddetallecompra) {
        this.dcompIddetallecompra = dcompIddetallecompra;
    }
    public Compra getCompra() {
        return this.compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public BigDecimal getDcompCantidad() {
        return this.dcompCantidad;
    }
    
    public void setDcompCantidad(BigDecimal dcompCantidad) {
        this.dcompCantidad = dcompCantidad;
    }
    public BigDecimal getDcompCosto() {
        return this.dcompCosto;
    }
    
    public void setDcompCosto(BigDecimal dcompCosto) {
        this.dcompCosto = dcompCosto;
    }




}


