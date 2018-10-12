/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Producto;
import Model.Compra;
import Model.DetalleCompra;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface DetalleCompraDAO {
    public List<DetalleCompra> mostrarDetallesCompra();
    public List<Compra> mostrarCompras();
    public List<Producto> mostrarProductos();
    public void insertarDetalleCompra(DetalleCompra detalleCompra);
    public void modificarDetalleCompra(DetalleCompra detalleCompra);
    public void eliminarDetalleCompra(DetalleCompra detalleCompra);
}
