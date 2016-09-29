/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.DbaTables;
import entities.DbaUsers;
import java.util.List;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ASUS
 */
public class DbaTablesJpaController {
    
    public DbaTablesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public int getNumTables (String owner){
        EntityManager em = this.getEntityManager();
        CriteriaQuery q = em.getCriteriaBuilder().createQuery();
        Root<DbaTables> rt = q.from(DbaTables.class);
        q.select(em.getCriteriaBuilder().count(rt)).groupBy(rt.get("owner")).where(rt.get("owner").in(owner));
        Query query = em.createQuery(q);
        try{
            return ((Long)query.getSingleResult()).intValue();
        }catch(NoResultException e){
            return 0;
        }
    }
}
