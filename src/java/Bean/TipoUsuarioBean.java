/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.TipoUsuarioDAO;
import DAO.TipoUsuarioImplement;
import Model.TipoUsuario;
import java.math.BigDecimal;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author vpaniagua
 */
@ManagedBean
@ViewScoped
public class TipoUsuarioBean {
    TipoUsuario tipoUsuario;
    List<TipoUsuario> tiposUsuario;

    /**
     * Creates a new instance of TipoUsuarioBean
     */
    public TipoUsuarioBean() {
        tipoUsuario = new TipoUsuario();
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<TipoUsuario> getTiposUsuario() {
        TipoUsuarioDAO accesoTipoUsuario = new TipoUsuarioImplement();
        tiposUsuario = accesoTipoUsuario.mostrarTiposUsuario();
        return tiposUsuario;
    }

    public void setTipoUsuarios(List<TipoUsuario> tiposUsuario) {
        this.tiposUsuario = tiposUsuario;
    }
    
    public void insertar(){
        idValue();
        TipoUsuarioDAO accesoTipoUsuario = new TipoUsuarioImplement();
        accesoTipoUsuario.insertarTipoUsuario(tipoUsuario);
        tipoUsuario = new TipoUsuario();
    }
    
    public void modificar(){
        TipoUsuarioDAO accesoTipoUsuario = new TipoUsuarioImplement();
        accesoTipoUsuario.modificarTipoUsuario(tipoUsuario);
        tipoUsuario = new TipoUsuario();
    }
    
    public void eliminar(){
        TipoUsuarioDAO accesoTipoUsuario = new TipoUsuarioImplement();
        accesoTipoUsuario.eliminarTipoUsuario(tipoUsuario);
        tipoUsuario = new TipoUsuario();
    }
    
    public void idValue(){
        List<TipoUsuario> listaTiposUsuario = this.getTiposUsuario();
        if(listaTiposUsuario.isEmpty()){
            tipoUsuario.setTusuIdtipousuario(BigDecimal.ONE);
        } else {
            tipoUsuario.setTusuIdtipousuario(BigDecimal.valueOf(listaTiposUsuario.size()+1));
        }
    }
    
}

