/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import Model.Proveedor;
import Model.Compra;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface CompraDAO {
    public List<Compra> mostrarCompra();
    public List<Proveedor> mostrarProveedores();
    public List<Usuario> mostrarUsuario();
    public void insertarCompra(Compra compra);
    public void modificarCompra(Compra compra);
    public void eliminarCompra(Compra compra);
}
