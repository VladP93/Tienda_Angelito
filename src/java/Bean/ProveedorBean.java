/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.ProveedorDAO;
import DAO.ProveedorImplement;
import Model.Proveedor;
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
public class ProveedorBean {
    Proveedor proveedor;
    List<Proveedor> proveedores;

    /**
     * Creates a new instance of ProveedorBean
     */
    public ProveedorBean() throws IOException {
        if(UsuarioLoggeado.tipoUsuario == -1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }else if(UsuarioLoggeado.tipoUsuario!=1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/factura.xhtml");
        }else{
        proveedor = new Proveedor();
        }
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<Proveedor> getProveedores() {
        ProveedorDAO accesoProveedor = new ProveedorImplement();
        proveedores = accesoProveedor.mostrarProveedores();
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    
    public void insertar(){
        ProveedorDAO accesoProveedor = new ProveedorImplement();
        accesoProveedor.insertarProveedor(proveedor);
        proveedor = new Proveedor();
    }
    
    public void modificar(){
        ProveedorDAO accesoProveedor = new ProveedorImplement();
        accesoProveedor.modificarProveedor(proveedor);
        proveedor = new Proveedor();
    }
    
    public void eliminar(){
        ProveedorDAO accesoProveedor = new ProveedorImplement();
        accesoProveedor.eliminarProveedor(proveedor);
        proveedor = new Proveedor();
    }
}
