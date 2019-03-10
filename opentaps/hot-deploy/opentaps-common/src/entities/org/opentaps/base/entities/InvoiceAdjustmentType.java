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
 * Auto generated base entity InvoiceAdjustmentType.
 */
@javax.persistence.Entity
@Table(name="INVOICE_ADJUSTMENT_TYPE")
public class InvoiceAdjustmentType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("invoiceAdjustmentTypeId", "INVOICE_ADJUSTMENT_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("InvoiceAdjustmentType", fields);
}
  public static enum Fields implements EntityFieldInterface<InvoiceAdjustmentType> {
    invoiceAdjustmentTypeId("invoiceAdjustmentTypeId"),
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

   @org.hibernate.annotations.GenericGenerator(name="InvoiceAdjustmentType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="InvoiceAdjustmentType_GEN")
   @Id
   @Column(name="INVOICE_ADJUSTMENT_TYPE_ID")
   private String invoiceAdjustmentTypeId;
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
   @OneToMany(fetch=FetchType.LAZY, mappedBy="invoiceAdjustmentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="INVOICE_ADJUSTMENT_TYPE_ID")
   
   private List<InvoiceAdjustment> invoiceAdjustments = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="invoiceAdjustmentType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="INVOICE_ADJUSTMENT_TYPE_ID")
   
   private List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccounts = null;

  /**
   * Default constructor.
   */
  public InvoiceAdjustmentType() {
      super();
      this.baseEntityName = "InvoiceAdjustmentType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("invoiceAdjustmentTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("invoiceAdjustmentTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public InvoiceAdjustmentType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param invoiceAdjustmentTypeId the invoiceAdjustmentTypeId to set
     */
    public void setInvoiceAdjustmentTypeId(String invoiceAdjustmentTypeId) {
        this.invoiceAdjustmentTypeId = invoiceAdjustmentTypeId;
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
    public String getInvoiceAdjustmentTypeId() {
        return this.invoiceAdjustmentTypeId;
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
     * Auto generated method that gets the related <code>InvoiceAdjustment</code> by the relation named <code>InvoiceAdjustment</code>.
     * @return the list of <code>InvoiceAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceAdjustment> getInvoiceAdjustments() throws RepositoryException {
        if (this.invoiceAdjustments == null) {
            this.invoiceAdjustments = getRelated(InvoiceAdjustment.class, "InvoiceAdjustment");
        }
        return this.invoiceAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>InvoiceAdjustmentGlAccount</code> by the relation named <code>InvoiceAdjustmentGlAccount</code>.
     * @return the list of <code>InvoiceAdjustmentGlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends InvoiceAdjustmentGlAccount> getInvoiceAdjustmentGlAccounts() throws RepositoryException {
        if (this.invoiceAdjustmentGlAccounts == null) {
            this.invoiceAdjustmentGlAccounts = getRelated(InvoiceAdjustmentGlAccount.class, "InvoiceAdjustmentGlAccount");
        }
        return this.invoiceAdjustmentGlAccounts;
    }

    /**
     * Auto generated value setter.
     * @param invoiceAdjustments the invoiceAdjustments to set
    */
    public void setInvoiceAdjustments(List<InvoiceAdjustment> invoiceAdjustments) {
        this.invoiceAdjustments = invoiceAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param invoiceAdjustmentGlAccounts the invoiceAdjustmentGlAccounts to set
    */
    public void setInvoiceAdjustmentGlAccounts(List<InvoiceAdjustmentGlAccount> invoiceAdjustmentGlAccounts) {
        this.invoiceAdjustmentGlAccounts = invoiceAdjustmentGlAccounts;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addInvoiceAdjustmentGlAccount(InvoiceAdjustmentGlAccount invoiceAdjustmentGlAccount) {
        if (this.invoiceAdjustmentGlAccounts == null) {
            this.invoiceAdjustmentGlAccounts = new ArrayList<InvoiceAdjustmentGlAccount>();
        }
        this.invoiceAdjustmentGlAccounts.add(invoiceAdjustmentGlAccount);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeInvoiceAdjustmentGlAccount(InvoiceAdjustmentGlAccount invoiceAdjustmentGlAccount) {
        if (this.invoiceAdjustmentGlAccounts == null) {
            return;
        }
        this.invoiceAdjustmentGlAccounts.remove(invoiceAdjustmentGlAccount);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearInvoiceAdjustmentGlAccount() {
        if (this.invoiceAdjustmentGlAccounts == null) {
            return;
        }
        this.invoiceAdjustmentGlAccounts.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setInvoiceAdjustmentTypeId((String) mapValue.get("invoiceAdjustmentTypeId"));
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
        mapValue.put("invoiceAdjustmentTypeId", getInvoiceAdjustmentTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
