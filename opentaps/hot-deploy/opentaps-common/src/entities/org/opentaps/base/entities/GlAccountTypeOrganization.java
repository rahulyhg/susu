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
 * Auto generated base entity GlAccountTypeOrganization.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectGlAccountTypeOrganizations", query="SELECT GAT.DESCRIPTION AS \"description\",GAT.GL_ACCOUNT_TYPE_ID AS \"glAccountTypeId\",GAO.POSTED_BALANCE AS \"postedBalance\",GAO.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",GAO.FROM_DATE AS \"fromDate\",GAO.THRU_DATE AS \"thruDate\",GA.GL_ACCOUNT_ID AS \"glAccountId\",GA.GL_ACCOUNT_CLASS_ID AS \"glAccountClassId\",GA.GL_RESOURCE_TYPE_ID AS \"glResourceTypeId\",GA.GL_XBRL_CLASS_ID AS \"glXbrlClassId\",GA.PARENT_GL_ACCOUNT_ID AS \"parentGlAccountId\",GA.ACCOUNT_CODE AS \"accountCode\",GA.ACCOUNT_NAME AS \"accountName\",GA.DESCRIPTION AS \"description\",GA.PRODUCT_ID AS \"productId\" FROM GL_ACCOUNT_TYPE_DEFAULT GATD INNER JOIN GL_ACCOUNT_TYPE GAT ON GATD.GL_ACCOUNT_TYPE_ID = GAT.GL_ACCOUNT_TYPE_ID INNER JOIN GL_ACCOUNT GA ON GATD.GL_ACCOUNT_ID = GA.GL_ACCOUNT_ID INNER JOIN GL_ACCOUNT_ORGANIZATION GAO ON GATD.GL_ACCOUNT_ID = GAO.GL_ACCOUNT_ID AND GATD.ORGANIZATION_PARTY_ID = GAO.ORGANIZATION_PARTY_ID", resultSetMapping="GlAccountTypeOrganizationMapping")
