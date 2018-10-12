/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface CategoriaDAO {
    public List<Categoria> mostrarCategorias();
    public void insertarCategoria(Categoria categoria);
    public void modificarCategoria(Categoria categoria);
    public void eliminarCategoria(Categoria categoria);
}
