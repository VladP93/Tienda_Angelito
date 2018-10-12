/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class UnidadMedidaImplement implements UnidadMedidaDAO {
    Session session = null;

    @Override
    public List<UnidadMedida> mostrarUnidadesMedida() {
        List<UnidadMedida> listaUnidadesMedida = null;
        
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM UnidadMedida order by unmUnidad");
            listaUnidadesMedida = (List<UnidadMedida>) query.list();
        } catch (HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if(session!=null){
                session.close();
            }
        }
        return listaUnidadesMedida;
    }

    @Override
    public void insertarUnidadMedida(UnidadMedida unidadMedida) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(unidadMedida);
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
    public void modificarUnidadMedida(UnidadMedida unidadMedida) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(unidadMedida);
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
    public void eliminarUnidadMedida(UnidadMedida unidadMedida) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(unidadMedida);
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