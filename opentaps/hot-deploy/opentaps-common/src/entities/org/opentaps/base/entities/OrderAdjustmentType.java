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
 * Auto generated base entity OrderAdjustmentType.
 */
@javax.persistence.Entity
@Table(name="ORDER_ADJUSTMENT_TYPE")
public class OrderAdjustmentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderAdjustmentTypeId", "ORDER_ADJUSTMENT_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderAdjustmentType", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderAdjustmentType> {
    orderAdjustmentTypeId("orderAdjustmentTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="OrderAdjustmentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="OrderAdjustmentType_GEN")
   @Id
   @Column(name="ORDER_ADJUSTMENT_TYPE_ID")
   private String orderAdjustmentTypeId;
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
   
   private OrderAdjustmentType parentOrderAdjustmentType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="orderAdjustmentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ORDER_ADJUSTMENT_TYPE_ID")
   
   private List<OrderAdjustment> orderAdjustments = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentOrderAdjustmentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<OrderAdjustmentType> childOrderAdjustmentTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="orderAdjustmentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="ORDER_ADJUSTMENT_TYPE_ID")
   
   private List<OrderAdjustmentTypeAttr> orderAdjustmentTypeAttrs = null;
   private transient List<ProductPromoAction> productPromoActions = null;
   private transient List<QuoteAdjustment> quoteAdjustments = null;

  /**
   * Default constructor.
   */
  public OrderAdjustmentType() {
      super();
      this.baseEntityName = "OrderAdjustmentType";
      this.isView = false;
      this.resourceName = "OrderEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderAdjustmentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderAdjustmentTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderAdjustmentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderAdjustmentTypeId the orderAdjustmentTypeId to set
     */
    public void setOrderAdjustmentTypeId(String orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId;
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
    public String getOrderAdjustmentTypeId() {
        return this.orderAdjustmentTypeId;
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
     * Auto generated method that gets the related <code>OrderAdjustmentType</code> by the relation named <code>ParentOrderAdjustmentType</code>.
     * @return the <code>OrderAdjustmentType</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderAdjustmentType getParentOrderAdjustmentType() throws RepositoryException {
        if (this.parentOrderAdjustmentType == null) {
            this.parentOrderAdjustmentType = getRelatedOne(OrderAdjustmentType.class, "ParentOrderAdjustmentType");
        }
        return this.parentOrderAdjustmentType;
    }
    /**
     * Auto generated method that gets the related <code>OrderAdjustment</code> by the relation named <code>OrderAdjustment</code>.
     * @return the list of <code>OrderAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustment> getOrderAdjustments() throws RepositoryException {
        if (this.orderAdjustments == null) {
            this.orderAdjustments = getRelated(OrderAdjustment.class, "OrderAdjustment");
        }
        return this.orderAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>OrderAdjustmentType</code> by the relation named <code>ChildOrderAdjustmentType</code>.
     * @return the list of <code>OrderAdjustmentType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustmentType> getChildOrderAdjustmentTypes() throws RepositoryException {
        if (this.childOrderAdjustmentTypes == null) {
            this.childOrderAdjustmentTypes = getRelated(OrderAdjustmentType.class, "ChildOrderAdjustmentType");
        }
        return this.childOrderAdjustmentTypes;
    }
    /**
     * Auto generated method that gets the related <code>OrderAdjustmentTypeAttr</code> by the relation named <code>OrderAdjustmentTypeAttr</code>.
     * @return the list of <code>OrderAdjustmentTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustmentTypeAttr> getOrderAdjustmentTypeAttrs() throws RepositoryException {
        if (this.orderAdjustmentTypeAttrs == null) {
            this.orderAdjustmentTypeAttrs = getRelated(OrderAdjustmentTypeAttr.class, "OrderAdjustmentTypeAttr");
        }
        return this.orderAdjustmentTypeAttrs;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoAction</code> by the relation named <code>ProductPromoAction</code>.
     * @return the list of <code>ProductPromoAction</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPromoAction> getProductPromoActions() throws RepositoryException {
        if (this.productPromoActions == null) {
            this.productPromoActions = getRelated(ProductPromoAction.class, "ProductPromoAction");
        }
        return this.productPromoActions;
    }
    /**
     * Auto generated method that gets the related <code>QuoteAdjustment</code> by the relation named <code>QuoteAdjustment</code>.
     * @return the list of <code>QuoteAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends QuoteAdjustment> getQuoteAdjustments() throws RepositoryException {
        if (this.quoteAdjustments == null) {
            this.quoteAdjustments = getRelated(QuoteAdjustment.class, "QuoteAdjustment");
        }
        return this.quoteAdjustments;
    }

    /**
     * Auto generated value setter.
     * @param parentOrderAdjustmentType the parentOrderAdjustmentType to set
    */
    public void setParentOrderAdjustmentType(OrderAdjustmentType parentOrderAdjustmentType) {
        this.parentOrderAdjustmentType = parentOrderAdjustmentType;
    }
    /**
     * Auto generated value setter.
     * @param orderAdjustments the orderAdjustments to set
    */
    public void setOrderAdjustments(List<OrderAdjustment> orderAdjustments) {
        this.orderAdjustments = orderAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param childOrderAdjustmentTypes the childOrderAdjustmentTypes to set
    */
    public void setChildOrderAdjustmentTypes(List<OrderAdjustmentType> childOrderAdjustmentTypes) {
        this.childOrderAdjustmentTypes = childOrderAdjustmentTypes;
    }
    /**
     * Auto generated value setter.
     * @param orderAdjustmentTypeAttrs the orderAdjustmentTypeAttrs to set
    */
    public void setOrderAdjustmentTypeAttrs(List<OrderAdjustmentTypeAttr> orderAdjustmentTypeAttrs) {
        this.orderAdjustmentTypeAttrs = orderAdjustmentTypeAttrs;
    }
    /**
     * Auto generated value setter.
     * @param productPromoActions the productPromoActions to set
    */
    public void setProductPromoActions(List<ProductPromoAction> productPromoActions) {
        this.productPromoActions = productPromoActions;
    }
    /**
     * Auto generated value setter.
     * @param quoteAdjustments the quoteAdjustments to set
    */
    public void setQuoteAdjustments(List<QuoteAdjustment> quoteAdjustments) {
        this.quoteAdjustments = quoteAdjustments;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addOrderAdjustmentTypeAttr(OrderAdjustmentTypeAttr orderAdjustmentTypeAttr) {
        if (this.orderAdjustmentTypeAttrs == null) {
            this.orderAdjustmentTypeAttrs = new ArrayList<OrderAdjustmentTypeAttr>();
        }
        this.orderAdjustmentTypeAttrs.add(orderAdjustmentTypeAttr);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeOrderAdjustmentTypeAttr(OrderAdjustmentTypeAttr orderAdjustmentTypeAttr) {
        if (this.orderAdjustmentTypeAttrs == null) {
            return;
        }
        this.orderAdjustmentTypeAttrs.remove(orderAdjustmentTypeAttr);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearOrderAdjustmentTypeAttr() {
        if (this.orderAdjustmentTypeAttrs == null) {
            return;
        }
        this.orderAdjustmentTypeAttrs.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderAdjustmentTypeId((String) mapValue.get("orderAdjustmentTypeId"));
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
        mapValue.put("orderAdjustmentTypeId", getOrderAdjustmentTypeId());
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
