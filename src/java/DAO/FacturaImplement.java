/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.Factura;
import Model.Usuario;
import Persistence.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */
public class FacturaImplement implements FacturaDAO {
    Session session = null;

    
    @Override
    public List<Factura> mostrarFactura() {
        List<Factura> listaFacturas = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Factura factura INNER JOIN FETCH factura.usuario usuario INNER JOIN FETCH factura.cliente cliente");
            listaFacturas = (List<Factura>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return listaFacturas;
    }

    @Override
    public List<Usuario> mostrarUsuarios() {
        List<Usuario> listaUsuarios= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Usuario order by usuApellido");
            listaUsuarios = (List<Usuario>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
        
        return listaUsuarios;
    }

    @Override
    public List<Cliente> mostrarClientes() {
        List<Cliente> listaClientes= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Cliente order by cliApellido");
            listaClientes = (List<Cliente>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
        
        return listaClientes;
    }

    @Override
    public void insertarFactura(Factura factura) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(factura);
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
    public void modificarFactura(Factura factura) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(factura);
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
    public void eliminarFactura(Factura factura) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(factura);
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
    
