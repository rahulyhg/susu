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
 * Auto generated base entity ProductFeatureGroupAndAppl.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectProductFeatureGroupAndAppls", query="SELECT PFGA.PRODUCT_FEATURE_GROUP_ID AS \"productFeatureGroupId\",PFGA.PRODUCT_FEATURE_ID AS \"productFeatureId\",PFGA.FROM_DATE AS \"fromDate\",PFGA.THRU_DATE AS \"thruDate\",PFGA.SEQUENCE_NUM AS \"sequenceNum\",PF.PRODUCT_FEATURE_TYPE_ID AS \"productFeatureTypeId\",PF.PRODUCT_FEATURE_CATEGORY_ID AS \"productFeatureCategoryId\",PF.DESCRIPTION AS \"description\",PF.UOM_ID AS \"uomId\",PF.NUMBER_SPECIFIED AS \"numberSpecified\",PF.DEFAULT_AMOUNT AS \"defaultAmount\",PF.DEFAULT_SEQUENCE_NUM AS \"defaultSequenceNum\",PF.ABBREV AS \"abbrev\",PF.ID_CODE AS \"idCode\" FROM PRODUCT_FEATURE_GROUP_APPL PFGA INNER JOIN PRODUCT_FEATURE PF ON PFGA.PRODUCT_FEATURE_ID = PF.PRODUCT_FEATURE_ID", resultSetMapping="ProductFeatureGroupAndApplMapping")
