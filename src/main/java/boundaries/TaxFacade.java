/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import entities.Tax;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MdmRahman
 */
@Stateless
public class TaxFacade extends AbstractFacade<Tax> {
    @PersistenceContext(unitName = "OnlinePOSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaxFacade() {
        super(Tax.class);
    }
    
}
