package org.opentaps.base.entities;

/*
 * Copyright (c) Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProdConfItemContentType.
 */
@javax.persistence.Entity
@Table(name="PROD_CONF_ITEM_CONTENT_TYPE")
public class ProdConfItemContentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("confItemContentTypeId", "CONF_ITEM_CONTENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProdConfItemContentType", fields);
}
  public static enum Fields implements EntityFieldInterface<ProdConfItemContentType> {
    confItemContentTypeId("confItemContentTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
    description("description"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @org.hibernate.annotations.GenericGenerator(name="ProdConfItemContentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProdConfItemContentType_GEN")
   @Id
   @Column(name="CONF_ITEM_CONTENT_TYPE_ID")
   private String confItemContentTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProdConfItemContentType parentProdConfItemContentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="prodConfItemContentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CONF_ITEM_CONTENT_TYPE_ID")
   
   private List<ProdConfItemContent> prodConfItemContents = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentProdConfItemContentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<ProdConfItemContentType> childProdConfItemContentTypes = null;

  /**
   * Default constructor.
   */
  public ProdConfItemContentType() {
      super();
      this.baseEntityName = "ProdConfItemContentType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("confItemContentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("confItemContentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProdConfItemContentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param confItemContentTypeId the confItemContentTypeId to set
     */
    public void setConfItemContentTypeId(String confItemContentTypeId) {
        this.confItemContentTypeId = confItemContentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
    /**
     * Auto generated value setter.
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfItemContentTypeId() {
        return this.confItemContentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>ProdConfItemContentType</code> by the relation named <code>ParentProdConfItemContentType</code>.
     * @return the <code>ProdConfItemContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProdConfItemContentType getParentProdConfItemContentType() throws RepositoryException {
        if (this.parentProdConfItemContentType == null) {
            this.parentProdConfItemContentType = getRelatedOne(ProdConfItemContentType.class, "ParentProdConfItemContentType");
        }
        return this.parentProdConfItemContentType;
    }
    /**
     * Auto generated method that gets the related <code>ProdConfItemContent</code> by the relation named <code>ProdConfItemContent</code>.
     * @return the list of <code>ProdConfItemContent</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProdConfItemContent> getProdConfItemContents() throws RepositoryException {
        if (this.prodConfItemContents == null) {
            this.prodConfItemContents = getRelated(ProdConfItemContent.class, "ProdConfItemContent");
        }
        return this.prodConfItemContents;
    }
    /**
     * Auto generated method that gets the related <code>ProdConfItemContentType</code> by the relation named <code>ChildProdConfItemContentType</code>.
     * @return the list of <code>ProdConfItemContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProdConfItemContentType> getChildProdConfItemContentTypes() throws RepositoryException {
        if (this.childProdConfItemContentTypes == null) {
            this.childProdConfItemContentTypes = getRelated(ProdConfItemContentType.class, "ChildProdConfItemContentType");
        }
        return this.childProdConfItemContentTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentProdConfItemContentType the parentProdConfItemContentType to set
    */
    public void setParentProdConfItemContentType(ProdConfItemContentType parentProdConfItemContentType) {
        this.parentProdConfItemContentType = parentProdConfItemContentType;
    }
    /**
     * Auto generated value setter.
     * @param prodConfItemContents the prodConfItemContents to set
    */
    public void setProdConfItemContents(List<ProdConfItemContent> prodConfItemContents) {
        this.prodConfItemContents = prodConfItemContents;
    }
    /**
     * Auto generated value setter.
     * @param childProdConfItemContentTypes the childProdConfItemContentTypes to set
    */
    public void setChildProdConfItemContentTypes(List<ProdConfItemContentType> childProdConfItemContentTypes) {
        this.childProdConfItemContentTypes = childProdConfItemContentTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProdConfItemContent(ProdConfItemContent prodConfItemContent) {
        if (this.prodConfItemContents == null) {
            this.prodConfItemContents = new ArrayList<ProdConfItemContent>();
        }
        this.prodConfItemContents.add(prodConfItemContent);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProdConfItemContent(ProdConfItemContent prodConfItemContent) {
        if (this.prodConfItemContents == null) {
            return;
        }
        this.prodConfItemContents.remove(prodConfItemContent);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProdConfItemContent() {
        if (this.prodConfItemContents == null) {
            return;
        }
        this.prodConfItemContents.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setConfItemContentTypeId((String) mapValue.get("confItemContentTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
        setDescription((String) mapValue.get("description"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("confItemContentTypeId", getConfItemContentTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
