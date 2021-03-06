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
 * Auto generated base entity OrderItemQuantityReportGroupByItem.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectOrderItemQuantityReportGroupByItems", query="SELECT OH.PRODUCT_STORE_ID AS \"productStoreId\",OH.ORDER_ID AS \"orderId\",OH.ORDER_TYPE_ID AS \"orderTypeId\",OH.STATUS_ID AS \"statusId\",OH.ORDER_DATE AS \"orderDate\",OI.ORDER_ITEM_SEQ_ID AS \"orderItemSeqId\",OI.STATUS_ID AS \"statusId\",OI.PRODUCT_ID AS \"productId\",OI.ITEM_DESCRIPTION AS \"itemDescription\",OI.SHIP_BEFORE_DATE AS \"shipBeforeDate\",OI.SHIP_AFTER_DATE AS \"shipAfterDate\",OI.QUANTITY_ORDERED AS \"quantityOrdered\",II.QUANTITY AS \"quantity\",OI.QUANTITY_OPEN AS \"quantityOpen\" FROM ORDER_HEADER OH INNER JOIN ORDER_ITEM OI ON OI.ORDER_ID = OH.ORDER_ID LEFT JOIN ITEM_ISSUANCE II ON OI.ORDER_ID = II.ORDER_ID AND OI.ORDER_ITEM_SEQ_ID = II.ORDER_ITEM_SEQ_ID", resultSetMapping="OrderItemQuantityReportGroupByItemMapping")
