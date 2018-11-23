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
import java.math.BigDecimal;
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
public class LogInBean {
    public String usuarioAlias;
    public String usuarioContraseña;
    public BigDecimal usuarioTipo;

    /**
     * Creates a new instance of LogInBean
     */
    public LogInBean() {
        UsuarioLoggeado.tipoUsuario=-1;
    }
    
    public void comprobarUsuario() throws IOException{
        UsuarioDAO accesoUsuario = new UsuarioImplement();
        List<Usuario> u = accesoUsuario.mostrarUsuarios();
        
        for(Usuario usu:u){
            if(usu.getUsuAlias().equals(usuarioAlias) && usu.getUsuContrasena().equals(usuarioContraseña)){
                 
                System.out.println("Logeado tipo de usuario: "+usu.getTipoUsuario().getTusuIdtipousuario().toString());
                UsuarioLoggeado.tipoUsuario = Integer.parseInt( usu.getTipoUsuario().getTusuIdtipousuario().toString());
            }else{
                //UsuarioLoggeado.tipoUsuario = -1;
            }
        }
        
        switch (UsuarioLoggeado.tipoUsuario) {
            case 1:
                FacesContext.getCurrentInstance().getExternalContext().redirect("faces/admin.xhtml");
                break;
            case 2:
                FacesContext.getCurrentInstance().getExternalContext().redirect("faces/factura.xhtml");
                break;
            default:
                FacesContext.getCurrentInstance().getExternalContext().redirect("no_existe.xhtml");
                break;
        }
        
    }
    
    List<Usuario> usuarios;
    List<SelectItem> tiposUsuario;

    /**
     * Creates a new instance of UsuarioBean
     */

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

    public String getUsuarioAlias() {
        return usuarioAlias;
    }

    public void setUsuarioAlias(String usuarioAlias) {
        this.usuarioAlias = usuarioAlias;
    }

    public String getUsuarioContraseña() {
        return usuarioContraseña;
    }

    public void setUsuarioContraseña(String usuarioContraseña) {
        this.usuarioContraseña = usuarioContraseña;
    }

    public BigDecimal getUsuarioTipo() {
        return usuarioTipo;
    }

    public void setUsuarioTipo(BigDecimal usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }
    
}
