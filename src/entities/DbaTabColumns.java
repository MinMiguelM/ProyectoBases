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
@Table(name = "DBA_TAB_COLUMNS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbaTabColumns.findAll", query = "SELECT d FROM DbaTabColumns d"),
    @NamedQuery(name = "DbaTabColumns.findByOwner", query = "SELECT d FROM DbaTabColumns d WHERE d.owner = :owner"),
    @NamedQuery(name = "DbaTabColumns.findByTableName", query = "SELECT d FROM DbaTabColumns d WHERE d.tableName = :tableName"),
    @NamedQuery(name = "DbaTabColumns.findByColumnName", query = "SELECT d FROM DbaTabColumns d WHERE d.columnName = :columnName"),
    @NamedQuery(name = "DbaTabColumns.findByDataType", query = "SELECT d FROM DbaTabColumns d WHERE d.dataType = :dataType"),
    @NamedQuery(name = "DbaTabColumns.findByDataTypeMod", query = "SELECT d FROM DbaTabColumns d WHERE d.dataTypeMod = :dataTypeMod"),
    @NamedQuery(name = "DbaTabColumns.findByDataTypeOwner", query = "SELECT d FROM DbaTabColumns d WHERE d.dataTypeOwner = :dataTypeOwner"),
    @NamedQuery(name = "DbaTabColumns.findByDataLength", query = "SELECT d FROM DbaTabColumns d WHERE d.dataLength = :dataLength"),
    @NamedQuery(name = "DbaTabColumns.findByDataPrecision", query = "SELECT d FROM DbaTabColumns d WHERE d.dataPrecision = :dataPrecision"),
    @NamedQuery(name = "DbaTabColumns.findByDataScale", query = "SELECT d FROM DbaTabColumns d WHERE d.dataScale = :dataScale"),
    @NamedQuery(name = "DbaTabColumns.findByNullable", query = "SELECT d FROM DbaTabColumns d WHERE d.nullable = :nullable"),
    @NamedQuery(name = "DbaTabColumns.findByColumnId", query = "SELECT d FROM DbaTabColumns d WHERE d.columnId = :columnId"),
    @NamedQuery(name = "DbaTabColumns.findByDefaultLength", query = "SELECT d FROM DbaTabColumns d WHERE d.defaultLength = :defaultLength"),
    @NamedQuery(name = "DbaTabColumns.findByNumDistinct", query = "SELECT d FROM DbaTabColumns d WHERE d.numDistinct = :numDistinct"),
    @NamedQuery(name = "DbaTabColumns.findByDensity", query = "SELECT d FROM DbaTabColumns d WHERE d.density = :density"),
    @NamedQuery(name = "DbaTabColumns.findByNumNulls", query = "SELECT d FROM DbaTabColumns d WHERE d.numNulls = :numNulls"),
    @NamedQuery(name = "DbaTabColumns.findByNumBuckets", query = "SELECT d FROM DbaTabColumns d WHERE d.numBuckets = :numBuckets"),
    @NamedQuery(name = "DbaTabColumns.findByLastAnalyzed", query = "SELECT d FROM DbaTabColumns d WHERE d.lastAnalyzed = :lastAnalyzed"),
    @NamedQuery(name = "DbaTabColumns.findBySampleSize", query = "SELECT d FROM DbaTabColumns d WHERE d.sampleSize = :sampleSize"),
    @NamedQuery(name = "DbaTabColumns.findByCharacterSetName", query = "SELECT d FROM DbaTabColumns d WHERE d.characterSetName = :characterSetName"),
    @NamedQuery(name = "DbaTabColumns.findByCharColDeclLength", query = "SELECT d FROM DbaTabColumns d WHERE d.charColDeclLength = :charColDeclLength"),
    @NamedQuery(name = "DbaTabColumns.findByGlobalStats", query = "SELECT d FROM DbaTabColumns d WHERE d.globalStats = :globalStats"),
    @NamedQuery(name = "DbaTabColumns.findByUserStats", query = "SELECT d FROM DbaTabColumns d WHERE d.userStats = :userStats"),
    @NamedQuery(name = "DbaTabColumns.findByAvgColLen", query = "SELECT d FROM DbaTabColumns d WHERE d.avgColLen = :avgColLen"),
    @NamedQuery(name = "DbaTabColumns.findByCharLength", query = "SELECT d FROM DbaTabColumns d WHERE d.charLength = :charLength"),
    @NamedQuery(name = "DbaTabColumns.findByCharUsed", query = "SELECT d FROM DbaTabColumns d WHERE d.charUsed = :charUsed"),
    @NamedQuery(name = "DbaTabColumns.findByV80FmtImage", query = "SELECT d FROM DbaTabColumns d WHERE d.v80FmtImage = :v80FmtImage"),
    @NamedQuery(name = "DbaTabColumns.findByDataUpgraded", query = "SELECT d FROM DbaTabColumns d WHERE d.dataUpgraded = :dataUpgraded"),
    @NamedQuery(name = "DbaTabColumns.findByHistogram", query = "SELECT d FROM DbaTabColumns d WHERE d.histogram = :histogram")})
