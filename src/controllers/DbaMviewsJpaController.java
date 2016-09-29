/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.DbaViews;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author ASUS
 */
public class DbaMviewsJpaController {
 private EntityManagerFactory emf = null;
    
    public DbaMviewsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public List<DbaViews> getMViews (){
        EntityManager em = this.getEntityManager();
        return em.createNamedQuery("DbaViews.findAllGroupByOwner").getResultList();
    }  
    
}
