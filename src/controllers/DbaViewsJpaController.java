/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.DbaMviews;
import entities.DbaUsers;
import entities.DbaViews;
import java.util.List;
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
public class DbaViewsJpaController{ 

    private EntityManagerFactory emf = null;
    
    public DbaViewsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public List<DbaViews> getViewsByOwner(String owner) {
        EntityManager em = emf.createEntityManager();
        return em.createNamedQuery("DbaViews.findByOwner").setParameter("owner", owner).getResultList();
    }
    
    public List<DbaViews> getViews (){
        EntityManager em = this.getEntityManager();
        return em.createNamedQuery("DbaViews.findAllGroupByOwner").getResultList();
    }  
    
    public int getNumviews(String owner){
        EntityManager em = this.getEntityManager();
        CriteriaQuery q = em.getCriteriaBuilder().createQuery();
        Root<DbaViews> rt = q.from(DbaViews.class);
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
