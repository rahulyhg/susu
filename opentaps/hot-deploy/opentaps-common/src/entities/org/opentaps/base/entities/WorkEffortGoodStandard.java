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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity WorkEffortGoodStandard.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_GOOD_STANDARD")
public class WorkEffortGoodStandard extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortId", "WORK_EFFORT_ID");
        fields.put("productId", "PRODUCT_ID");
        fields.put("workEffortGoodStdTypeId", "WORK_EFFORT_GOOD_STD_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("statusId", "STATUS_ID");
        fields.put("estimatedQuantity", "ESTIMATED_QUANTITY");
        fields.put("estimatedCost", "ESTIMATED_COST");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("minQuantity", "MIN_QUANTITY");
        fields.put("maxQuantity", "MAX_QUANTITY");
fieldMapColumns.put("WorkEffortGoodStandard", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortGoodStandard> {
    workEffortId("workEffortId"),
    productId("productId"),
    workEffortGoodStdTypeId("workEffortGoodStdTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    statusId("statusId"),
    estimatedQuantity("estimatedQuantity"),
    estimatedCost("estimatedCost"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    minQuantity("minQuantity"),
    maxQuantity("maxQuantity");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.WorkEffortGoodStandardPkBridge.class)
     private WorkEffortGoodStandardPk id = new WorkEffortGoodStandardPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkEffortGoodStandardPk</code>
     */
      public WorkEffortGoodStandardPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkEffortGoodStandardPk</code> value to set
    */   
      public void setId(WorkEffortGoodStandardPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="ESTIMATED_QUANTITY")
   private BigDecimal estimatedQuantity;
   @Column(name="ESTIMATED_COST")
   private BigDecimal estimatedCost;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="MIN_QUANTITY")
   private BigDecimal minQuantity;
   @Column(name="MAX_QUANTITY")
   private BigDecimal maxQuantity;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_GOOD_STD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffortGoodStandardType workEffortGoodStandardType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;

  /**
   * Default constructor.
   */
  public WorkEffortGoodStandard() {
      super();
      this.baseEntityName = "WorkEffortGoodStandard";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("productId");this.primaryKeyNames.add("workEffortGoodStdTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("productId");this.allFieldsNames.add("workEffortGoodStdTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("estimatedQuantity");this.allFieldsNames.add("estimatedCost");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("minQuantity");this.allFieldsNames.add("maxQuantity");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortGoodStandard(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        id.setWorkEffortId(workEffortId);
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param workEffortGoodStdTypeId the workEffortGoodStdTypeId to set
     */
    public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        id.setWorkEffortGoodStdTypeId(workEffortGoodStdTypeId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param estimatedQuantity the estimatedQuantity to set
     */
    public void setEstimatedQuantity(BigDecimal estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }
    /**
     * Auto generated value setter.
     * @param estimatedCost the estimatedCost to set
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
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
     * Auto generated value setter.
     * @param minQuantity the minQuantity to set
     */
    public void setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
    }
    /**
     * Auto generated value setter.
     * @param maxQuantity the maxQuantity to set
     */
    public void setMaxQuantity(BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.id.getWorkEffortId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortGoodStdTypeId() {
        return this.id.getWorkEffortGoodStdTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedQuantity() {
        return this.estimatedQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedCost() {
        return this.estimatedCost;
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
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinQuantity() {
        return this.minQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMaxQuantity() {
        return this.maxQuantity;
    }

    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getWorkEffort() throws RepositoryException {
        if (this.workEffort == null) {
            this.workEffort = getRelatedOne(WorkEffort.class, "WorkEffort");
        }
        return this.workEffort;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortGoodStandardType</code> by the relation named <code>WorkEffortGoodStandardType</code>.
     * @return the <code>WorkEffortGoodStandardType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortGoodStandardType getWorkEffortGoodStandardType() throws RepositoryException {
        if (this.workEffortGoodStandardType == null) {
            this.workEffortGoodStandardType = getRelatedOne(WorkEffortGoodStandardType.class, "WorkEffortGoodStandardType");
        }
        return this.workEffortGoodStandardType;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>Product</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProduct() throws RepositoryException {
        if (this.product == null) {
            this.product = getRelatedOne(Product.class, "Product");
        }
        return this.product;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }

    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }
    /**
     * Auto generated value setter.
     * @param workEffortGoodStandardType the workEffortGoodStandardType to set
    */
    public void setWorkEffortGoodStandardType(WorkEffortGoodStandardType workEffortGoodStandardType) {
        this.workEffortGoodStandardType = workEffortGoodStandardType;
    }
    /**
     * Auto generated value setter.
     * @param product the product to set
    */
    public void setProduct(Product product) {
        this.product = product;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setProductId((String) mapValue.get("productId"));
        setWorkEffortGoodStdTypeId((String) mapValue.get("workEffortGoodStdTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setStatusId((String) mapValue.get("statusId"));
        setEstimatedQuantity(convertToBigDecimal(mapValue.get("estimatedQuantity")));
        setEstimatedCost(convertToBigDecimal(mapValue.get("estimatedCost")));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setMinQuantity(convertToBigDecimal(mapValue.get("minQuantity")));
        setMaxQuantity(convertToBigDecimal(mapValue.get("maxQuantity")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("productId", getProductId());
        mapValue.put("workEffortGoodStdTypeId", getWorkEffortGoodStdTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("estimatedQuantity", getEstimatedQuantity());
        mapValue.put("estimatedCost", getEstimatedCost());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("minQuantity", getMinQuantity());
        mapValue.put("maxQuantity", getMaxQuantity());
        return mapValue;
    }


}
