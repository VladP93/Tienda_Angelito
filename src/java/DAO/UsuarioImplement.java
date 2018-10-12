/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TipoUsuario;
import Model.Usuario;
import java.util.List;
import Persistence.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */
public class UsuarioImplement implements UsuarioDAO {
    Session session = null;

    @Override
    public List<Usuario> mostrarUsuarios() {
        List<Usuario> listaUsuarios = null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Usuario usuario INNER JOIN FETCH usuario.tipoUsuario tipoUsuario");
            listaUsuarios = (List<Usuario>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return listaUsuarios;
    }

    @Override
    public List<TipoUsuario> mostrarTiposUsuario() {
        List<TipoUsuario> listaTiposUsuario= null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM TipoUsuario order by tusuTipo");
            listaTiposUsuario = (List<TipoUsuario>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
        
        return listaTiposUsuario;
    }

    @Override
    public void insertarUsuario(Usuario usuario) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(usuario);
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
    public void modificarUsuario(Usuario usuario) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(usuario);
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
    public void eliminarUsuario(Usuario usuario) {
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(usuario);
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
