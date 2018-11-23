/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.FacturaDAO;
import DAO.FacturaImplement;
import Model.Cliente;
import Model.Factura;
import Model.Usuario;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author vpaniagua
 */
@ManagedBean
@ViewScoped
public class FacturaBean {
    Cliente cliente;
    Factura factura;
    Usuario usuario;
    Date date;
    List<SelectItem> clientes;
    List<Factura> facturas;
    List<SelectItem> usuarios;

    /**
     * Creates a new instance of FacturaBean
     */
    public FacturaBean()  throws IOException {
        if(UsuarioLoggeado.tipoUsuario == -1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }else{
        factura = new Factura();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDate() {
        date = new Date();
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<SelectItem> getClientes() {
        clientes = new ArrayList<>();
        FacturaDAO accesoFactura = new FacturaImplement();
        List<Cliente> c = accesoFactura.mostrarClientes();
        clientes.clear();
        
        for(Cliente cli:c){
            SelectItem clienteItem =new SelectItem(cli.getCliDui(),cli.getCliNombre()+" "+cli.getCliApellido());
            clientes.add(clienteItem);
        }
        
        return clientes;
    }

    public void setClientes(List<SelectItem> clientes) {
        this.clientes = clientes;
    }

    public List<Factura> getFacturas() {
        FacturaDAO accesoFactura= new FacturaImplement();
        facturas = accesoFactura.mostrarFactura();
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public List<SelectItem> getUsuarios() {
        usuarios = new ArrayList<>();
        FacturaDAO accesoFactura = new FacturaImplement();
        List<Usuario> u = accesoFactura.mostrarUsuarios();
        usuarios.clear();
        
        for(Usuario usu:u){
            SelectItem usuarioItem =new SelectItem(usu.getUsuDui(),usu.getUsuNombre()+" "+usu.getUsuApellido());
            usuarios.add(usuarioItem);
        }
        
        return usuarios;
    }

    public void setUsuarios(List<SelectItem> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void insertar(){
        FacturaDAO accesoUsuario = new FacturaImplement();
        factura.setFactFecha(getDate());
        idValue();
        accesoUsuario.insertarFactura(factura);
        factura = new Factura();
    }
    
    public void modificar(){
        FacturaDAO accesoUsuario = new FacturaImplement();
        accesoUsuario.modificarFactura(factura);
        factura = new Factura();
    }
    
    public void eliminar(){
        FacturaDAO accesoUsuario = new FacturaImplement();
        accesoUsuario.eliminarFactura(factura);
        factura = new Factura();
    }
    
    public void idValue(){
        List<Factura> listaFacturas = this.getFacturas();
        if(listaFacturas.isEmpty()){
            factura.setFactIdfactura(BigDecimal.ONE);
        } else {
            factura.setFactIdfactura(BigDecimal.valueOf(listaFacturas.size()+1));
        }
    }
    
}