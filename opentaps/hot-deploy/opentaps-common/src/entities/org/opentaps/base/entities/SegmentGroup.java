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
 * Auto generated base entity SegmentGroup.
 */
@javax.persistence.Entity
@Table(name="SEGMENT_GROUP")
public class SegmentGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("segmentGroupId", "SEGMENT_GROUP_ID");
        fields.put("segmentGroupTypeId", "SEGMENT_GROUP_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("productStoreId", "PRODUCT_STORE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SegmentGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<SegmentGroup> {
    segmentGroupId("segmentGroupId"),
    segmentGroupTypeId("segmentGroupTypeId"),
    description("description"),
    productStoreId("productStoreId"),
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

   @org.hibernate.annotations.GenericGenerator(name="SegmentGroup_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SegmentGroup_GEN")
   @Id
   @Column(name="SEGMENT_GROUP_ID")
   private String segmentGroupId;
   @Column(name="SEGMENT_GROUP_TYPE_ID")
   private String segmentGroupTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="PRODUCT_STORE_ID")
   private String productStoreId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SEGMENT_GROUP_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SegmentGroupType segmentGroupType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_STORE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductStore productStore = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="segmentGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SEGMENT_GROUP_ID")
   
   private List<SegmentGroupClassification> segmentGroupClassifications = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="segmentGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SEGMENT_GROUP_ID")
   
   private List<SegmentGroupGeo> segmentGroupGeos = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="segmentGroup", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SEGMENT_GROUP_ID")
   
   private List<SegmentGroupRole> segmentGroupRoles = null;

  /**
   * Default constructor.
   */
  public SegmentGroup() {
      super();
      this.baseEntityName = "SegmentGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("segmentGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("segmentGroupId");this.allFieldsNames.add("segmentGroupTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SegmentGroup(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param segmentGroupId the segmentGroupId to set
     */
    public void setSegmentGroupId(String segmentGroupId) {
        this.segmentGroupId = segmentGroupId;
    }
    /**
     * Auto generated value setter.
     * @param segmentGroupTypeId the segmentGroupTypeId to set
     */
    public void setSegmentGroupTypeId(String segmentGroupTypeId) {
        this.segmentGroupTypeId = segmentGroupTypeId;
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
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
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
    public String getSegmentGroupId() {
        return this.segmentGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSegmentGroupTypeId() {
        return this.segmentGroupTypeId;
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
     * @return <code>String</code>
     */
    public String getProductStoreId() {
        return this.productStoreId;
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
     * Auto generated method that gets the related <code>SegmentGroupType</code> by the relation named <code>SegmentGroupType</code>.
     * @return the <code>SegmentGroupType</code>
     * @throws RepositoryException if an error occurs
     */
    public SegmentGroupType getSegmentGroupType() throws RepositoryException {
        if (this.segmentGroupType == null) {
            this.segmentGroupType = getRelatedOne(SegmentGroupType.class, "SegmentGroupType");
        }
        return this.segmentGroupType;
    }
    /**
     * Auto generated method that gets the related <code>ProductStore</code> by the relation named <code>ProductStore</code>.
     * @return the <code>ProductStore</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductStore getProductStore() throws RepositoryException {
        if (this.productStore == null) {
            this.productStore = getRelatedOne(ProductStore.class, "ProductStore");
        }
        return this.productStore;
    }
    /**
     * Auto generated method that gets the related <code>SegmentGroupClassification</code> by the relation named <code>SegmentGroupClassification</code>.
     * @return the list of <code>SegmentGroupClassification</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SegmentGroupClassification> getSegmentGroupClassifications() throws RepositoryException {
        if (this.segmentGroupClassifications == null) {
            this.segmentGroupClassifications = getRelated(SegmentGroupClassification.class, "SegmentGroupClassification");
        }
        return this.segmentGroupClassifications;
    }
    /**
     * Auto generated method that gets the related <code>SegmentGroupGeo</code> by the relation named <code>SegmentGroupGeo</code>.
     * @return the list of <code>SegmentGroupGeo</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SegmentGroupGeo> getSegmentGroupGeos() throws RepositoryException {
        if (this.segmentGroupGeos == null) {
            this.segmentGroupGeos = getRelated(SegmentGroupGeo.class, "SegmentGroupGeo");
        }
        return this.segmentGroupGeos;
    }
    /**
     * Auto generated method that gets the related <code>SegmentGroupRole</code> by the relation named <code>SegmentGroupRole</code>.
     * @return the list of <code>SegmentGroupRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SegmentGroupRole> getSegmentGroupRoles() throws RepositoryException {
        if (this.segmentGroupRoles == null) {
            this.segmentGroupRoles = getRelated(SegmentGroupRole.class, "SegmentGroupRole");
        }
        return this.segmentGroupRoles;
    }

    /**
     * Auto generated value setter.
     * @param segmentGroupType the segmentGroupType to set
    */
    public void setSegmentGroupType(SegmentGroupType segmentGroupType) {
        this.segmentGroupType = segmentGroupType;
    }
    /**
     * Auto generated value setter.
     * @param productStore the productStore to set
    */
    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }
    /**
     * Auto generated value setter.
     * @param segmentGroupClassifications the segmentGroupClassifications to set
    */
    public void setSegmentGroupClassifications(List<SegmentGroupClassification> segmentGroupClassifications) {
        this.segmentGroupClassifications = segmentGroupClassifications;
    }
    /**
     * Auto generated value setter.
     * @param segmentGroupGeos the segmentGroupGeos to set
    */
    public void setSegmentGroupGeos(List<SegmentGroupGeo> segmentGroupGeos) {
        this.segmentGroupGeos = segmentGroupGeos;
    }
    /**
     * Auto generated value setter.
     * @param segmentGroupRoles the segmentGroupRoles to set
    */
    public void setSegmentGroupRoles(List<SegmentGroupRole> segmentGroupRoles) {
        this.segmentGroupRoles = segmentGroupRoles;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addSegmentGroupClassification(SegmentGroupClassification segmentGroupClassification) {
        if (this.segmentGroupClassifications == null) {
            this.segmentGroupClassifications = new ArrayList<SegmentGroupClassification>();
        }
        this.segmentGroupClassifications.add(segmentGroupClassification);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSegmentGroupClassification(SegmentGroupClassification segmentGroupClassification) {
        if (this.segmentGroupClassifications == null) {
            return;
        }
        this.segmentGroupClassifications.remove(segmentGroupClassification);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSegmentGroupClassification() {
        if (this.segmentGroupClassifications == null) {
            return;
        }
        this.segmentGroupClassifications.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addSegmentGroupGeo(SegmentGroupGeo segmentGroupGeo) {
        if (this.segmentGroupGeos == null) {
            this.segmentGroupGeos = new ArrayList<SegmentGroupGeo>();
        }
        this.segmentGroupGeos.add(segmentGroupGeo);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSegmentGroupGeo(SegmentGroupGeo segmentGroupGeo) {
        if (this.segmentGroupGeos == null) {
            return;
        }
        this.segmentGroupGeos.remove(segmentGroupGeo);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSegmentGroupGeo() {
        if (this.segmentGroupGeos == null) {
            return;
        }
        this.segmentGroupGeos.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addSegmentGroupRole(SegmentGroupRole segmentGroupRole) {
        if (this.segmentGroupRoles == null) {
            this.segmentGroupRoles = new ArrayList<SegmentGroupRole>();
        }
        this.segmentGroupRoles.add(segmentGroupRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSegmentGroupRole(SegmentGroupRole segmentGroupRole) {
        if (this.segmentGroupRoles == null) {
            return;
        }
        this.segmentGroupRoles.remove(segmentGroupRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSegmentGroupRole() {
        if (this.segmentGroupRoles == null) {
            return;
        }
        this.segmentGroupRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSegmentGroupId((String) mapValue.get("segmentGroupId"));
        setSegmentGroupTypeId((String) mapValue.get("segmentGroupTypeId"));
        setDescription((String) mapValue.get("description"));
        setProductStoreId((String) mapValue.get("productStoreId"));
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
        mapValue.put("segmentGroupId", getSegmentGroupId());
        mapValue.put("segmentGroupTypeId", getSegmentGroupTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}