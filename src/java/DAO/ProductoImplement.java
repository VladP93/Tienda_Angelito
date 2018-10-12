/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import Model.Producto;
import Model.UnidadMedida;
import java.util.List;
import Persistence.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author vpaniagua
 */
public class ProductoImplement implements ProductoDAO{
    Session session = null;

    @Override
    public List<Producto> mostrarProductos() {
        List<Producto> listaProductos = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Producto producto INNER JOIN FETCH producto.categoria categoria INNER JOIN FETCH producto.unidadMedida unidadMedida");
            listaProductos = (List<Producto>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return listaProductos;
    }

    @Override
    public List<UnidadMedida> mostrarUnidadesMedida() {
        List<UnidadMedida> listaUnidadesMedida= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM UnidadMedida");
            listaUnidadesMedida = (List<UnidadMedida>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
        
        return listaUnidadesMedida;
    }

    @Override
    public List<Categoria> mostrarCategorias() {
        List<Categoria> listaCategorias= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Categoria order by catIdcategoria");
            listaCategorias = (List<Categoria>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
        
        return listaCategorias;
    }

    @Override
    public void insertarProducto(Producto producto) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(producto);
            session.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session !=  null){
                session.close();
            }
        }
    }

    @Override
    public void modificarProducto(Producto producto) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(producto);
            session.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session !=  null){
                session.close();
            }
        }
    }

    @Override
    public void eliminarProducto(Producto producto) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(producto);
            session.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session !=  null){
                session.close();
            }
        }
    }
    
}
