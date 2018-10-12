/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.UnidadMedidaDAO;
import DAO.UnidadMedidaImplement;
import Model.UnidadMedida;
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
public class UnidadMedidaBean {
    UnidadMedida unidadMedida;
    List<UnidadMedida> unidadesMedida;

    /**
     * Creates a new instance of UnidadMedidaBean
     */
    public UnidadMedidaBean() {
        unidadMedida = new UnidadMedida();
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<UnidadMedida> getUnidadesMedida() {
        UnidadMedidaDAO accesoUnidadMedida = new UnidadMedidaImplement();
        unidadesMedida = accesoUnidadMedida.mostrarUnidadesMedida();
        return unidadesMedida;
    }

    public void setUnidadesMedida(List<UnidadMedida> unidadesMedida) {
        this.unidadesMedida = unidadesMedida;
    }
    
    public void insertar(){
        idValue();
        UnidadMedidaDAO accesoUnidadMedida = new UnidadMedidaImplement();
        accesoUnidadMedida.insertarUnidadMedida(unidadMedida);
        unidadMedida = new UnidadMedida();
    }
    
    public void modificar(){
        UnidadMedidaDAO accesoUnidadMedida = new UnidadMedidaImplement();
        accesoUnidadMedida.modificarUnidadMedida(unidadMedida);
        unidadMedida = new UnidadMedida();
    }
    
    public void eliminar(){
        UnidadMedidaDAO accesoUnidadMedida = new UnidadMedidaImplement();
        accesoUnidadMedida.eliminarUnidadMedida(unidadMedida);
        unidadMedida = new UnidadMedida();
    }
    
    public void idValue(){
        List<UnidadMedida> listaUnidadesMedida = this.getUnidadesMedida();
        if(listaUnidadesMedida.isEmpty()){
            unidadMedida.setUnmIdunidadmedida(BigDecimal.ONE);
        } else {
            unidadMedida.setUnmIdunidadmedida(BigDecimal.valueOf(listaUnidadesMedida.size()+1));
        }
    }
    
}

