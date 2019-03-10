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
 * Auto generated base entity InventoryItemDetail.
 */
@javax.persistence.Entity
@Table(name="INVENTORY_ITEM_DETAIL")
public class InventoryItemDetail extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("inventoryItemId", "INVENTORY_ITEM_ID");
        fields.put("inventoryItemDetailSeqId", "INVENTORY_ITEM_DETAIL_SEQ_ID");
        fields.put("effectiveDate", "EFFECTIVE_DATE");
        fields.put("quantityOnHandDiff", "QUANTITY_ON_HAND_DIFF");
        fields.put("availableToPromiseDiff", "AVAILABLE_TO_PROMISE_DIFF");
        fields.put("unitCost", "UNIT_COST");
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("shipGroupSeqId", "SHIP_GROUP_SEQ_ID");
        fields.put("shipmentId", "SHIPMENT_ID");
        fields.put("shipmentItemSeqId", "SHIPMENT_ITEM_SEQ_ID");
        fields.put("returnId", "RETURN_ID");
        fields.put("returnItemSeqId", "RETURN_ITEM_SEQ_ID");
        fields.put("workEffortId", "WORK_EFFORT_ID");
        fields.put("fixedAssetId", "FIXED_ASSET_ID");
        fields.put("maintHistSeqId", "MAINT_HIST_SEQ_ID");
        fields.put("itemIssuanceId", "ITEM_ISSUANCE_ID");
        fields.put("receiptId", "RECEIPT_ID");
        fields.put("physicalInventoryId", "PHYSICAL_INVENTORY_ID");
        fields.put("reasonEnumId", "REASON_ENUM_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InventoryItemDetail", fields);
}
  public static enum Fields implements EntityFieldInterface<InventoryItemDetail> {
    inventoryItemId("inventoryItemId"),
    inventoryItemDetailSeqId("inventoryItemDetailSeqId"),
    effectiveDate("effectiveDate"),
    quantityOnHandDiff("quantityOnHandDiff"),
    availableToPromiseDiff("availableToPromiseDiff"),
    unitCost("unitCost"),
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    shipGroupSeqId("shipGroupSeqId"),
    shipmentId("shipmentId"),
    shipmentItemSeqId("shipmentItemSeqId"),
    returnId("returnId"),
    returnItemSeqId("returnItemSeqId"),
    workEffortId("workEffortId"),
    fixedAssetId("fixedAssetId"),
    maintHistSeqId("maintHistSeqId"),
    itemIssuanceId("itemIssuanceId"),
    receiptId("receiptId"),
    physicalInventoryId("physicalInventoryId"),
    reasonEnumId("reasonEnumId"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.InventoryItemDetailPkBridge.class)
     private InventoryItemDetailPk id = new InventoryItemDetailPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>InventoryItemDetailPk</code>
     */
      public InventoryItemDetailPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>InventoryItemDetailPk</code> value to set
    */   
      public void setId(InventoryItemDetailPk id) {
         this.id = id;
      }
   @Column(name="EFFECTIVE_DATE")
   private Timestamp effectiveDate;
   @Column(name="QUANTITY_ON_HAND_DIFF")
   private BigDecimal quantityOnHandDiff;
   @Column(name="AVAILABLE_TO_PROMISE_DIFF")
   private BigDecimal availableToPromiseDiff;
   @Column(name="UNIT_COST")
   private BigDecimal unitCost;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="ORDER_ITEM_SEQ_ID")
   private String orderItemSeqId;
   @Column(name="SHIP_GROUP_SEQ_ID")
   private String shipGroupSeqId;
   @Column(name="SHIPMENT_ID")
   private String shipmentId;
   @Column(name="SHIPMENT_ITEM_SEQ_ID")
   private String shipmentItemSeqId;
   @Column(name="RETURN_ID")
   private String returnId;
   @Column(name="RETURN_ITEM_SEQ_ID")
   private String returnItemSeqId;
   @Column(name="WORK_EFFORT_ID")
   private String workEffortId;
   @Column(name="FIXED_ASSET_ID")
   private String fixedAssetId;
   @Column(name="MAINT_HIST_SEQ_ID")
   private String maintHistSeqId;
   @Column(name="ITEM_ISSUANCE_ID")
   private String itemIssuanceId;
   @Column(name="RECEIPT_ID")
   private String receiptId;
   @Column(name="PHYSICAL_INVENTORY_ID")
   private String physicalInventoryId;
   @Column(name="REASON_ENUM_ID")
   private String reasonEnumId;
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
   @JoinColumn(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItem inventoryItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   private transient OrderItemShipGrpInvRes orderItemShipGrpInvRes = null;
   private transient FixedAssetMaint fixedAssetMaint = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ITEM_ISSUANCE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ItemIssuance itemIssuance = null;
   private transient WorkEffortInventoryAssign workEffortInventoryAssign = null;
   private transient WorkEffortInventoryProduced workEffortInventoryProduced = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RECEIPT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ShipmentReceipt shipmentReceipt = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PHYSICAL_INVENTORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PhysicalInventory physicalInventory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REASON_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration reasonEnumeration = null;
   private transient InventoryItemVariance inventoryItemVariance = null;

  /**
   * Default constructor.
   */
  public InventoryItemDetail() {
      super();
      this.baseEntityName = "InventoryItemDetail";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("inventoryItemId");this.primaryKeyNames.add("inventoryItemDetailSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("inventoryItemDetailSeqId");this.allFieldsNames.add("effectiveDate");this.allFieldsNames.add("quantityOnHandDiff");this.allFieldsNames.add("availableToPromiseDiff");this.allFieldsNames.add("unitCost");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("shipmentId");this.allFieldsNames.add("shipmentItemSeqId");this.allFieldsNames.add("returnId");this.allFieldsNames.add("returnItemSeqId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("maintHistSeqId");this.allFieldsNames.add("itemIssuanceId");this.allFieldsNames.add("receiptId");this.allFieldsNames.add("physicalInventoryId");this.allFieldsNames.add("reasonEnumId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InventoryItemDetail(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        id.setInventoryItemId(inventoryItemId);
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemDetailSeqId the inventoryItemDetailSeqId to set
     */
    public void setInventoryItemDetailSeqId(String inventoryItemDetailSeqId) {
        id.setInventoryItemDetailSeqId(inventoryItemDetailSeqId);
    }
    /**
     * Auto generated value setter.
     * @param effectiveDate the effectiveDate to set
     */
    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    /**
     * Auto generated value setter.
     * @param quantityOnHandDiff the quantityOnHandDiff to set
     */
    public void setQuantityOnHandDiff(BigDecimal quantityOnHandDiff) {
        this.quantityOnHandDiff = quantityOnHandDiff;
    }
    /**
     * Auto generated value setter.
     * @param availableToPromiseDiff the availableToPromiseDiff to set
     */
    public void setAvailableToPromiseDiff(BigDecimal availableToPromiseDiff) {
        this.availableToPromiseDiff = availableToPromiseDiff;
    }
    /**
     * Auto generated value setter.
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentItemSeqId the shipmentItemSeqId to set
     */
    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
    /**
     * Auto generated value setter.
     * @param returnItemSeqId the returnItemSeqId to set
     */
    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetId the fixedAssetId to set
     */
    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
    /**
     * Auto generated value setter.
     * @param maintHistSeqId the maintHistSeqId to set
     */
    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }
    /**
     * Auto generated value setter.
     * @param itemIssuanceId the itemIssuanceId to set
     */
    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }
    /**
     * Auto generated value setter.
     * @param receiptId the receiptId to set
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }
    /**
     * Auto generated value setter.
     * @param physicalInventoryId the physicalInventoryId to set
     */
    public void setPhysicalInventoryId(String physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }
    /**
     * Auto generated value setter.
     * @param reasonEnumId the reasonEnumId to set
     */
    public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
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
    public String getInventoryItemId() {
        return this.id.getInventoryItemId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemDetailSeqId() {
        return this.id.getInventoryItemDetailSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEffectiveDate() {
        return this.effectiveDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOnHandDiff() {
        return this.quantityOnHandDiff;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAvailableToPromiseDiff() {
        return this.availableToPromiseDiff;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitCost() {
        return this.unitCost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.orderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipGroupSeqId() {
        return this.shipGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentItemSeqId() {
        return this.shipmentItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnId() {
        return this.returnId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnItemSeqId() {
        return this.returnItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFixedAssetId() {
        return this.fixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMaintHistSeqId() {
        return this.maintHistSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemIssuanceId() {
        return this.itemIssuanceId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReceiptId() {
        return this.receiptId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPhysicalInventoryId() {
        return this.physicalInventoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReasonEnumId() {
        return this.reasonEnumId;
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
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItem getInventoryItem() throws RepositoryException {
        if (this.inventoryItem == null) {
            this.inventoryItem = getRelatedOne(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItem;
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
     * Auto generated method that gets the related <code>OrderItemShipGrpInvRes</code> by the relation named <code>OrderItemShipGrpInvRes</code>.
     * @return the <code>OrderItemShipGrpInvRes</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGrpInvRes getOrderItemShipGrpInvRes() throws RepositoryException {
        if (this.orderItemShipGrpInvRes == null) {
            this.orderItemShipGrpInvRes = getRelatedOne(OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes");
        }
        return this.orderItemShipGrpInvRes;
    }
    /**
     * Auto generated method that gets the related <code>FixedAssetMaint</code> by the relation named <code>FixedAssetMaint</code>.
     * @return the <code>FixedAssetMaint</code>
     * @throws RepositoryException if an error occurs
     */
    public FixedAssetMaint getFixedAssetMaint() throws RepositoryException {
        if (this.fixedAssetMaint == null) {
            this.fixedAssetMaint = getRelatedOne(FixedAssetMaint.class, "FixedAssetMaint");
        }
        return this.fixedAssetMaint;
    }
    /**
     * Auto generated method that gets the related <code>ItemIssuance</code> by the relation named <code>ItemIssuance</code>.
     * @return the <code>ItemIssuance</code>
     * @throws RepositoryException if an error occurs
     */
    public ItemIssuance getItemIssuance() throws RepositoryException {
        if (this.itemIssuance == null) {
            this.itemIssuance = getRelatedOne(ItemIssuance.class, "ItemIssuance");
        }
        return this.itemIssuance;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortInventoryAssign</code> by the relation named <code>WorkEffortInventoryAssign</code>.
     * @return the <code>WorkEffortInventoryAssign</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortInventoryAssign getWorkEffortInventoryAssign() throws RepositoryException {
        if (this.workEffortInventoryAssign == null) {
            this.workEffortInventoryAssign = getRelatedOne(WorkEffortInventoryAssign.class, "WorkEffortInventoryAssign");
        }
        return this.workEffortInventoryAssign;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortInventoryProduced</code> by the relation named <code>WorkEffortInventoryProduced</code>.
     * @return the <code>WorkEffortInventoryProduced</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortInventoryProduced getWorkEffortInventoryProduced() throws RepositoryException {
        if (this.workEffortInventoryProduced == null) {
            this.workEffortInventoryProduced = getRelatedOne(WorkEffortInventoryProduced.class, "WorkEffortInventoryProduced");
        }
        return this.workEffortInventoryProduced;
    }
    /**
     * Auto generated method that gets the related <code>ShipmentReceipt</code> by the relation named <code>ShipmentReceipt</code>.
     * @return the <code>ShipmentReceipt</code>
     * @throws RepositoryException if an error occurs
     */
    public ShipmentReceipt getShipmentReceipt() throws RepositoryException {
        if (this.shipmentReceipt == null) {
            this.shipmentReceipt = getRelatedOne(ShipmentReceipt.class, "ShipmentReceipt");
        }
        return this.shipmentReceipt;
    }
    /**
     * Auto generated method that gets the related <code>PhysicalInventory</code> by the relation named <code>PhysicalInventory</code>.
     * @return the <code>PhysicalInventory</code>
     * @throws RepositoryException if an error occurs
     */
    public PhysicalInventory getPhysicalInventory() throws RepositoryException {
        if (this.physicalInventory == null) {
            this.physicalInventory = getRelatedOne(PhysicalInventory.class, "PhysicalInventory");
        }
        return this.physicalInventory;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>ReasonEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getReasonEnumeration() throws RepositoryException {
        if (this.reasonEnumeration == null) {
            this.reasonEnumeration = getRelatedOne(Enumeration.class, "ReasonEnumeration");
        }
        return this.reasonEnumeration;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemVariance</code> by the relation named <code>InventoryItemVariance</code>.
     * @return the <code>InventoryItemVariance</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItemVariance getInventoryItemVariance() throws RepositoryException {
        if (this.inventoryItemVariance == null) {
            this.inventoryItemVariance = getRelatedOne(InventoryItemVariance.class, "InventoryItemVariance");
        }
        return this.inventoryItemVariance;
    }

    /**
     * Auto generated value setter.
     * @param inventoryItem the inventoryItem to set
    */
    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
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
     * @param orderItemShipGrpInvRes the orderItemShipGrpInvRes to set
    */
    public void setOrderItemShipGrpInvRes(OrderItemShipGrpInvRes orderItemShipGrpInvRes) {
        this.orderItemShipGrpInvRes = orderItemShipGrpInvRes;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetMaint the fixedAssetMaint to set
    */
    public void setFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
        this.fixedAssetMaint = fixedAssetMaint;
    }
    /**
     * Auto generated value setter.
     * @param itemIssuance the itemIssuance to set
    */
    public void setItemIssuance(ItemIssuance itemIssuance) {
        this.itemIssuance = itemIssuance;
    }
    /**
     * Auto generated value setter.
     * @param workEffortInventoryAssign the workEffortInventoryAssign to set
    */
    public void setWorkEffortInventoryAssign(WorkEffortInventoryAssign workEffortInventoryAssign) {
        this.workEffortInventoryAssign = workEffortInventoryAssign;
    }
    /**
     * Auto generated value setter.
     * @param workEffortInventoryProduced the workEffortInventoryProduced to set
    */
    public void setWorkEffortInventoryProduced(WorkEffortInventoryProduced workEffortInventoryProduced) {
        this.workEffortInventoryProduced = workEffortInventoryProduced;
    }
    /**
     * Auto generated value setter.
     * @param shipmentReceipt the shipmentReceipt to set
    */
    public void setShipmentReceipt(ShipmentReceipt shipmentReceipt) {
        this.shipmentReceipt = shipmentReceipt;
    }
    /**
     * Auto generated value setter.
     * @param physicalInventory the physicalInventory to set
    */
    public void setPhysicalInventory(PhysicalInventory physicalInventory) {
        this.physicalInventory = physicalInventory;
    }
    /**
     * Auto generated value setter.
     * @param reasonEnumeration the reasonEnumeration to set
    */
    public void setReasonEnumeration(Enumeration reasonEnumeration) {
        this.reasonEnumeration = reasonEnumeration;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemVariance the inventoryItemVariance to set
    */
    public void setInventoryItemVariance(InventoryItemVariance inventoryItemVariance) {
        this.inventoryItemVariance = inventoryItemVariance;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setInventoryItemDetailSeqId((String) mapValue.get("inventoryItemDetailSeqId"));
        setEffectiveDate((Timestamp) mapValue.get("effectiveDate"));
        setQuantityOnHandDiff(convertToBigDecimal(mapValue.get("quantityOnHandDiff")));
        setAvailableToPromiseDiff(convertToBigDecimal(mapValue.get("availableToPromiseDiff")));
        setUnitCost(convertToBigDecimal(mapValue.get("unitCost")));
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setShipmentId((String) mapValue.get("shipmentId"));
        setShipmentItemSeqId((String) mapValue.get("shipmentItemSeqId"));
        setReturnId((String) mapValue.get("returnId"));
        setReturnItemSeqId((String) mapValue.get("returnItemSeqId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setMaintHistSeqId((String) mapValue.get("maintHistSeqId"));
        setItemIssuanceId((String) mapValue.get("itemIssuanceId"));
        setReceiptId((String) mapValue.get("receiptId"));
        setPhysicalInventoryId((String) mapValue.get("physicalInventoryId"));
        setReasonEnumId((String) mapValue.get("reasonEnumId"));
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
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("inventoryItemDetailSeqId", getInventoryItemDetailSeqId());
        mapValue.put("effectiveDate", getEffectiveDate());
        mapValue.put("quantityOnHandDiff", getQuantityOnHandDiff());
        mapValue.put("availableToPromiseDiff", getAvailableToPromiseDiff());
        mapValue.put("unitCost", getUnitCost());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("shipmentId", getShipmentId());
        mapValue.put("shipmentItemSeqId", getShipmentItemSeqId());
        mapValue.put("returnId", getReturnId());
        mapValue.put("returnItemSeqId", getReturnItemSeqId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("maintHistSeqId", getMaintHistSeqId());
        mapValue.put("itemIssuanceId", getItemIssuanceId());
        mapValue.put("receiptId", getReceiptId());
        mapValue.put("physicalInventoryId", getPhysicalInventoryId());
        mapValue.put("reasonEnumId", getReasonEnumId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
