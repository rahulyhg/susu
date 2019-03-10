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
 * Auto generated base entity ProductConfigOptionIactn.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_CONFIG_OPTION_IACTN")
public class ProductConfigOptionIactn extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("configItemId", "CONFIG_ITEM_ID");
        fields.put("configOptionId", "CONFIG_OPTION_ID");
        fields.put("configItemIdTo", "CONFIG_ITEM_ID_TO");
        fields.put("configOptionIdTo", "CONFIG_OPTION_ID_TO");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("configIactnTypeId", "CONFIG_IACTN_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductConfigOptionIactn", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductConfigOptionIactn> {
    configItemId("configItemId"),
    configOptionId("configOptionId"),
    configItemIdTo("configItemIdTo"),
    configOptionIdTo("configOptionIdTo"),
    sequenceNum("sequenceNum"),
    configIactnTypeId("configIactnTypeId"),
    description("description"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductConfigOptionIactnPkBridge.class)
     private ProductConfigOptionIactnPk id = new ProductConfigOptionIactnPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductConfigOptionIactnPk</code>
     */
      public ProductConfigOptionIactnPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductConfigOptionIactnPk</code> value to set
    */   
      public void setId(ProductConfigOptionIactnPk id) {
         this.id = id;
      }
   @Column(name="CONFIG_IACTN_TYPE_ID")
   private String configIactnTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONFIG_ITEM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductConfigItem configItemProductConfigItem = null;
   private transient ProductConfigOption configOptionProductConfigOption = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONFIG_ITEM_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductConfigItem configItemToProductConfigItem = null;
   private transient ProductConfigOption configOptionToProductConfigOption = null;

  /**
   * Default constructor.
   */
  public ProductConfigOptionIactn() {
      super();
      this.baseEntityName = "ProductConfigOptionIactn";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("configItemId");this.primaryKeyNames.add("configOptionId");this.primaryKeyNames.add("configItemIdTo");this.primaryKeyNames.add("configOptionIdTo");this.primaryKeyNames.add("sequenceNum");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("configItemId");this.allFieldsNames.add("configOptionId");this.allFieldsNames.add("configItemIdTo");this.allFieldsNames.add("configOptionIdTo");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("configIactnTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductConfigOptionIactn(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param configOptionId the configOptionId to set
     */
    public void setConfigOptionId(String configOptionId) {
        id.setConfigOptionId(configOptionId);
    }
    /**
     * Auto generated value setter.
     * @param configItemIdTo the configItemIdTo to set
     */
    public void setConfigItemIdTo(String configItemIdTo) {
        id.setConfigItemIdTo(configItemIdTo);
    }
    /**
     * Auto generated value setter.
     * @param configOptionIdTo the configOptionIdTo to set
     */
    public void setConfigOptionIdTo(String configOptionIdTo) {
        id.setConfigOptionIdTo(configOptionIdTo);
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
     * @param configIactnTypeId the configIactnTypeId to set
     */
    public void setConfigIactnTypeId(String configIactnTypeId) {
        this.configIactnTypeId = configIactnTypeId;
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
    public String getConfigItemId() {
        return this.id.getConfigItemId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigOptionId() {
        return this.id.getConfigOptionId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigItemIdTo() {
        return this.id.getConfigItemIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getConfigOptionIdTo() {
        return this.id.getConfigOptionIdTo();
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
     * @return <code>String</code>
     */
    public String getConfigIactnTypeId() {
        return this.configIactnTypeId;
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
     * Auto generated method that gets the related <code>ProductConfigOption</code> by the relation named <code>ConfigOptionProductConfigOption</code>.
     * @return the <code>ProductConfigOption</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductConfigOption getConfigOptionProductConfigOption() throws RepositoryException {
        if (this.configOptionProductConfigOption == null) {
            this.configOptionProductConfigOption = getRelatedOne(ProductConfigOption.class, "ConfigOptionProductConfigOption");
        }
        return this.configOptionProductConfigOption;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigItem</code> by the relation named <code>ConfigItemToProductConfigItem</code>.
     * @return the <code>ProductConfigItem</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductConfigItem getConfigItemToProductConfigItem() throws RepositoryException {
        if (this.configItemToProductConfigItem == null) {
            this.configItemToProductConfigItem = getRelatedOne(ProductConfigItem.class, "ConfigItemToProductConfigItem");
        }
        return this.configItemToProductConfigItem;
    }
    /**
     * Auto generated method that gets the related <code>ProductConfigOption</code> by the relation named <code>ConfigOptionToProductConfigOption</code>.
     * @return the <code>ProductConfigOption</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductConfigOption getConfigOptionToProductConfigOption() throws RepositoryException {
        if (this.configOptionToProductConfigOption == null) {
            this.configOptionToProductConfigOption = getRelatedOne(ProductConfigOption.class, "ConfigOptionToProductConfigOption");
        }
        return this.configOptionToProductConfigOption;
    }

    /**
     * Auto generated value setter.
     * @param configItemProductConfigItem the configItemProductConfigItem to set
    */
    public void setConfigItemProductConfigItem(ProductConfigItem configItemProductConfigItem) {
        this.configItemProductConfigItem = configItemProductConfigItem;
    }
    /**
     * Auto generated value setter.
     * @param configOptionProductConfigOption the configOptionProductConfigOption to set
    */
    public void setConfigOptionProductConfigOption(ProductConfigOption configOptionProductConfigOption) {
        this.configOptionProductConfigOption = configOptionProductConfigOption;
    }
    /**
     * Auto generated value setter.
     * @param configItemToProductConfigItem the configItemToProductConfigItem to set
    */
    public void setConfigItemToProductConfigItem(ProductConfigItem configItemToProductConfigItem) {
        this.configItemToProductConfigItem = configItemToProductConfigItem;
    }
    /**
     * Auto generated value setter.
     * @param configOptionToProductConfigOption the configOptionToProductConfigOption to set
    */
    public void setConfigOptionToProductConfigOption(ProductConfigOption configOptionToProductConfigOption) {
        this.configOptionToProductConfigOption = configOptionToProductConfigOption;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setConfigItemId((String) mapValue.get("configItemId"));
        setConfigOptionId((String) mapValue.get("configOptionId"));
        setConfigItemIdTo((String) mapValue.get("configItemIdTo"));
        setConfigOptionIdTo((String) mapValue.get("configOptionIdTo"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setConfigIactnTypeId((String) mapValue.get("configIactnTypeId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("configItemId", getConfigItemId());
        mapValue.put("configOptionId", getConfigOptionId());
        mapValue.put("configItemIdTo", getConfigItemIdTo());
        mapValue.put("configOptionIdTo", getConfigOptionIdTo());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("configIactnTypeId", getConfigIactnTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
