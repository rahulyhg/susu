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
 * Auto generated base entity FacilityProductAndMrpEventAndDetailAndOrder.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectFacilityProductAndMrpEventAndDetailAndOrders", query="SELECT PR.BILL_OF_MATERIAL_LEVEL AS \"billOfMaterialLevel\",PR.INTRODUCTION_DATE AS \"introductionDate\",PR.SALES_DISCONTINUATION_DATE AS \"salesDiscontinuationDate\",IEPT.IN_OUT AS \"inOut\",MIED.ORDER_ID AS \"orderId\",OH.PRODUCT_STORE_ID AS \"productStoreId\",PF.PRODUCT_ID AS \"productId\",PF.FACILITY_ID AS \"facilityId\",PF.MINIMUM_STOCK AS \"minimumStock\",PF.REORDER_QUANTITY AS \"reorderQuantity\",PF.DAYS_TO_SHIP AS \"daysToShip\",PF.REPLENISH_METHOD_ENUM_ID AS \"replenishMethodEnumId\",PF.REPLENISH_FROM_FACILITY_ID AS \"replenishFromFacilityId\",IEP.EVENT_DATE AS \"eventDate\",IEP.INVENTORY_EVENT_PLAN_TYPE_ID AS \"inventoryEventPlanTypeId\",IEP.EVENT_QUANTITY AS \"eventQuantity\",IEP.NET_QOH AS \"netQoh\",IEP.EVENT_NAME AS \"eventName\",IEP.IS_LATE AS \"isLate\" FROM PRODUCT PR INNER JOIN PRODUCT_FACILITY PF ON PF.PRODUCT_ID = PR.PRODUCT_ID LEFT JOIN MRP_INVENTORY_EVENT IEP ON PF.PRODUCT_ID = IEP.PRODUCT_ID AND PF.FACILITY_ID = IEP.FACILITY_ID LEFT JOIN INVENTORY_EVENT_PLANNED_TYPE IEPT ON IEP.INVENTORY_EVENT_PLAN_TYPE_ID = IEPT.INVENTORY_EVENT_PLAN_TYPE_ID INNER JOIN MRP_INVENTORY_EVENT_DETAIL MIED ON IEP.PRODUCT_ID = MIED.PRODUCT_ID AND IEP.FACILITY_ID = MIED.FACILITY_ID INNER JOIN ORDER_HEADER OH ON MIED.ORDER_ID = OH.ORDER_ID", resultSetMapping="FacilityProductAndMrpEventAndDetailAndOrderMapping")
