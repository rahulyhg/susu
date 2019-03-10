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

/**
 * Auto generated base entity WorkEffortAndInventoryProduced.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortAndInventoryProduceds", query="SELECT II.PRODUCT_ID AS \"productId\",II.CURRENCY_UOM_ID AS \"currencyUomId\",II.UNIT_COST AS \"unitCost\",WEIP.WORK_EFFORT_ID AS \"workEffortId\",WEIP.INVENTORY_ITEM_ID AS \"inventoryItemId\" FROM WORK_EFFORT_INVENTORY_PRODUCED WEIP INNER JOIN INVENTORY_ITEM II ON WEIP.INVENTORY_ITEM_ID = II.INVENTORY_ITEM_ID", resultSetMapping="WorkEffortAndInventoryProducedMapping")
@SqlResultSetMapping(name="WorkEffortAndInventoryProducedMapping", entities={
@EntityResult(entityClass=WorkEffortAndInventoryProduced.class, fields = {
@FieldResult(name="productId", column="productId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="unitCost", column="unitCost")
,@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="inventoryItemId", column="inventoryItemId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortAndInventoryProduced extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productId", "II.PRODUCT_ID");
        fields.put("currencyUomId", "II.CURRENCY_UOM_ID");
        fields.put("unitCost", "II.UNIT_COST");
        fields.put("workEffortId", "WEIP.WORK_EFFORT_ID");
        fields.put("inventoryItemId", "WEIP.INVENTORY_ITEM_ID");
fieldMapColumns.put("WorkEffortAndInventoryProduced", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortAndInventoryProduced> {
    productId("productId"),
    currencyUomId("currencyUomId"),
    unitCost("unitCost"),
    workEffortId("workEffortId"),
    inventoryItemId("inventoryItemId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String productId;
    
   private String currencyUomId;
    
   private BigDecimal unitCost;
    @Id
   private String workEffortId;
    
   private String inventoryItemId;

  /**
   * Default constructor.
   */
  public WorkEffortAndInventoryProduced() {
      super();
      this.baseEntityName = "WorkEffortAndInventoryProduced";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("inventoryItemId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("unitCost");this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("inventoryItemId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortAndInventoryProduced(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
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
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
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
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getUnitCost() {
        return this.unitCost;
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
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductId((String) mapValue.get("productId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setUnitCost(convertToBigDecimal(mapValue.get("unitCost")));
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setInventoryItemId((String) mapValue.get("inventoryItemId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("productId", getProductId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("unitCost", getUnitCost());
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("inventoryItemId", getInventoryItemId());
        return mapValue;
    }


}
