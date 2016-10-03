/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "ALL_CONS_COLUMNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AllConsColumns.findAll", query = "SELECT a FROM AllConsColumns a"),
    @NamedQuery(name = "AllConsColumns.findByOwner", query = "SELECT a FROM AllConsColumns a WHERE a.owner = :owner"),
    @NamedQuery(name = "AllConsColumns.findByConstraintName", query = "SELECT a FROM AllConsColumns a WHERE a.constraintName = :constraintName"),
    @NamedQuery(name = "AllConsColumns.findByTableName", query = "SELECT a FROM AllConsColumns a WHERE a.tableName = :tableName"),
    @NamedQuery(name = "AllConsColumns.findByColumnName", query = "SELECT a FROM AllConsColumns a WHERE a.columnName = :columnName"),
    @NamedQuery(name = "AllConsColumns.findByPosition", query = "SELECT a FROM AllConsColumns a WHERE a.position = :position"),
    @NamedQuery(name = "AllConsColumns.findByTableAndColumnName", query = "SELECT a FROM AllConsColumns a WHERE a.columnName = :columnName AND a.tableName = :tableName")})
public class AllConsColumns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Id
    @Column(name = "OWNER")
    private String owner;
    @Basic(optional = false)
    @Column(name = "CONSTRAINT_NAME")
    @Id
    private String constraintName;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "COLUMN_NAME")
    @Id
    private String columnName;
    @Column(name = "POSITION")
    private BigInteger position;

    public AllConsColumns() {
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public BigInteger getPosition() {
        return position;
    }

    public void setPosition(BigInteger position) {
        this.position = position;
    }
    
}
