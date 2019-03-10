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
 * Auto generated base entity OrderItemGroup.
 */
@javax.persistence.Entity
@Table(name="ORDER_ITEM_GROUP")
public class OrderItemGroup extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("orderItemGroupSeqId", "ORDER_ITEM_GROUP_SEQ_ID");
        fields.put("parentGroupSeqId", "PARENT_GROUP_SEQ_ID");
        fields.put("groupName", "GROUP_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OrderItemGroup", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemGroup> {
    orderId("orderId"),
    orderItemGroupSeqId("orderItemGroupSeqId"),
    parentGroupSeqId("parentGroupSeqId"),
    groupName("groupName"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OrderItemGroupPkBridge.class)
     private OrderItemGroupPk id = new OrderItemGroupPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OrderItemGroupPk</code>
     */
      public OrderItemGroupPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OrderItemGroupPk</code> value to set
    */   
      public void setId(OrderItemGroupPk id) {
         this.id = id;
      }
   @Column(name="PARENT_GROUP_SEQ_ID")
   private String parentGroupSeqId;
   @Column(name="GROUP_NAME")
   private String groupName;
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
   private transient OrderItemGroup parentOrderItemGroup = null;
   private transient List<OrderItem> orderItems = null;
   private transient List<OrderItemGroup> childOrderItemGroups = null;

  /**
   * Default constructor.
   */
  public OrderItemGroup() {
      super();
      this.baseEntityName = "OrderItemGroup";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemGroupSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderItemGroupSeqId");this.allFieldsNames.add("parentGroupSeqId");this.allFieldsNames.add("groupName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemGroup(RepositoryInterface repository) {
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
     * @param orderItemGroupSeqId the orderItemGroupSeqId to set
     */
    public void setOrderItemGroupSeqId(String orderItemGroupSeqId) {
        id.setOrderItemGroupSeqId(orderItemGroupSeqId);
    }
    /**
     * Auto generated value setter.
     * @param parentGroupSeqId the parentGroupSeqId to set
     */
    public void setParentGroupSeqId(String parentGroupSeqId) {
        this.parentGroupSeqId = parentGroupSeqId;
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
    public String getOrderItemGroupSeqId() {
        return this.id.getOrderItemGroupSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentGroupSeqId() {
        return this.parentGroupSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
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
     * Auto generated method that gets the related <code>OrderItemGroup</code> by the relation named <code>ParentOrderItemGroup</code>.
     * @return the <code>OrderItemGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderItemGroup getParentOrderItemGroup() throws RepositoryException {
        if (this.parentOrderItemGroup == null) {
            this.parentOrderItemGroup = getRelatedOne(OrderItemGroup.class, "ParentOrderItemGroup");
        }
        return this.parentOrderItemGroup;
    }
    /**
     * Auto generated method that gets the related <code>OrderItem</code> by the relation named <code>OrderItem</code>.
     * @return the list of <code>OrderItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItem> getOrderItems() throws RepositoryException {
        if (this.orderItems == null) {
            this.orderItems = getRelated(OrderItem.class, "OrderItem");
        }
        return this.orderItems;
    }
    /**
     * Auto generated method that gets the related <code>OrderItemGroup</code> by the relation named <code>ChildOrderItemGroup</code>.
     * @return the list of <code>OrderItemGroup</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderItemGroup> getChildOrderItemGroups() throws RepositoryException {
        if (this.childOrderItemGroups == null) {
            this.childOrderItemGroups = getRelated(OrderItemGroup.class, "ChildOrderItemGroup");
        }
        return this.childOrderItemGroups;
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
     * @param parentOrderItemGroup the parentOrderItemGroup to set
    */
    public void setParentOrderItemGroup(OrderItemGroup parentOrderItemGroup) {
        this.parentOrderItemGroup = parentOrderItemGroup;
    }
    /**
     * Auto generated value setter.
     * @param orderItems the orderItems to set
    */
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    /**
     * Auto generated value setter.
     * @param childOrderItemGroups the childOrderItemGroups to set
    */
    public void setChildOrderItemGroups(List<OrderItemGroup> childOrderItemGroups) {
        this.childOrderItemGroups = childOrderItemGroups;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setOrderItemGroupSeqId((String) mapValue.get("orderItemGroupSeqId"));
        setParentGroupSeqId((String) mapValue.get("parentGroupSeqId"));
        setGroupName((String) mapValue.get("groupName"));
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
        mapValue.put("orderItemGroupSeqId", getOrderItemGroupSeqId());
        mapValue.put("parentGroupSeqId", getParentGroupSeqId());
        mapValue.put("groupName", getGroupName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
