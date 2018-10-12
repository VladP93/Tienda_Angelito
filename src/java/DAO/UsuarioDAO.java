/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TipoUsuario;
import Model.Usuario;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface UsuarioDAO {
    public List<Usuario> mostrarUsuarios();
    public List<TipoUsuario> mostrarTiposUsuario();
    public void insertarUsuario(Usuario usuario);
    public void modificarUsuario(Usuario usuario);
    public void eliminarUsuario(Usuario usuario);
}
