/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface ClienteDAO {
    public List<Cliente> mostrarClientes();
    public void insertarCliente(Cliente cliente);
    public void modificarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
