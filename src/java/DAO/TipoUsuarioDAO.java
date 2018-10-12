/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TipoUsuario;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface TipoUsuarioDAO {
    public List<TipoUsuario> mostrarTiposUsuario();
    public void insertarTipoUsuario(TipoUsuario tipoUsuario);
    public void modificarTipoUsuario(TipoUsuario tipoUsuario);
    public void eliminarTipoUsuario(TipoUsuario tipoUsuario);
}
