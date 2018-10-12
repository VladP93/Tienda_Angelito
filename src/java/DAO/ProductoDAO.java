/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.UnidadMedida;
import Model.Categoria;
import Model.Producto;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface ProductoDAO {
    public List<Producto> mostrarProductos();
    public List<UnidadMedida> mostrarUnidadesMedida();
    public List<Categoria> mostrarCategorias();
    public void insertarProducto(Producto producto);
    public void modificarProducto(Producto producto);
    public void eliminarProducto(Producto producto);
}
