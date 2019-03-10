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
 * Auto generated base entity UomConversion.
 */
@javax.persistence.Entity
@Table(name="UOM_CONVERSION")
public class UomConversion extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("uomId", "UOM_ID");
        fields.put("uomIdTo", "UOM_ID_TO");
        fields.put("conversionFactor", "CONVERSION_FACTOR");
        fields.put("customMethodId", "CUSTOM_METHOD_ID");
        fields.put("decimalScale", "DECIMAL_SCALE");
        fields.put("roundingMode", "ROUNDING_MODE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("UomConversion", fields);
}
  public static enum Fields implements EntityFieldInterface<UomConversion> {
    uomId("uomId"),
    uomIdTo("uomIdTo"),
    conversionFactor("conversionFactor"),
    customMethodId("customMethodId"),
    decimalScale("decimalScale"),
    roundingMode("roundingMode"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.UomConversionPkBridge.class)
     private UomConversionPk id = new UomConversionPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>UomConversionPk</code>
     */
      public UomConversionPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>UomConversionPk</code> value to set
    */   
      public void setId(UomConversionPk id) {
         this.id = id;
      }
   @Column(name="CONVERSION_FACTOR")
   private BigDecimal conversionFactor;
   @Column(name="CUSTOM_METHOD_ID")
   private String customMethodId;
   @Column(name="DECIMAL_SCALE")
   private Long decimalScale;
   @Column(name="ROUNDING_MODE")
   private String roundingMode;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom mainUom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="UOM_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom convToUom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CUSTOM_METHOD_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustomMethod uomCustomMethodCustomMethod = null;

  /**
   * Default constructor.
   */
  public UomConversion() {
      super();
      this.baseEntityName = "UomConversion";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("uomId");this.primaryKeyNames.add("uomIdTo");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("uomId");this.allFieldsNames.add("uomIdTo");this.allFieldsNames.add("conversionFactor");this.allFieldsNames.add("customMethodId");this.allFieldsNames.add("decimalScale");this.allFieldsNames.add("roundingMode");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UomConversion(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        id.setUomId(uomId);
    }
    /**
     * Auto generated value setter.
     * @param uomIdTo the uomIdTo to set
     */
    public void setUomIdTo(String uomIdTo) {
        id.setUomIdTo(uomIdTo);
    }
    /**
     * Auto generated value setter.
     * @param conversionFactor the conversionFactor to set
     */
    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    /**
     * Auto generated value setter.
     * @param customMethodId the customMethodId to set
     */
    public void setCustomMethodId(String customMethodId) {
        this.customMethodId = customMethodId;
    }
    /**
     * Auto generated value setter.
     * @param decimalScale the decimalScale to set
     */
    public void setDecimalScale(Long decimalScale) {
        this.decimalScale = decimalScale;
    }
    /**
     * Auto generated value setter.
     * @param roundingMode the roundingMode to set
     */
    public void setRoundingMode(String roundingMode) {
        this.roundingMode = roundingMode;
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
    public String getUomId() {
        return this.id.getUomId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomIdTo() {
        return this.id.getUomIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getConversionFactor() {
        return this.conversionFactor;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomMethodId() {
        return this.customMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDecimalScale() {
        return this.decimalScale;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoundingMode() {
        return this.roundingMode;
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
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>MainUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getMainUom() throws RepositoryException {
        if (this.mainUom == null) {
            this.mainUom = getRelatedOne(Uom.class, "MainUom");
        }
        return this.mainUom;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>ConvToUom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getConvToUom() throws RepositoryException {
        if (this.convToUom == null) {
            this.convToUom = getRelatedOne(Uom.class, "ConvToUom");
        }
        return this.convToUom;
    }
    /**
     * Auto generated method that gets the related <code>CustomMethod</code> by the relation named <code>uomCustomMethodCustomMethod</code>.
     * @return the <code>CustomMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public CustomMethod getuomCustomMethodCustomMethod() throws RepositoryException {
        if (this.uomCustomMethodCustomMethod == null) {
            this.uomCustomMethodCustomMethod = getRelatedOne(CustomMethod.class, "uomCustomMethodCustomMethod");
        }
        return this.uomCustomMethodCustomMethod;
    }

    /**
     * Auto generated value setter.
     * @param mainUom the mainUom to set
    */
    public void setMainUom(Uom mainUom) {
        this.mainUom = mainUom;
    }
    /**
     * Auto generated value setter.
     * @param convToUom the convToUom to set
    */
    public void setConvToUom(Uom convToUom) {
        this.convToUom = convToUom;
    }
    /**
     * Auto generated value setter.
     * @param uomCustomMethodCustomMethod the uomCustomMethodCustomMethod to set
    */
    public void setuomCustomMethodCustomMethod(CustomMethod uomCustomMethodCustomMethod) {
        this.uomCustomMethodCustomMethod = uomCustomMethodCustomMethod;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUomId((String) mapValue.get("uomId"));
        setUomIdTo((String) mapValue.get("uomIdTo"));
        setConversionFactor(convertToBigDecimal(mapValue.get("conversionFactor")));
        setCustomMethodId((String) mapValue.get("customMethodId"));
        setDecimalScale((Long) mapValue.get("decimalScale"));
        setRoundingMode((String) mapValue.get("roundingMode"));
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
        mapValue.put("uomId", getUomId());
        mapValue.put("uomIdTo", getUomIdTo());
        mapValue.put("conversionFactor", getConversionFactor());
        mapValue.put("customMethodId", getCustomMethodId());
        mapValue.put("decimalScale", getDecimalScale());
        mapValue.put("roundingMode", getRoundingMode());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
