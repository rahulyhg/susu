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
 * Auto generated base entity ProductContent.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CONTENT")
public class ProductContent extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("contentId", "CONTENT_ID");
        fields.put("productContentTypeId", "PRODUCT_CONTENT_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("purchaseFromDate", "PURCHASE_FROM_DATE");
        fields.put("purchaseThruDate", "PURCHASE_THRU_DATE");
        fields.put("useCountLimit", "USE_COUNT_LIMIT");
        fields.put("useTime", "USE_TIME");
        fields.put("useTimeUomId", "USE_TIME_UOM_ID");
        fields.put("useRoleTypeId", "USE_ROLE_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductContent", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductContent> {
    productId("productId"),
    contentId("contentId"),
    productContentTypeId("productContentTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    purchaseFromDate("purchaseFromDate"),
    purchaseThruDate("purchaseThruDate"),
    useCountLimit("useCountLimit"),
    useTime("useTime"),
    useTimeUomId("useTimeUomId"),
    useRoleTypeId("useRoleTypeId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductContentPkBridge.class)
     private ProductContentPk id = new ProductContentPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductContentPk</code>
     */
      public ProductContentPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductContentPk</code> value to set
    */   
      public void setId(ProductContentPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="PURCHASE_FROM_DATE")
   private Timestamp purchaseFromDate;
   @Column(name="PURCHASE_THRU_DATE")
   private Timestamp purchaseThruDate;
   @Column(name="USE_COUNT_LIMIT")
   private Long useCountLimit;
   @Column(name="USE_TIME")
   private Long useTime;
   @Column(name="USE_TIME_UOM_ID")
   private String useTimeUomId;
   @Column(name="USE_ROLE_TYPE_ID")
   private String useRoleTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Product product = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Content content = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CONTENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductContentType productContentType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="USE_ROLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType useRoleType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="USE_TIME_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom useTimeUom = null;

  /**
   * Default constructor.
   */
  public ProductContent() {
      super();
      this.baseEntityName = "ProductContent";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("contentId");this.primaryKeyNames.add("productContentTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("contentId");this.allFieldsNames.add("productContentTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("purchaseFromDate");this.allFieldsNames.add("purchaseThruDate");this.allFieldsNames.add("useCountLimit");this.allFieldsNames.add("useTime");this.allFieldsNames.add("useTimeUomId");this.allFieldsNames.add("useRoleTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductContent(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        id.setProductId(productId);
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        id.setContentId(contentId);
    }
    /**
     * Auto generated value setter.
     * @param productContentTypeId the productContentTypeId to set
     */
    public void setProductContentTypeId(String productContentTypeId) {
        id.setProductContentTypeId(productContentTypeId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
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
     * @param purchaseFromDate the purchaseFromDate to set
     */
    public void setPurchaseFromDate(Timestamp purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }
    /**
     * Auto generated value setter.
     * @param purchaseThruDate the purchaseThruDate to set
     */
    public void setPurchaseThruDate(Timestamp purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }
    /**
     * Auto generated value setter.
     * @param useCountLimit the useCountLimit to set
     */
    public void setUseCountLimit(Long useCountLimit) {
        this.useCountLimit = useCountLimit;
    }
    /**
     * Auto generated value setter.
     * @param useTime the useTime to set
     */
    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }
    /**
     * Auto generated value setter.
     * @param useTimeUomId the useTimeUomId to set
     */
    public void setUseTimeUomId(String useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }
    /**
     * Auto generated value setter.
     * @param useRoleTypeId the useRoleTypeId to set
     */
    public void setUseRoleTypeId(String useRoleTypeId) {
        this.useRoleTypeId = useRoleTypeId;
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
    public String getProductId() {
        return this.id.getProductId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentId() {
        return this.id.getContentId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductContentTypeId() {
        return this.id.getProductContentTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getPurchaseFromDate() {
        return this.purchaseFromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPurchaseThruDate() {
        return this.purchaseThruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getUseCountLimit() {
        return this.useCountLimit;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getUseTime() {
        return this.useTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUseTimeUomId() {
        return this.useTimeUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUseRoleTypeId() {
        return this.useRoleTypeId;
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
     * Auto generated method that gets the related <code>Content</code> by the relation named <code>Content</code>.
     * @return the <code>Content</code>
     * @throws RepositoryException if an error occurs
     */
    public Content getContent() throws RepositoryException {
        if (this.content == null) {
            this.content = getRelatedOne(Content.class, "Content");
        }
        return this.content;
    }
    /**
     * Auto generated method that gets the related <code>ProductContentType</code> by the relation named <code>ProductContentType</code>.
     * @return the <code>ProductContentType</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductContentType getProductContentType() throws RepositoryException {
        if (this.productContentType == null) {
            this.productContentType = getRelatedOne(ProductContentType.class, "ProductContentType");
        }
        return this.productContentType;
    }
    /**
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>UseRoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getUseRoleType() throws RepositoryException {
        if (this.useRoleType == null) {
            this.useRoleType = getRelatedOne(RoleType.class, "UseRoleType");
        }
        return this.useRoleType;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>UseTimeUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUseTimeUom() throws RepositoryException {
        if (this.useTimeUom == null) {
            this.useTimeUom = getRelatedOne(Uom.class, "UseTimeUom");
        }
        return this.useTimeUom;
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
     * @param content the content to set
    */
    public void setContent(Content content) {
        this.content = content;
    }
    /**
     * Auto generated value setter.
     * @param productContentType the productContentType to set
    */
    public void setProductContentType(ProductContentType productContentType) {
        this.productContentType = productContentType;
    }
    /**
     * Auto generated value setter.
     * @param useRoleType the useRoleType to set
    */
    public void setUseRoleType(RoleType useRoleType) {
        this.useRoleType = useRoleType;
    }
    /**
     * Auto generated value setter.
     * @param useTimeUom the useTimeUom to set
    */
    public void setUseTimeUom(Uom useTimeUom) {
        this.useTimeUom = useTimeUom;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setContentId((String) mapValue.get("contentId"));
        setProductContentTypeId((String) mapValue.get("productContentTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPurchaseFromDate((Timestamp) mapValue.get("purchaseFromDate"));
        setPurchaseThruDate((Timestamp) mapValue.get("purchaseThruDate"));
        setUseCountLimit((Long) mapValue.get("useCountLimit"));
        setUseTime((Long) mapValue.get("useTime"));
        setUseTimeUomId((String) mapValue.get("useTimeUomId"));
        setUseRoleTypeId((String) mapValue.get("useRoleTypeId"));
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
        mapValue.put("productId", getProductId());
        mapValue.put("contentId", getContentId());
        mapValue.put("productContentTypeId", getProductContentTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("purchaseFromDate", getPurchaseFromDate());
        mapValue.put("purchaseThruDate", getPurchaseThruDate());
        mapValue.put("useCountLimit", getUseCountLimit());
        mapValue.put("useTime", getUseTime());
        mapValue.put("useTimeUomId", getUseTimeUomId());
        mapValue.put("useRoleTypeId", getUseRoleTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
