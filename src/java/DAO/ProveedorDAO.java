/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Proveedor;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface ProveedorDAO {
    public List<Proveedor> mostrarProveedores();
    public void insertarProveedor(Proveedor proveedor);
    public void modificarProveedor(Proveedor proveedor);
    public void eliminarProveedor(Proveedor proveedor);
}
