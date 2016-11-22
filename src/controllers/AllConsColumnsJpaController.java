/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AllConsColumns;
import entities.AllConstraints;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author ASUS
 */
public class AllConsColumnsJpaController {
    
    private EntityManagerFactory emf;
    
    public AllConsColumnsJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    public AllConsColumns getByConstraintName(String constraintName){
        Query q = this.getEntityManager().createNamedQuery("AllConsColumns.findByConstraintName");
        q.setParameter("constraintName", constraintName);
        return (AllConsColumns)q.getSingleResult();
    }
    
    public AllConsColumns getConstraintName(String user, String attribute,String table){
        Query q = this.getEntityManager().createNamedQuery("AllConsColumns.findByColumnName");
        q.setParameter("columnName", attribute);
        q.setParameter("owner", user);
        q.setParameter("tableName", table);
        List<AllConsColumns> l = q.getResultList();
        AllConstraintsJpaController all = new AllConstraintsJpaController(emf);
        for (AllConsColumns allConsColumns : l) {
            if(all.lookUp(user, allConsColumns.getConstraintName()).getConstraintType().equals("R"))
                return allConsColumns;
        }
        return null;
    }
    
    public List<String> getConstraintName(String tableName, String attributeName){
        List<String> constraints = new ArrayList<>();
        EntityManager em = this.getEntityManager();
        try{
            List<AllConsColumns> l = em.createNamedQuery("AllConsColumns.findByTableAndColumnName",AllConsColumns.class).setParameter("tableName", tableName)
                .setParameter("columnName", attributeName).getResultList();
            for (AllConsColumns l1 : l) {
                constraints.add(l1.getConstraintName());
            }
        }catch(NoResultException e){
            return constraints;
        }finally{
            if (em != null)
                em.close();
        }
        return constraints;
    }
    
}
