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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "DBA_TRIGGERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbaTriggers.findAll", query = "SELECT d FROM DbaTriggers d"),
    @NamedQuery(name = "DbaTriggers.findByOwner", query = "SELECT d FROM DbaTriggers d WHERE d.owner = :owner"),
    @NamedQuery(name = "DbaTriggers.findByTriggerName", query = "SELECT d FROM DbaTriggers d WHERE d.triggerName = :triggerName"),
    @NamedQuery(name = "DbaTriggers.findByTriggerType", query = "SELECT d FROM DbaTriggers d WHERE d.triggerType = :triggerType"),
    @NamedQuery(name = "DbaTriggers.findByTriggeringEvent", query = "SELECT d FROM DbaTriggers d WHERE d.triggeringEvent = :triggeringEvent"),
    @NamedQuery(name = "DbaTriggers.findByTableOwner", query = "SELECT d FROM DbaTriggers d WHERE d.tableOwner = :tableOwner"),
    @NamedQuery(name = "DbaTriggers.findByBaseObjectType", query = "SELECT d FROM DbaTriggers d WHERE d.baseObjectType = :baseObjectType"),
    @NamedQuery(name = "DbaTriggers.findByTableName", query = "SELECT d FROM DbaTriggers d WHERE d.tableName = :tableName"),
    @NamedQuery(name = "DbaTriggers.findByColumnName", query = "SELECT d FROM DbaTriggers d WHERE d.columnName = :columnName"),
    @NamedQuery(name = "DbaTriggers.findByReferencingNames", query = "SELECT d FROM DbaTriggers d WHERE d.referencingNames = :referencingNames"),
    @NamedQuery(name = "DbaTriggers.findByWhenClause", query = "SELECT d FROM DbaTriggers d WHERE d.whenClause = :whenClause"),
    @NamedQuery(name = "DbaTriggers.findByStatus", query = "SELECT d FROM DbaTriggers d WHERE d.status = :status"),
    @NamedQuery(name = "DbaTriggers.findByDescription", query = "SELECT d FROM DbaTriggers d WHERE d.description = :description"),
    @NamedQuery(name = "DbaTriggers.findByActionType", query = "SELECT d FROM DbaTriggers d WHERE d.actionType = :actionType"),
    @NamedQuery(name = "DbaTriggers.findByCrossedition", query = "SELECT d FROM DbaTriggers d WHERE d.crossedition = :crossedition"),
    @NamedQuery(name = "DbaTriggers.findByBeforeStatement", query = "SELECT d FROM DbaTriggers d WHERE d.beforeStatement = :beforeStatement"),
    @NamedQuery(name = "DbaTriggers.findByBeforeRow", query = "SELECT d FROM DbaTriggers d WHERE d.beforeRow = :beforeRow"),
    @NamedQuery(name = "DbaTriggers.findByAfterRow", query = "SELECT d FROM DbaTriggers d WHERE d.afterRow = :afterRow"),
    @NamedQuery(name = "DbaTriggers.findByAfterStatement", query = "SELECT d FROM DbaTriggers d WHERE d.afterStatement = :afterStatement"),
    @NamedQuery(name = "DbaTriggers.findByInsteadOfRow", query = "SELECT d FROM DbaTriggers d WHERE d.insteadOfRow = :insteadOfRow"),
    @NamedQuery(name = "DbaTriggers.findByFireOnce", query = "SELECT d FROM DbaTriggers d WHERE d.fireOnce = :fireOnce"),
    @NamedQuery(name = "DbaTriggers.findByApplyServerOnly", query = "SELECT d FROM DbaTriggers d WHERE d.applyServerOnly = :applyServerOnly")})
public class DbaTriggers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "OWNER")
    @Id
    private String owner;
    @Column(name = "TRIGGER_NAME")
    private String triggerName;
    @Column(name = "TRIGGER_TYPE")
    private String triggerType;
    @Column(name = "TRIGGERING_EVENT")
    private String triggeringEvent;
    @Column(name = "TABLE_OWNER")
    private String tableOwner;
    @Column(name = "BASE_OBJECT_TYPE")
    private String baseObjectType;
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Column(name = "REFERENCING_NAMES")
    private String referencingNames;
    @Column(name = "WHEN_CLAUSE")
    private String whenClause;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ACTION_TYPE")
    private String actionType;
    @Lob
    @Column(name = "TRIGGER_BODY")
    private String triggerBody;
    @Column(name = "CROSSEDITION")
    private String crossedition;
    @Column(name = "BEFORE_STATEMENT")
    private String beforeStatement;
    @Column(name = "BEFORE_ROW")
    private String beforeRow;
    @Column(name = "AFTER_ROW")
    private String afterRow;
    @Column(name = "AFTER_STATEMENT")
    private String afterStatement;
    @Column(name = "INSTEAD_OF_ROW")
    private String insteadOfRow;
    @Column(name = "FIRE_ONCE")
    private String fireOnce;
    @Column(name = "APPLY_SERVER_ONLY")
    private String applyServerOnly;

    public DbaTriggers() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getTriggeringEvent() {
        return triggeringEvent;
    }

    public void setTriggeringEvent(String triggeringEvent) {
        this.triggeringEvent = triggeringEvent;
    }

    public String getTableOwner() {
        return tableOwner;
    }

    public void setTableOwner(String tableOwner) {
        this.tableOwner = tableOwner;
    }

    public String getBaseObjectType() {
        return baseObjectType;
    }

    public void setBaseObjectType(String baseObjectType) {
        this.baseObjectType = baseObjectType;
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

    public String getReferencingNames() {
        return referencingNames;
    }

    public void setReferencingNames(String referencingNames) {
        this.referencingNames = referencingNames;
    }

    public String getWhenClause() {
        return whenClause;
    }

    public void setWhenClause(String whenClause) {
        this.whenClause = whenClause;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getTriggerBody() {
        return triggerBody;
    }

    public void setTriggerBody(String triggerBody) {
        this.triggerBody = triggerBody;
    }

    public String getCrossedition() {
        return crossedition;
    }

    public void setCrossedition(String crossedition) {
        this.crossedition = crossedition;
    }

    public String getBeforeStatement() {
        return beforeStatement;
    }

    public void setBeforeStatement(String beforeStatement) {
        this.beforeStatement = beforeStatement;
    }

    public String getBeforeRow() {
        return beforeRow;
    }

    public void setBeforeRow(String beforeRow) {
        this.beforeRow = beforeRow;
    }

    public String getAfterRow() {
        return afterRow;
    }

    public void setAfterRow(String afterRow) {
        this.afterRow = afterRow;
    }

    public String getAfterStatement() {
        return afterStatement;
    }

    public void setAfterStatement(String afterStatement) {
        this.afterStatement = afterStatement;
    }

    public String getInsteadOfRow() {
        return insteadOfRow;
    }

    public void setInsteadOfRow(String insteadOfRow) {
        this.insteadOfRow = insteadOfRow;
    }

    public String getFireOnce() {
        return fireOnce;
    }

    public void setFireOnce(String fireOnce) {
        this.fireOnce = fireOnce;
    }

    public String getApplyServerOnly() {
        return applyServerOnly;
    }

    public void setApplyServerOnly(String applyServerOnly) {
        this.applyServerOnly = applyServerOnly;
    }
    
}
