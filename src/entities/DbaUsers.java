/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "DBA_USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbaUsers.findAll", query = "SELECT d FROM DbaUsers d"),
    @NamedQuery(name = "DbaUsers.findByUsername", query = "SELECT d FROM DbaUsers d WHERE d.username = :username"),
    @NamedQuery(name = "DbaUsers.findByUserId", query = "SELECT d FROM DbaUsers d WHERE d.userId = :userId"),
    @NamedQuery(name = "DbaUsers.findByPassword", query = "SELECT d FROM DbaUsers d WHERE d.password = :password"),
    @NamedQuery(name = "DbaUsers.findByAccountStatus", query = "SELECT d FROM DbaUsers d WHERE d.accountStatus = :accountStatus"),
    @NamedQuery(name = "DbaUsers.findByLockDate", query = "SELECT d FROM DbaUsers d WHERE d.lockDate = :lockDate"),
    @NamedQuery(name = "DbaUsers.findByExpiryDate", query = "SELECT d FROM DbaUsers d WHERE d.expiryDate = :expiryDate"),
    @NamedQuery(name = "DbaUsers.findByDefaultTablespace", query = "SELECT d FROM DbaUsers d WHERE d.defaultTablespace = :defaultTablespace"),
    @NamedQuery(name = "DbaUsers.findByTemporaryTablespace", query = "SELECT d FROM DbaUsers d WHERE d.temporaryTablespace = :temporaryTablespace"),
    @NamedQuery(name = "DbaUsers.findByCreated", query = "SELECT d FROM DbaUsers d WHERE d.created = :created"),
    @NamedQuery(name = "DbaUsers.findByProfile", query = "SELECT d FROM DbaUsers d WHERE d.profile = :profile"),
    @NamedQuery(name = "DbaUsers.findByInitialRsrcConsumerGroup", query = "SELECT d FROM DbaUsers d WHERE d.initialRsrcConsumerGroup = :initialRsrcConsumerGroup"),
    @NamedQuery(name = "DbaUsers.findByExternalName", query = "SELECT d FROM DbaUsers d WHERE d.externalName = :externalName"),
    @NamedQuery(name = "DbaUsers.findByPasswordVersions", query = "SELECT d FROM DbaUsers d WHERE d.passwordVersions = :passwordVersions"),
    @NamedQuery(name = "DbaUsers.findByEditionsEnabled", query = "SELECT d FROM DbaUsers d WHERE d.editionsEnabled = :editionsEnabled"),
    @NamedQuery(name = "DbaUsers.findByAuthenticationType", query = "SELECT d FROM DbaUsers d WHERE d.authenticationType = :authenticationType")})
public class DbaUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Id
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "ACCOUNT_STATUS")
    private String accountStatus;
    @Column(name = "LOCK_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lockDate;
    @Column(name = "EXPIRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Basic(optional = false)
    @Column(name = "DEFAULT_TABLESPACE")
    private String defaultTablespace;
    @Basic(optional = false)
    @Column(name = "TEMPORARY_TABLESPACE")
    private String temporaryTablespace;
    @Basic(optional = false)
    @Column(name = "CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Basic(optional = false)
    @Column(name = "PROFILE")
    private String profile;
    @Column(name = "INITIAL_RSRC_CONSUMER_GROUP")
    private String initialRsrcConsumerGroup;
    @Column(name = "EXTERNAL_NAME")
    private String externalName;
    @Column(name = "PASSWORD_VERSIONS")
    private String passwordVersions;
    @Column(name = "EDITIONS_ENABLED")
    private String editionsEnabled;
    @Column(name = "AUTHENTICATION_TYPE")
    private String authenticationType;

    public DbaUsers() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Date getLockDate() {
        return lockDate;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDefaultTablespace() {
        return defaultTablespace;
    }

    public void setDefaultTablespace(String defaultTablespace) {
        this.defaultTablespace = defaultTablespace;
    }

    public String getTemporaryTablespace() {
        return temporaryTablespace;
    }

    public void setTemporaryTablespace(String temporaryTablespace) {
        this.temporaryTablespace = temporaryTablespace;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getInitialRsrcConsumerGroup() {
        return initialRsrcConsumerGroup;
    }

    public void setInitialRsrcConsumerGroup(String initialRsrcConsumerGroup) {
        this.initialRsrcConsumerGroup = initialRsrcConsumerGroup;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getPasswordVersions() {
        return passwordVersions;
    }

    public void setPasswordVersions(String passwordVersions) {
        this.passwordVersions = passwordVersions;
    }

    public String getEditionsEnabled() {
        return editionsEnabled;
    }

    public void setEditionsEnabled(String editionsEnabled) {
        this.editionsEnabled = editionsEnabled;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }
    
}
