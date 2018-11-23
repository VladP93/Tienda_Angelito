/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.ClienteDAO;
import DAO.ClienteImplement;
import Model.Cliente;
import java.io.IOException;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author vpaniagua
 */
@ManagedBean
@ViewScoped
public class ClienteBean {
    Cliente cliente;
    List<Cliente> clientes;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() throws IOException {
        if(UsuarioLoggeado.tipoUsuario == -1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }else if(UsuarioLoggeado.tipoUsuario!=1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/factura.xhtml");
        }else{
        cliente = new Cliente();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        ClienteDAO accesoCliente = new ClienteImplement();
        clientes = accesoCliente.mostrarClientes();
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void insertar(){
        ClienteDAO accesoCliente = new ClienteImplement();
        accesoCliente.insertarCliente(cliente);
        cliente = new Cliente();
    }
    
    public void modificar(){
        ClienteDAO accesoCliente = new ClienteImplement();
        accesoCliente.modificarCliente(cliente);
        cliente = new Cliente();
    }
    
    public void eliminar(){
        ClienteDAO accesoCliente = new ClienteImplement();
        accesoCliente.eliminarCliente(cliente);
        cliente = new Cliente();
    }
}
