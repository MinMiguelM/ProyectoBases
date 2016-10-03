/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AllConsColumns;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;

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