public class DbaTabColumns implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Id
    @Column(name = "OWNER")
    private String owner;
    @Basic(optional = false)
    @Column(name = "TABLE_NAME")
    @Id
    private String tableName;
    @Basic(optional = false)
    @Column(name = "COLUMN_NAME")
    @Id
    private String columnName;
    @Column(name = "DATA_TYPE")
    private String dataType;
    @Column(name = "DATA_TYPE_MOD")
    private String dataTypeMod;
    @Column(name = "DATA_TYPE_OWNER")
    private String dataTypeOwner;
    @Basic(optional = false)
    @Column(name = "DATA_LENGTH")
    private BigInteger dataLength;
    @Column(name = "DATA_PRECISION")
    private BigInteger dataPrecision;
    @Column(name = "DATA_SCALE")
    private BigInteger dataScale;
    @Column(name = "NULLABLE")
    private String nullable;
    @Column(name = "COLUMN_ID")
    private BigInteger columnId;
    @Column(name = "DEFAULT_LENGTH")
    private BigInteger defaultLength;
    @Lob
    @Column(name = "DATA_DEFAULT")
    private String dataDefault;
    @Column(name = "NUM_DISTINCT")
    private BigInteger numDistinct;
    @Lob
    @Column(name = "LOW_VALUE")
    private byte[] lowValue;
    @Lob
    @Column(name = "HIGH_VALUE")
    private byte[] highValue;
    @Column(name = "DENSITY")
    private BigInteger density;
    @Column(name = "NUM_NULLS")
    private BigInteger numNulls;
    @Column(name = "NUM_BUCKETS")
    private BigInteger numBuckets;
    @Column(name = "LAST_ANALYZED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAnalyzed;
    @Column(name = "SAMPLE_SIZE")
    private BigInteger sampleSize;
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;
    @Column(name = "CHAR_COL_DECL_LENGTH")
    private BigInteger charColDeclLength;
    @Column(name = "GLOBAL_STATS")
    private String globalStats;
    @Column(name = "USER_STATS")
    private String userStats;
    @Column(name = "AVG_COL_LEN")
    private BigInteger avgColLen;
    @Column(name = "CHAR_LENGTH")
    private BigInteger charLength;
    @Column(name = "CHAR_USED")
    private String charUsed;
    @Column(name = "V80_FMT_IMAGE")
    private String v80FmtImage;
    @Column(name = "DATA_UPGRADED")
    private String dataUpgraded;
    @Column(name = "HISTOGRAM")
    private String histogram;

    public DbaTabColumns() {
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataTypeMod() {
        return dataTypeMod;
    }

    public void setDataTypeMod(String dataTypeMod) {
        this.dataTypeMod = dataTypeMod;
    }

    public String getDataTypeOwner() {
        return dataTypeOwner;
    }

    public void setDataTypeOwner(String dataTypeOwner) {
        this.dataTypeOwner = dataTypeOwner;
    }

    public BigInteger getDataLength() {
        return dataLength;
    }

    public void setDataLength(BigInteger dataLength) {
        this.dataLength = dataLength;
    }

    public BigInteger getDataPrecision() {
        return dataPrecision;
    }

    public void setDataPrecision(BigInteger dataPrecision) {
        this.dataPrecision = dataPrecision;
    }

    public BigInteger getDataScale() {
        return dataScale;
    }

    public void setDataScale(BigInteger dataScale) {
        this.dataScale = dataScale;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public BigInteger getColumnId() {
        return columnId;
    }

    public void setColumnId(BigInteger columnId) {
        this.columnId = columnId;
    }

    public BigInteger getDefaultLength() {
        return defaultLength;
    }

    public void setDefaultLength(BigInteger defaultLength) {
        this.defaultLength = defaultLength;
    }

    public String getDataDefault() {
        return dataDefault;
    }

    public void setDataDefault(String dataDefault) {
        this.dataDefault = dataDefault;
    }

    public BigInteger getNumDistinct() {
        return numDistinct;
    }

    public void setNumDistinct(BigInteger numDistinct) {
        this.numDistinct = numDistinct;
    }

    public byte[] getLowValue() {
        return lowValue;
    }

    public void setLowValue(byte[] lowValue) {
        this.lowValue = lowValue;
    }

    public byte[] getHighValue() {
        return highValue;
    }

    public void setHighValue(byte[] highValue) {
        this.highValue = highValue;
    }

    public BigInteger getDensity() {
        return density;
    }

    public void setDensity(BigInteger density) {
        this.density = density;
    }

    public BigInteger getNumNulls() {
        return numNulls;
    }

    public void setNumNulls(BigInteger numNulls) {
        this.numNulls = numNulls;
    }

    public BigInteger getNumBuckets() {
        return numBuckets;
    }

    public void setNumBuckets(BigInteger numBuckets) {
        this.numBuckets = numBuckets;
    }

    public Date getLastAnalyzed() {
        return lastAnalyzed;
    }

    public void setLastAnalyzed(Date lastAnalyzed) {
        this.lastAnalyzed = lastAnalyzed;
    }

    public BigInteger getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(BigInteger sampleSize) {
        this.sampleSize = sampleSize;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public BigInteger getCharColDeclLength() {
        return charColDeclLength;
    }

    public void setCharColDeclLength(BigInteger charColDeclLength) {
        this.charColDeclLength = charColDeclLength;
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

    public BigInteger getAvgColLen() {
        return avgColLen;
    }

    public void setAvgColLen(BigInteger avgColLen) {
        this.avgColLen = avgColLen;
    }

    public BigInteger getCharLength() {
        return charLength;
    }

    public void setCharLength(BigInteger charLength) {
        this.charLength = charLength;
    }

    public String getCharUsed() {
        return charUsed;
    }

    public void setCharUsed(String charUsed) {
        this.charUsed = charUsed;
    }

    public String getV80FmtImage() {
        return v80FmtImage;
    }

    public void setV80FmtImage(String v80FmtImage) {
        this.v80FmtImage = v80FmtImage;
    }

    public String getDataUpgraded() {
        return dataUpgraded;
    }

    public void setDataUpgraded(String dataUpgraded) {
        this.dataUpgraded = dataUpgraded;
    }

    public String getHistogram() {
        return histogram;
    }

    public void setHistogram(String histogram) {
        this.histogram = histogram;
    }
    
}
