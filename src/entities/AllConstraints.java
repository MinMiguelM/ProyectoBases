/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "ALL_CONSTRAINTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllConstraints.findAll", query = "SELECT a FROM AllConstraints a"),
    @NamedQuery(name = "AllConstraints.findByOwner", query = "SELECT a FROM AllConstraints a WHERE a.owner = :owner"),
    @NamedQuery(name = "AllConstraints.findByConstraintName", query = "SELECT a FROM AllConstraints a WHERE a.constraintName = :constraintName"),
    @NamedQuery(name = "AllConstraints.findByConstraintType", query = "SELECT a FROM AllConstraints a WHERE a.constraintType = :constraintType"),
    @NamedQuery(name = "AllConstraints.findByTableName", query = "SELECT a FROM AllConstraints a WHERE a.tableName = :tableName"),
    @NamedQuery(name = "AllConstraints.findByROwner", query = "SELECT a FROM AllConstraints a WHERE a.rOwner = :rOwner"),
    @NamedQuery(name = "AllConstraints.findByRConstraintName", query = "SELECT a FROM AllConstraints a WHERE a.rConstraintName = :rConstraintName"),
    @NamedQuery(name = "AllConstraints.findByDeleteRule", query = "SELECT a FROM AllConstraints a WHERE a.deleteRule = :deleteRule"),
    @NamedQuery(name = "AllConstraints.findByStatus", query = "SELECT a FROM AllConstraints a WHERE a.status = :status"),
    @NamedQuery(name = "AllConstraints.findByDeferrable", query = "SELECT a FROM AllConstraints a WHERE a.deferrable = :deferrable"),
    @NamedQuery(name = "AllConstraints.findByDeferred", query = "SELECT a FROM AllConstraints a WHERE a.deferred = :deferred"),
    @NamedQuery(name = "AllConstraints.findByValidated", query = "SELECT a FROM AllConstraints a WHERE a.validated = :validated"),
    @NamedQuery(name = "AllConstraints.findByGenerated", query = "SELECT a FROM AllConstraints a WHERE a.generated = :generated"),
    @NamedQuery(name = "AllConstraints.findByBad", query = "SELECT a FROM AllConstraints a WHERE a.bad = :bad"),
    @NamedQuery(name = "AllConstraints.findByRely", query = "SELECT a FROM AllConstraints a WHERE a.rely = :rely"),
    @NamedQuery(name = "AllConstraints.findByLastChange", query = "SELECT a FROM AllConstraints a WHERE a.lastChange = :lastChange"),
    @NamedQuery(name = "AllConstraints.findByIndexOwner", query = "SELECT a FROM AllConstraints a WHERE a.indexOwner = :indexOwner"),
    @NamedQuery(name = "AllConstraints.findByIndexName", query = "SELECT a FROM AllConstraints a WHERE a.indexName = :indexName"),
    @NamedQuery(name = "AllConstraints.findByInvalid", query = "SELECT a FROM AllConstraints a WHERE a.invalid = :invalid"),
    @NamedQuery(name = "AllConstraints.findByViewRelated", query = "SELECT a FROM AllConstraints a WHERE a.viewRelated = :viewRelated")})
public class AllConstraints implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "CONSTRAINT_NAME")
    @Id
    private String constraintName;
    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Lob
    @Column(name = "SEARCH_CONDITION")
    private String searchCondition;
    @Column(name = "R_OWNER")
    private String rOwner;
    @Column(name = "R_CONSTRAINT_NAME")
    private String rConstraintName;
    @Column(name = "DELETE_RULE")
    private String deleteRule;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DEFERRABLE")
    private String deferrable;
    @Column(name = "DEFERRED")
    private String deferred;
    @Column(name = "VALIDATED")
    private String validated;
    @Column(name = "GENERATED")
    private String generated;
    @Column(name = "BAD")
    private String bad;
    @Column(name = "RELY")
    private String rely;
    @Column(name = "LAST_CHANGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastChange;
    @Column(name = "INDEX_OWNER")
    private String indexOwner;
    @Column(name = "INDEX_NAME")
    private String indexName;
    @Column(name = "INVALID")
    private String invalid;
    @Column(name = "VIEW_RELATED")
    private String viewRelated;

    public AllConstraints() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    public String getROwner() {
        return rOwner;
    }

    public void setROwner(String rOwner) {
        this.rOwner = rOwner;
    }

    public String getRConstraintName() {
        return rConstraintName;
    }

    public void setRConstraintName(String rConstraintName) {
        this.rConstraintName = rConstraintName;
    }

    public String getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeferrable() {
        return deferrable;
    }

    public void setDeferrable(String deferrable) {
        this.deferrable = deferrable;
    }

    public String getDeferred() {
        return deferred;
    }

    public void setDeferred(String deferred) {
        this.deferred = deferred;
    }

    public String getValidated() {
        return validated;
    }

    public void setValidated(String validated) {
        this.validated = validated;
    }

    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getRely() {
        return rely;
    }

    public void setRely(String rely) {
        this.rely = rely;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    public String getIndexOwner() {
        return indexOwner;
    }

    public void setIndexOwner(String indexOwner) {
        this.indexOwner = indexOwner;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }

    public String getViewRelated() {
        return viewRelated;
    }

    public void setViewRelated(String viewRelated) {
        this.viewRelated = viewRelated;
    }
    
}
