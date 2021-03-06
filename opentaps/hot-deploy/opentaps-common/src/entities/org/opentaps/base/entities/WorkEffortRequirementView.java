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
 * Auto generated base entity WorkEffortRequirementView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortRequirementViews", query="SELECT SI.DESCRIPTION AS \"description\",WRFT.DESCRIPTION AS \"description\",REQ.DESCRIPTION AS \"description\",WRF.REQUIREMENT_ID AS \"requirementId\",WRF.WORK_EFFORT_ID AS \"workEffortId\",WRF.WORK_REQ_FULF_TYPE_ID AS \"workReqFulfTypeId\",REQ.REQUIREMENT_TYPE_ID AS \"requirementTypeId\",REQ.FACILITY_ID AS \"facilityId\",REQ.DELIVERABLE_ID AS \"deliverableId\",REQ.FIXED_ASSET_ID AS \"fixedAssetId\",REQ.PRODUCT_ID AS \"productId\",REQ.STATUS_ID AS \"statusId\",REQ.DESCRIPTION AS \"description\",REQ.REQUIREMENT_START_DATE AS \"requirementStartDate\",REQ.REQUIRED_BY_DATE AS \"requiredByDate\",REQ.ESTIMATED_BUDGET AS \"estimatedBudget\",REQ.QUANTITY AS \"quantity\",REQ.USE_CASE AS \"useCase\",REQ.REASON AS \"reason\",REQ.CREATED_DATE AS \"createdDate\",REQ.CREATED_BY_USER_LOGIN AS \"createdByUserLogin\",REQ.LAST_MODIFIED_DATE AS \"lastModifiedDate\",REQ.LAST_MODIFIED_BY_USER_LOGIN AS \"lastModifiedByUserLogin\",REQ.ORDER_ITEM_TYPE_ID AS \"orderItemTypeId\",REQ.FACILITY_ID_TO AS \"facilityIdTo\" FROM WORK_REQUIREMENT_FULFILLMENT WRF INNER JOIN REQUIREMENT REQ ON WRF.REQUIREMENT_ID = REQ.REQUIREMENT_ID LEFT JOIN STATUS_ITEM SI ON REQ.STATUS_ID = SI.STATUS_ID LEFT JOIN WORK_REQ_FULF_TYPE WRFT ON WRF.WORK_REQ_FULF_TYPE_ID = WRFT.WORK_REQ_FULF_TYPE_ID", resultSetMapping="WorkEffortRequirementViewMapping")
