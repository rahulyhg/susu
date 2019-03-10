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
 * Auto generated base entity PaymentGatewayConfigType.
 */
@javax.persistence.Entity
@Table(name="PAYMENT_GATEWAY_CONFIG_TYPE")
public class PaymentGatewayConfigType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentGatewayConfigTypeId", "PAYMENT_GATEWAY_CONFIG_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaymentGatewayConfigType", fields);
}
  public static enum Fields implements EntityFieldInterface<PaymentGatewayConfigType> {
    paymentGatewayConfigTypeId("paymentGatewayConfigTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
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

   @org.hibernate.annotations.GenericGenerator(name="PaymentGatewayConfigType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PaymentGatewayConfigType_GEN")
   @Id
   @Column(name="PAYMENT_GATEWAY_CONFIG_TYPE_ID")
   private String paymentGatewayConfigTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
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
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentGatewayConfigType parentPaymentGatewayConfigType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentPaymentGatewayConfigType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<PaymentGatewayConfigType> siblingPaymentGatewayConfigTypes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="paymentGatewayConfigType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PAYMENT_GATEWAY_CONFIG_TYPE_ID")
   
   private List<PaymentGatewayConfig> paymentGatewayConfigs = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentPaymentGatewayConfigType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<PaymentGatewayConfigType> childPaymentGatewayConfigTypes = null;

  /**
   * Default constructor.
   */
  public PaymentGatewayConfigType() {
      super();
      this.baseEntityName = "PaymentGatewayConfigType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentGatewayConfigTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentGatewayConfigTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaymentGatewayConfigType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentGatewayConfigTypeId the paymentGatewayConfigTypeId to set
     */
    public void setPaymentGatewayConfigTypeId(String paymentGatewayConfigTypeId) {
        this.paymentGatewayConfigTypeId = paymentGatewayConfigTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
    public String getPaymentGatewayConfigTypeId() {
        return this.paymentGatewayConfigTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
     * Auto generated method that gets the related <code>PaymentGatewayConfigType</code> by the relation named <code>ParentPaymentGatewayConfigType</code>.
     * @return the <code>PaymentGatewayConfigType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentGatewayConfigType getParentPaymentGatewayConfigType() throws RepositoryException {
        if (this.parentPaymentGatewayConfigType == null) {
            this.parentPaymentGatewayConfigType = getRelatedOne(PaymentGatewayConfigType.class, "ParentPaymentGatewayConfigType");
        }
        return this.parentPaymentGatewayConfigType;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayConfigType</code> by the relation named <code>SiblingPaymentGatewayConfigType</code>.
     * @return the list of <code>PaymentGatewayConfigType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentGatewayConfigType> getSiblingPaymentGatewayConfigTypes() throws RepositoryException {
        if (this.siblingPaymentGatewayConfigTypes == null) {
            this.siblingPaymentGatewayConfigTypes = getRelated(PaymentGatewayConfigType.class, "SiblingPaymentGatewayConfigType");
        }
        return this.siblingPaymentGatewayConfigTypes;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayConfig</code> by the relation named <code>PaymentGatewayConfig</code>.
     * @return the list of <code>PaymentGatewayConfig</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentGatewayConfig> getPaymentGatewayConfigs() throws RepositoryException {
        if (this.paymentGatewayConfigs == null) {
            this.paymentGatewayConfigs = getRelated(PaymentGatewayConfig.class, "PaymentGatewayConfig");
        }
        return this.paymentGatewayConfigs;
    }
    /**
     * Auto generated method that gets the related <code>PaymentGatewayConfigType</code> by the relation named <code>ChildPaymentGatewayConfigType</code>.
     * @return the list of <code>PaymentGatewayConfigType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentGatewayConfigType> getChildPaymentGatewayConfigTypes() throws RepositoryException {
        if (this.childPaymentGatewayConfigTypes == null) {
            this.childPaymentGatewayConfigTypes = getRelated(PaymentGatewayConfigType.class, "ChildPaymentGatewayConfigType");
        }
        return this.childPaymentGatewayConfigTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentPaymentGatewayConfigType the parentPaymentGatewayConfigType to set
    */
    public void setParentPaymentGatewayConfigType(PaymentGatewayConfigType parentPaymentGatewayConfigType) {
        this.parentPaymentGatewayConfigType = parentPaymentGatewayConfigType;
    }
    /**
     * Auto generated value setter.
     * @param siblingPaymentGatewayConfigTypes the siblingPaymentGatewayConfigTypes to set
    */
    public void setSiblingPaymentGatewayConfigTypes(List<PaymentGatewayConfigType> siblingPaymentGatewayConfigTypes) {
        this.siblingPaymentGatewayConfigTypes = siblingPaymentGatewayConfigTypes;
    }
    /**
     * Auto generated value setter.
     * @param paymentGatewayConfigs the paymentGatewayConfigs to set
    */
    public void setPaymentGatewayConfigs(List<PaymentGatewayConfig> paymentGatewayConfigs) {
        this.paymentGatewayConfigs = paymentGatewayConfigs;
    }
    /**
     * Auto generated value setter.
     * @param childPaymentGatewayConfigTypes the childPaymentGatewayConfigTypes to set
    */
    public void setChildPaymentGatewayConfigTypes(List<PaymentGatewayConfigType> childPaymentGatewayConfigTypes) {
        this.childPaymentGatewayConfigTypes = childPaymentGatewayConfigTypes;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentGatewayConfigTypeId((String) mapValue.get("paymentGatewayConfigTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
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
        mapValue.put("paymentGatewayConfigTypeId", getPaymentGatewayConfigTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
