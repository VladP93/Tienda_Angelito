/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import Model.Cliente;
import Model.Factura;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface FacturaDAO {
    public List<Factura> mostrarFactura();
    public List<Usuario> mostrarUsuarios();
    public List<Cliente> mostrarClientes();
    public void insertarFactura(Factura factura);
    public void modificarFactura(Factura factura);
    public void eliminarFactura(Factura factura);
}