@SqlResultSetMapping(name="WorkEffortRequirementViewMapping", entities={
@EntityResult(entityClass=WorkEffortRequirementView.class, fields = {
@FieldResult(name="statusItemDescription", column="statusItemDescription")
,@FieldResult(name="workReqFulfTypeDescription", column="workReqFulfTypeDescription")
,@FieldResult(name="requirementDescription", column="requirementDescription")
,@FieldResult(name="requirementId", column="requirementId")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="workReqFulfTypeId", column="workReqFulfTypeId")
,@FieldResult(name="requirementTypeId", column="requirementTypeId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="deliverableId", column="deliverableId")
,@FieldResult(name="fixedAssetId", column="fixedAssetId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="requirementStartDate", column="requirementStartDate")
,@FieldResult(name="requiredByDate", column="requiredByDate")
,@FieldResult(name="estimatedBudget", column="estimatedBudget")
,@FieldResult(name="quantity", column="quantity")
,@FieldResult(name="useCase", column="useCase")
,@FieldResult(name="reason", column="reason")
,@FieldResult(name="createdDate", column="createdDate")
,@FieldResult(name="createdByUserLogin", column="createdByUserLogin")
,@FieldResult(name="lastModifiedDate", column="lastModifiedDate")
,@FieldResult(name="lastModifiedByUserLogin", column="lastModifiedByUserLogin")
,@FieldResult(name="orderItemTypeId", column="orderItemTypeId")
,@FieldResult(name="facilityIdTo", column="facilityIdTo")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortRequirementView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("statusItemDescription", "SI.DESCRIPTION");
        fields.put("workReqFulfTypeDescription", "WRFT.DESCRIPTION");
        fields.put("requirementDescription", "REQ.DESCRIPTION");
        fields.put("requirementId", "WRF.REQUIREMENT_ID");
        fields.put("workEffortId", "WRF.WORK_EFFORT_ID");
        fields.put("workReqFulfTypeId", "WRF.WORK_REQ_FULF_TYPE_ID");
        fields.put("requirementTypeId", "REQ.REQUIREMENT_TYPE_ID");
        fields.put("facilityId", "REQ.FACILITY_ID");
        fields.put("deliverableId", "REQ.DELIVERABLE_ID");
        fields.put("fixedAssetId", "REQ.FIXED_ASSET_ID");
        fields.put("productId", "REQ.PRODUCT_ID");
        fields.put("statusId", "REQ.STATUS_ID");
        fields.put("description", "REQ.DESCRIPTION");
        fields.put("requirementStartDate", "REQ.REQUIREMENT_START_DATE");
        fields.put("requiredByDate", "REQ.REQUIRED_BY_DATE");
        fields.put("estimatedBudget", "REQ.ESTIMATED_BUDGET");
        fields.put("quantity", "REQ.QUANTITY");
        fields.put("useCase", "REQ.USE_CASE");
        fields.put("reason", "REQ.REASON");
        fields.put("createdDate", "REQ.CREATED_DATE");
        fields.put("createdByUserLogin", "REQ.CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedDate", "REQ.LAST_MODIFIED_DATE");
        fields.put("lastModifiedByUserLogin", "REQ.LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("orderItemTypeId", "REQ.ORDER_ITEM_TYPE_ID");
        fields.put("facilityIdTo", "REQ.FACILITY_ID_TO");
fieldMapColumns.put("WorkEffortRequirementView", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortRequirementView> {
    statusItemDescription("statusItemDescription"),
    workReqFulfTypeDescription("workReqFulfTypeDescription"),
    requirementDescription("requirementDescription"),
    requirementId("requirementId"),
    workEffortId("workEffortId"),
    workReqFulfTypeId("workReqFulfTypeId"),
    requirementTypeId("requirementTypeId"),
    facilityId("facilityId"),
    deliverableId("deliverableId"),
    fixedAssetId("fixedAssetId"),
    productId("productId"),
    statusId("statusId"),
    description("description"),
    requirementStartDate("requirementStartDate"),
    requiredByDate("requiredByDate"),
    estimatedBudget("estimatedBudget"),
    quantity("quantity"),
    useCase("useCase"),
    reason("reason"),
    createdDate("createdDate"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedDate("lastModifiedDate"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    orderItemTypeId("orderItemTypeId"),
    facilityIdTo("facilityIdTo");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String statusItemDescription;
    
   private String workReqFulfTypeDescription;
    
   private String requirementDescription;
    @Id
   private String requirementId;
    
   private String workEffortId;
    
   private String workReqFulfTypeId;
    
   private String requirementTypeId;
    
   private String facilityId;
    
   private String deliverableId;
    
   private String fixedAssetId;
    
   private String productId;
    
   private String statusId;
    
   private String description;
    
   private Timestamp requirementStartDate;
    
   private Timestamp requiredByDate;
    
   private BigDecimal estimatedBudget;
    
   private BigDecimal quantity;
    
   private String useCase;
    
   private String reason;
    
   private Timestamp createdDate;
    
   private String createdByUserLogin;
    
   private Timestamp lastModifiedDate;
    
   private String lastModifiedByUserLogin;
    
   private String orderItemTypeId;
    
   private String facilityIdTo;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REQUIREMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Requirement requirement = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_REQ_FULF_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkReqFulfType workReqFulfType = null;

  /**
   * Default constructor.
   */
  public WorkEffortRequirementView() {
      super();
      this.baseEntityName = "WorkEffortRequirementView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("requirementId");this.primaryKeyNames.add("workEffortId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("statusItemDescription");this.allFieldsNames.add("workReqFulfTypeDescription");this.allFieldsNames.add("requirementDescription");this.allFieldsNames.add("requirementId");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("workReqFulfTypeId");this.allFieldsNames.add("requirementTypeId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("deliverableId");this.allFieldsNames.add("fixedAssetId");this.allFieldsNames.add("productId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("description");this.allFieldsNames.add("requirementStartDate");this.allFieldsNames.add("requiredByDate");this.allFieldsNames.add("estimatedBudget");this.allFieldsNames.add("quantity");this.allFieldsNames.add("useCase");this.allFieldsNames.add("reason");this.allFieldsNames.add("createdDate");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedDate");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("orderItemTypeId");this.allFieldsNames.add("facilityIdTo");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortRequirementView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param statusItemDescription the statusItemDescription to set
     */
    public void setStatusItemDescription(String statusItemDescription) {
        this.statusItemDescription = statusItemDescription;
    }
    /**
     * Auto generated value setter.
     * @param workReqFulfTypeDescription the workReqFulfTypeDescription to set
     */
    public void setWorkReqFulfTypeDescription(String workReqFulfTypeDescription) {
        this.workReqFulfTypeDescription = workReqFulfTypeDescription;
    }
    /**
     * Auto generated value setter.
     * @param requirementDescription the requirementDescription to set
     */
    public void setRequirementDescription(String requirementDescription) {
        this.requirementDescription = requirementDescription;
    }
    /**
     * Auto generated value setter.
     * @param requirementId the requirementId to set
     */
    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
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
     * @param workReqFulfTypeId the workReqFulfTypeId to set
     */
    public void setWorkReqFulfTypeId(String workReqFulfTypeId) {
        this.workReqFulfTypeId = workReqFulfTypeId;
    }
    /**
     * Auto generated value setter.
     * @param requirementTypeId the requirementTypeId to set
     */
    public void setRequirementTypeId(String requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
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
     * @param deliverableId the deliverableId to set
     */
    public void setDeliverableId(String deliverableId) {
        this.deliverableId = deliverableId;
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
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param requirementStartDate the requirementStartDate to set
     */
    public void setRequirementStartDate(Timestamp requirementStartDate) {
        this.requirementStartDate = requirementStartDate;
    }
    /**
     * Auto generated value setter.
     * @param requiredByDate the requiredByDate to set
     */
    public void setRequiredByDate(Timestamp requiredByDate) {
        this.requiredByDate = requiredByDate;
    }
    /**
     * Auto generated value setter.
     * @param estimatedBudget the estimatedBudget to set
     */
    public void setEstimatedBudget(BigDecimal estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
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
     * @param useCase the useCase to set
     */
    public void setUseCase(String useCase) {
        this.useCase = useCase;
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
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedDate the lastModifiedDate to set
     */
    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param orderItemTypeId the orderItemTypeId to set
     */
    public void setOrderItemTypeId(String orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }
    /**
     * Auto generated value setter.
     * @param facilityIdTo the facilityIdTo to set
     */
    public void setFacilityIdTo(String facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusItemDescription() {
        return this.statusItemDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkReqFulfTypeDescription() {
        return this.workReqFulfTypeDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementDescription() {
        return this.requirementDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementId() {
        return this.requirementId;
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
    public String getWorkReqFulfTypeId() {
        return this.workReqFulfTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementTypeId() {
        return this.requirementTypeId;
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
    public String getDeliverableId() {
        return this.deliverableId;
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
    public String getProductId() {
        return this.productId;
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
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRequirementStartDate() {
        return this.requirementStartDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRequiredByDate() {
        return this.requiredByDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedBudget() {
        return this.estimatedBudget;
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
     * @return <code>String</code>
     */
    public String getUseCase() {
        return this.useCase;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderItemTypeId() {
        return this.orderItemTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFacilityIdTo() {
        return this.facilityIdTo;
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
     * Auto generated method that gets the related <code>Requirement</code> by the relation named <code>Requirement</code>.
     * @return the <code>Requirement</code>
     * @throws RepositoryException if an error occurs
     */
    public Requirement getRequirement() throws RepositoryException {
        if (this.requirement == null) {
            this.requirement = getRelatedOne(Requirement.class, "Requirement");
        }
        return this.requirement;
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
     * Auto generated method that gets the related <code>WorkReqFulfType</code> by the relation named <code>WorkReqFulfType</code>.
     * @return the <code>WorkReqFulfType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkReqFulfType getWorkReqFulfType() throws RepositoryException {
        if (this.workReqFulfType == null) {
            this.workReqFulfType = getRelatedOne(WorkReqFulfType.class, "WorkReqFulfType");
        }
        return this.workReqFulfType;
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
     * @param requirement the requirement to set
    */
    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param workReqFulfType the workReqFulfType to set
    */
    public void setWorkReqFulfType(WorkReqFulfType workReqFulfType) {
        this.workReqFulfType = workReqFulfType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setStatusItemDescription((String) mapValue.get("statusItemDescription"));
        setWorkReqFulfTypeDescription((String) mapValue.get("workReqFulfTypeDescription"));
        setRequirementDescription((String) mapValue.get("requirementDescription"));
        setRequirementId((String) mapValue.get("requirementId"));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setWorkReqFulfTypeId((String) mapValue.get("workReqFulfTypeId"));
        setRequirementTypeId((String) mapValue.get("requirementTypeId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setDeliverableId((String) mapValue.get("deliverableId"));
        setFixedAssetId((String) mapValue.get("fixedAssetId"));
        setProductId((String) mapValue.get("productId"));
        setStatusId((String) mapValue.get("statusId"));
        setDescription((String) mapValue.get("description"));
        setRequirementStartDate((Timestamp) mapValue.get("requirementStartDate"));
        setRequiredByDate((Timestamp) mapValue.get("requiredByDate"));
        setEstimatedBudget(convertToBigDecimal(mapValue.get("estimatedBudget")));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        setUseCase((String) mapValue.get("useCase"));
        setReason((String) mapValue.get("reason"));
        setCreatedDate((Timestamp) mapValue.get("createdDate"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setOrderItemTypeId((String) mapValue.get("orderItemTypeId"));
        setFacilityIdTo((String) mapValue.get("facilityIdTo"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("statusItemDescription", getStatusItemDescription());
        mapValue.put("workReqFulfTypeDescription", getWorkReqFulfTypeDescription());
        mapValue.put("requirementDescription", getRequirementDescription());
        mapValue.put("requirementId", getRequirementId());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("workReqFulfTypeId", getWorkReqFulfTypeId());
        mapValue.put("requirementTypeId", getRequirementTypeId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("deliverableId", getDeliverableId());
        mapValue.put("fixedAssetId", getFixedAssetId());
        mapValue.put("productId", getProductId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("description", getDescription());
        mapValue.put("requirementStartDate", getRequirementStartDate());
        mapValue.put("requiredByDate", getRequiredByDate());
        mapValue.put("estimatedBudget", getEstimatedBudget());
        mapValue.put("quantity", getQuantity());
        mapValue.put("useCase", getUseCase());
        mapValue.put("reason", getReason());
        mapValue.put("createdDate", getCreatedDate());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedDate", getLastModifiedDate());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("orderItemTypeId", getOrderItemTypeId());
        mapValue.put("facilityIdTo", getFacilityIdTo());
        return mapValue;
    }


}