@SqlResultSetMapping(name="FacilityProductAndMrpEventAndDetailAndOrderMapping", entities={
@EntityResult(entityClass=FacilityProductAndMrpEventAndDetailAndOrder.class, fields = {
@FieldResult(name="billOfMaterialLevel", column="billOfMaterialLevel")
,@FieldResult(name="introductionDate", column="introductionDate")
,@FieldResult(name="salesDiscontinuationDate", column="salesDiscontinuationDate")
,@FieldResult(name="inOut", column="inOut")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="minimumStock", column="minimumStock")
,@FieldResult(name="reorderQuantity", column="reorderQuantity")
,@FieldResult(name="daysToShip", column="daysToShip")
,@FieldResult(name="replenishMethodEnumId", column="replenishMethodEnumId")
,@FieldResult(name="replenishFromFacilityId", column="replenishFromFacilityId")
,@FieldResult(name="eventDate", column="eventDate")
,@FieldResult(name="inventoryEventPlanTypeId", column="inventoryEventPlanTypeId")
,@FieldResult(name="eventQuantity", column="eventQuantity")
,@FieldResult(name="netQoh", column="netQoh")
,@FieldResult(name="eventName", column="eventName")
,@FieldResult(name="isLate", column="isLate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class FacilityProductAndMrpEventAndDetailAndOrder extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("billOfMaterialLevel", "PR.BILL_OF_MATERIAL_LEVEL");
        fields.put("introductionDate", "PR.INTRODUCTION_DATE");
        fields.put("salesDiscontinuationDate", "PR.SALES_DISCONTINUATION_DATE");
        fields.put("inOut", "IEPT.IN_OUT");
        fields.put("orderId", "MIED.ORDER_ID");
        fields.put("productStoreId", "OH.PRODUCT_STORE_ID");
        fields.put("productId", "PF.PRODUCT_ID");
        fields.put("facilityId", "PF.FACILITY_ID");
        fields.put("minimumStock", "PF.MINIMUM_STOCK");
        fields.put("reorderQuantity", "PF.REORDER_QUANTITY");
        fields.put("daysToShip", "PF.DAYS_TO_SHIP");
        fields.put("replenishMethodEnumId", "PF.REPLENISH_METHOD_ENUM_ID");
        fields.put("replenishFromFacilityId", "PF.REPLENISH_FROM_FACILITY_ID");
        fields.put("eventDate", "IEP.EVENT_DATE");
        fields.put("inventoryEventPlanTypeId", "IEP.INVENTORY_EVENT_PLAN_TYPE_ID");
        fields.put("eventQuantity", "IEP.EVENT_QUANTITY");
        fields.put("netQoh", "IEP.NET_QOH");
        fields.put("eventName", "IEP.EVENT_NAME");
        fields.put("isLate", "IEP.IS_LATE");
fieldMapColumns.put("FacilityProductAndMrpEventAndDetailAndOrder", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityProductAndMrpEventAndDetailAndOrder> {
    billOfMaterialLevel("billOfMaterialLevel"),
    introductionDate("introductionDate"),
    salesDiscontinuationDate("salesDiscontinuationDate"),
    inOut("inOut"),
    orderId("orderId"),
    productStoreId("productStoreId"),
    productId("productId"),
    facilityId("facilityId"),
    minimumStock("minimumStock"),
    reorderQuantity("reorderQuantity"),
    daysToShip("daysToShip"),
    replenishMethodEnumId("replenishMethodEnumId"),
    replenishFromFacilityId("replenishFromFacilityId"),
    eventDate("eventDate"),
    inventoryEventPlanTypeId("inventoryEventPlanTypeId"),
    eventQuantity("eventQuantity"),
    netQoh("netQoh"),
    eventName("eventName"),
    isLate("isLate");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private Long billOfMaterialLevel;
    
   private Timestamp introductionDate;
    
   private Timestamp salesDiscontinuationDate;
    
   private String inOut;
    
   private String orderId;
    
   private String productStoreId;
    @Id
   private String productId;
    
   private String facilityId;
    
   private BigDecimal minimumStock;
    
   private BigDecimal reorderQuantity;
    
   private Long daysToShip;
    
   private String replenishMethodEnumId;
    
   private String replenishFromFacilityId;
    
   private Timestamp eventDate;
    
   private String inventoryEventPlanTypeId;
    
   private BigDecimal eventQuantity;
    
   private BigDecimal netQoh;
    
   private String eventName;
    
   private String isLate;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_EVENT_PLAN_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryEventPlannedType inventoryEventPlannedType = null;
   private transient MrpInventoryEvent mrpInventoryEvent = null;
   private transient List<MrpInventoryEventDetail> mrpInventoryEventDetails = null;

  /**
   * Default constructor.
   */
  public FacilityProductAndMrpEventAndDetailAndOrder() {
      super();
      this.baseEntityName = "FacilityProductAndMrpEventAndDetailAndOrder";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("eventDate");this.primaryKeyNames.add("inventoryEventPlanTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("billOfMaterialLevel");this.allFieldsNames.add("introductionDate");this.allFieldsNames.add("salesDiscontinuationDate");this.allFieldsNames.add("inOut");this.allFieldsNames.add("orderId");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("productId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("minimumStock");this.allFieldsNames.add("reorderQuantity");this.allFieldsNames.add("daysToShip");this.allFieldsNames.add("replenishMethodEnumId");this.allFieldsNames.add("replenishFromFacilityId");this.allFieldsNames.add("eventDate");this.allFieldsNames.add("inventoryEventPlanTypeId");this.allFieldsNames.add("eventQuantity");this.allFieldsNames.add("netQoh");this.allFieldsNames.add("eventName");this.allFieldsNames.add("isLate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityProductAndMrpEventAndDetailAndOrder(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param billOfMaterialLevel the billOfMaterialLevel to set
     */
    public void setBillOfMaterialLevel(Long billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }
    /**
     * Auto generated value setter.
     * @param introductionDate the introductionDate to set
     */
    public void setIntroductionDate(Timestamp introductionDate) {
        this.introductionDate = introductionDate;
    }
    /**
     * Auto generated value setter.
     * @param salesDiscontinuationDate the salesDiscontinuationDate to set
     */
    public void setSalesDiscontinuationDate(Timestamp salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }
    /**
     * Auto generated value setter.
     * @param inOut the inOut to set
     */
    public void setInOut(String inOut) {
        this.inOut = inOut;
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
     * @param productStoreId the productStoreId to set
     */
    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
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
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param minimumStock the minimumStock to set
     */
    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }
    /**
     * Auto generated value setter.
     * @param reorderQuantity the reorderQuantity to set
     */
    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }
    /**
     * Auto generated value setter.
     * @param daysToShip the daysToShip to set
     */
    public void setDaysToShip(Long daysToShip) {
        this.daysToShip = daysToShip;
    }
    /**
     * Auto generated value setter.
     * @param replenishMethodEnumId the replenishMethodEnumId to set
     */
    public void setReplenishMethodEnumId(String replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
    }
    /**
     * Auto generated value setter.
     * @param replenishFromFacilityId the replenishFromFacilityId to set
     */
    public void setReplenishFromFacilityId(String replenishFromFacilityId) {
        this.replenishFromFacilityId = replenishFromFacilityId;
    }
    /**
     * Auto generated value setter.
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Timestamp eventDate) {
        this.eventDate = eventDate;
    }
    /**
     * Auto generated value setter.
     * @param inventoryEventPlanTypeId the inventoryEventPlanTypeId to set
     */
    public void setInventoryEventPlanTypeId(String inventoryEventPlanTypeId) {
        this.inventoryEventPlanTypeId = inventoryEventPlanTypeId;
    }
    /**
     * Auto generated value setter.
     * @param eventQuantity the eventQuantity to set
     */
    public void setEventQuantity(BigDecimal eventQuantity) {
        this.eventQuantity = eventQuantity;
    }
    /**
     * Auto generated value setter.
     * @param netQoh the netQoh to set
     */
    public void setNetQoh(BigDecimal netQoh) {
        this.netQoh = netQoh;
    }
    /**
     * Auto generated value setter.
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    /**
     * Auto generated value setter.
     * @param isLate the isLate to set
     */
    public void setIsLate(String isLate) {
        this.isLate = isLate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getBillOfMaterialLevel() {
        return this.billOfMaterialLevel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getIntroductionDate() {
        return this.introductionDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getSalesDiscontinuationDate() {
        return this.salesDiscontinuationDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInOut() {
        return this.inOut;
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
    public String getProductStoreId() {
        return this.productStoreId;
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
    public String getFacilityId() {
        return this.facilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getMinimumStock() {
        return this.minimumStock;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReorderQuantity() {
        return this.reorderQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDaysToShip() {
        return this.daysToShip;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReplenishMethodEnumId() {
        return this.replenishMethodEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReplenishFromFacilityId() {
        return this.replenishFromFacilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getEventDate() {
        return this.eventDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryEventPlanTypeId() {
        return this.inventoryEventPlanTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEventQuantity() {
        return this.eventQuantity;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getNetQoh() {
        return this.netQoh;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEventName() {
        return this.eventName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsLate() {
        return this.isLate;
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
     * Auto generated method that gets the related <code>InventoryEventPlannedType</code> by the relation named <code>InventoryEventPlannedType</code>.
     * @return the <code>InventoryEventPlannedType</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryEventPlannedType getInventoryEventPlannedType() throws RepositoryException {
        if (this.inventoryEventPlannedType == null) {
            this.inventoryEventPlannedType = getRelatedOne(InventoryEventPlannedType.class, "InventoryEventPlannedType");
        }
        return this.inventoryEventPlannedType;
    }
    /**
     * Auto generated method that gets the related <code>MrpInventoryEvent</code> by the relation named <code>MrpInventoryEvent</code>.
     * @return the <code>MrpInventoryEvent</code>
     * @throws RepositoryException if an error occurs
     */
    public MrpInventoryEvent getMrpInventoryEvent() throws RepositoryException {
        if (this.mrpInventoryEvent == null) {
            this.mrpInventoryEvent = getRelatedOne(MrpInventoryEvent.class, "MrpInventoryEvent");
        }
        return this.mrpInventoryEvent;
    }
    /**
     * Auto generated method that gets the related <code>MrpInventoryEventDetail</code> by the relation named <code>MrpInventoryEventDetail</code>.
     * @return the list of <code>MrpInventoryEventDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends MrpInventoryEventDetail> getMrpInventoryEventDetails() throws RepositoryException {
        if (this.mrpInventoryEventDetails == null) {
            this.mrpInventoryEventDetails = getRelated(MrpInventoryEventDetail.class, "MrpInventoryEventDetail");
        }
        return this.mrpInventoryEventDetails;
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
     * @param inventoryEventPlannedType the inventoryEventPlannedType to set
    */
    public void setInventoryEventPlannedType(InventoryEventPlannedType inventoryEventPlannedType) {
        this.inventoryEventPlannedType = inventoryEventPlannedType;
    }
    /**
     * Auto generated value setter.
     * @param mrpInventoryEvent the mrpInventoryEvent to set
    */
    public void setMrpInventoryEvent(MrpInventoryEvent mrpInventoryEvent) {
        this.mrpInventoryEvent = mrpInventoryEvent;
    }
    /**
     * Auto generated value setter.
     * @param mrpInventoryEventDetails the mrpInventoryEventDetails to set
    */
    public void setMrpInventoryEventDetails(List<MrpInventoryEventDetail> mrpInventoryEventDetails) {
        this.mrpInventoryEventDetails = mrpInventoryEventDetails;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBillOfMaterialLevel((Long) mapValue.get("billOfMaterialLevel"));
        setIntroductionDate((Timestamp) mapValue.get("introductionDate"));
        setSalesDiscontinuationDate((Timestamp) mapValue.get("salesDiscontinuationDate"));
        setInOut((String) mapValue.get("inOut"));
        setOrderId((String) mapValue.get("orderId"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setProductId((String) mapValue.get("productId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setMinimumStock(convertToBigDecimal(mapValue.get("minimumStock")));
        setReorderQuantity(convertToBigDecimal(mapValue.get("reorderQuantity")));
        setDaysToShip((Long) mapValue.get("daysToShip"));
        setReplenishMethodEnumId((String) mapValue.get("replenishMethodEnumId"));
        setReplenishFromFacilityId((String) mapValue.get("replenishFromFacilityId"));
        setEventDate((Timestamp) mapValue.get("eventDate"));
        setInventoryEventPlanTypeId((String) mapValue.get("inventoryEventPlanTypeId"));
        setEventQuantity(convertToBigDecimal(mapValue.get("eventQuantity")));
        setNetQoh(convertToBigDecimal(mapValue.get("netQoh")));
        setEventName((String) mapValue.get("eventName"));
        setIsLate((String) mapValue.get("isLate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("billOfMaterialLevel", getBillOfMaterialLevel());
        mapValue.put("introductionDate", getIntroductionDate());
        mapValue.put("salesDiscontinuationDate", getSalesDiscontinuationDate());
        mapValue.put("inOut", getInOut());
        mapValue.put("orderId", getOrderId());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("productId", getProductId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("minimumStock", getMinimumStock());
        mapValue.put("reorderQuantity", getReorderQuantity());
        mapValue.put("daysToShip", getDaysToShip());
        mapValue.put("replenishMethodEnumId", getReplenishMethodEnumId());
        mapValue.put("replenishFromFacilityId", getReplenishFromFacilityId());
        mapValue.put("eventDate", getEventDate());
        mapValue.put("inventoryEventPlanTypeId", getInventoryEventPlanTypeId());
        mapValue.put("eventQuantity", getEventQuantity());
        mapValue.put("netQoh", getNetQoh());
        mapValue.put("eventName", getEventName());
        mapValue.put("isLate", getIsLate());
        return mapValue;
    }


}
