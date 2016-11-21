/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jtorresa
 */
@Entity
@Table(name = "ALL_SYNONYMS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllSynonyms.findAll", query = "SELECT a FROM AllSynonyms a"),
    @NamedQuery(name = "AllSynonyms.findByOwner", query = "SELECT a FROM AllSynonyms a WHERE a.owner = :owner"),
    @NamedQuery(name = "AllSynonyms.findBySynonymName", query = "SELECT a FROM AllSynonyms a WHERE a.synonymName = :synonymName"),
    @NamedQuery(name = "AllSynonyms.findByTableOwner", query = "SELECT a FROM AllSynonyms a WHERE a.tableOwner = :tableOwner"),
    @NamedQuery(name = "AllSynonyms.findByTableName", query = "SELECT a FROM AllSynonyms a WHERE a.tableName = :tableName"),
    @NamedQuery(name = "AllSynonyms.findByDbLink", query = "SELECT a FROM AllSynonyms a WHERE a.dbLink = :dbLink")})
public class AllSynonyms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "OWNER")
    private String owner;
    @Id
    @Column(name = "SYNONYM_NAME")
    private String synonymName;
    @Column(name = "TABLE_OWNER")
    private String tableOwner;
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "DB_LINK")
    private String dbLink;

    public AllSynonyms() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSynonymName() {
        return synonymName;
    }

    public void setSynonymName(String synonymName) {
        this.synonymName = synonymName;
    }

    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDbLink() {
        return dbLink;
    }

    public void setDbLink(String dbLink) {
        this.dbLink = dbLink;
    }
    
}
