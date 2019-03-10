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
 * Auto generated base entity TrackingCodeAndOrderHeader.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectTrackingCodeAndOrderHeaders", query="SELECT OH.GRAND_TOTAL AS \"grandTotal\",TCO.ORDER_ID AS \"orderId\",OH.ORDER_DATE AS \"orderDate\",TCO.TRACKING_CODE_ID AS \"trackingCodeId\" FROM TRACKING_CODE_ORDER TCO INNER JOIN ORDER_HEADER OH ON TCO.ORDER_ID = OH.ORDER_ID", resultSetMapping="TrackingCodeAndOrderHeaderMapping")
@SqlResultSetMapping(name="TrackingCodeAndOrderHeaderMapping", entities={
@EntityResult(entityClass=TrackingCodeAndOrderHeader.class, fields = {
@FieldResult(name="grandTotal", column="grandTotal")
,@FieldResult(name="orderId", column="orderId")
,@FieldResult(name="orderDate", column="orderDate")
,@FieldResult(name="trackingCodeId", column="trackingCodeId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class TrackingCodeAndOrderHeader extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("grandTotal", "OH.GRAND_TOTAL");
        fields.put("orderId", "TCO.ORDER_ID");
        fields.put("orderDate", "OH.ORDER_DATE");
        fields.put("trackingCodeId", "TCO.TRACKING_CODE_ID");
fieldMapColumns.put("TrackingCodeAndOrderHeader", fields);
}
  public static enum Fields implements EntityFieldInterface<TrackingCodeAndOrderHeader> {
    grandTotal("grandTotal"),
    orderId("orderId"),
    orderDate("orderDate"),
    trackingCodeId("trackingCodeId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private BigDecimal grandTotal;
    @Id
   private Long orderId;
    
   private Timestamp orderDate;
    
   private String trackingCodeId;

  /**
   * Default constructor.
   */
  public TrackingCodeAndOrderHeader() {
      super();
      this.baseEntityName = "TrackingCodeAndOrderHeader";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("grandTotal");this.allFieldsNames.add("orderId");this.allFieldsNames.add("orderDate");this.allFieldsNames.add("trackingCodeId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TrackingCodeAndOrderHeader(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
    /**
     * Auto generated value setter.
     * @param trackingCodeId the trackingCodeId to set
     */
    public void setTrackingCodeId(String trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getGrandTotal() {
        return this.grandTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTrackingCodeId() {
        return this.trackingCodeId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGrandTotal(convertToBigDecimal(mapValue.get("grandTotal")));
        setOrderId((Long) mapValue.get("orderId"));
        setOrderDate((Timestamp) mapValue.get("orderDate"));
        setTrackingCodeId((String) mapValue.get("trackingCodeId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("grandTotal", getGrandTotal());
        mapValue.put("orderId", getOrderId());
        mapValue.put("orderDate", getOrderDate());
        mapValue.put("trackingCodeId", getTrackingCodeId());
        return mapValue;
    }


}
