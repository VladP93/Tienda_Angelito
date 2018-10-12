/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.util.List;
import Persistence.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */
public class ClienteImplement implements ClienteDAO {
    Session session = null;

    @Override
    public List<Cliente> mostrarClientes() {
        List<Cliente> listaClientes = null;
        
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Cliente order by cliDui");
            listaClientes = (List<Cliente>) query.list();
        } catch (HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if(session!=null){
                session.close();
            }
        }
        return listaClientes;
    }

    @Override
    public void insertarCliente(Cliente cliente) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cliente);
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
    public void modificarCliente(Cliente cliente) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(cliente);
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
    public void eliminarCliente(Cliente cliente) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(cliente);
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
