/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.CategoriaDAO;
import DAO.CategoriaImplement;
import Model.Categoria;
import java.io.IOException;
import java.math.BigDecimal;
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
public class CategoriaBean {
    Categoria categoria;
    List<Categoria> categorias;

    /**
     * Creates a new instance of CategoriaBean
     */
    public CategoriaBean() throws IOException {
        if(UsuarioLoggeado.tipoUsuario == -1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }else if(UsuarioLoggeado.tipoUsuario!=1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/factura.xhtml");
        }else{
        categoria = new Categoria();
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getCategorias() {
        CategoriaDAO accesoCategoria = new CategoriaImplement();
        categorias = accesoCategoria.mostrarCategorias();
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public void insertar(){
        idValue();
        CategoriaDAO accesoCategoria = new CategoriaImplement();
        accesoCategoria.insertarCategoria(categoria);
        categoria = new Categoria();
    }
    
    public void modificar(){
        CategoriaDAO accesoCategoria = new CategoriaImplement();
        accesoCategoria.modificarCategoria(categoria);
        categoria = new Categoria();
    }
    
    public void eliminar(){
        CategoriaDAO accesoCategoria = new CategoriaImplement();
        accesoCategoria.eliminarCategoria(categoria);
        categoria = new Categoria();
    }
    
    public void idValue(){
        List<Categoria> listaCategorias = this.getCategorias();
        if(listaCategorias.isEmpty()){
            categoria.setCatIdcategoria(BigDecimal.ONE);
        } else {
            categoria.setCatIdcategoria(BigDecimal.valueOf(listaCategorias.size()+1));
        }
    }
    
}

