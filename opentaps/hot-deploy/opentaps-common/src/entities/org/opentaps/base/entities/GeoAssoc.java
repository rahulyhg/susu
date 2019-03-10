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
 * Auto generated base entity GeoAssoc.
 */
@javax.persistence.Entity
@Table(name="GEO_ASSOC")
public class GeoAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("geoId", "GEO_ID");
        fields.put("geoIdTo", "GEO_ID_TO");
        fields.put("geoAssocTypeId", "GEO_ASSOC_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("GeoAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<GeoAssoc> {
    geoId("geoId"),
    geoIdTo("geoIdTo"),
    geoAssocTypeId("geoAssocTypeId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.GeoAssocPkBridge.class)
     private GeoAssocPk id = new GeoAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>GeoAssocPk</code>
     */
      public GeoAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>GeoAssocPk</code> value to set
    */   
      public void setId(GeoAssocPk id) {
         this.id = id;
      }
   @Column(name="GEO_ASSOC_TYPE_ID")
   private String geoAssocTypeId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo mainGeo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GEO_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo assocGeo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GEO_ASSOC_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GeoAssocType geoAssocType = null;

  /**
   * Default constructor.
   */
  public GeoAssoc() {
      super();
      this.baseEntityName = "GeoAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("geoId");this.primaryKeyNames.add("geoIdTo");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("geoId");this.allFieldsNames.add("geoIdTo");this.allFieldsNames.add("geoAssocTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GeoAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param geoId the geoId to set
     */
    public void setGeoId(String geoId) {
        id.setGeoId(geoId);
    }
    /**
     * Auto generated value setter.
     * @param geoIdTo the geoIdTo to set
     */
    public void setGeoIdTo(String geoIdTo) {
        id.setGeoIdTo(geoIdTo);
    }
    /**
     * Auto generated value setter.
     * @param geoAssocTypeId the geoAssocTypeId to set
     */
    public void setGeoAssocTypeId(String geoAssocTypeId) {
        this.geoAssocTypeId = geoAssocTypeId;
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
    public String getGeoId() {
        return this.id.getGeoId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoIdTo() {
        return this.id.getGeoIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoAssocTypeId() {
        return this.geoAssocTypeId;
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
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>MainGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getMainGeo() throws RepositoryException {
        if (this.mainGeo == null) {
            this.mainGeo = getRelatedOne(Geo.class, "MainGeo");
        }
        return this.mainGeo;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>AssocGeo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getAssocGeo() throws RepositoryException {
        if (this.assocGeo == null) {
            this.assocGeo = getRelatedOne(Geo.class, "AssocGeo");
        }
        return this.assocGeo;
    }
    /**
     * Auto generated method that gets the related <code>GeoAssocType</code> by the relation named <code>GeoAssocType</code>.
     * @return the <code>GeoAssocType</code>
     * @throws RepositoryException if an error occurs
     */
    public GeoAssocType getGeoAssocType() throws RepositoryException {
        if (this.geoAssocType == null) {
            this.geoAssocType = getRelatedOne(GeoAssocType.class, "GeoAssocType");
        }
        return this.geoAssocType;
    }

    /**
     * Auto generated value setter.
     * @param mainGeo the mainGeo to set
    */
    public void setMainGeo(Geo mainGeo) {
        this.mainGeo = mainGeo;
    }
    /**
     * Auto generated value setter.
     * @param assocGeo the assocGeo to set
    */
    public void setAssocGeo(Geo assocGeo) {
        this.assocGeo = assocGeo;
    }
    /**
     * Auto generated value setter.
     * @param geoAssocType the geoAssocType to set
    */
    public void setGeoAssocType(GeoAssocType geoAssocType) {
        this.geoAssocType = geoAssocType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGeoId((String) mapValue.get("geoId"));
        setGeoIdTo((String) mapValue.get("geoIdTo"));
        setGeoAssocTypeId((String) mapValue.get("geoAssocTypeId"));
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
        mapValue.put("geoId", getGeoId());
        mapValue.put("geoIdTo", getGeoIdTo());
        mapValue.put("geoAssocTypeId", getGeoAssocTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
