/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Proveedor;
import java.util.List;
import Persistence.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */
public class ProveedorImplement implements ProveedorDAO {
    Session session = null;

    @Override
    public List<Proveedor> mostrarProveedores() {
        List<Proveedor> listaProveedores = null;
        
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Proveedor order by cliDui");
            listaProveedores = (List<Proveedor>) query.list();
        } catch (HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if(session!=null){
                session.close();
            }
        }
        return listaProveedores;
    }

    @Override
    public void insertarProveedor(Proveedor proveedor) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(proveedor);
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
    public void modificarProveedor(Proveedor proveedor) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(proveedor);
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
    public void eliminarProveedor(Proveedor proveedor) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(proveedor);
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
