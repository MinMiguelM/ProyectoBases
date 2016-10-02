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
@Table(name = "DBA_TABLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbaTables.findAll", query = "SELECT d FROM DbaTables d"),
    @NamedQuery(name = "DbaTables.findAllGroupByOwner", query = "SELECT d.owner, count(d) FROM DbaTables d GROUP BY d.owner"),
    @NamedQuery(name = "DbaTables.findByOwner", query = "SELECT d FROM DbaTables d WHERE d.owner = :owner"),
    @NamedQuery(name = "DbaTables.findByTableName", query = "SELECT d FROM DbaTables d WHERE d.tableName = :tableName"),
    @NamedQuery(name = "DbaTables.findByTablespaceName", query = "SELECT d FROM DbaTables d WHERE d.tablespaceName = :tablespaceName"),
    @NamedQuery(name = "DbaTables.findByClusterName", query = "SELECT d FROM DbaTables d WHERE d.clusterName = :clusterName"),
    @NamedQuery(name = "DbaTables.findByIotName", query = "SELECT d FROM DbaTables d WHERE d.iotName = :iotName"),
    @NamedQuery(name = "DbaTables.findByStatus", query = "SELECT d FROM DbaTables d WHERE d.status = :status"),
    @NamedQuery(name = "DbaTables.findByPctFree", query = "SELECT d FROM DbaTables d WHERE d.pctFree = :pctFree"),
    @NamedQuery(name = "DbaTables.findByPctUsed", query = "SELECT d FROM DbaTables d WHERE d.pctUsed = :pctUsed"),
    @NamedQuery(name = "DbaTables.findByIniTrans", query = "SELECT d FROM DbaTables d WHERE d.iniTrans = :iniTrans"),
    @NamedQuery(name = "DbaTables.findByMaxTrans", query = "SELECT d FROM DbaTables d WHERE d.maxTrans = :maxTrans"),
    @NamedQuery(name = "DbaTables.findByInitialExtent", query = "SELECT d FROM DbaTables d WHERE d.initialExtent = :initialExtent"),
    @NamedQuery(name = "DbaTables.findByNextExtent", query = "SELECT d FROM DbaTables d WHERE d.nextExtent = :nextExtent"),
    @NamedQuery(name = "DbaTables.findByMinExtents", query = "SELECT d FROM DbaTables d WHERE d.minExtents = :minExtents"),
    @NamedQuery(name = "DbaTables.findByMaxExtents", query = "SELECT d FROM DbaTables d WHERE d.maxExtents = :maxExtents"),
    @NamedQuery(name = "DbaTables.findByPctIncrease", query = "SELECT d FROM DbaTables d WHERE d.pctIncrease = :pctIncrease"),
    @NamedQuery(name = "DbaTables.findByFreelists", query = "SELECT d FROM DbaTables d WHERE d.freelists = :freelists"),
    @NamedQuery(name = "DbaTables.findByFreelistGroups", query = "SELECT d FROM DbaTables d WHERE d.freelistGroups = :freelistGroups"),
    @NamedQuery(name = "DbaTables.findByLogging", query = "SELECT d FROM DbaTables d WHERE d.logging = :logging"),
    @NamedQuery(name = "DbaTables.findByBackedUp", query = "SELECT d FROM DbaTables d WHERE d.backedUp = :backedUp"),
    @NamedQuery(name = "DbaTables.findByNumRows", query = "SELECT d FROM DbaTables d WHERE d.numRows = :numRows"),
    @NamedQuery(name = "DbaTables.findByBlocks", query = "SELECT d FROM DbaTables d WHERE d.blocks = :blocks"),
    @NamedQuery(name = "DbaTables.findByEmptyBlocks", query = "SELECT d FROM DbaTables d WHERE d.emptyBlocks = :emptyBlocks"),
    @NamedQuery(name = "DbaTables.findByAvgSpace", query = "SELECT d FROM DbaTables d WHERE d.avgSpace = :avgSpace"),
    @NamedQuery(name = "DbaTables.findByChainCnt", query = "SELECT d FROM DbaTables d WHERE d.chainCnt = :chainCnt"),
    @NamedQuery(name = "DbaTables.findByAvgRowLen", query = "SELECT d FROM DbaTables d WHERE d.avgRowLen = :avgRowLen"),
    @NamedQuery(name = "DbaTables.findByAvgSpaceFreelistBlocks", query = "SELECT d FROM DbaTables d WHERE d.avgSpaceFreelistBlocks = :avgSpaceFreelistBlocks"),
    @NamedQuery(name = "DbaTables.findByNumFreelistBlocks", query = "SELECT d FROM DbaTables d WHERE d.numFreelistBlocks = :numFreelistBlocks"),
    @NamedQuery(name = "DbaTables.findByDegree", query = "SELECT d FROM DbaTables d WHERE d.degree = :degree"),
    @NamedQuery(name = "DbaTables.findByInstances", query = "SELECT d FROM DbaTables d WHERE d.instances = :instances"),
    @NamedQuery(name = "DbaTables.findByCache", query = "SELECT d FROM DbaTables d WHERE d.cache = :cache"),
    @NamedQuery(name = "DbaTables.findByTableLock", query = "SELECT d FROM DbaTables d WHERE d.tableLock = :tableLock"),
    @NamedQuery(name = "DbaTables.findBySampleSize", query = "SELECT d FROM DbaTables d WHERE d.sampleSize = :sampleSize"),
    @NamedQuery(name = "DbaTables.findByLastAnalyzed", query = "SELECT d FROM DbaTables d WHERE d.lastAnalyzed = :lastAnalyzed"),
    @NamedQuery(name = "DbaTables.findByPartitioned", query = "SELECT d FROM DbaTables d WHERE d.partitioned = :partitioned"),
    @NamedQuery(name = "DbaTables.findByIotType", query = "SELECT d FROM DbaTables d WHERE d.iotType = :iotType"),
    @NamedQuery(name = "DbaTables.findByTemporary", query = "SELECT d FROM DbaTables d WHERE d.temporary = :temporary"),
    @NamedQuery(name = "DbaTables.findBySecondary", query = "SELECT d FROM DbaTables d WHERE d.secondary = :secondary"),
    @NamedQuery(name = "DbaTables.findByNested", query = "SELECT d FROM DbaTables d WHERE d.nested = :nested"),
    @NamedQuery(name = "DbaTables.findByBufferPool", query = "SELECT d FROM DbaTables d WHERE d.bufferPool = :bufferPool"),
    @NamedQuery(name = "DbaTables.findByFlashCache", query = "SELECT d FROM DbaTables d WHERE d.flashCache = :flashCache"),
    @NamedQuery(name = "DbaTables.findByCellFlashCache", query = "SELECT d FROM DbaTables d WHERE d.cellFlashCache = :cellFlashCache"),
    @NamedQuery(name = "DbaTables.findByRowMovement", query = "SELECT d FROM DbaTables d WHERE d.rowMovement = :rowMovement"),
    @NamedQuery(name = "DbaTables.findByGlobalStats", query = "SELECT d FROM DbaTables d WHERE d.globalStats = :globalStats"),
    @NamedQuery(name = "DbaTables.findByUserStats", query = "SELECT d FROM DbaTables d WHERE d.userStats = :userStats"),
    @NamedQuery(name = "DbaTables.findByDuration", query = "SELECT d FROM DbaTables d WHERE d.duration = :duration"),
    @NamedQuery(name = "DbaTables.findBySkipCorrupt", query = "SELECT d FROM DbaTables d WHERE d.skipCorrupt = :skipCorrupt"),
    @NamedQuery(name = "DbaTables.findByMonitoring", query = "SELECT d FROM DbaTables d WHERE d.monitoring = :monitoring"),
    @NamedQuery(name = "DbaTables.findByClusterOwner", query = "SELECT d FROM DbaTables d WHERE d.clusterOwner = :clusterOwner"),
    @NamedQuery(name = "DbaTables.findByDependencies", query = "SELECT d FROM DbaTables d WHERE d.dependencies = :dependencies"),
    @NamedQuery(name = "DbaTables.findByCompression", query = "SELECT d FROM DbaTables d WHERE d.compression = :compression"),
    @NamedQuery(name = "DbaTables.findByCompressFor", query = "SELECT d FROM DbaTables d WHERE d.compressFor = :compressFor"),
    @NamedQuery(name = "DbaTables.findByDropped", query = "SELECT d FROM DbaTables d WHERE d.dropped = :dropped"),
    @NamedQuery(name = "DbaTables.findByReadOnly", query = "SELECT d FROM DbaTables d WHERE d.readOnly = :readOnly"),
    @NamedQuery(name = "DbaTables.findBySegmentCreated", query = "SELECT d FROM DbaTables d WHERE d.segmentCreated = :segmentCreated"),
    @NamedQuery(name = "DbaTables.findByResultCache", query = "SELECT d FROM DbaTables d WHERE d.resultCache = :resultCache")})
