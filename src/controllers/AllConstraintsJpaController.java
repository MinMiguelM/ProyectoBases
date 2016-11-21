/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AllConstraints;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;

/**
 *
 * @author ASUS
 */
public class AllConstraintsJpaController {
    
    private EntityManagerFactory emf;
    
    public AllConstraintsJpaController(EntityManagerFactory emf){
        this.emf = emf;
    }
    
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    
    // retorna una lista con tres booleans, el primero corresponde a pk, el
    // segundo a fk y el tercero a idx
    public List isSomeConstraint(String attribute, String tableName, String owner){
        EntityManager em = this.getEntityManager();
        AllConsColumnsJpaController consController = new AllConsColumnsJpaController(emf);
        boolean pk=false,fk=false,idx=false;
        List<String> constraints = consController.getConstraintName(tableName, attribute);
        
        for (String constraint : constraints) {
            try{
                AllConstraints c = em.createNamedQuery("AllConstraints.findByConstraintName",AllConstraints.class)
                        .setParameter("constraintName", constraint).setParameter("owner", owner).getSingleResult();
                if(c.getConstraintType().equalsIgnoreCase("P"))
                    pk = true;
                if(c.getConstraintType().equalsIgnoreCase("R"))
                    fk = true;
                if(c.getIndexName() != null)
                    idx = true;
            }catch(NoResultException e){
                pk=false;fk=false;idx=false;
                e.printStackTrace();
            }
        }
        return Arrays.asList(pk,fk,idx);
    }
}
