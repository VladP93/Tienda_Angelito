/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.UsuarioDAO;
import DAO.UsuarioImplement;
import Model.Usuario;
import Model.TipoUsuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author vpaniagua
 */
@ManagedBean
@ViewScoped
public class UsuarioBean {
    Usuario usuario;
    TipoUsuario tipoUsuario;
    List<Usuario> usuarios;
    List<SelectItem> tiposUsuario;

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() throws IOException {
        if(UsuarioLoggeado.tipoUsuario == -1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }else if(UsuarioLoggeado.tipoUsuario!=1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/factura.xhtml");
        }else{
            usuario = new Usuario();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Usuario> getUsuarios() {
        UsuarioDAO accesoUsuario= new UsuarioImplement();
        usuarios = accesoUsuario.mostrarUsuarios();
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<SelectItem> getTiposUsuario() {
        tiposUsuario = new ArrayList<>();
        UsuarioDAO accesoUsuario = new UsuarioImplement();
        List<TipoUsuario> tu = accesoUsuario.mostrarTiposUsuario();
        tiposUsuario.clear();
        
        for(TipoUsuario tusu:tu){
            SelectItem tipoUsuarioItem =new SelectItem(tusu.getTusuIdtipousuario(),tusu.getTusuTipo());
            tiposUsuario.add(tipoUsuarioItem);
        }
        
        return tiposUsuario;
    }

    public void setTiposUsuario(List<SelectItem> tiposUsuario) {
        this.tiposUsuario = tiposUsuario;
    }
    
    public void insertar(){
        UsuarioDAO accesoUsuario = new UsuarioImplement();
        accesoUsuario.insertarUsuario(usuario);
        usuario = new Usuario();
        System.out.println("usuario: "+UsuarioLoggeado.tipoUsuario);
    }
    
    public void modificar(){
        UsuarioDAO accesoUsuario = new UsuarioImplement();
        accesoUsuario.modificarUsuario(usuario);
        usuario = new Usuario();
    }
    
    public void eliminar(){
        UsuarioDAO accesoUsuario = new UsuarioImplement();
        accesoUsuario.eliminarUsuario(usuario);
        usuario = new Usuario();
    }
    
    
}
