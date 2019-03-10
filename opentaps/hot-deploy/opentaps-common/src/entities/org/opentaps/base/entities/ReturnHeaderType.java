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
 * Auto generated base entity ReturnHeaderType.
 */
@javax.persistence.Entity
@Table(name="RETURN_HEADER_TYPE")
public class ReturnHeaderType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("returnHeaderTypeId", "RETURN_HEADER_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ReturnHeaderType", fields);
}
  public static enum Fields implements EntityFieldInterface<ReturnHeaderType> {
    returnHeaderTypeId("returnHeaderTypeId"),
    parentTypeId("parentTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="ReturnHeaderType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ReturnHeaderType_GEN")
   @Id
   @Column(name="RETURN_HEADER_TYPE_ID")
   private String returnHeaderTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
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
   
   private ReturnHeaderType parentReturnHeaderType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="returnHeaderType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="RETURN_HEADER_TYPE_ID")
   
   private List<ReturnHeader> returnHeaders = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentReturnHeaderType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<ReturnHeaderType> childReturnHeaderTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="returnHeaderType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="RETURN_HEADER_TYPE_ID")
   
   private List<ReturnItemTypeMap> returnItemTypeMaps = null;

  /**
   * Default constructor.
   */
  public ReturnHeaderType() {
      super();
      this.baseEntityName = "ReturnHeaderType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("returnHeaderTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("returnHeaderTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReturnHeaderType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param returnHeaderTypeId the returnHeaderTypeId to set
     */
    public void setReturnHeaderTypeId(String returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
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
    public String getReturnHeaderTypeId() {
        return this.returnHeaderTypeId;
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
     * Auto generated method that gets the related <code>ReturnHeaderType</code> by the relation named <code>ParentReturnHeaderType</code>.
     * @return the <code>ReturnHeaderType</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnHeaderType getParentReturnHeaderType() throws RepositoryException {
        if (this.parentReturnHeaderType == null) {
            this.parentReturnHeaderType = getRelatedOne(ReturnHeaderType.class, "ParentReturnHeaderType");
        }
        return this.parentReturnHeaderType;
    }
    /**
     * Auto generated method that gets the related <code>ReturnHeader</code> by the relation named <code>ReturnHeader</code>.
     * @return the list of <code>ReturnHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnHeader> getReturnHeaders() throws RepositoryException {
        if (this.returnHeaders == null) {
            this.returnHeaders = getRelated(ReturnHeader.class, "ReturnHeader");
        }
        return this.returnHeaders;
    }
    /**
     * Auto generated method that gets the related <code>ReturnHeaderType</code> by the relation named <code>ChildReturnHeaderType</code>.
     * @return the list of <code>ReturnHeaderType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnHeaderType> getChildReturnHeaderTypes() throws RepositoryException {
        if (this.childReturnHeaderTypes == null) {
            this.childReturnHeaderTypes = getRelated(ReturnHeaderType.class, "ChildReturnHeaderType");
        }
        return this.childReturnHeaderTypes;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemTypeMap</code> by the relation named <code>ReturnItemTypeMap</code>.
     * @return the list of <code>ReturnItemTypeMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemTypeMap> getReturnItemTypeMaps() throws RepositoryException {
        if (this.returnItemTypeMaps == null) {
            this.returnItemTypeMaps = getRelated(ReturnItemTypeMap.class, "ReturnItemTypeMap");
        }
        return this.returnItemTypeMaps;
    }

    /**
     * Auto generated value setter.
     * @param parentReturnHeaderType the parentReturnHeaderType to set
    */
    public void setParentReturnHeaderType(ReturnHeaderType parentReturnHeaderType) {
        this.parentReturnHeaderType = parentReturnHeaderType;
    }
    /**
     * Auto generated value setter.
     * @param returnHeaders the returnHeaders to set
    */
    public void setReturnHeaders(List<ReturnHeader> returnHeaders) {
        this.returnHeaders = returnHeaders;
    }
    /**
     * Auto generated value setter.
     * @param childReturnHeaderTypes the childReturnHeaderTypes to set
    */
    public void setChildReturnHeaderTypes(List<ReturnHeaderType> childReturnHeaderTypes) {
        this.childReturnHeaderTypes = childReturnHeaderTypes;
    }
    /**
     * Auto generated value setter.
     * @param returnItemTypeMaps the returnItemTypeMaps to set
    */
    public void setReturnItemTypeMaps(List<ReturnItemTypeMap> returnItemTypeMaps) {
        this.returnItemTypeMaps = returnItemTypeMaps;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addReturnItemTypeMap(ReturnItemTypeMap returnItemTypeMap) {
        if (this.returnItemTypeMaps == null) {
            this.returnItemTypeMaps = new ArrayList<ReturnItemTypeMap>();
        }
        this.returnItemTypeMaps.add(returnItemTypeMap);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeReturnItemTypeMap(ReturnItemTypeMap returnItemTypeMap) {
        if (this.returnItemTypeMaps == null) {
            return;
        }
        this.returnItemTypeMaps.remove(returnItemTypeMap);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearReturnItemTypeMap() {
        if (this.returnItemTypeMaps == null) {
            return;
        }
        this.returnItemTypeMaps.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReturnHeaderTypeId((String) mapValue.get("returnHeaderTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
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
        mapValue.put("returnHeaderTypeId", getReturnHeaderTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
