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
 * Auto generated base entity ProductCategoryRollupAndRole.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductCategoryRollupAndRoles", query="SELECT PCRLP.PRODUCT_CATEGORY_ID AS \"productCategoryId\",PCRLP.PARENT_PRODUCT_CATEGORY_ID AS \"parentProductCategoryId\",PCRLP.FROM_DATE AS \"fromDate\",PCRLP.THRU_DATE AS \"thruDate\",PCRLP.SEQUENCE_NUM AS \"sequenceNum\",PCR.PARTY_ID AS \"partyId\",PCR.ROLE_TYPE_ID AS \"roleTypeId\",PCR.FROM_DATE AS \"fromDate\",PCR.THRU_DATE AS \"thruDate\",PCR.COMMENTS AS \"comments\" FROM PRODUCT_CATEGORY_ROLLUP PCRLP INNER JOIN PRODUCT_CATEGORY_ROLE PCR ON PCRLP.PARENT_PRODUCT_CATEGORY_ID = PCR.PRODUCT_CATEGORY_ID", resultSetMapping="ProductCategoryRollupAndRoleMapping")
@SqlResultSetMapping(name="ProductCategoryRollupAndRoleMapping", entities={
@EntityResult(entityClass=ProductCategoryRollupAndRole.class, fields = {
@FieldResult(name="productCategoryId", column="productCategoryId")
,@FieldResult(name="parentProductCategoryId", column="parentProductCategoryId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="sequenceNum", column="sequenceNum")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="roleTypeId", column="roleTypeId")
,@FieldResult(name="roleFromDate", column="roleFromDate")
,@FieldResult(name="roleThruDate", column="roleThruDate")
,@FieldResult(name="roleComments", column="roleComments")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductCategoryRollupAndRole extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productCategoryId", "PCRLP.PRODUCT_CATEGORY_ID");
        fields.put("parentProductCategoryId", "PCRLP.PARENT_PRODUCT_CATEGORY_ID");
        fields.put("fromDate", "PCRLP.FROM_DATE");
        fields.put("thruDate", "PCRLP.THRU_DATE");
        fields.put("sequenceNum", "PCRLP.SEQUENCE_NUM");
        fields.put("partyId", "PCR.PARTY_ID");
        fields.put("roleTypeId", "PCR.ROLE_TYPE_ID");
        fields.put("roleFromDate", "PCR.FROM_DATE");
        fields.put("roleThruDate", "PCR.THRU_DATE");
        fields.put("roleComments", "PCR.COMMENTS");
fieldMapColumns.put("ProductCategoryRollupAndRole", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductCategoryRollupAndRole> {
    productCategoryId("productCategoryId"),
    parentProductCategoryId("parentProductCategoryId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    roleFromDate("roleFromDate"),
    roleThruDate("roleThruDate"),
    roleComments("roleComments");
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
   private String productCategoryId;
    
   private String parentProductCategoryId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private Long sequenceNum;
    
   private String partyId;
    
   private String roleTypeId;
    
   private Timestamp roleFromDate;
    
   private Timestamp roleThruDate;
    
   private String roleComments;
   private transient ProductCategoryRollup productCategoryRollup = null;
   private transient ProductCategoryRole productCategoryRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory productCategory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory parentProductCategory = null;

  /**
   * Default constructor.
   */
  public ProductCategoryRollupAndRole() {
      super();
      this.baseEntityName = "ProductCategoryRollupAndRole";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productCategoryId");this.primaryKeyNames.add("parentProductCategoryId");this.primaryKeyNames.add("fromDate");this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("roleTypeId");this.primaryKeyNames.add("roleFromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("parentProductCategoryId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("roleFromDate");this.allFieldsNames.add("roleThruDate");this.allFieldsNames.add("roleComments");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductCategoryRollupAndRole(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param parentProductCategoryId the parentProductCategoryId to set
     */
    public void setParentProductCategoryId(String parentProductCategoryId) {
        this.parentProductCategoryId = parentProductCategoryId;
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
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param roleFromDate the roleFromDate to set
     */
    public void setRoleFromDate(Timestamp roleFromDate) {
        this.roleFromDate = roleFromDate;
    }
    /**
     * Auto generated value setter.
     * @param roleThruDate the roleThruDate to set
     */
    public void setRoleThruDate(Timestamp roleThruDate) {
        this.roleThruDate = roleThruDate;
    }
    /**
     * Auto generated value setter.
     * @param roleComments the roleComments to set
     */
    public void setRoleComments(String roleComments) {
        this.roleComments = roleComments;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryId() {
        return this.productCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentProductCategoryId() {
        return this.parentProductCategoryId;
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
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRoleFromDate() {
        return this.roleFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getRoleThruDate() {
        return this.roleThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleComments() {
        return this.roleComments;
    }

    /**
     * Auto generated method that gets the related <code>ProductCategoryRollup</code> by the relation named <code>ProductCategoryRollup</code>.
     * @return the <code>ProductCategoryRollup</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategoryRollup getProductCategoryRollup() throws RepositoryException {
        if (this.productCategoryRollup == null) {
            this.productCategoryRollup = getRelatedOne(ProductCategoryRollup.class, "ProductCategoryRollup");
        }
        return this.productCategoryRollup;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategoryRole</code> by the relation named <code>ProductCategoryRole</code>.
     * @return the <code>ProductCategoryRole</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategoryRole getProductCategoryRole() throws RepositoryException {
        if (this.productCategoryRole == null) {
            this.productCategoryRole = getRelatedOne(ProductCategoryRole.class, "ProductCategoryRole");
        }
        return this.productCategoryRole;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getProductCategory() throws RepositoryException {
        if (this.productCategory == null) {
            this.productCategory = getRelatedOne(ProductCategory.class, "ProductCategory");
        }
        return this.productCategory;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ParentProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getParentProductCategory() throws RepositoryException {
        if (this.parentProductCategory == null) {
            this.parentProductCategory = getRelatedOne(ProductCategory.class, "ParentProductCategory");
        }
        return this.parentProductCategory;
    }

    /**
     * Auto generated value setter.
     * @param productCategoryRollup the productCategoryRollup to set
    */
    public void setProductCategoryRollup(ProductCategoryRollup productCategoryRollup) {
        this.productCategoryRollup = productCategoryRollup;
    }
    /**
     * Auto generated value setter.
     * @param productCategoryRole the productCategoryRole to set
    */
    public void setProductCategoryRole(ProductCategoryRole productCategoryRole) {
        this.productCategoryRole = productCategoryRole;
    }
    /**
     * Auto generated value setter.
     * @param productCategory the productCategory to set
    */
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    /**
     * Auto generated value setter.
     * @param parentProductCategory the parentProductCategory to set
    */
    public void setParentProductCategory(ProductCategory parentProductCategory) {
        this.parentProductCategory = parentProductCategory;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductCategoryId((String) mapValue.get("productCategoryId"));
        setParentProductCategoryId((String) mapValue.get("parentProductCategoryId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setRoleFromDate((Timestamp) mapValue.get("roleFromDate"));
        setRoleThruDate((Timestamp) mapValue.get("roleThruDate"));
        setRoleComments((String) mapValue.get("roleComments"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("parentProductCategoryId", getParentProductCategoryId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("roleFromDate", getRoleFromDate());
        mapValue.put("roleThruDate", getRoleThruDate());
        mapValue.put("roleComments", getRoleComments());
        return mapValue;
    }


}
