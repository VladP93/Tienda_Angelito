package Model;
// Generated 09-23-2018 06:43:41 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Comprobante generated by hbm2java
 */
public class Comprobante  implements java.io.Serializable {


     private BigDecimal comprobIdcomprobante;
     private Compra compra;
     private String comprobNombre;

    public Comprobante() {
    }

    public Comprobante(BigDecimal comprobIdcomprobante, Compra compra, String comprobNombre) {
       this.comprobIdcomprobante = comprobIdcomprobante;
       this.compra = compra;
       this.comprobNombre = comprobNombre;
    }
   
    public BigDecimal getComprobIdcomprobante() {
        return this.comprobIdcomprobante;
    }
    
    public void setComprobIdcomprobante(BigDecimal comprobIdcomprobante) {
        this.comprobIdcomprobante = comprobIdcomprobante;
    }
    public Compra getCompra() {
        return this.compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    public String getComprobNombre() {
        return this.comprobNombre;
    }
    
    public void setComprobNombre(String comprobNombre) {
        this.comprobNombre = comprobNombre;
    }




}


