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
import java.sql.Timestamp;

/**
 * Auto generated base entity FacilityAndContactMech.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectFacilityAndContactMechs", query="SELECT FA.FACILITY_ID AS \"facilityId\",FA.FACILITY_TYPE_ID AS \"facilityTypeId\",FA.PARENT_FACILITY_ID AS \"parentFacilityId\",FA.OWNER_PARTY_ID AS \"ownerPartyId\",FA.DEFAULT_INVENTORY_ITEM_TYPE_ID AS \"defaultInventoryItemTypeId\",FA.FACILITY_NAME AS \"facilityName\",FA.PRIMARY_FACILITY_GROUP_ID AS \"primaryFacilityGroupId\",FA.SQUARE_FOOTAGE AS \"squareFootage\",FA.PRODUCT_STORE_ID AS \"productStoreId\",FA.DEFAULT_DAYS_TO_SHIP AS \"defaultDaysToShip\",FA.OPENED_DATE AS \"openedDate\",FA.CLOSED_DATE AS \"closedDate\",FA.DESCRIPTION AS \"description\",FA.DEFAULT_WEIGHT_UOM_ID AS \"defaultWeightUomId\",FA.GEO_POINT_ID AS \"geoPointId\",FA.INVENTORY_RESERVE_ORDER_ENUM_ID AS \"inventoryReserveOrderEnumId\",CM.CONTACT_MECH_ID AS \"contactMechId\",CM.FROM_DATE AS \"fromDate\",CM.THRU_DATE AS \"thruDate\",CM.EXTENSION AS \"extension\",CM.COMMENTS AS \"comments\" FROM FACILITY FA INNER JOIN FACILITY_CONTACT_MECH CM ON FA.FACILITY_ID = CM.FACILITY_ID", resultSetMapping="FacilityAndContactMechMapping")
@SqlResultSetMapping(name="FacilityAndContactMechMapping", entities={
@EntityResult(entityClass=FacilityAndContactMech.class, fields = {
@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="facilityTypeId", column="facilityTypeId")
,@FieldResult(name="parentFacilityId", column="parentFacilityId")
,@FieldResult(name="ownerPartyId", column="ownerPartyId")
,@FieldResult(name="defaultInventoryItemTypeId", column="defaultInventoryItemTypeId")
,@FieldResult(name="facilityName", column="facilityName")
,@FieldResult(name="primaryFacilityGroupId", column="primaryFacilityGroupId")
,@FieldResult(name="squareFootage", column="squareFootage")
,@FieldResult(name="productStoreId", column="productStoreId")
,@FieldResult(name="defaultDaysToShip", column="defaultDaysToShip")
,@FieldResult(name="openedDate", column="openedDate")
,@FieldResult(name="closedDate", column="closedDate")
,@FieldResult(name="description", column="description")
,@FieldResult(name="defaultWeightUomId", column="defaultWeightUomId")
,@FieldResult(name="geoPointId", column="geoPointId")
,@FieldResult(name="inventoryReserveOrderEnumId", column="inventoryReserveOrderEnumId")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="extension", column="extension")
,@FieldResult(name="comments", column="comments")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class FacilityAndContactMech extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityId", "FA.FACILITY_ID");
        fields.put("facilityTypeId", "FA.FACILITY_TYPE_ID");
        fields.put("parentFacilityId", "FA.PARENT_FACILITY_ID");
        fields.put("ownerPartyId", "FA.OWNER_PARTY_ID");
        fields.put("defaultInventoryItemTypeId", "FA.DEFAULT_INVENTORY_ITEM_TYPE_ID");
        fields.put("facilityName", "FA.FACILITY_NAME");
        fields.put("primaryFacilityGroupId", "FA.PRIMARY_FACILITY_GROUP_ID");
        fields.put("squareFootage", "FA.SQUARE_FOOTAGE");
        fields.put("productStoreId", "FA.PRODUCT_STORE_ID");
        fields.put("defaultDaysToShip", "FA.DEFAULT_DAYS_TO_SHIP");
        fields.put("openedDate", "FA.OPENED_DATE");
        fields.put("closedDate", "FA.CLOSED_DATE");
        fields.put("description", "FA.DESCRIPTION");
        fields.put("defaultWeightUomId", "FA.DEFAULT_WEIGHT_UOM_ID");
        fields.put("geoPointId", "FA.GEO_POINT_ID");
        fields.put("inventoryReserveOrderEnumId", "FA.INVENTORY_RESERVE_ORDER_ENUM_ID");
        fields.put("contactMechId", "CM.CONTACT_MECH_ID");
        fields.put("fromDate", "CM.FROM_DATE");
        fields.put("thruDate", "CM.THRU_DATE");
        fields.put("extension", "CM.EXTENSION");
        fields.put("comments", "CM.COMMENTS");
fieldMapColumns.put("FacilityAndContactMech", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityAndContactMech> {
    facilityId("facilityId"),
    facilityTypeId("facilityTypeId"),
    parentFacilityId("parentFacilityId"),
    ownerPartyId("ownerPartyId"),
    defaultInventoryItemTypeId("defaultInventoryItemTypeId"),
    facilityName("facilityName"),
    primaryFacilityGroupId("primaryFacilityGroupId"),
    squareFootage("squareFootage"),
    productStoreId("productStoreId"),
    defaultDaysToShip("defaultDaysToShip"),
    openedDate("openedDate"),
    closedDate("closedDate"),
    description("description"),
    defaultWeightUomId("defaultWeightUomId"),
    geoPointId("geoPointId"),
    inventoryReserveOrderEnumId("inventoryReserveOrderEnumId"),
    contactMechId("contactMechId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    extension("extension"),
    comments("comments");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String facilityId;
    
   private String facilityTypeId;
    
   private String parentFacilityId;
    
   private String ownerPartyId;
    
   private String defaultInventoryItemTypeId;
    
   private String facilityName;
    
   private String primaryFacilityGroupId;
    
   private Long squareFootage;
    
   private String productStoreId;
    
   private Long defaultDaysToShip;
    
   private Timestamp openedDate;
    
   private Timestamp closedDate;
    
   private String description;
    
   private String defaultWeightUomId;
    
   private String geoPointId;
    
   private String inventoryReserveOrderEnumId;
    
   private String contactMechId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String extension;
    
   private String comments;

  /**
   * Default constructor.
   */
  public FacilityAndContactMech() {
      super();
      this.baseEntityName = "FacilityAndContactMech";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("contactMechId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityId");this.allFieldsNames.add("facilityTypeId");this.allFieldsNames.add("parentFacilityId");this.allFieldsNames.add("ownerPartyId");this.allFieldsNames.add("defaultInventoryItemTypeId");this.allFieldsNames.add("facilityName");this.allFieldsNames.add("primaryFacilityGroupId");this.allFieldsNames.add("squareFootage");this.allFieldsNames.add("productStoreId");this.allFieldsNames.add("defaultDaysToShip");this.allFieldsNames.add("openedDate");this.allFieldsNames.add("closedDate");this.allFieldsNames.add("description");this.allFieldsNames.add("defaultWeightUomId");this.allFieldsNames.add("geoPointId");this.allFieldsNames.add("inventoryReserveOrderEnumId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("extension");this.allFieldsNames.add("comments");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityAndContactMech(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param facilityTypeId the facilityTypeId to set
     */
    public void setFacilityTypeId(String facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentFacilityId the parentFacilityId to set
     */
    public void setParentFacilityId(String parentFacilityId) {
        this.parentFacilityId = parentFacilityId;
    }
    /**
     * Auto generated value setter.
     * @param ownerPartyId the ownerPartyId to set
     */
    public void setOwnerPartyId(String ownerPartyId) {
        this.ownerPartyId = ownerPartyId;
    }
    /**
     * Auto generated value setter.
     * @param defaultInventoryItemTypeId the defaultInventoryItemTypeId to set
     */
    public void setDefaultInventoryItemTypeId(String defaultInventoryItemTypeId) {
        this.defaultInventoryItemTypeId = defaultInventoryItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param facilityName the facilityName to set
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }
    /**
     * Auto generated value setter.
     * @param primaryFacilityGroupId the primaryFacilityGroupId to set
     */
    public void setPrimaryFacilityGroupId(String primaryFacilityGroupId) {
        this.primaryFacilityGroupId = primaryFacilityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param squareFootage the squareFootage to set
     */
    public void setSquareFootage(Long squareFootage) {
        this.squareFootage = squareFootage;
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
     * @param defaultDaysToShip the defaultDaysToShip to set
     */
    public void setDefaultDaysToShip(Long defaultDaysToShip) {
        this.defaultDaysToShip = defaultDaysToShip;
    }
    /**
     * Auto generated value setter.
     * @param openedDate the openedDate to set
     */
    public void setOpenedDate(Timestamp openedDate) {
        this.openedDate = openedDate;
    }
    /**
     * Auto generated value setter.
     * @param closedDate the closedDate to set
     */
    public void setClosedDate(Timestamp closedDate) {
        this.closedDate = closedDate;
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
     * @param defaultWeightUomId the defaultWeightUomId to set
     */
    public void setDefaultWeightUomId(String defaultWeightUomId) {
        this.defaultWeightUomId = defaultWeightUomId;
    }
    /**
     * Auto generated value setter.
     * @param geoPointId the geoPointId to set
     */
    public void setGeoPointId(String geoPointId) {
        this.geoPointId = geoPointId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryReserveOrderEnumId the inventoryReserveOrderEnumId to set
     */
    public void setInventoryReserveOrderEnumId(String inventoryReserveOrderEnumId) {
        this.inventoryReserveOrderEnumId = inventoryReserveOrderEnumId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
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
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
     * @return <code>String</code>
     */
    public String getFacilityTypeId() {
        return this.facilityTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentFacilityId() {
        return this.parentFacilityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOwnerPartyId() {
        return this.ownerPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDefaultInventoryItemTypeId() {
        return this.defaultInventoryItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityName() {
        return this.facilityName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryFacilityGroupId() {
        return this.primaryFacilityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSquareFootage() {
        return this.squareFootage;
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
     * @return <code>Long</code>
     */
    public Long getDefaultDaysToShip() {
        return this.defaultDaysToShip;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOpenedDate() {
        return this.openedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getClosedDate() {
        return this.closedDate;
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
    public String getDefaultWeightUomId() {
        return this.defaultWeightUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoPointId() {
        return this.geoPointId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryReserveOrderEnumId() {
        return this.inventoryReserveOrderEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
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
    public String getExtension() {
        return this.extension;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityId((String) mapValue.get("facilityId"));
        setFacilityTypeId((String) mapValue.get("facilityTypeId"));
        setParentFacilityId((String) mapValue.get("parentFacilityId"));
        setOwnerPartyId((String) mapValue.get("ownerPartyId"));
        setDefaultInventoryItemTypeId((String) mapValue.get("defaultInventoryItemTypeId"));
        setFacilityName((String) mapValue.get("facilityName"));
        setPrimaryFacilityGroupId((String) mapValue.get("primaryFacilityGroupId"));
        setSquareFootage((Long) mapValue.get("squareFootage"));
        setProductStoreId((String) mapValue.get("productStoreId"));
        setDefaultDaysToShip((Long) mapValue.get("defaultDaysToShip"));
        setOpenedDate((Timestamp) mapValue.get("openedDate"));
        setClosedDate((Timestamp) mapValue.get("closedDate"));
        setDescription((String) mapValue.get("description"));
        setDefaultWeightUomId((String) mapValue.get("defaultWeightUomId"));
        setGeoPointId((String) mapValue.get("geoPointId"));
        setInventoryReserveOrderEnumId((String) mapValue.get("inventoryReserveOrderEnumId"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setExtension((String) mapValue.get("extension"));
        setComments((String) mapValue.get("comments"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("facilityTypeId", getFacilityTypeId());
        mapValue.put("parentFacilityId", getParentFacilityId());
        mapValue.put("ownerPartyId", getOwnerPartyId());
        mapValue.put("defaultInventoryItemTypeId", getDefaultInventoryItemTypeId());
        mapValue.put("facilityName", getFacilityName());
        mapValue.put("primaryFacilityGroupId", getPrimaryFacilityGroupId());
        mapValue.put("squareFootage", getSquareFootage());
        mapValue.put("productStoreId", getProductStoreId());
        mapValue.put("defaultDaysToShip", getDefaultDaysToShip());
        mapValue.put("openedDate", getOpenedDate());
        mapValue.put("closedDate", getClosedDate());
        mapValue.put("description", getDescription());
        mapValue.put("defaultWeightUomId", getDefaultWeightUomId());
        mapValue.put("geoPointId", getGeoPointId());
        mapValue.put("inventoryReserveOrderEnumId", getInventoryReserveOrderEnumId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("extension", getExtension());
        mapValue.put("comments", getComments());
        return mapValue;
    }


}
