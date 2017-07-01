/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import Modelo.Auto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mneakira00
 */
@Stateless
public class AutoFacade extends AbstractFacade<Auto> {

    @PersistenceContext(unitName = "Struts2_EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutoFacade() {
        super(Auto.class);
    }
    
}
