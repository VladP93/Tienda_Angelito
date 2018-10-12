/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.DetalleFacturaDAO;
import DAO.DetalleFacturaImplement;
import Model.Producto;
import Model.Factura;
import Model.DetalleFactura;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author vpaniagua
 */
@ManagedBean
@ViewScoped
public class DetalleFacturaBean {
    DetalleFactura detalleFactura;
    Producto producto;
    Factura factura;
    List<DetalleFactura> detallesFactura;
    List<SelectItem> productos;
    List<SelectItem> facturas;
            
    /**
     * Creates a new instance of DetalleFacturaBean
     */
    public DetalleFacturaBean() {
        detalleFactura = new DetalleFactura();
    }

    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(DetalleFactura detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public List<DetalleFactura> getDetallesFactura() {
        DetalleFacturaDAO accesoDetallesFactura =  new DetalleFacturaImplement();
        detallesFactura = accesoDetallesFactura.mostrarDetallesFactura();
        return detallesFactura;
    }

    public void setDetallesFactura(List<DetalleFactura> detallesFactura) {
        this.detallesFactura = detallesFactura;
    }

    public List<SelectItem> getProductos() {
        productos = new ArrayList<>();
        DetalleFacturaDAO accesoDetallesFactura = new DetalleFacturaImplement();
        List<Producto> p = accesoDetallesFactura.mostrarProductos();
        productos.clear();
        
        for(Producto prod:p){
            SelectItem productoItem = new SelectItem(prod.getProdCodproducto(),prod.getProdNombre());
            productos.add(productoItem);
        }
        
        return productos;
    }

    public void setProductos(List<SelectItem> productos) {
        this.productos = productos;
    }

    public List<SelectItem> getFacturas() {
        facturas = new ArrayList<>();
        DetalleFacturaDAO accesoDetallesFactura = new DetalleFacturaImplement();
        List<Factura> f = accesoDetallesFactura.mostrarFacturas();
        facturas.clear();
        
        for(Factura fact:f){
            SelectItem facturaItem = new SelectItem(fact.getFactIdfactura(),fact.getFactFecha().toString());
            facturas.add(facturaItem);
        }
        
        return facturas;
    }

    public void setFacturas(List<SelectItem> facturas) {
        this.facturas = facturas;
    }
    
    public void insertar() {
        idValue();
        DetalleFacturaDAO accesoDetalleFactura = new DetalleFacturaImplement();
        accesoDetalleFactura.insertarDetalleFactura(detalleFactura);
        detalleFactura = new DetalleFactura();
    }
    
    public void modificar() {
        DetalleFacturaDAO accesoDetalleFactura = new DetalleFacturaImplement();
        accesoDetalleFactura.modificarDetalleFactura(detalleFactura);
        detalleFactura = new DetalleFactura();
    }
    
    public void eliminar() {
        DetalleFacturaDAO accesoDetalleFactura = new DetalleFacturaImplement();
        accesoDetalleFactura.eliminarDetalleFactura(detalleFactura);
        detalleFactura = new DetalleFactura();
    }
    
    public void idValue(){
        List<DetalleFactura> listaDetallesFactura = this.getDetallesFactura();
        if(listaDetallesFactura.isEmpty()){
            detalleFactura.setDetfIddetallefactura(BigDecimal.ONE);
        } else {
            detalleFactura.setDetfIddetallefactura(BigDecimal.valueOf(listaDetallesFactura.size()+1));
        }
    }
    
    public double getSubtotal(){
        return getDetalleFactura().getDetfCantidad().doubleValue() * getDetalleFactura().getProducto().getProdPrecioUnitario().doubleValue();
    }

}
