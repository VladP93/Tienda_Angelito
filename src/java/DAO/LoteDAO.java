/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Producto;
import Model.Lote;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface LoteDAO {
    public List<Lote> mostrarLotes();
    public List<Producto> mostrarProductos();
    public void insertarLote(Lote lote);
    public void modificarLote(Lote lote);
    public void eliminarLote(Lote lote);
}
