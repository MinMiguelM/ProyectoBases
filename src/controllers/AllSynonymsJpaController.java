/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import controllers.exceptions.PreexistingEntityException;
import entities.AllSynonyms;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author jtorresa
 */
public class AllSynonymsJpaController implements Serializable {

    public AllSynonymsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(AllSynonyms allSynonyms) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(allSynonyms);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAllSynonyms(allSynonyms.getSynonymName()) != null) {
                throw new PreexistingEntityException("AllSynonyms " + allSynonyms + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AllSynonyms allSynonyms) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            allSynonyms = em.merge(allSynonyms);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = allSynonyms.getSynonymName();
                if (findAllSynonyms(id) == null) {
                    throw new NonexistentEntityException("The allSynonyms with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AllSynonyms allSynonyms;
            try {
                allSynonyms = em.getReference(AllSynonyms.class, id);
                allSynonyms.getSynonymName();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The allSynonyms with id " + id + " no longer exists.", enfe);
            }
            em.remove(allSynonyms);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AllSynonyms> findAllSynonymsEntities() {
        return findAllSynonymsEntities(true, -1, -1);
    }

    public List<AllSynonyms> findAllSynonymsEntities(int maxResults, int firstResult) {
        return findAllSynonymsEntities(false, maxResults, firstResult);
    }

    private List<AllSynonyms> findAllSynonymsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AllSynonyms.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public AllSynonyms findAllSynonyms(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AllSynonyms.class, id);
        } finally {
            em.close();
        }
    }
    
    public int getNumSynonyms (String owner){
        EntityManager em = this.getEntityManager();
        CriteriaQuery q = em.getCriteriaBuilder().createQuery();
        Root<AllSynonyms> rt = q.from(AllSynonyms.class);
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

    public int getAllSynonymsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AllSynonyms> rt = cq.from(AllSynonyms.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