public class DbaTables implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    @Id
    private String tableName;
    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;
    @Column(name = "CLUSTER_NAME")
    private String clusterName;
    @Column(name = "IOT_NAME")
    private String iotName;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "PCT_FREE")
    private BigInteger pctFree;
    @Column(name = "PCT_USED")
    private BigInteger pctUsed;
    @Column(name = "INI_TRANS")
    private BigInteger iniTrans;
    @Column(name = "MAX_TRANS")
    private BigInteger maxTrans;
    @Column(name = "INITIAL_EXTENT")
    private BigInteger initialExtent;
    @Column(name = "NEXT_EXTENT")
    private BigInteger nextExtent;
    @Column(name = "MIN_EXTENTS")
    private BigInteger minExtents;
    @Column(name = "MAX_EXTENTS")
    private BigInteger maxExtents;
    @Column(name = "PCT_INCREASE")
    private BigInteger pctIncrease;
    @Column(name = "FREELISTS")
    private BigInteger freelists;
    @Column(name = "FREELIST_GROUPS")
    private BigInteger freelistGroups;
    @Column(name = "LOGGING")
    private String logging;
    @Column(name = "BACKED_UP")
    private String backedUp;
    @Column(name = "NUM_ROWS")
    private BigInteger numRows;
    @Column(name = "BLOCKS")
    private BigInteger blocks;
    @Column(name = "EMPTY_BLOCKS")
    private BigInteger emptyBlocks;
    @Column(name = "AVG_SPACE")
    private BigInteger avgSpace;
    @Column(name = "CHAIN_CNT")
    private BigInteger chainCnt;
    @Column(name = "AVG_ROW_LEN")
    private BigInteger avgRowLen;
    @Column(name = "AVG_SPACE_FREELIST_BLOCKS")
    private BigInteger avgSpaceFreelistBlocks;
    @Column(name = "NUM_FREELIST_BLOCKS")
    private BigInteger numFreelistBlocks;
    @Column(name = "DEGREE")
    private String degree;
    @Column(name = "INSTANCES")
    private String instances;
    @Column(name = "CACHE")
    private String cache;
    @Column(name = "TABLE_LOCK")
    private String tableLock;
    @Column(name = "SAMPLE_SIZE")
    private BigInteger sampleSize;
    @Column(name = "LAST_ANALYZED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAnalyzed;
    @Column(name = "PARTITIONED")
    private String partitioned;
    @Column(name = "IOT_TYPE")
    private String iotType;
    @Column(name = "TEMPORARY")
    private String temporary;
    @Column(name = "SECONDARY")
    private String secondary;
    @Column(name = "NESTED")
    private String nested;
    @Column(name = "BUFFER_POOL")
    private String bufferPool;
    @Column(name = "FLASH_CACHE")
    private String flashCache;
    @Column(name = "CELL_FLASH_CACHE")
    private String cellFlashCache;
    @Column(name = "ROW_MOVEMENT")
    private String rowMovement;
    @Column(name = "GLOBAL_STATS")
    private String globalStats;
    @Column(name = "USER_STATS")
    private String userStats;
    @Column(name = "DURATION")
    private String duration;
    @Column(name = "SKIP_CORRUPT")
    private String skipCorrupt;
    @Column(name = "MONITORING")
    private String monitoring;
    @Column(name = "CLUSTER_OWNER")
    private String clusterOwner;
    @Column(name = "DEPENDENCIES")
    private String dependencies;
    @Column(name = "COMPRESSION")
    private String compression;
    @Column(name = "COMPRESS_FOR")
    private String compressFor;
    @Column(name = "DROPPED")
    private String dropped;
    @Column(name = "READ_ONLY")
    private String readOnly;
    @Column(name = "SEGMENT_CREATED")
    private String segmentCreated;
    @Column(name = "RESULT_CACHE")
    private String resultCache;

    public DbaTables() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getIotName() {
        return iotName;
    }

    public void setIotName(String iotName) {
        this.iotName = iotName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getPctFree() {
        return pctFree;
    }

    public void setPctFree(BigInteger pctFree) {
        this.pctFree = pctFree;
    }

    public BigInteger getPctUsed() {
        return pctUsed;
    }

    public void setPctUsed(BigInteger pctUsed) {
        this.pctUsed = pctUsed;
    }

    public BigInteger getIniTrans() {
        return iniTrans;
    }

    public void setIniTrans(BigInteger iniTrans) {
        this.iniTrans = iniTrans;
    }

    public BigInteger getMaxTrans() {
        return maxTrans;
    }

    public void setMaxTrans(BigInteger maxTrans) {
        this.maxTrans = maxTrans;
    }

    public BigInteger getInitialExtent() {
        return initialExtent;
    }

    public void setInitialExtent(BigInteger initialExtent) {
        this.initialExtent = initialExtent;
    }

    public BigInteger getNextExtent() {
        return nextExtent;
    }

    public void setNextExtent(BigInteger nextExtent) {
        this.nextExtent = nextExtent;
    }

    public BigInteger getMinExtents() {
        return minExtents;
    }

    public void setMinExtents(BigInteger minExtents) {
        this.minExtents = minExtents;
    }

    public BigInteger getMaxExtents() {
        return maxExtents;
    }

    public void setMaxExtents(BigInteger maxExtents) {
        this.maxExtents = maxExtents;
    }

    public BigInteger getPctIncrease() {
        return pctIncrease;
    }

    public void setPctIncrease(BigInteger pctIncrease) {
        this.pctIncrease = pctIncrease;
    }

    public BigInteger getFreelists() {
        return freelists;
    }

    public void setFreelists(BigInteger freelists) {
        this.freelists = freelists;
    }

    public BigInteger getFreelistGroups() {
        return freelistGroups;
    }

    public void setFreelistGroups(BigInteger freelistGroups) {
        this.freelistGroups = freelistGroups;
    }

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    public String getBackedUp() {
        return backedUp;
    }

    public void setBackedUp(String backedUp) {
        this.backedUp = backedUp;
    }

    public BigInteger getNumRows() {
        return numRows;
    }

    public void setNumRows(BigInteger numRows) {
        this.numRows = numRows;
    }

    public BigInteger getBlocks() {
        return blocks;
    }

    public void setBlocks(BigInteger blocks) {
        this.blocks = blocks;
    }

    public BigInteger getEmptyBlocks() {
        return emptyBlocks;
    }

    public void setEmptyBlocks(BigInteger emptyBlocks) {
        this.emptyBlocks = emptyBlocks;
    }

    public BigInteger getAvgSpace() {
        return avgSpace;
    }

    public void setAvgSpace(BigInteger avgSpace) {
        this.avgSpace = avgSpace;
    }

    public BigInteger getChainCnt() {
        return chainCnt;
    }

    public void setChainCnt(BigInteger chainCnt) {
        this.chainCnt = chainCnt;
    }

    public BigInteger getAvgRowLen() {
        return avgRowLen;
    }

    public void setAvgRowLen(BigInteger avgRowLen) {
        this.avgRowLen = avgRowLen;
    }

    public BigInteger getAvgSpaceFreelistBlocks() {
        return avgSpaceFreelistBlocks;
    }

    public void setAvgSpaceFreelistBlocks(BigInteger avgSpaceFreelistBlocks) {
        this.avgSpaceFreelistBlocks = avgSpaceFreelistBlocks;
    }

    public BigInteger getNumFreelistBlocks() {
        return numFreelistBlocks;
    }

    public void setNumFreelistBlocks(BigInteger numFreelistBlocks) {
        this.numFreelistBlocks = numFreelistBlocks;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstances() {
        return instances;
    }

    public void setInstances(String instances) {
        this.instances = instances;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getTableLock() {
        return tableLock;
    }

    public void setTableLock(String tableLock) {
        this.tableLock = tableLock;
    }

    public BigInteger getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigInteger sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public String getPartitioned() {
        return partitioned;
    }

    public void setPartitioned(String partitioned) {
        this.partitioned = partitioned;
    }

    public String getIotType() {
        return iotType;
    }

    public void setIotType(String iotType) {
        this.iotType = iotType;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getNested() {
        return nested;
    }

    public void setNested(String nested) {
        this.nested = nested;
    }

    public String getBufferPool() {
        return bufferPool;
    }

    public void setBufferPool(String bufferPool) {
        this.bufferPool = bufferPool;
    }

    public String getFlashCache() {
        return flashCache;
    }

    public void setFlashCache(String flashCache) {
        this.flashCache = flashCache;
    }

    public String getCellFlashCache() {
        return cellFlashCache;
    }

    public void setCellFlashCache(String cellFlashCache) {
        this.cellFlashCache = cellFlashCache;
    }

    public String getRowMovement() {
        return rowMovement;
    }

    public void setRowMovement(String rowMovement) {
        this.rowMovement = rowMovement;
    }

    public String getGlobalStats() {
        return globalStats;
    }

    public void setGlobalStats(String globalStats) {
        this.globalStats = globalStats;
    }

    public String getUserStats() {
        return userStats;
    }

    public void setUserStats(String userStats) {
        this.userStats = userStats;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSkipCorrupt() {
        return skipCorrupt;
    }

    public void setSkipCorrupt(String skipCorrupt) {
        this.skipCorrupt = skipCorrupt;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getClusterOwner() {
        return clusterOwner;
    }

    public void setClusterOwner(String clusterOwner) {
        this.clusterOwner = clusterOwner;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public String getCompressFor() {
        return compressFor;
    }

    public void setCompressFor(String compressFor) {
        this.compressFor = compressFor;
    }

    public String getDropped() {
        return dropped;
    }

    public void setDropped(String dropped) {
        this.dropped = dropped;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }

    public String getSegmentCreated() {
        return segmentCreated;
    }

    public void setSegmentCreated(String segmentCreated) {
        this.segmentCreated = segmentCreated;
    }

    public String getResultCache() {
        return resultCache;
    }

    public void setResultCache(String resultCache) {
        this.resultCache = resultCache;
    }
    
    public String toString() {
        return tableName;
    }
    
}
