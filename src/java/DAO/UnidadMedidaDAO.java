/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.UnidadMedida;
import java.util.List;

/**
 *
 * @author vpaniagua
 */
public interface UnidadMedidaDAO {
    public List<UnidadMedida> mostrarUnidadesMedida();
    public void insertarUnidadMedida(UnidadMedida unidadMedida);
    public void modificarUnidadMedida(UnidadMedida unidadMedida);
    public void eliminarUnidadMedida(UnidadMedida unidadMedida);
}
