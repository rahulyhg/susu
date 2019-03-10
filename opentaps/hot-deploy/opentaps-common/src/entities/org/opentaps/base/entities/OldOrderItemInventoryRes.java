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
 * Auto generated base entity OldOrderItemInventoryRes.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_INVENTORY_RES")
public class OldOrderItemInventoryRes extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("inventoryItemId", "INVENTORY_ITEM_ID");
        fields.put("reserveOrderEnumId", "RESERVE_ORDER_ENUM_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("quantityNotAvailable", "QUANTITY_NOT_AVAILABLE");
        fields.put("reservedDatetime", "RESERVED_DATETIME");
        fields.put("createdDatetime", "CREATED_DATETIME");
        fields.put("promisedDatetime", "PROMISED_DATETIME");
        fields.put("currentPromisedDate", "CURRENT_PROMISED_DATE");
        fields.put("pickStartDate", "PICK_START_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OldOrderItemInventoryRes", fields);
}
  public static enum Fields implements EntityFieldInterface<OldOrderItemInventoryRes> {
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    inventoryItemId("inventoryItemId"),
    reserveOrderEnumId("reserveOrderEnumId"),
    quantity("quantity"),
    quantityNotAvailable("quantityNotAvailable"),
    reservedDatetime("reservedDatetime"),
    createdDatetime("createdDatetime"),
    promisedDatetime("promisedDatetime"),
    currentPromisedDate("currentPromisedDate"),
    pickStartDate("pickStartDate"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OldOrderItemInventoryResPkBridge.class)
     private OldOrderItemInventoryResPk id = new OldOrderItemInventoryResPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OldOrderItemInventoryResPk</code>
     */
      public OldOrderItemInventoryResPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OldOrderItemInventoryResPk</code> value to set
    */   
      public void setId(OldOrderItemInventoryResPk id) {
         this.id = id;
      }
   @Column(name="RESERVE_ORDER_ENUM_ID")
   private String reserveOrderEnumId;
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="QUANTITY_NOT_AVAILABLE")
   private BigDecimal quantityNotAvailable;
   @Column(name="RESERVED_DATETIME")
   private Timestamp reservedDatetime;
   @Column(name="CREATED_DATETIME")
   private Timestamp createdDatetime;
   @Column(name="PROMISED_DATETIME")
   private Timestamp promisedDatetime;
   @Column(name="CURRENT_PROMISED_DATE")
   private Timestamp currentPromisedDate;
   @Column(name="PICK_START_DATE")
   private Timestamp pickStartDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   private transient OrderItem orderItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItem inventoryItem = null;

  /**
   * Default constructor.
   */
  public OldOrderItemInventoryRes() {
      super();
      this.baseEntityName = "OldOrderItemInventoryRes";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");this.primaryKeyNames.add("inventoryItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("inventoryItemId");this.allFieldsNames.add("reserveOrderEnumId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("quantityNotAvailable");this.allFieldsNames.add("reservedDatetime");this.allFieldsNames.add("createdDatetime");this.allFieldsNames.add("promisedDatetime");this.allFieldsNames.add("currentPromisedDate");this.allFieldsNames.add("pickStartDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OldOrderItemInventoryRes(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        id.setOrderId(orderId);
    }
    /**
     * Auto generated value setter.
     * @param orderItemSeqId the orderItemSeqId to set
     */
    public void setOrderItemSeqId(String orderItemSeqId) {
        id.setOrderItemSeqId(orderItemSeqId);
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
     * @param reserveOrderEnumId the reserveOrderEnumId to set
     */
    public void setReserveOrderEnumId(String reserveOrderEnumId) {
        this.reserveOrderEnumId = reserveOrderEnumId;
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
     * @param quantityNotAvailable the quantityNotAvailable to set
     */
    public void setQuantityNotAvailable(BigDecimal quantityNotAvailable) {
        this.quantityNotAvailable = quantityNotAvailable;
    }
    /**
     * Auto generated value setter.
     * @param reservedDatetime the reservedDatetime to set
     */
    public void setReservedDatetime(Timestamp reservedDatetime) {
        this.reservedDatetime = reservedDatetime;
    }
    /**
     * Auto generated value setter.
     * @param createdDatetime the createdDatetime to set
     */
    public void setCreatedDatetime(Timestamp createdDatetime) {
        this.createdDatetime = createdDatetime;
    }
    /**
     * Auto generated value setter.
     * @param promisedDatetime the promisedDatetime to set
     */
    public void setPromisedDatetime(Timestamp promisedDatetime) {
        this.promisedDatetime = promisedDatetime;
    }
    /**
     * Auto generated value setter.
     * @param currentPromisedDate the currentPromisedDate to set
     */
    public void setCurrentPromisedDate(Timestamp currentPromisedDate) {
        this.currentPromisedDate = currentPromisedDate;
    }
    /**
     * Auto generated value setter.
     * @param pickStartDate the pickStartDate to set
     */
    public void setPickStartDate(Timestamp pickStartDate) {
        this.pickStartDate = pickStartDate;
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
    public String getOrderId() {
        return this.id.getOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemSeqId() {
        return this.id.getOrderItemSeqId();
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
    public String getReserveOrderEnumId() {
        return this.reserveOrderEnumId;
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
    public BigDecimal getQuantityNotAvailable() {
        return this.quantityNotAvailable;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReservedDatetime() {
        return this.reservedDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDatetime() {
        return this.createdDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPromisedDatetime() {
        return this.promisedDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCurrentPromisedDate() {
        return this.currentPromisedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPickStartDate() {
        return this.pickStartDate;
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
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItem getOrderItem() throws RepositoryException {
        if (this.orderItem == null) {
            this.orderItem = getRelatedOne(OrderItem.class, "OrderItem");
        }
        return this.orderItem;
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
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItem the inventoryItem to set
    */
    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        setReserveOrderEnumId((String) mapValue.get("reserveOrderEnumId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setQuantityNotAvailable(convertToBigDecimal(mapValue.get("quantityNotAvailable")));
        setReservedDatetime((Timestamp) mapValue.get("reservedDatetime"));
        setCreatedDatetime((Timestamp) mapValue.get("createdDatetime"));
        setPromisedDatetime((Timestamp) mapValue.get("promisedDatetime"));
        setCurrentPromisedDate((Timestamp) mapValue.get("currentPromisedDate"));
        setPickStartDate((Timestamp) mapValue.get("pickStartDate"));
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
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        mapValue.put("reserveOrderEnumId", getReserveOrderEnumId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("quantityNotAvailable", getQuantityNotAvailable());
        mapValue.put("reservedDatetime", getReservedDatetime());
        mapValue.put("createdDatetime", getCreatedDatetime());
        mapValue.put("promisedDatetime", getPromisedDatetime());
        mapValue.put("currentPromisedDate", getCurrentPromisedDate());
        mapValue.put("pickStartDate", getPickStartDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
