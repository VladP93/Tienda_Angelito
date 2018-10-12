/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Compra;
import Model.Comprobante;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface ComprobanteDAO {
    public List<Comprobante> mostrarComprobantes();
    public List<Compra> mostrarCompras();
    public void insertarComprobante(Comprobante comprobante);
    public void modificarComprobante(Comprobante comprobante);
    public void eliminarComprobante(Comprobante comprobante);
}
