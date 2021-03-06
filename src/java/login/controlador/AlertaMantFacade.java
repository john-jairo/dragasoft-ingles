/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import login.entidades.AlertaMant;

/**
 *
 * @author JOHNJ
 */
@Stateless
public class AlertaMantFacade extends AbstractFacade<AlertaMant> {

    @PersistenceContext(unitName = "dragasoft-inglesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlertaMantFacade() {
        super(AlertaMant.class);
    }
    
}
