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
 * Auto generated base entity CustomMethod.
 */
@javax.persistence.Entity
@Table(name="CUSTOM_METHOD")
public class CustomMethod extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("customMethodId", "CUSTOM_METHOD_ID");
        fields.put("customMethodTypeId", "CUSTOM_METHOD_TYPE_ID");
        fields.put("customMethodName", "CUSTOM_METHOD_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CustomMethod", fields);
}
  public static enum Fields implements EntityFieldInterface<CustomMethod> {
    customMethodId("customMethodId"),
    customMethodTypeId("customMethodTypeId"),
    customMethodName("customMethodName"),
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

   @org.hibernate.annotations.GenericGenerator(name="CustomMethod_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CustomMethod_GEN")
   @Id
   @Column(name="CUSTOM_METHOD_ID")
   private String customMethodId;
   @Column(name="CUSTOM_METHOD_TYPE_ID")
   private String customMethodTypeId;
   @Column(name="CUSTOM_METHOD_NAME")
   private String customMethodName;
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
   @JoinColumn(name="CUSTOM_METHOD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private CustomMethodType customMethodType = null;
   private transient List<CostComponentCalc> costComponentCalcs = null;
   private transient List<FixedAssetDepMethod> fixedAssetDepMethods = null;
   private transient List<ProductAssoc> productAssocs = null;
   private transient List<ProductPrice> productPrices = null;
   private transient List<ProductStorePaymentSetting> productStorePaymentSettings = null;
   private transient List<UomConversion> uomCustomMethodUomConversions = null;
   private transient List<UomConversionDated> uomCustomMethodUomConversionDateds = null;
   private transient List<WorkEffort> workEfforts = null;

  /**
   * Default constructor.
   */
  public CustomMethod() {
      super();
      this.baseEntityName = "CustomMethod";
      this.isView = false;
      this.resourceName = "CommonEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("customMethodId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("customMethodId");this.allFieldsNames.add("customMethodTypeId");this.allFieldsNames.add("customMethodName");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustomMethod(RepositoryInterface repository) {
      this();
      initRepository(repository);
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
     * @param customMethodTypeId the customMethodTypeId to set
     */
    public void setCustomMethodTypeId(String customMethodTypeId) {
        this.customMethodTypeId = customMethodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param customMethodName the customMethodName to set
     */
    public void setCustomMethodName(String customMethodName) {
        this.customMethodName = customMethodName;
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
    public String getCustomMethodId() {
        return this.customMethodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomMethodTypeId() {
        return this.customMethodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomMethodName() {
        return this.customMethodName;
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
     * Auto generated method that gets the related <code>CustomMethodType</code> by the relation named <code>CustomMethodType</code>.
     * @return the <code>CustomMethodType</code>
     * @throws RepositoryException if an error occurs
     */
    public CustomMethodType getCustomMethodType() throws RepositoryException {
        if (this.customMethodType == null) {
            this.customMethodType = getRelatedOne(CustomMethodType.class, "CustomMethodType");
        }
        return this.customMethodType;
    }
    /**
     * Auto generated method that gets the related <code>CostComponentCalc</code> by the relation named <code>CostComponentCalc</code>.
     * @return the list of <code>CostComponentCalc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CostComponentCalc> getCostComponentCalcs() throws RepositoryException {
        if (this.costComponentCalcs == null) {
            this.costComponentCalcs = getRelated(CostComponentCalc.class, "CostComponentCalc");
        }
        return this.costComponentCalcs;
    }
    /**
     * Auto generated method that gets the related <code>FixedAssetDepMethod</code> by the relation named <code>FixedAssetDepMethod</code>.
     * @return the list of <code>FixedAssetDepMethod</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends FixedAssetDepMethod> getFixedAssetDepMethods() throws RepositoryException {
        if (this.fixedAssetDepMethods == null) {
            this.fixedAssetDepMethods = getRelated(FixedAssetDepMethod.class, "FixedAssetDepMethod");
        }
        return this.fixedAssetDepMethods;
    }
    /**
     * Auto generated method that gets the related <code>ProductAssoc</code> by the relation named <code>ProductAssoc</code>.
     * @return the list of <code>ProductAssoc</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductAssoc> getProductAssocs() throws RepositoryException {
        if (this.productAssocs == null) {
            this.productAssocs = getRelated(ProductAssoc.class, "ProductAssoc");
        }
        return this.productAssocs;
    }
    /**
     * Auto generated method that gets the related <code>ProductPrice</code> by the relation named <code>ProductPrice</code>.
     * @return the list of <code>ProductPrice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPrice> getProductPrices() throws RepositoryException {
        if (this.productPrices == null) {
            this.productPrices = getRelated(ProductPrice.class, "ProductPrice");
        }
        return this.productPrices;
    }
    /**
     * Auto generated method that gets the related <code>ProductStorePaymentSetting</code> by the relation named <code>ProductStorePaymentSetting</code>.
     * @return the list of <code>ProductStorePaymentSetting</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductStorePaymentSetting> getProductStorePaymentSettings() throws RepositoryException {
        if (this.productStorePaymentSettings == null) {
            this.productStorePaymentSettings = getRelated(ProductStorePaymentSetting.class, "ProductStorePaymentSetting");
        }
        return this.productStorePaymentSettings;
    }
    /**
     * Auto generated method that gets the related <code>UomConversion</code> by the relation named <code>uomCustomMethodUomConversion</code>.
     * @return the list of <code>UomConversion</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends UomConversion> getuomCustomMethodUomConversions() throws RepositoryException {
        if (this.uomCustomMethodUomConversions == null) {
            this.uomCustomMethodUomConversions = getRelated(UomConversion.class, "uomCustomMethodUomConversion");
        }
        return this.uomCustomMethodUomConversions;
    }
    /**
     * Auto generated method that gets the related <code>UomConversionDated</code> by the relation named <code>uomCustomMethodUomConversionDated</code>.
     * @return the list of <code>UomConversionDated</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends UomConversionDated> getuomCustomMethodUomConversionDateds() throws RepositoryException {
        if (this.uomCustomMethodUomConversionDateds == null) {
            this.uomCustomMethodUomConversionDateds = getRelated(UomConversionDated.class, "uomCustomMethodUomConversionDated");
        }
        return this.uomCustomMethodUomConversionDateds;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the list of <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffort> getWorkEfforts() throws RepositoryException {
        if (this.workEfforts == null) {
            this.workEfforts = getRelated(WorkEffort.class, "WorkEffort");
        }
        return this.workEfforts;
    }

    /**
     * Auto generated value setter.
     * @param customMethodType the customMethodType to set
    */
    public void setCustomMethodType(CustomMethodType customMethodType) {
        this.customMethodType = customMethodType;
    }
    /**
     * Auto generated value setter.
     * @param costComponentCalcs the costComponentCalcs to set
    */
    public void setCostComponentCalcs(List<CostComponentCalc> costComponentCalcs) {
        this.costComponentCalcs = costComponentCalcs;
    }
    /**
     * Auto generated value setter.
     * @param fixedAssetDepMethods the fixedAssetDepMethods to set
    */
    public void setFixedAssetDepMethods(List<FixedAssetDepMethod> fixedAssetDepMethods) {
        this.fixedAssetDepMethods = fixedAssetDepMethods;
    }
    /**
     * Auto generated value setter.
     * @param productAssocs the productAssocs to set
    */
    public void setProductAssocs(List<ProductAssoc> productAssocs) {
        this.productAssocs = productAssocs;
    }
    /**
     * Auto generated value setter.
     * @param productPrices the productPrices to set
    */
    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }
    /**
     * Auto generated value setter.
     * @param productStorePaymentSettings the productStorePaymentSettings to set
    */
    public void setProductStorePaymentSettings(List<ProductStorePaymentSetting> productStorePaymentSettings) {
        this.productStorePaymentSettings = productStorePaymentSettings;
    }
    /**
     * Auto generated value setter.
     * @param uomCustomMethodUomConversions the uomCustomMethodUomConversions to set
    */
    public void setuomCustomMethodUomConversions(List<UomConversion> uomCustomMethodUomConversions) {
        this.uomCustomMethodUomConversions = uomCustomMethodUomConversions;
    }
    /**
     * Auto generated value setter.
     * @param uomCustomMethodUomConversionDateds the uomCustomMethodUomConversionDateds to set
    */
    public void setuomCustomMethodUomConversionDateds(List<UomConversionDated> uomCustomMethodUomConversionDateds) {
        this.uomCustomMethodUomConversionDateds = uomCustomMethodUomConversionDateds;
    }
    /**
     * Auto generated value setter.
     * @param workEfforts the workEfforts to set
    */
    public void setWorkEfforts(List<WorkEffort> workEfforts) {
        this.workEfforts = workEfforts;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustomMethodId((String) mapValue.get("customMethodId"));
        setCustomMethodTypeId((String) mapValue.get("customMethodTypeId"));
        setCustomMethodName((String) mapValue.get("customMethodName"));
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
        mapValue.put("customMethodId", getCustomMethodId());
        mapValue.put("customMethodTypeId", getCustomMethodTypeId());
        mapValue.put("customMethodName", getCustomMethodName());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
