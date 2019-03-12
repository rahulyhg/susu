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
import java.sql.Timestamp;

/**
 * Auto generated base entity DataImportUSCountyTax.
 */
@javax.persistence.Entity
@Table(name="DATA_IMPORT_U_S_COUNTY_TAX")
public class DataImportUSCountyTax extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("county", "COUNTY");
        fields.put("stateCode", "STATE_CODE");
        fields.put("taxRate", "TAX_RATE");
        fields.put("inheritExemptions", "INHERIT_EXEMPTIONS");
        fields.put("importStatusId", "IMPORT_STATUS_ID");
        fields.put("processedTimestamp", "PROCESSED_TIMESTAMP");
        fields.put("importError", "IMPORT_ERROR");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("DataImportUSCountyTax", fields);
}
  public static enum Fields implements EntityFieldInterface<DataImportUSCountyTax> {
    county("county"),
    stateCode("stateCode"),
    taxRate("taxRate"),
    inheritExemptions("inheritExemptions"),
    importStatusId("importStatusId"),
    processedTimestamp("processedTimestamp"),
    importError("importError"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.DataImportUSCountyTaxPkBridge.class)
     private DataImportUSCountyTaxPk id = new DataImportUSCountyTaxPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>DataImportUSCountyTaxPk</code>
     */
      public DataImportUSCountyTaxPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>DataImportUSCountyTaxPk</code> value to set
    */   
      public void setId(DataImportUSCountyTaxPk id) {
         this.id = id;
      }
   @Column(name="TAX_RATE")
   private BigDecimal taxRate;
   @Column(name="INHERIT_EXEMPTIONS")
   private String inheritExemptions;
   @Column(name="IMPORT_STATUS_ID")
   private String importStatusId;
   @Column(name="PROCESSED_TIMESTAMP")
   private Timestamp processedTimestamp;
   @Column(name="IMPORT_ERROR")
   private String importError;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;

  /**
   * Default constructor.
   */
  public DataImportUSCountyTax() {
      super();
      this.baseEntityName = "DataImportUSCountyTax";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("county");this.primaryKeyNames.add("stateCode");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("county");this.allFieldsNames.add("stateCode");this.allFieldsNames.add("taxRate");this.allFieldsNames.add("inheritExemptions");this.allFieldsNames.add("importStatusId");this.allFieldsNames.add("processedTimestamp");this.allFieldsNames.add("importError");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public DataImportUSCountyTax(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param county the county to set
     */
    public void setCounty(String county) {
        id.setCounty(county);
    }
    /**
     * Auto generated value setter.
     * @param stateCode the stateCode to set
     */
    public void setStateCode(String stateCode) {
        id.setStateCode(stateCode);
    }
    /**
     * Auto generated value setter.
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
    /**
     * Auto generated value setter.
     * @param inheritExemptions the inheritExemptions to set
     */
    public void setInheritExemptions(String inheritExemptions) {
        this.inheritExemptions = inheritExemptions;
    }
    /**
     * Auto generated value setter.
     * @param importStatusId the importStatusId to set
     */
    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }
    /**
     * Auto generated value setter.
     * @param processedTimestamp the processedTimestamp to set
     */
    public void setProcessedTimestamp(Timestamp processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param importError the importError to set
     */
    public void setImportError(String importError) {
        this.importError = importError;
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
    public String getCounty() {
        return this.id.getCounty();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStateCode() {
        return this.id.getStateCode();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTaxRate() {
        return this.taxRate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInheritExemptions() {
        return this.inheritExemptions;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImportStatusId() {
        return this.importStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getProcessedTimestamp() {
        return this.processedTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getImportError() {
        return this.importError;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCounty((String) mapValue.get("county"));
        setStateCode((String) mapValue.get("stateCode"));
        setTaxRate(convertToBigDecimal(mapValue.get("taxRate")));
        setInheritExemptions((String) mapValue.get("inheritExemptions"));
        setImportStatusId((String) mapValue.get("importStatusId"));
        setProcessedTimestamp((Timestamp) mapValue.get("processedTimestamp"));
        setImportError((String) mapValue.get("importError"));
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
        mapValue.put("county", getCounty());
        mapValue.put("stateCode", getStateCode());
        mapValue.put("taxRate", getTaxRate());
        mapValue.put("inheritExemptions", getInheritExemptions());
        mapValue.put("importStatusId", getImportStatusId());
        mapValue.put("processedTimestamp", getProcessedTimestamp());
        mapValue.put("importError", getImportError());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}