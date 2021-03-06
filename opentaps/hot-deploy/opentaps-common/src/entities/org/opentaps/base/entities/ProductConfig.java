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
 * Auto generated base entity ProductConfig.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CONFIG")
public class ProductConfig extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "PRODUCT_ID");
        fields.put("configItemId", "CONFIG_ITEM_ID");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("fromDate", "FROM_DATE");
        fields.put("description", "DESCRIPTION");
        fields.put("longDescription", "LONG_DESCRIPTION");
        fields.put("configTypeId", "CONFIG_TYPE_ID");
        fields.put("defaultConfigOptionId", "DEFAULT_CONFIG_OPTION_ID");
        fields.put("thruDate", "THRU_DATE");
        fields.put("isMandatory", "IS_MANDATORY");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductConfig", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductConfig> {
    productId("productId"),
    configItemId("configItemId"),
    sequenceNum("sequenceNum"),
    fromDate("fromDate"),
    description("description"),
    longDescription("longDescription"),
    configTypeId("configTypeId"),
    defaultConfigOptionId("defaultConfigOptionId"),
    thruDate("thruDate"),
    isMandatory("isMandatory"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductConfigPkBridge.class)
     private ProductConfigPk id = new ProductConfigPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductConfigPk</code>
     */
      public ProductConfigPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductConfigPk</code> value to set
    */   
      public void setId(ProductConfigPk id) {
         this.id = id;
      }
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LONG_DESCRIPTION")
   private String longDescription;
   @Column(name="CONFIG_TYPE_ID")
   private String configTypeId;
   @Column(name="DEFAULT_CONFIG_OPTION_ID")
   private String defaultConfigOptionId;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="IS_MANDATORY")
   private String isMandatory;
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
   
   private Product productProduct = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONFIG_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductConfigItem configItemProductConfigItem = null;

  /**
   * Default constructor.
   */
  public ProductConfig() {
      super();
      this.baseEntityName = "ProductConfig";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productId");this.primaryKeyNames.add("configItemId");this.primaryKeyNames.add("sequenceNum");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("configItemId");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("description");this.allFieldsNames.add("longDescription");this.allFieldsNames.add("configTypeId");this.allFieldsNames.add("defaultConfigOptionId");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("isMandatory");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductConfig(RepositoryInterface repository) {
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
     * @param configItemId the configItemId to set
     */
    public void setConfigItemId(String configItemId) {
        id.setConfigItemId(configItemId);
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        id.setSequenceNum(sequenceNum);
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
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Auto generated value setter.
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    /**
     * Auto generated value setter.
     * @param configTypeId the configTypeId to set
     */
    public void setConfigTypeId(String configTypeId) {
        this.configTypeId = configTypeId;
    }
    /**
     * Auto generated value setter.
     * @param defaultConfigOptionId the defaultConfigOptionId to set
     */
    public void setDefaultConfigOptionId(String defaultConfigOptionId) {
        this.defaultConfigOptionId = defaultConfigOptionId;
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
     * @param isMandatory the isMandatory to set
     */
    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
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
    public String getConfigItemId() {
        return this.id.getConfigItemId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.id.getSequenceNum();
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
     * @return <code>String</code>
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLongDescription() {
        return this.longDescription;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigTypeId() {
        return this.configTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDefaultConfigOptionId() {
        return this.defaultConfigOptionId;
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
    public String getIsMandatory() {
        return this.isMandatory;
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
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>ProductProduct</code>.
     * @return the <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public Product getProductProduct() throws RepositoryException {
        if (this.productProduct == null) {
            this.productProduct = getRelatedOne(Product.class, "ProductProduct");
        }
        return this.productProduct;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigItem</code> by the relation named <code>ConfigItemProductConfigItem</code>.
     * @return the <code>ProductConfigItem</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductConfigItem getConfigItemProductConfigItem() throws RepositoryException {
        if (this.configItemProductConfigItem == null) {
            this.configItemProductConfigItem = getRelatedOne(ProductConfigItem.class, "ConfigItemProductConfigItem");
        }
        return this.configItemProductConfigItem;
    }

    /**
     * Auto generated value setter.
     * @param productProduct the productProduct to set
    */
    public void setProductProduct(Product productProduct) {
        this.productProduct = productProduct;
    }
    /**
     * Auto generated value setter.
     * @param configItemProductConfigItem the configItemProductConfigItem to set
    */
    public void setConfigItemProductConfigItem(ProductConfigItem configItemProductConfigItem) {
        this.configItemProductConfigItem = configItemProductConfigItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setConfigItemId((String) mapValue.get("configItemId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setDescription((String) mapValue.get("description"));
        setLongDescription((String) mapValue.get("longDescription"));
        setConfigTypeId((String) mapValue.get("configTypeId"));
        setDefaultConfigOptionId((String) mapValue.get("defaultConfigOptionId"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setIsMandatory((String) mapValue.get("isMandatory"));
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
        mapValue.put("configItemId", getConfigItemId());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("description", getDescription());
        mapValue.put("longDescription", getLongDescription());
        mapValue.put("configTypeId", getConfigTypeId());
        mapValue.put("defaultConfigOptionId", getDefaultConfigOptionId());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("isMandatory", getIsMandatory());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
