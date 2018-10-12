/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TipoUsuario;
import java.util.List;
import Persistence.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */
public class TipoUsuarioImplement implements TipoUsuarioDAO {
    Session session = null;

    @Override
    public List<TipoUsuario> mostrarTiposUsuario() {
        List<TipoUsuario> listaTiposUsuario = null;
        
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM TipoUsuario order by tusuTipo");
            listaTiposUsuario = (List<TipoUsuario>) query.list();
        } catch (HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if(session!=null){
                session.close();
            }
        }
        return listaTiposUsuario;
    }

    @Override
    public void insertarTipoUsuario(TipoUsuario tipoUsuario) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(tipoUsuario);
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
    public void modificarTipoUsuario(TipoUsuario tipoUsuario) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(tipoUsuario);
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
    public void eliminarTipoUsuario(TipoUsuario tipoUsuario) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(tipoUsuario);
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
