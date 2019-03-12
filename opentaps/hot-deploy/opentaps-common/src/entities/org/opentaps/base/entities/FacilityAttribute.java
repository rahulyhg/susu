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
 * Auto generated base entity FacilityAttribute.
 */
@javax.persistence.Entity
@Table(name="FACILITY_ATTRIBUTE")
public class FacilityAttribute extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("facilityId", "FACILITY_ID");
        fields.put("attrName", "ATTR_NAME");
        fields.put("attrValue", "ATTR_VALUE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("FacilityAttribute", fields);
}
  public static enum Fields implements EntityFieldInterface<FacilityAttribute> {
    facilityId("facilityId"),
    attrName("attrName"),
    attrValue("attrValue"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.FacilityAttributePkBridge.class)
     private FacilityAttributePk id = new FacilityAttributePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>FacilityAttributePk</code>
     */
      public FacilityAttributePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>FacilityAttributePk</code> value to set
    */   
      public void setId(FacilityAttributePk id) {
         this.id = id;
      }
   @Column(name="ATTR_VALUE")
   private String attrValue;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="FACILITY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Facility facility = null;
   private transient List<FacilityTypeAttr> facilityTypeAttrs = null;

  /**
   * Default constructor.
   */
  public FacilityAttribute() {
      super();
      this.baseEntityName = "FacilityAttribute";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("facilityId");this.primaryKeyNames.add("attrName");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("facilityId");this.allFieldsNames.add("attrName");this.allFieldsNames.add("attrValue");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public FacilityAttribute(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param facilityId the facilityId to set
     */
    public void setFacilityId(String facilityId) {
        id.setFacilityId(facilityId);
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
     * @param attrValue the attrValue to set
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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
    public String getFacilityId() {
        return this.id.getFacilityId();
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
     * @return <code>String</code>
     */
    public String getAttrValue() {
        return this.attrValue;
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
     * Auto generated method that gets the related <code>Facility</code> by the relation named <code>Facility</code>.
     * @return the <code>Facility</code>
     * @throws RepositoryException if an error occurs
     */
    public Facility getFacility() throws RepositoryException {
        if (this.facility == null) {
            this.facility = getRelatedOne(Facility.class, "Facility");
        }
        return this.facility;
    }
    /**
     * Auto generated method that gets the related <code>FacilityTypeAttr</code> by the relation named <code>FacilityTypeAttr</code>.
     * @return the list of <code>FacilityTypeAttr</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FacilityTypeAttr> getFacilityTypeAttrs() throws RepositoryException {
        if (this.facilityTypeAttrs == null) {
            this.facilityTypeAttrs = getRelated(FacilityTypeAttr.class, "FacilityTypeAttr");
        }
        return this.facilityTypeAttrs;
    }

    /**
     * Auto generated value setter.
     * @param facility the facility to set
    */
    public void setFacility(Facility facility) {
        this.facility = facility;
    }
    /**
     * Auto generated value setter.
     * @param facilityTypeAttrs the facilityTypeAttrs to set
    */
    public void setFacilityTypeAttrs(List<FacilityTypeAttr> facilityTypeAttrs) {
        this.facilityTypeAttrs = facilityTypeAttrs;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setFacilityId((String) mapValue.get("facilityId"));
        setAttrName((String) mapValue.get("attrName"));
        setAttrValue((String) mapValue.get("attrValue"));
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
        mapValue.put("facilityId", getFacilityId());
        mapValue.put("attrName", getAttrName());
        mapValue.put("attrValue", getAttrValue());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}