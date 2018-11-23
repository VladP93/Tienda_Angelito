/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Producto;
import Model.Factura;
import Model.DetalleFactura;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface DetalleFacturaDAO {
    public List<DetalleFactura> mostrarDetallesFactura();
    public List<DetalleFactura> mostrarDetallesFactura(Factura factura);
    public List<Producto> mostrarProductos();
    public List<Factura> mostrarFacturas();
    public void insertarDetalleFactura(DetalleFactura detalleFactura);
    public void modificarDetalleFactura(DetalleFactura detalleFactura);
    public void eliminarDetalleFactura(DetalleFactura detalleFactura);
}
