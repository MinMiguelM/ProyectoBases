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
@Table(name = "DBA_VIEWS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DbaViews.findAll", query = "SELECT d FROM DbaViews d"),
    @NamedQuery(name = "DbaViews.findAllGroupByOwner",query = "SELECT d.owner,COUNT(d) FROM DbaViews d GROUP BY d.owner"),
    @NamedQuery(name = "DbaViews.findByOwner", query = "SELECT d FROM DbaViews d WHERE d.owner = :owner"),
    @NamedQuery(name = "DbaViews.findByViewName", query = "SELECT d FROM DbaViews d WHERE d.viewName = :viewName"),
    @NamedQuery(name = "DbaViews.findByTextLength", query = "SELECT d FROM DbaViews d WHERE d.textLength = :textLength"),
    @NamedQuery(name = "DbaViews.findByTypeTextLength", query = "SELECT d FROM DbaViews d WHERE d.typeTextLength = :typeTextLength"),
    @NamedQuery(name = "DbaViews.findByTypeText", query = "SELECT d FROM DbaViews d WHERE d.typeText = :typeText"),
    @NamedQuery(name = "DbaViews.findByOidTextLength", query = "SELECT d FROM DbaViews d WHERE d.oidTextLength = :oidTextLength"),
    @NamedQuery(name = "DbaViews.findByOidText", query = "SELECT d FROM DbaViews d WHERE d.oidText = :oidText"),
    @NamedQuery(name = "DbaViews.findByViewTypeOwner", query = "SELECT d FROM DbaViews d WHERE d.viewTypeOwner = :viewTypeOwner"),
    @NamedQuery(name = "DbaViews.findByViewType", query = "SELECT d FROM DbaViews d WHERE d.viewType = :viewType"),
    @NamedQuery(name = "DbaViews.findBySuperviewName", query = "SELECT d FROM DbaViews d WHERE d.superviewName = :superviewName"),
    @NamedQuery(name = "DbaViews.findByEditioningView", query = "SELECT d FROM DbaViews d WHERE d.editioningView = :editioningView"),
    @NamedQuery(name = "DbaViews.findByReadOnly", query = "SELECT d FROM DbaViews d WHERE d.readOnly = :readOnly")})
public class DbaViews implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "OWNER")
    private String owner;
    @Basic(optional = false)
    @Id
    @Column(name = "VIEW_NAME")
    private String viewName;
    @Column(name = "TEXT_LENGTH")
    private BigInteger textLength;
    @Lob
    @Column(name = "TEXT")
    private String text;
    @Column(name = "TYPE_TEXT_LENGTH")
    private BigInteger typeTextLength;
    @Column(name = "TYPE_TEXT")
    private String typeText;
    @Column(name = "OID_TEXT_LENGTH")
    private BigInteger oidTextLength;
    @Column(name = "OID_TEXT")
    private String oidText;
    @Column(name = "VIEW_TYPE_OWNER")
    private String viewTypeOwner;
    @Column(name = "VIEW_TYPE")
    private String viewType;
    @Column(name = "SUPERVIEW_NAME")
    private String superviewName;
    @Column(name = "EDITIONING_VIEW")
    private String editioningView;
    @Column(name = "READ_ONLY")
    private String readOnly;

    public DbaViews() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public BigInteger getTextLength() {
        return textLength;
    }

    public void setTextLength(BigInteger textLength) {
        this.textLength = textLength;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public BigInteger getTypeTextLength() {
        return typeTextLength;
    }

    public void setTypeTextLength(BigInteger typeTextLength) {
        this.typeTextLength = typeTextLength;
    }

    public String getTypeText() {
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public BigInteger getOidTextLength() {
        return oidTextLength;
    }

    public void setOidTextLength(BigInteger oidTextLength) {
        this.oidTextLength = oidTextLength;
    }

    public String getOidText() {
        return oidText;
    }

    public void setOidText(String oidText) {
        this.oidText = oidText;
    }

    public String getViewTypeOwner() {
        return viewTypeOwner;
    }

    public void setViewTypeOwner(String viewTypeOwner) {
        this.viewTypeOwner = viewTypeOwner;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public String getSuperviewName() {
        return superviewName;
    }

    public void setSuperviewName(String superviewName) {
        this.superviewName = superviewName;
    }

    public String getEditioningView() {
        return editioningView;
    }

    public void setEditioningView(String editioningView) {
        this.editioningView = editioningView;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }
    
}
