/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.ProductoDAO;
import DAO.ProductoImplement;
import Model.Producto;
import Model.UnidadMedida;
import Model.Categoria;
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
public class ProductoBean {
    Producto producto;
    UnidadMedida unidadMedida;
    Categoria categoria;
    List<Producto> productos;
    List<Producto> productoFiltrado;
    List<SelectItem> unidadesMedida;
    List<SelectItem> categorias;

    /**
     * Creates a new instance of ProductoBean
     */
    public ProductoBean() throws IOException {
        if(UsuarioLoggeado.tipoUsuario == -1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        }else if(UsuarioLoggeado.tipoUsuario!=1){
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/factura.xhtml");
        }else{
        producto=new Producto();
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Producto> getProductos() {
        ProductoDAO accesoProducto = new ProductoImplement();
        productos = accesoProducto.mostrarProductos();
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<SelectItem> getUnidadesMedida() {
        unidadesMedida = new ArrayList<>();
        ProductoDAO accesoProducto = new ProductoImplement();
        List<UnidadMedida> u = accesoProducto.mostrarUnidadesMedida();
        unidadesMedida.clear();
        
        for(UnidadMedida unm:u){
            SelectItem unidadMedidaItem =new SelectItem(unm.getUnmIdunidadmedida(),unm.getUnmUnidad());
            unidadesMedida.add(unidadMedidaItem);
        }
        
        return unidadesMedida;
    }

    public void setUnidadesMedida(List<SelectItem> unidadesMedida) {
        this.unidadesMedida = unidadesMedida;
    }

    public List<SelectItem> getCategorias() {
        categorias = new ArrayList<>();
        ProductoDAO accesoProducto = new ProductoImplement();
        List<Categoria> c = accesoProducto.mostrarCategorias();
        categorias.clear();
        
        for(Categoria cat:c){
            SelectItem categoriaItem =new SelectItem(cat.getCatIdcategoria(),cat.getCatNombre());
            categorias.add(categoriaItem);
        }
        
        return categorias;
    }

    public void setCategorias(List<SelectItem> categorias) {
        this.categorias = categorias;
    }
    
    public void insertar(){
        ProductoDAO accesoProducto = new ProductoImplement();
        accesoProducto.insertarProducto(producto);
        producto = new Producto();
    }
    
    public void modificar(){
        ProductoDAO accesoProducto = new ProductoImplement();
        accesoProducto.modificarProducto(producto);
        producto = new Producto();
    }
    
    public void eliminar(){
        ProductoDAO accesoProducto = new ProductoImplement();
        accesoProducto.eliminarProducto(producto);
        producto = new Producto();
    }

    public List<Producto> getProductoFiltrado() {
        return productoFiltrado;
    }

    public void setProductoFiltrado(List<Producto> productoFiltrado) {
        this.productoFiltrado = productoFiltrado;
    }
    
}
