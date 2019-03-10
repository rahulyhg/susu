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
import java.sql.Timestamp;

/**
 * Auto generated base entity InventoryItemTypeAttr.
 */
@javax.persistence.Entity
@Table(name="INVENTORY_ITEM_TYPE_ATTR")
public class InventoryItemTypeAttr extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("inventoryItemTypeId", "INVENTORY_ITEM_TYPE_ID");
        fields.put("attrName", "ATTR_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InventoryItemTypeAttr", fields);
}
  public static enum Fields implements EntityFieldInterface<InventoryItemTypeAttr> {
    inventoryItemTypeId("inventoryItemTypeId"),
    attrName("attrName"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.InventoryItemTypeAttrPkBridge.class)
     private InventoryItemTypeAttrPk id = new InventoryItemTypeAttrPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>InventoryItemTypeAttrPk</code>
     */
      public InventoryItemTypeAttrPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>InventoryItemTypeAttrPk</code> value to set
    */   
      public void setId(InventoryItemTypeAttrPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="INVENTORY_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private InventoryItemType inventoryItemType = null;
   private transient List<InventoryItemAttribute> inventoryItemAttributes = null;
   private transient List<InventoryItem> inventoryItems = null;

  /**
   * Default constructor.
   */
  public InventoryItemTypeAttr() {
      super();
      this.baseEntityName = "InventoryItemTypeAttr";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("inventoryItemTypeId");this.primaryKeyNames.add("attrName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("inventoryItemTypeId");this.allFieldsNames.add("attrName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InventoryItemTypeAttr(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param inventoryItemTypeId the inventoryItemTypeId to set
     */
    public void setInventoryItemTypeId(String inventoryItemTypeId) {
        id.setInventoryItemTypeId(inventoryItemTypeId);
    }
    /**
     * Auto generated value setter.
     * @param attrName the attrName to set
     */
    public void setAttrName(String attrName) {
        id.setAttrName(attrName);
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
    public String getInventoryItemTypeId() {
        return this.id.getInventoryItemTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAttrName() {
        return this.id.getAttrName();
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
     * Auto generated method that gets the related <code>InventoryItemType</code> by the relation named <code>InventoryItemType</code>.
     * @return the <code>InventoryItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public InventoryItemType getInventoryItemType() throws RepositoryException {
        if (this.inventoryItemType == null) {
            this.inventoryItemType = getRelatedOne(InventoryItemType.class, "InventoryItemType");
        }
        return this.inventoryItemType;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItemAttribute</code> by the relation named <code>InventoryItemAttribute</code>.
     * @return the list of <code>InventoryItemAttribute</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItemAttribute> getInventoryItemAttributes() throws RepositoryException {
        if (this.inventoryItemAttributes == null) {
            this.inventoryItemAttributes = getRelated(InventoryItemAttribute.class, "InventoryItemAttribute");
        }
        return this.inventoryItemAttributes;
    }
    /**
     * Auto generated method that gets the related <code>InventoryItem</code> by the relation named <code>InventoryItem</code>.
     * @return the list of <code>InventoryItem</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InventoryItem> getInventoryItems() throws RepositoryException {
        if (this.inventoryItems == null) {
            this.inventoryItems = getRelated(InventoryItem.class, "InventoryItem");
        }
        return this.inventoryItems;
    }

    /**
     * Auto generated value setter.
     * @param inventoryItemType the inventoryItemType to set
    */
    public void setInventoryItemType(InventoryItemType inventoryItemType) {
        this.inventoryItemType = inventoryItemType;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemAttributes the inventoryItemAttributes to set
    */
    public void setInventoryItemAttributes(List<InventoryItemAttribute> inventoryItemAttributes) {
        this.inventoryItemAttributes = inventoryItemAttributes;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItems the inventoryItems to set
    */
    public void setInventoryItems(List<InventoryItem> inventoryItems) {
        this.inventoryItems = inventoryItems;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInventoryItemTypeId((String) mapValue.get("inventoryItemTypeId"));
        setAttrName((String) mapValue.get("attrName"));
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
        mapValue.put("inventoryItemTypeId", getInventoryItemTypeId());
        mapValue.put("attrName", getAttrName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
