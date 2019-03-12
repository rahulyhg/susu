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
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity ProductAssoc.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_ASSOC")
public class ProductAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("productIdTo", "PRODUCT_ID_TO");
        fields.put("productAssocTypeId", "PRODUCT_ASSOC_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("reason", "REASON");
        fields.put("quantity", "QUANTITY");
        fields.put("scrapFactor", "SCRAP_FACTOR");
        fields.put("instruction", "INSTRUCTION");
        fields.put("routingWorkEffortId", "ROUTING_WORK_EFFORT_ID");
        fields.put("estimateCalcMethod", "ESTIMATE_CALC_METHOD");
        fields.put("recurrenceInfoId", "RECURRENCE_INFO_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
        fields.put("specificRoutingWorkEffortId", "SPEC_ROU_WEFF_ID");
fieldMapColumns.put("ProductAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductAssoc> {
    productId("productId"),
    productIdTo("productIdTo"),
    productAssocTypeId("productAssocTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
    reason("reason"),
    quantity("quantity"),
    scrapFactor("scrapFactor"),
    instruction("instruction"),
    routingWorkEffortId("routingWorkEffortId"),
    estimateCalcMethod("estimateCalcMethod"),
    recurrenceInfoId("recurrenceInfoId"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp"),
    specificRoutingWorkEffortId("specificRoutingWorkEffortId");
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductAssocPkBridge.class)
     private ProductAssocPk id = new ProductAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductAssocPk</code>
     */
      public ProductAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductAssocPk</code> value to set
    */   
      public void setId(ProductAssocPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="REASON")
   private String reason;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="SCRAP_FACTOR")
   private BigDecimal scrapFactor;
   @Column(name="INSTRUCTION")
   private String instruction;
   @Column(name="ROUTING_WORK_EFFORT_ID")
   private String routingWorkEffortId;
   @Column(name="ESTIMATE_CALC_METHOD")
   private String estimateCalcMethod;
   @Column(name="RECURRENCE_INFO_ID")
   private String recurrenceInfoId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @Column(name="SPEC_ROU_WEFF_ID")
   private String specificRoutingWorkEffortId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ASSOC_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductAssocType productAssocType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product mainProduct = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product assocProduct = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROUTING_WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort routingWorkEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ESTIMATE_CALC_METHOD", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustomMethod customMethod = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RECURRENCE_INFO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RecurrenceInfo recurrenceInfo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SPEC_ROU_WEFF_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;

  /**
   * Default constructor.
   */
  public ProductAssoc() {
      super();
      this.baseEntityName = "ProductAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("productIdTo");this.primaryKeyNames.add("productAssocTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("productIdTo");this.allFieldsNames.add("productAssocTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("reason");this.allFieldsNames.add("quantity");this.allFieldsNames.add("scrapFactor");this.allFieldsNames.add("instruction");this.allFieldsNames.add("routingWorkEffortId");this.allFieldsNames.add("estimateCalcMethod");this.allFieldsNames.add("recurrenceInfoId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");this.allFieldsNames.add("specificRoutingWorkEffortId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param productIdTo the productIdTo to set
     */
    public void setProductIdTo(String productIdTo) {
        id.setProductIdTo(productIdTo);
    }
    /**
     * Auto generated value setter.
     * @param productAssocTypeId the productAssocTypeId to set
     */
    public void setProductAssocTypeId(String productAssocTypeId) {
        id.setProductAssocTypeId(productAssocTypeId);
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * Auto generated value setter.
     * @param scrapFactor the scrapFactor to set
     */
    public void setScrapFactor(BigDecimal scrapFactor) {
        this.scrapFactor = scrapFactor;
    }
    /**
     * Auto generated value setter.
     * @param instruction the instruction to set
     */
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    /**
     * Auto generated value setter.
     * @param routingWorkEffortId the routingWorkEffortId to set
     */
    public void setRoutingWorkEffortId(String routingWorkEffortId) {
        this.routingWorkEffortId = routingWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * @param estimateCalcMethod the estimateCalcMethod to set
     */
    public void setEstimateCalcMethod(String estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod;
    }
    /**
     * Auto generated value setter.
     * @param recurrenceInfoId the recurrenceInfoId to set
     */
    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
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
     * @param specificRoutingWorkEffortId the specificRoutingWorkEffortId to set
     */
    public void setSpecificRoutingWorkEffortId(String specificRoutingWorkEffortId) {
        this.specificRoutingWorkEffortId = specificRoutingWorkEffortId;
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
    public String getProductIdTo() {
        return this.id.getProductIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductAssocTypeId() {
        return this.id.getProductAssocTypeId();
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReason() {
        return this.reason;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getScrapFactor() {
        return this.scrapFactor;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInstruction() {
        return this.instruction;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoutingWorkEffortId() {
        return this.routingWorkEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEstimateCalcMethod() {
        return this.estimateCalcMethod;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRecurrenceInfoId() {
        return this.recurrenceInfoId;
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
     * @return <code>String</code>
     */
    public String getSpecificRoutingWorkEffortId() {
        return this.specificRoutingWorkEffortId;
    }

    /**
     * Auto generated method that gets the related <code>ProductAssocType</code> by the relation named <code>ProductAssocType</code>.
     * @return the <code>ProductAssocType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductAssocType getProductAssocType() throws RepositoryException {
        if (this.productAssocType == null) {
            this.productAssocType = getRelatedOne(ProductAssocType.class, "ProductAssocType");
        }
        return this.productAssocType;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>MainProduct</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getMainProduct() throws RepositoryException {
        if (this.mainProduct == null) {
            this.mainProduct = getRelatedOne(Product.class, "MainProduct");
        }
        return this.mainProduct;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>AssocProduct</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getAssocProduct() throws RepositoryException {
        if (this.assocProduct == null) {
            this.assocProduct = getRelatedOne(Product.class, "AssocProduct");
        }
        return this.assocProduct;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>RoutingWorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getRoutingWorkEffort() throws RepositoryException {
        if (this.routingWorkEffort == null) {
            this.routingWorkEffort = getRelatedOne(WorkEffort.class, "RoutingWorkEffort");
        }
        return this.routingWorkEffort;
    }
    /**
     * Auto generated method that gets the related <code>CustomMethod</code> by the relation named <code>CustomMethod</code>.
     * @return the <code>CustomMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public CustomMethod getCustomMethod() throws RepositoryException {
        if (this.customMethod == null) {
            this.customMethod = getRelatedOne(CustomMethod.class, "CustomMethod");
        }
        return this.customMethod;
    }
    /**
     * Auto generated method that gets the related <code>RecurrenceInfo</code> by the relation named <code>RecurrenceInfo</code>.
     * @return the <code>RecurrenceInfo</code>
     * @throws RepositoryException if an error occurs
     */
    public RecurrenceInfo getRecurrenceInfo() throws RepositoryException {
        if (this.recurrenceInfo == null) {
            this.recurrenceInfo = getRelatedOne(RecurrenceInfo.class, "RecurrenceInfo");
        }
        return this.recurrenceInfo;
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
     * Auto generated value setter.
     * @param productAssocType the productAssocType to set
    */
    public void setProductAssocType(ProductAssocType productAssocType) {
        this.productAssocType = productAssocType;
    }
    /**
     * Auto generated value setter.
     * @param mainProduct the mainProduct to set
    */
    public void setMainProduct(Product mainProduct) {
        this.mainProduct = mainProduct;
    }
    /**
     * Auto generated value setter.
     * @param assocProduct the assocProduct to set
    */
    public void setAssocProduct(Product assocProduct) {
        this.assocProduct = assocProduct;
    }
    /**
     * Auto generated value setter.
     * @param routingWorkEffort the routingWorkEffort to set
    */
    public void setRoutingWorkEffort(WorkEffort routingWorkEffort) {
        this.routingWorkEffort = routingWorkEffort;
    }
    /**
     * Auto generated value setter.
     * @param customMethod the customMethod to set
    */
    public void setCustomMethod(CustomMethod customMethod) {
        this.customMethod = customMethod;
    }
    /**
     * Auto generated value setter.
     * @param recurrenceInfo the recurrenceInfo to set
    */
    public void setRecurrenceInfo(RecurrenceInfo recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
    }
    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setProductIdTo((String) mapValue.get("productIdTo"));
        setProductAssocTypeId((String) mapValue.get("productAssocTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setReason((String) mapValue.get("reason"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setScrapFactor(convertToBigDecimal(mapValue.get("scrapFactor")));
        setInstruction((String) mapValue.get("instruction"));
        setRoutingWorkEffortId((String) mapValue.get("routingWorkEffortId"));
        setEstimateCalcMethod((String) mapValue.get("estimateCalcMethod"));
        setRecurrenceInfoId((String) mapValue.get("recurrenceInfoId"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        setSpecificRoutingWorkEffortId((String) mapValue.get("specificRoutingWorkEffortId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("productIdTo", getProductIdTo());
        mapValue.put("productAssocTypeId", getProductAssocTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("reason", getReason());
        mapValue.put("quantity", getQuantity());
        mapValue.put("scrapFactor", getScrapFactor());
        mapValue.put("instruction", getInstruction());
        mapValue.put("routingWorkEffortId", getRoutingWorkEffortId());
        mapValue.put("estimateCalcMethod", getEstimateCalcMethod());
        mapValue.put("recurrenceInfoId", getRecurrenceInfoId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        mapValue.put("specificRoutingWorkEffortId", getSpecificRoutingWorkEffortId());
        return mapValue;
    }


}