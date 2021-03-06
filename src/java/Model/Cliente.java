package Model;
// Generated 09-23-2018 06:43:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private String cliDui;
     private String cliNit;
     private String cliNombre;
     private String cliApellido;
     private String cliDireccion;
     private String cliTelefono;
     private String cliEmail;
     private Character cliJuridica;
     private Set<Factura> facturas = new HashSet<Factura>(0);

    public Cliente() {
    }

	
    public Cliente(String cliDui, String cliNit, String cliNombre, String cliApellido, String cliDireccion, String cliTelefono) {
        this.cliDui = cliDui;
        this.cliNit = cliNit;
        this.cliNombre = cliNombre;
        this.cliApellido = cliApellido;
        this.cliDireccion = cliDireccion;
        this.cliTelefono = cliTelefono;
    }
    public Cliente(String cliDui, String cliNit, String cliNombre, String cliApellido, String cliDireccion, String cliTelefono, String cliEmail, Character cliJuridica, Set<Factura> facturas) {
       this.cliDui = cliDui;
       this.cliNit = cliNit;
       this.cliNombre = cliNombre;
       this.cliApellido = cliApellido;
       this.cliDireccion = cliDireccion;
       this.cliTelefono = cliTelefono;
       this.cliEmail = cliEmail;
       this.cliJuridica = cliJuridica;
       this.facturas = facturas;
    }
   
    public String getCliDui() {
        return this.cliDui;
    }
    
    public void setCliDui(String cliDui) {
        this.cliDui = cliDui;
    }
    public String getCliNit() {
        return this.cliNit;
    }
    
    public void setCliNit(String cliNit) {
        this.cliNit = cliNit;
    }
    public String getCliNombre() {
        return this.cliNombre;
    }
    
    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }
    public String getCliApellido() {
        return this.cliApellido;
    }
    
    public void setCliApellido(String cliApellido) {
        this.cliApellido = cliApellido;
    }
    public String getCliDireccion() {
        return this.cliDireccion;
    }
    
    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }
    public String getCliTelefono() {
        return this.cliTelefono;
    }
    
    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }
    public String getCliEmail() {
        return this.cliEmail;
    }
    
    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }
    public Character getCliJuridica() {
        return this.cliJuridica;
    }
    
    public void setCliJuridica(Character cliJuridica) {
        this.cliJuridica = cliJuridica;
    }
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }




}


