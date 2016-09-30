/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.DbaTables;
import entities.DbaTriggers;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ASUS
 */
public class DbaTriggersJpaController {
    
    private EntityManagerFactory emf = null;
    
    public DbaTriggersJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public int getNumTriggers(String owner){
        EntityManager em = this.getEntityManager();
        CriteriaQuery q = em.getCriteriaBuilder().createQuery();
        Root<DbaTriggers> rt = q.from(DbaTriggers.class);
        q.select(em.getCriteriaBuilder().count(rt)).groupBy(rt.get("owner")).where(rt.get("owner").in(owner));
        Query query = em.createQuery(q);
        try{
            return ((Long)query.getSingleResult()).intValue();
        }catch(NoResultException e){
            return 0;
        }finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
}
