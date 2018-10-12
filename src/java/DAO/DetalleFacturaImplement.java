/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DetalleFactura;
import Model.Factura;
import Model.Producto;
import Persistence.HibernateUtil;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vpaniagua
 */

public class DetalleFacturaImplement implements DetalleFacturaDAO{
    Session session= null;

    @Override
    public List<DetalleFactura> mostrarDetallesFactura() {
        List<DetalleFactura> listaDetallesFactura=null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM DetalleFactura dfactura INNER JOIN FETCH dfactura.producto producto INNER JOIN FETCH dfactura.factura factura");
            listaDetallesFactura = (List<DetalleFactura>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session != null){
                session.close();
            }
        }
        
        return listaDetallesFactura;
    }

    @Override
    public List<Producto> mostrarProductos() {
        List<Producto> listaProductos=null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Producto ORDER BY prodNombre");
            listaProductos = (List<Producto>) query.list();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
        
        return listaProductos;
    }

    @Override
    public List<Factura> mostrarFacturas() {
        List<Factura> listaFacturas=null;
        
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("FROM Factura ORDER BY factIdfactura");
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
    public void insertarDetalleFactura(DetalleFactura detalleFactura) {
        
        System.out.println("Datos...");
        System.out.println("cantidad: "+detalleFactura.getDetfCantidad());
        System.out.println("producto: "+detalleFactura.getProducto().getProdCodproducto());
        System.out.println("id detalle: "+detalleFactura.getDetfIddetallefactura());
        System.out.println("id factura: "+detalleFactura.getFactura().getFactIdfactura());
        int cantidadProducto = detalleFactura.getDetfCantidad().intValue();
        BigDecimal codigoProducto = detalleFactura.getProducto().getProdCodproducto();
        BigDecimal idDetalle = detalleFactura.getDetfIddetallefactura();
        BigDecimal numFactura = detalleFactura.getFactura().getFactIdfactura();
                
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            /*Query query = session.createSQLQuery(
                    "CALL ventas123("+detalleFactura.getDetfCantidad()
                            +","+detalleFactura.getProducto().getProdCodproducto()
                            +","+detalleFactura.getDetfIddetallefactura()
                            +","+detalleFactura.getFactura().getFactIdfactura()
                            +");");
            */
            //Query query = sessionFactory.getCurrentSession().createSQLQuery( "CALL SlaGrid(:appID, :fromYear, :toYear, :fromMon, :toMon)") .setParameter("appID", 245) .setParameter("fromYear", 2012) .setParameter("toYear", 2013) .setParameter("fromMon", 1) .setParameter("toMon", 12); 
            
            Query query = session.createSQLQuery("exec ventas(:cantidadProducto, :codigoProducto, :idDetalle, :numFactura)")
                    .setParameter("cantidadProducto", cantidadProducto)
                    .setParameter("codigoProducto", codigoProducto)
                    .setParameter("idDetalle", idDetalle)
                    .setParameter("numFactura", numFactura);
            
            //(:cantidadProducto, :codigoProducto, :idDetalle, :numFactura)
            
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void modificarDetalleFactura(DetalleFactura detalleFactura) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(detalleFactura);
            session.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void eliminarDetalleFactura(DetalleFactura detalleFactura) {
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(detalleFactura);
            session.getTransaction().commit();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }finally{
            if(session!=null){
                session.close();
            }
        }
    }
    
}
