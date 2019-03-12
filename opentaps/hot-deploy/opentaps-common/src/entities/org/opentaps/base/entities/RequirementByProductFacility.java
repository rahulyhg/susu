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
 * Auto generated base entity RequirementByProductFacility.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectRequirementByProductFacilitys", query="SELECT RQ.STATUS_ID AS \"statusId\",RQ.PRODUCT_ID AS \"productId\",RQ.FACILITY_ID AS \"facilityId\",RQ.QUANTITY AS \"quantity\" FROM REQUIREMENT RQ", resultSetMapping="RequirementByProductFacilityMapping")
@SqlResultSetMapping(name="RequirementByProductFacilityMapping", entities={
@EntityResult(entityClass=RequirementByProductFacility.class, fields = {
@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="productId", column="productId")
,@FieldResult(name="facilityId", column="facilityId")
,@FieldResult(name="quantity", column="quantity")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class RequirementByProductFacility extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("statusId", "RQ.STATUS_ID");
        fields.put("productId", "RQ.PRODUCT_ID");
        fields.put("facilityId", "RQ.FACILITY_ID");
        fields.put("quantity", "RQ.QUANTITY");
fieldMapColumns.put("RequirementByProductFacility", fields);
}
  public static enum Fields implements EntityFieldInterface<RequirementByProductFacility> {
    statusId("statusId"),
    productId("productId"),
    facilityId("facilityId"),
    quantity("quantity");
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
   private String statusId;
    
   private String productId;
    
   private String facilityId;
    
   private BigDecimal quantity;

  /**
   * Default constructor.
   */
  public RequirementByProductFacility() {
      super();
      this.baseEntityName = "RequirementByProductFacility";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("statusId");this.allFieldsNames.add("productId");this.allFieldsNames.add("facilityId");this.allFieldsNames.add("quantity");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public RequirementByProductFacility(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }
    /**
     * Auto generated value setter.
     * @param quantity the quantity to set
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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
    public String getProductId() {
        return this.productId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantity() {
        return this.quantity;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setStatusId((String) mapValue.get("statusId"));
        setProductId((String) mapValue.get("productId"));
        setFacilityId((String) mapValue.get("facilityId"));
        setQuantity(convertToBigDecimal(mapValue.get("quantity")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("statusId", getStatusId());
        mapValue.put("productId", getProductId());
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("quantity", getQuantity());
        return mapValue;
    }


}