/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import java.util.List;
import Persistence.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */
public class CategoriaImplement implements CategoriaDAO {
    Session session = null;

    @Override
    public List<Categoria> mostrarCategorias() {
        List<Categoria> listaCategorias = null;
        
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Categoria order by catNombre");
            listaCategorias = (List<Categoria>) query.list();
        } catch (HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if(session!=null){
                session.close();
            }
        }
        return listaCategorias;
    }

    @Override
    public void insertarCategoria(Categoria categoria) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(categoria);
            session.getTransaction().commit();
        } catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void modificarCategoria(Categoria categoria) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(categoria);
            session.getTransaction().commit();
        } catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void eliminarCategoria(Categoria categoria) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(categoria);
            session.getTransaction().commit();
        } catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }
}