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
@Table(name = "DBA_MVIEWS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbaMviews.findAll", query = "SELECT d FROM DbaMviews d"),
    @NamedQuery(name = "DbaMviews.findAllGroupByOwner", query = "SELECT d.owner, count(d) from DbaMviews d"),
    @NamedQuery(name = "DbaMviews.findByOwner", query = "SELECT d FROM DbaMviews d WHERE d.owner = :owner"),
    @NamedQuery(name = "DbaMviews.findByMviewName", query = "SELECT d FROM DbaMviews d WHERE d.mviewName = :mviewName"),
    @NamedQuery(name = "DbaMviews.findByContainerName", query = "SELECT d FROM DbaMviews d WHERE d.containerName = :containerName"),
    @NamedQuery(name = "DbaMviews.findByQueryLen", query = "SELECT d FROM DbaMviews d WHERE d.queryLen = :queryLen"),
    @NamedQuery(name = "DbaMviews.findByUpdatable", query = "SELECT d FROM DbaMviews d WHERE d.updatable = :updatable"),
    @NamedQuery(name = "DbaMviews.findByUpdateLog", query = "SELECT d FROM DbaMviews d WHERE d.updateLog = :updateLog"),
    @NamedQuery(name = "DbaMviews.findByMasterRollbackSeg", query = "SELECT d FROM DbaMviews d WHERE d.masterRollbackSeg = :masterRollbackSeg"),
    @NamedQuery(name = "DbaMviews.findByMasterLink", query = "SELECT d FROM DbaMviews d WHERE d.masterLink = :masterLink"),
    @NamedQuery(name = "DbaMviews.findByRewriteEnabled", query = "SELECT d FROM DbaMviews d WHERE d.rewriteEnabled = :rewriteEnabled"),
    @NamedQuery(name = "DbaMviews.findByRewriteCapability", query = "SELECT d FROM DbaMviews d WHERE d.rewriteCapability = :rewriteCapability"),
    @NamedQuery(name = "DbaMviews.findByRefreshMode", query = "SELECT d FROM DbaMviews d WHERE d.refreshMode = :refreshMode"),
    @NamedQuery(name = "DbaMviews.findByRefreshMethod", query = "SELECT d FROM DbaMviews d WHERE d.refreshMethod = :refreshMethod"),
    @NamedQuery(name = "DbaMviews.findByBuildMode", query = "SELECT d FROM DbaMviews d WHERE d.buildMode = :buildMode"),
    @NamedQuery(name = "DbaMviews.findByFastRefreshable", query = "SELECT d FROM DbaMviews d WHERE d.fastRefreshable = :fastRefreshable"),
    @NamedQuery(name = "DbaMviews.findByLastRefreshType", query = "SELECT d FROM DbaMviews d WHERE d.lastRefreshType = :lastRefreshType"),
    @NamedQuery(name = "DbaMviews.findByLastRefreshDate", query = "SELECT d FROM DbaMviews d WHERE d.lastRefreshDate = :lastRefreshDate"),
    @NamedQuery(name = "DbaMviews.findByStaleness", query = "SELECT d FROM DbaMviews d WHERE d.staleness = :staleness"),
    @NamedQuery(name = "DbaMviews.findByAfterFastRefresh", query = "SELECT d FROM DbaMviews d WHERE d.afterFastRefresh = :afterFastRefresh"),
    @NamedQuery(name = "DbaMviews.findByUnknownPrebuilt", query = "SELECT d FROM DbaMviews d WHERE d.unknownPrebuilt = :unknownPrebuilt"),
    @NamedQuery(name = "DbaMviews.findByUnknownPlsqlFunc", query = "SELECT d FROM DbaMviews d WHERE d.unknownPlsqlFunc = :unknownPlsqlFunc"),
    @NamedQuery(name = "DbaMviews.findByUnknownExternalTable", query = "SELECT d FROM DbaMviews d WHERE d.unknownExternalTable = :unknownExternalTable"),
    @NamedQuery(name = "DbaMviews.findByUnknownConsiderFresh", query = "SELECT d FROM DbaMviews d WHERE d.unknownConsiderFresh = :unknownConsiderFresh"),
    @NamedQuery(name = "DbaMviews.findByUnknownImport", query = "SELECT d FROM DbaMviews d WHERE d.unknownImport = :unknownImport"),
    @NamedQuery(name = "DbaMviews.findByUnknownTrustedFd", query = "SELECT d FROM DbaMviews d WHERE d.unknownTrustedFd = :unknownTrustedFd"),
    @NamedQuery(name = "DbaMviews.findByCompileState", query = "SELECT d FROM DbaMviews d WHERE d.compileState = :compileState"),
    @NamedQuery(name = "DbaMviews.findByUseNoIndex", query = "SELECT d FROM DbaMviews d WHERE d.useNoIndex = :useNoIndex"),
    @NamedQuery(name = "DbaMviews.findByStaleSince", query = "SELECT d FROM DbaMviews d WHERE d.staleSince = :staleSince"),
    @NamedQuery(name = "DbaMviews.findByNumPctTables", query = "SELECT d FROM DbaMviews d WHERE d.numPctTables = :numPctTables"),
    @NamedQuery(name = "DbaMviews.findByNumFreshPctRegions", query = "SELECT d FROM DbaMviews d WHERE d.numFreshPctRegions = :numFreshPctRegions"),
    @NamedQuery(name = "DbaMviews.findByNumStalePctRegions", query = "SELECT d FROM DbaMviews d WHERE d.numStalePctRegions = :numStalePctRegions")})
