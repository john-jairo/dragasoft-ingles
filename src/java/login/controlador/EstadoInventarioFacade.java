/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import login.entidades.EstadoInventario;

/**
 *
 * @author JOHNJ
 */
@Stateless
public class EstadoInventarioFacade extends AbstractFacade<EstadoInventario> {

    @PersistenceContext(unitName = "dragasoft-inglesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoInventarioFacade() {
        super(EstadoInventario.class);
    }
    
}