@SqlResultSetMapping(name="ProductFeatureGroupAndApplMapping", entities={
@EntityResult(entityClass=ProductFeatureGroupAndAppl.class, fields = {
@FieldResult(name="productFeatureGroupId", column="productFeatureGroupId")
,@FieldResult(name="productFeatureId", column="productFeatureId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="sequenceNum", column="sequenceNum")
,@FieldResult(name="productFeatureTypeId", column="productFeatureTypeId")
,@FieldResult(name="productFeatureCategoryId", column="productFeatureCategoryId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="uomId", column="uomId")
,@FieldResult(name="numberSpecified", column="numberSpecified")
,@FieldResult(name="defaultAmount", column="defaultAmount")
,@FieldResult(name="defaultSequenceNum", column="defaultSequenceNum")
,@FieldResult(name="abbrev", column="abbrev")
,@FieldResult(name="idCode", column="idCode")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ProductFeatureGroupAndAppl extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productFeatureGroupId", "PFGA.PRODUCT_FEATURE_GROUP_ID");
        fields.put("productFeatureId", "PFGA.PRODUCT_FEATURE_ID");
        fields.put("fromDate", "PFGA.FROM_DATE");
        fields.put("thruDate", "PFGA.THRU_DATE");
        fields.put("sequenceNum", "PFGA.SEQUENCE_NUM");
        fields.put("productFeatureTypeId", "PF.PRODUCT_FEATURE_TYPE_ID");
        fields.put("productFeatureCategoryId", "PF.PRODUCT_FEATURE_CATEGORY_ID");
        fields.put("description", "PF.DESCRIPTION");
        fields.put("uomId", "PF.UOM_ID");
        fields.put("numberSpecified", "PF.NUMBER_SPECIFIED");
        fields.put("defaultAmount", "PF.DEFAULT_AMOUNT");
        fields.put("defaultSequenceNum", "PF.DEFAULT_SEQUENCE_NUM");
        fields.put("abbrev", "PF.ABBREV");
        fields.put("idCode", "PF.ID_CODE");
fieldMapColumns.put("ProductFeatureGroupAndAppl", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductFeatureGroupAndAppl> {
    productFeatureGroupId("productFeatureGroupId"),
    productFeatureId("productFeatureId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    sequenceNum("sequenceNum"),
    productFeatureTypeId("productFeatureTypeId"),
    productFeatureCategoryId("productFeatureCategoryId"),
    description("description"),
    uomId("uomId"),
    numberSpecified("numberSpecified"),
    defaultAmount("defaultAmount"),
    defaultSequenceNum("defaultSequenceNum"),
    abbrev("abbrev"),
    idCode("idCode");
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
   private String productFeatureGroupId;
    
   private String productFeatureId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private Long sequenceNum;
    
   private String productFeatureTypeId;
    
   private String productFeatureCategoryId;
    
   private String description;
    
   private String uomId;
    
   private BigDecimal numberSpecified;
    
   private BigDecimal defaultAmount;
    
   private Long defaultSequenceNum;
    
   private String abbrev;
    
   private String idCode;

  /**
   * Default constructor.
   */
  public ProductFeatureGroupAndAppl() {
      super();
      this.baseEntityName = "ProductFeatureGroupAndAppl";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productFeatureGroupId");this.primaryKeyNames.add("productFeatureId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productFeatureGroupId");this.allFieldsNames.add("productFeatureId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("productFeatureTypeId");this.allFieldsNames.add("productFeatureCategoryId");this.allFieldsNames.add("description");this.allFieldsNames.add("uomId");this.allFieldsNames.add("numberSpecified");this.allFieldsNames.add("defaultAmount");this.allFieldsNames.add("defaultSequenceNum");this.allFieldsNames.add("abbrev");this.allFieldsNames.add("idCode");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductFeatureGroupAndAppl(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productFeatureGroupId the productFeatureGroupId to set
     */
    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureId the productFeatureId to set
     */
    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
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
     * @param productFeatureTypeId the productFeatureTypeId to set
     */
    public void setProductFeatureTypeId(String productFeatureTypeId) {
        this.productFeatureTypeId = productFeatureTypeId;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureCategoryId the productFeatureCategoryId to set
     */
    public void setProductFeatureCategoryId(String productFeatureCategoryId) {
        this.productFeatureCategoryId = productFeatureCategoryId;
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
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
    }
    /**
     * Auto generated value setter.
     * @param numberSpecified the numberSpecified to set
     */
    public void setNumberSpecified(BigDecimal numberSpecified) {
        this.numberSpecified = numberSpecified;
    }
    /**
     * Auto generated value setter.
     * @param defaultAmount the defaultAmount to set
     */
    public void setDefaultAmount(BigDecimal defaultAmount) {
        this.defaultAmount = defaultAmount;
    }
    /**
     * Auto generated value setter.
     * @param defaultSequenceNum the defaultSequenceNum to set
     */
    public void setDefaultSequenceNum(Long defaultSequenceNum) {
        this.defaultSequenceNum = defaultSequenceNum;
    }
    /**
     * Auto generated value setter.
     * @param abbrev the abbrev to set
     */
    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }
    /**
     * Auto generated value setter.
     * @param idCode the idCode to set
     */
    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureGroupId() {
        return this.productFeatureGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureId() {
        return this.productFeatureId;
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
    public String getProductFeatureTypeId() {
        return this.productFeatureTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureCategoryId() {
        return this.productFeatureCategoryId;
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
    public String getUomId() {
        return this.uomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getNumberSpecified() {
        return this.numberSpecified;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getDefaultAmount() {
        return this.defaultAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDefaultSequenceNum() {
        return this.defaultSequenceNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAbbrev() {
        return this.abbrev;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIdCode() {
        return this.idCode;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductFeatureGroupId((String) mapValue.get("productFeatureGroupId"));
        setProductFeatureId((String) mapValue.get("productFeatureId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setProductFeatureTypeId((String) mapValue.get("productFeatureTypeId"));
        setProductFeatureCategoryId((String) mapValue.get("productFeatureCategoryId"));
        setDescription((String) mapValue.get("description"));
        setUomId((String) mapValue.get("uomId"));
        setNumberSpecified(convertToBigDecimal(mapValue.get("numberSpecified")));
        setDefaultAmount(convertToBigDecimal(mapValue.get("defaultAmount")));
        setDefaultSequenceNum((Long) mapValue.get("defaultSequenceNum"));
        setAbbrev((String) mapValue.get("abbrev"));
        setIdCode((String) mapValue.get("idCode"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productFeatureGroupId", getProductFeatureGroupId());
        mapValue.put("productFeatureId", getProductFeatureId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("productFeatureTypeId", getProductFeatureTypeId());
        mapValue.put("productFeatureCategoryId", getProductFeatureCategoryId());
        mapValue.put("description", getDescription());
        mapValue.put("uomId", getUomId());
        mapValue.put("numberSpecified", getNumberSpecified());
        mapValue.put("defaultAmount", getDefaultAmount());
        mapValue.put("defaultSequenceNum", getDefaultSequenceNum());
        mapValue.put("abbrev", getAbbrev());
        mapValue.put("idCode", getIdCode());
        return mapValue;
    }


}
