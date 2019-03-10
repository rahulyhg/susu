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
 * Auto generated base entity OrderItemShipGroupAssoc.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_SHIP_GROUP_ASSOC")
public class OrderItemShipGroupAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemSeqId", "ORDER_ITEM_SEQ_ID");
        fields.put("shipGroupSeqId", "SHIP_GROUP_SEQ_ID");
        fields.put("quantity", "QUANTITY");
        fields.put("cancelQuantity", "CANCEL_QUANTITY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderItemShipGroupAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemShipGroupAssoc> {
    orderId("orderId"),
    orderItemSeqId("orderItemSeqId"),
    shipGroupSeqId("shipGroupSeqId"),
    quantity("quantity"),
    cancelQuantity("cancelQuantity"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OrderItemShipGroupAssocPkBridge.class)
     private OrderItemShipGroupAssocPk id = new OrderItemShipGroupAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderItemShipGroupAssocPk</code>
     */
      public OrderItemShipGroupAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderItemShipGroupAssocPk</code> value to set
    */   
      public void setId(OrderItemShipGroupAssocPk id) {
         this.id = id;
      }
   @Column(name="QUANTITY")
   private BigDecimal quantity;
   @Column(name="CANCEL_QUANTITY")
   private BigDecimal cancelQuantity;
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
   private transient OrderItemShipGroup orderItemShipGroup = null;
   private transient List<OrderAdjustment> orderAdjustments = null;
   private transient List<OrderItemAssoc> fromOrderItemAssocs = null;
   private transient List<OrderItemAssoc> toOrderItemAssocs = null;
   private transient List<OrderItemShipGrpInvRes> orderItemShipGrpInvReses = null;

  /**
   * Default constructor.
   */
  public OrderItemShipGroupAssoc() {
      super();
      this.baseEntityName = "OrderItemShipGroupAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");this.primaryKeyNames.add("shipGroupSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("shipGroupSeqId");this.allFieldsNames.add("quantity");this.allFieldsNames.add("cancelQuantity");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemShipGroupAssoc(RepositoryInterface repository) {
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
     * @param shipGroupSeqId the shipGroupSeqId to set
     */
    public void setShipGroupSeqId(String shipGroupSeqId) {
        id.setShipGroupSeqId(shipGroupSeqId);
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
     * @param cancelQuantity the cancelQuantity to set
     */
    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
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
    public String getShipGroupSeqId() {
        return this.id.getShipGroupSeqId();
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
    public BigDecimal getCancelQuantity() {
        return this.cancelQuantity;
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
     * Auto generated method that gets the related <code>OrderItemShipGroup</code> by the relation named <code>OrderItemShipGroup</code>.
     * @return the <code>OrderItemShipGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemShipGroup getOrderItemShipGroup() throws RepositoryException {
        if (this.orderItemShipGroup == null) {
            this.orderItemShipGroup = getRelatedOne(OrderItemShipGroup.class, "OrderItemShipGroup");
        }
        return this.orderItemShipGroup;
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
     * Auto generated method that gets the related <code>OrderItemAssoc</code> by the relation named <code>FromOrderItemAssoc</code>.
     * @return the list of <code>OrderItemAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemAssoc> getFromOrderItemAssocs() throws RepositoryException {
        if (this.fromOrderItemAssocs == null) {
            this.fromOrderItemAssocs = getRelated(OrderItemAssoc.class, "FromOrderItemAssoc");
        }
        return this.fromOrderItemAssocs;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemAssoc</code> by the relation named <code>ToOrderItemAssoc</code>.
     * @return the list of <code>OrderItemAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemAssoc> getToOrderItemAssocs() throws RepositoryException {
        if (this.toOrderItemAssocs == null) {
            this.toOrderItemAssocs = getRelated(OrderItemAssoc.class, "ToOrderItemAssoc");
        }
        return this.toOrderItemAssocs;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemShipGrpInvRes</code> by the relation named <code>OrderItemShipGrpInvRes</code>.
     * @return the list of <code>OrderItemShipGrpInvRes</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemShipGrpInvRes> getOrderItemShipGrpInvReses() throws RepositoryException {
        if (this.orderItemShipGrpInvReses == null) {
            this.orderItemShipGrpInvReses = getRelated(OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes");
        }
        return this.orderItemShipGrpInvReses;
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
     * @param orderItemShipGroup the orderItemShipGroup to set
    */
    public void setOrderItemShipGroup(OrderItemShipGroup orderItemShipGroup) {
        this.orderItemShipGroup = orderItemShipGroup;
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
     * @param fromOrderItemAssocs the fromOrderItemAssocs to set
    */
    public void setFromOrderItemAssocs(List<OrderItemAssoc> fromOrderItemAssocs) {
        this.fromOrderItemAssocs = fromOrderItemAssocs;
    }
    /**
     * Auto generated value setter.
     * @param toOrderItemAssocs the toOrderItemAssocs to set
    */
    public void setToOrderItemAssocs(List<OrderItemAssoc> toOrderItemAssocs) {
        this.toOrderItemAssocs = toOrderItemAssocs;
    }
    /**
     * Auto generated value setter.
     * @param orderItemShipGrpInvReses the orderItemShipGrpInvReses to set
    */
    public void setOrderItemShipGrpInvReses(List<OrderItemShipGrpInvRes> orderItemShipGrpInvReses) {
        this.orderItemShipGrpInvReses = orderItemShipGrpInvReses;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setCancelQuantity(convertToBigDecimal(mapValue.get("cancelQuantity")));
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
        mapValue.put("shipGroupSeqId", getShipGroupSeqId());
        mapValue.put("quantity", getQuantity());
        mapValue.put("cancelQuantity", getCancelQuantity());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