@SqlResultSetMapping(name="GlAccountTypeOrganizationMapping", entities={
@EntityResult(entityClass=GlAccountTypeOrganization.class, fields = {
@FieldResult(name="glAccountTypeDescription", column="glAccountTypeDescription")
,@FieldResult(name="glAccountTypeId", column="glAccountTypeId")
,@FieldResult(name="postedBalance", column="postedBalance")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="glAccountClassId", column="glAccountClassId")
,@FieldResult(name="glResourceTypeId", column="glResourceTypeId")
,@FieldResult(name="glXbrlClassId", column="glXbrlClassId")
,@FieldResult(name="parentGlAccountId", column="parentGlAccountId")
,@FieldResult(name="accountCode", column="accountCode")
,@FieldResult(name="accountName", column="accountName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="productId", column="productId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class GlAccountTypeOrganization extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glAccountTypeDescription", "GAT.DESCRIPTION");
        fields.put("glAccountTypeId", "GAT.GL_ACCOUNT_TYPE_ID");
        fields.put("postedBalance", "GAO.POSTED_BALANCE");
        fields.put("organizationPartyId", "GAO.ORGANIZATION_PARTY_ID");
        fields.put("fromDate", "GAO.FROM_DATE");
        fields.put("thruDate", "GAO.THRU_DATE");
        fields.put("glAccountId", "GA.GL_ACCOUNT_ID");
        fields.put("glAccountClassId", "GA.GL_ACCOUNT_CLASS_ID");
        fields.put("glResourceTypeId", "GA.GL_RESOURCE_TYPE_ID");
        fields.put("glXbrlClassId", "GA.GL_XBRL_CLASS_ID");
        fields.put("parentGlAccountId", "GA.PARENT_GL_ACCOUNT_ID");
        fields.put("accountCode", "GA.ACCOUNT_CODE");
        fields.put("accountName", "GA.ACCOUNT_NAME");
        fields.put("description", "GA.DESCRIPTION");
        fields.put("productId", "GA.PRODUCT_ID");
fieldMapColumns.put("GlAccountTypeOrganization", fields);
}
  public static enum Fields implements EntityFieldInterface<GlAccountTypeOrganization> {
    glAccountTypeDescription("glAccountTypeDescription"),
    glAccountTypeId("glAccountTypeId"),
    postedBalance("postedBalance"),
    organizationPartyId("organizationPartyId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    glAccountId("glAccountId"),
    glAccountClassId("glAccountClassId"),
    glResourceTypeId("glResourceTypeId"),
    glXbrlClassId("glXbrlClassId"),
    parentGlAccountId("parentGlAccountId"),
    accountCode("accountCode"),
    accountName("accountName"),
    description("description"),
    productId("productId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String glAccountTypeDescription;
    @Id
   private String glAccountTypeId;
    
   private BigDecimal postedBalance;
    
   private String organizationPartyId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String glAccountId;
    
   private String glAccountClassId;
    
   private String glResourceTypeId;
    
   private String glXbrlClassId;
    
   private String parentGlAccountId;
    
   private String accountCode;
    
   private String accountName;
    
   private String description;
    
   private String productId;

  /**
   * Default constructor.
   */
  public GlAccountTypeOrganization() {
      super();
      this.baseEntityName = "GlAccountTypeOrganization";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountTypeId");this.primaryKeyNames.add("organizationPartyId");this.primaryKeyNames.add("glAccountId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glAccountTypeDescription");this.allFieldsNames.add("glAccountTypeId");this.allFieldsNames.add("postedBalance");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("glAccountClassId");this.allFieldsNames.add("glResourceTypeId");this.allFieldsNames.add("glXbrlClassId");this.allFieldsNames.add("parentGlAccountId");this.allFieldsNames.add("accountCode");this.allFieldsNames.add("accountName");this.allFieldsNames.add("description");this.allFieldsNames.add("productId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlAccountTypeOrganization(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param glAccountTypeDescription the glAccountTypeDescription to set
     */
    public void setGlAccountTypeDescription(String glAccountTypeDescription) {
        this.glAccountTypeDescription = glAccountTypeDescription;
    }
    /**
     * Auto generated value setter.
     * @param glAccountTypeId the glAccountTypeId to set
     */
    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * @param postedBalance the postedBalance to set
     */
    public void setPostedBalance(BigDecimal postedBalance) {
        this.postedBalance = postedBalance;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
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
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param glAccountClassId the glAccountClassId to set
     */
    public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }
    /**
     * Auto generated value setter.
     * @param glResourceTypeId the glResourceTypeId to set
     */
    public void setGlResourceTypeId(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }
    /**
     * Auto generated value setter.
     * @param glXbrlClassId the glXbrlClassId to set
     */
    public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }
    /**
     * Auto generated value setter.
     * @param parentGlAccountId the parentGlAccountId to set
     */
    public void setParentGlAccountId(String parentGlAccountId) {
        this.parentGlAccountId = parentGlAccountId;
    }
    /**
     * Auto generated value setter.
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }
    /**
     * Auto generated value setter.
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountTypeDescription() {
        return this.glAccountTypeDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountTypeId() {
        return this.glAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPostedBalance() {
        return this.postedBalance;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
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
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountClassId() {
        return this.glAccountClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlResourceTypeId() {
        return this.glResourceTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlXbrlClassId() {
        return this.glXbrlClassId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentGlAccountId() {
        return this.parentGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountCode() {
        return this.accountCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountName() {
        return this.accountName;
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
    public String getProductId() {
        return this.productId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlAccountTypeDescription((String) mapValue.get("glAccountTypeDescription"));
        setGlAccountTypeId((String) mapValue.get("glAccountTypeId"));
        setPostedBalance(convertToBigDecimal(mapValue.get("postedBalance")));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setGlAccountClassId((String) mapValue.get("glAccountClassId"));
        setGlResourceTypeId((String) mapValue.get("glResourceTypeId"));
        setGlXbrlClassId((String) mapValue.get("glXbrlClassId"));
        setParentGlAccountId((String) mapValue.get("parentGlAccountId"));
        setAccountCode((String) mapValue.get("accountCode"));
        setAccountName((String) mapValue.get("accountName"));
        setDescription((String) mapValue.get("description"));
        setProductId((String) mapValue.get("productId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("glAccountTypeDescription", getGlAccountTypeDescription());
        mapValue.put("glAccountTypeId", getGlAccountTypeId());
        mapValue.put("postedBalance", getPostedBalance());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("glAccountClassId", getGlAccountClassId());
        mapValue.put("glResourceTypeId", getGlResourceTypeId());
        mapValue.put("glXbrlClassId", getGlXbrlClassId());
        mapValue.put("parentGlAccountId", getParentGlAccountId());
        mapValue.put("accountCode", getAccountCode());
        mapValue.put("accountName", getAccountName());
        mapValue.put("description", getDescription());
        mapValue.put("productId", getProductId());
        return mapValue;
    }


}