@SqlResultSetMapping(name="OrderItemQuantityReportGroupByItemMapping", entities={
@EntityResult(entityClass=OrderItemQuantityReportGroupByItem.class, fields = {
@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderTypeId", column="orderTypeId")
,@FieldResult(name="orderStatusId", column="orderStatusId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="orderItemSeqId", column="orderItemSeqId")
,@FieldResult(name="orderItemStatusId", column="orderItemStatusId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="itemDescription", column="itemDescription")
,@FieldResult(name="shipBeforeDate", column="shipBeforeDate")
,@FieldResult(name="shipAfterDate", column="shipAfterDate")
,@FieldResult(name="quantityOrdered", column="quantityOrdered")
,@FieldResult(name="quantityIssued", column="quantityIssued")
,@FieldResult(name="quantityOpen", column="quantityOpen")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class OrderItemQuantityReportGroupByItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productStoreId", "OH.PRODUCT_STORE_ID");
        fields.put("orderId", "OH.ORDER_ID");
        fields.put("orderTypeId", "OH.ORDER_TYPE_ID");
        fields.put("orderStatusId", "OH.STATUS_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("orderItemSeqId", "OI.ORDER_ITEM_SEQ_ID");
        fields.put("orderItemStatusId", "OI.STATUS_ID");
        fields.put("productId", "OI.PRODUCT_ID");
        fields.put("itemDescription", "OI.ITEM_DESCRIPTION");
        fields.put("shipBeforeDate", "OI.SHIP_BEFORE_DATE");
        fields.put("shipAfterDate", "OI.SHIP_AFTER_DATE");
        fields.put("quantityOrdered", "OI.QUANTITY_ORDERED");
        fields.put("quantityIssued", "II.QUANTITY");
        fields.put("quantityOpen", "OI.QUANTITY_OPEN");
fieldMapColumns.put("OrderItemQuantityReportGroupByItem", fields);
}
  public static enum Fields implements EntityFieldInterface<OrderItemQuantityReportGroupByItem> {
    productStoreId("productStoreId"),
    orderId("orderId"),
    orderTypeId("orderTypeId"),
    orderStatusId("orderStatusId"),
    orderDate("orderDate"),
    orderItemSeqId("orderItemSeqId"),
    orderItemStatusId("orderItemStatusId"),
    productId("productId"),
    itemDescription("itemDescription"),
    shipBeforeDate("shipBeforeDate"),
    shipAfterDate("shipAfterDate"),
    quantityOrdered("quantityOrdered"),
    quantityIssued("quantityIssued"),
    quantityOpen("quantityOpen");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String productStoreId;
    @Id
   private String orderId;
    
   private String orderTypeId;
    
   private String orderStatusId;
    
   private Timestamp orderDate;
    
   private String orderItemSeqId;
    
   private String orderItemStatusId;
    
   private String productId;
    
   private String itemDescription;
    
   private Timestamp shipBeforeDate;
    
   private Timestamp shipAfterDate;
    
   private BigDecimal quantityOrdered;
    
   private BigDecimal quantityIssued;
    
   private BigDecimal quantityOpen;
   private transient OrderItem orderItem = null;

  /**
   * Default constructor.
   */
  public OrderItemQuantityReportGroupByItem() {
      super();
      this.baseEntityName = "OrderItemQuantityReportGroupByItem";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("orderItemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderTypeId");this.allFieldsNames.add("orderStatusId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("orderItemSeqId");this.allFieldsNames.add("orderItemStatusId");this.allFieldsNames.add("productId");this.allFieldsNames.add("itemDescription");this.allFieldsNames.add("shipBeforeDate");this.allFieldsNames.add("shipAfterDate");this.allFieldsNames.add("quantityOrdered");this.allFieldsNames.add("quantityIssued");this.allFieldsNames.add("quantityOpen");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OrderItemQuantityReportGroupByItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
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
     * @param orderTypeId the orderTypeId to set
     */
    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
    /**
     * Auto generated value setter.
     * @param orderStatusId the orderStatusId to set
     */
    public void setOrderStatusId(String orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
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
     * @param orderItemStatusId the orderItemStatusId to set
     */
    public void setOrderItemStatusId(String orderItemStatusId) {
        this.orderItemStatusId = orderItemStatusId;
    }
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    /**
     * Auto generated value setter.
     * @param shipBeforeDate the shipBeforeDate to set
     */
    public void setShipBeforeDate(Timestamp shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }
    /**
     * Auto generated value setter.
     * @param shipAfterDate the shipAfterDate to set
     */
    public void setShipAfterDate(Timestamp shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }
    /**
     * Auto generated value setter.
     * @param quantityOrdered the quantityOrdered to set
     */
    public void setQuantityOrdered(BigDecimal quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }
    /**
     * Auto generated value setter.
     * @param quantityIssued the quantityIssued to set
     */
    public void setQuantityIssued(BigDecimal quantityIssued) {
        this.quantityIssued = quantityIssued;
    }
    /**
     * Auto generated value setter.
     * @param quantityOpen the quantityOpen to set
     */
    public void setQuantityOpen(BigDecimal quantityOpen) {
        this.quantityOpen = quantityOpen;
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
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderTypeId() {
        return this.orderTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderStatusId() {
        return this.orderStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
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
    public String getOrderItemStatusId() {
        return this.orderItemStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemDescription() {
        return this.itemDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getShipBeforeDate() {
        return this.shipBeforeDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getShipAfterDate() {
        return this.shipAfterDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOrdered() {
        return this.quantityOrdered;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityIssued() {
        return this.quantityIssued;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityOpen() {
        return this.quantityOpen;
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
     * Auto generated value setter.
     * @param orderItem the orderItem to set
    */
    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductStoreId((String) mapValue.get("productStoreId"));
        setOrderId((String) mapValue.get("orderId"));
        setOrderTypeId((String) mapValue.get("orderTypeId"));
        setOrderStatusId((String) mapValue.get("orderStatusId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        setOrderItemStatusId((String) mapValue.get("orderItemStatusId"));
        setProductId((String) mapValue.get("productId"));
        setItemDescription((String) mapValue.get("itemDescription"));
        setShipBeforeDate((Timestamp) mapValue.get("shipBeforeDate"));
        setShipAfterDate((Timestamp) mapValue.get("shipAfterDate"));
        setQuantityOrdered(convertToBigDecimal(mapValue.get("quantityOrdered")));
        setQuantityIssued(convertToBigDecimal(mapValue.get("quantityIssued")));
        setQuantityOpen(convertToBigDecimal(mapValue.get("quantityOpen")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderTypeId", getOrderTypeId());
        mapValue.put("orderStatusId", getOrderStatusId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("orderItemSeqId", getOrderItemSeqId());
        mapValue.put("orderItemStatusId", getOrderItemStatusId());
        mapValue.put("productId", getProductId());
        mapValue.put("itemDescription", getItemDescription());
        mapValue.put("shipBeforeDate", getShipBeforeDate());
        mapValue.put("shipAfterDate", getShipAfterDate());
        mapValue.put("quantityOrdered", getQuantityOrdered());
        mapValue.put("quantityIssued", getQuantityIssued());
        mapValue.put("quantityOpen", getQuantityOpen());
        return mapValue;
    }


}