public class DbaMviews implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "MVIEW_NAME")
    private String mviewName;
    @Basic(optional = false)
    @Column(name = "CONTAINER_NAME")
    private String containerName;
    @Lob
    @Column(name = "QUERY")
    private String query;
    @Column(name = "QUERY_LEN")
    private BigInteger queryLen;
    @Column(name = "UPDATABLE")
    private String updatable;
    @Column(name = "UPDATE_LOG")
    private String updateLog;
    @Column(name = "MASTER_ROLLBACK_SEG")
    private String masterRollbackSeg;
    @Column(name = "MASTER_LINK")
    private String masterLink;
    @Column(name = "REWRITE_ENABLED")
    private String rewriteEnabled;
    @Column(name = "REWRITE_CAPABILITY")
    private String rewriteCapability;
    @Column(name = "REFRESH_MODE")
    private String refreshMode;
    @Column(name = "REFRESH_METHOD")
    private String refreshMethod;
    @Column(name = "BUILD_MODE")
    private String buildMode;
    @Column(name = "FAST_REFRESHABLE")
    private String fastRefreshable;
    @Column(name = "LAST_REFRESH_TYPE")
    private String lastRefreshType;
    @Column(name = "LAST_REFRESH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastRefreshDate;
    @Column(name = "STALENESS")
    private String staleness;
    @Column(name = "AFTER_FAST_REFRESH")
    private String afterFastRefresh;
    @Column(name = "UNKNOWN_PREBUILT")
    private String unknownPrebuilt;
    @Column(name = "UNKNOWN_PLSQL_FUNC")
    private String unknownPlsqlFunc;
    @Column(name = "UNKNOWN_EXTERNAL_TABLE")
    private String unknownExternalTable;
    @Column(name = "UNKNOWN_CONSIDER_FRESH")
    private String unknownConsiderFresh;
    @Column(name = "UNKNOWN_IMPORT")
    private String unknownImport;
    @Column(name = "UNKNOWN_TRUSTED_FD")
    private String unknownTrustedFd;
    @Column(name = "COMPILE_STATE")
    private String compileState;
    @Column(name = "USE_NO_INDEX")
    private String useNoIndex;
    @Column(name = "STALE_SINCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date staleSince;
    @Column(name = "NUM_PCT_TABLES")
    private BigInteger numPctTables;
    @Column(name = "NUM_FRESH_PCT_REGIONS")
    private BigInteger numFreshPctRegions;
    @Column(name = "NUM_STALE_PCT_REGIONS")
    private BigInteger numStalePctRegions;

    public DbaMviews() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMviewName() {
        return mviewName;
    }

    public void setMviewName(String mviewName) {
        this.mviewName = mviewName;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public BigInteger getQueryLen() {
        return queryLen;
    }

    public void setQueryLen(BigInteger queryLen) {
        this.queryLen = queryLen;
    }

    public String getUpdatable() {
        return updatable;
    }

    public void setUpdatable(String updatable) {
        this.updatable = updatable;
    }

    public String getUpdateLog() {
        return updateLog;
    }

    public void setUpdateLog(String updateLog) {
        this.updateLog = updateLog;
    }

    public String getMasterRollbackSeg() {
        return masterRollbackSeg;
    }

    public void setMasterRollbackSeg(String masterRollbackSeg) {
        this.masterRollbackSeg = masterRollbackSeg;
    }

    public String getMasterLink() {
        return masterLink;
    }

    public void setMasterLink(String masterLink) {
        this.masterLink = masterLink;
    }

    public String getRewriteEnabled() {
        return rewriteEnabled;
    }

    public void setRewriteEnabled(String rewriteEnabled) {
        this.rewriteEnabled = rewriteEnabled;
    }

    public String getRewriteCapability() {
        return rewriteCapability;
    }

    public void setRewriteCapability(String rewriteCapability) {
        this.rewriteCapability = rewriteCapability;
    }

    public String getRefreshMode() {
        return refreshMode;
    }

    public void setRefreshMode(String refreshMode) {
        this.refreshMode = refreshMode;
    }

    public String getRefreshMethod() {
        return refreshMethod;
    }

    public void setRefreshMethod(String refreshMethod) {
        this.refreshMethod = refreshMethod;
    }

    public String getBuildMode() {
        return buildMode;
    }

    public void setBuildMode(String buildMode) {
        this.buildMode = buildMode;
    }

    public String getFastRefreshable() {
        return fastRefreshable;
    }

    public void setFastRefreshable(String fastRefreshable) {
        this.fastRefreshable = fastRefreshable;
    }

    public String getLastRefreshType() {
        return lastRefreshType;
    }

    public void setLastRefreshType(String lastRefreshType) {
        this.lastRefreshType = lastRefreshType;
    }

    public Date getLastRefreshDate() {
        return lastRefreshDate;
    }

    public void setLastRefreshDate(Date lastRefreshDate) {
        this.lastRefreshDate = lastRefreshDate;
    }

    public String getStaleness() {
        return staleness;
    }

    public void setStaleness(String staleness) {
        this.staleness = staleness;
    }

    public String getAfterFastRefresh() {
        return afterFastRefresh;
    }

    public void setAfterFastRefresh(String afterFastRefresh) {
        this.afterFastRefresh = afterFastRefresh;
    }

    public String getUnknownPrebuilt() {
        return unknownPrebuilt;
    }

    public void setUnknownPrebuilt(String unknownPrebuilt) {
        this.unknownPrebuilt = unknownPrebuilt;
    }

    public String getUnknownPlsqlFunc() {
        return unknownPlsqlFunc;
    }

    public void setUnknownPlsqlFunc(String unknownPlsqlFunc) {
        this.unknownPlsqlFunc = unknownPlsqlFunc;
    }

    public String getUnknownExternalTable() {
        return unknownExternalTable;
    }

    public void setUnknownExternalTable(String unknownExternalTable) {
        this.unknownExternalTable = unknownExternalTable;
    }

    public String getUnknownConsiderFresh() {
        return unknownConsiderFresh;
    }

    public void setUnknownConsiderFresh(String unknownConsiderFresh) {
        this.unknownConsiderFresh = unknownConsiderFresh;
    }

    public String getUnknownImport() {
        return unknownImport;
    }

    public void setUnknownImport(String unknownImport) {
        this.unknownImport = unknownImport;
    }

    public String getUnknownTrustedFd() {
        return unknownTrustedFd;
    }

    public void setUnknownTrustedFd(String unknownTrustedFd) {
        this.unknownTrustedFd = unknownTrustedFd;
    }

    public String getCompileState() {
        return compileState;
    }

    public void setCompileState(String compileState) {
        this.compileState = compileState;
    }

    public String getUseNoIndex() {
        return useNoIndex;
    }

    public void setUseNoIndex(String useNoIndex) {
        this.useNoIndex = useNoIndex;
    }

    public Date getStaleSince() {
        return staleSince;
    }

    public void setStaleSince(Date staleSince) {
        this.staleSince = staleSince;
    }

    public BigInteger getNumPctTables() {
        return numPctTables;
    }

    public void setNumPctTables(BigInteger numPctTables) {
        this.numPctTables = numPctTables;
    }

    public BigInteger getNumFreshPctRegions() {
        return numFreshPctRegions;
    }

    public void setNumFreshPctRegions(BigInteger numFreshPctRegions) {
        this.numFreshPctRegions = numFreshPctRegions;
    }

    public BigInteger getNumStalePctRegions() {
        return numStalePctRegions;
    }

    public void setNumStalePctRegions(BigInteger numStalePctRegions) {
        this.numStalePctRegions = numStalePctRegions;
    }
    
}
