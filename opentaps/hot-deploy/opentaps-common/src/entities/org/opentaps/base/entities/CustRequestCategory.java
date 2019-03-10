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
 * Auto generated base entity CustRequestCategory.
 */
@javax.persistence.Entity
@Table(name="CUST_REQUEST_CATEGORY")
public class CustRequestCategory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestCategoryId", "CUST_REQUEST_CATEGORY_ID");
        fields.put("custRequestTypeId", "CUST_REQUEST_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CustRequestCategory", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestCategory> {
    custRequestCategoryId("custRequestCategoryId"),
    custRequestTypeId("custRequestTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="CustRequestCategory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CustRequestCategory_GEN")
   @Id
   @Column(name="CUST_REQUEST_CATEGORY_ID")
   private String custRequestCategoryId;
   @Column(name="CUST_REQUEST_TYPE_ID")
   private String custRequestTypeId;
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
   @JoinColumn(name="CUST_REQUEST_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustRequestType custRequestType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="custRequestCategory", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CUST_REQUEST_CATEGORY_ID")
   
   private List<CustRequest> custRequests = null;

  /**
   * Default constructor.
   */
  public CustRequestCategory() {
      super();
      this.baseEntityName = "CustRequestCategory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestCategoryId");this.allFieldsNames.add("custRequestTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestCategory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param custRequestCategoryId the custRequestCategoryId to set
     */
    public void setCustRequestCategoryId(String custRequestCategoryId) {
        this.custRequestCategoryId = custRequestCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestTypeId the custRequestTypeId to set
     */
    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
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
    public String getCustRequestCategoryId() {
        return this.custRequestCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestTypeId() {
        return this.custRequestTypeId;
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
     * Auto generated method that gets the related <code>CustRequestType</code> by the relation named <code>CustRequestType</code>.
     * @return the <code>CustRequestType</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequestType getCustRequestType() throws RepositoryException {
        if (this.custRequestType == null) {
            this.custRequestType = getRelatedOne(CustRequestType.class, "CustRequestType");
        }
        return this.custRequestType;
    }
    /**
     * Auto generated method that gets the related <code>CustRequest</code> by the relation named <code>CustRequest</code>.
     * @return the list of <code>CustRequest</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CustRequest> getCustRequests() throws RepositoryException {
        if (this.custRequests == null) {
            this.custRequests = getRelated(CustRequest.class, "CustRequest");
        }
        return this.custRequests;
    }

    /**
     * Auto generated value setter.
     * @param custRequestType the custRequestType to set
    */
    public void setCustRequestType(CustRequestType custRequestType) {
        this.custRequestType = custRequestType;
    }
    /**
     * Auto generated value setter.
     * @param custRequests the custRequests to set
    */
    public void setCustRequests(List<CustRequest> custRequests) {
        this.custRequests = custRequests;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestCategoryId((String) mapValue.get("custRequestCategoryId"));
        setCustRequestTypeId((String) mapValue.get("custRequestTypeId"));
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
        mapValue.put("custRequestCategoryId", getCustRequestCategoryId());
        mapValue.put("custRequestTypeId", getCustRequestTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
