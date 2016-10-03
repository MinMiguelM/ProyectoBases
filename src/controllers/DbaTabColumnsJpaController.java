/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.DbaTabColumns;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author ASUS
 */
public class DbaTabColumnsJpaController {
    private EntityManagerFactory emf = null;
    
    public DbaTabColumnsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public List<DbaTabColumns> getColumnsByOwner (String owner, Object[] tables) {
        EntityManager em = this.getEntityManager();
        List<DbaTabColumns> result = new ArrayList<>();
        
        for (Object s : tables) {
            result.addAll(em.createNamedQuery("DbaTabColumns.findByTableNameOwner", DbaTabColumns.class).setParameter("tableName", s)
                    .setParameter("owner", owner).getResultList());
        }
        
        return result;
    }
}
