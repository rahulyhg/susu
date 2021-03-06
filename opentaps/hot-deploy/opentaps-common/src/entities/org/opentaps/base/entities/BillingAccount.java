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
 * Auto generated base entity BillingAccount.
 */
@javax.persistence.Entity
@Table(name="BILLING_ACCOUNT")
public class BillingAccount extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("billingAccountId", "BILLING_ACCOUNT_ID");
        fields.put("accountLimit", "ACCOUNT_LIMIT");
        fields.put("accountCurrencyUomId", "ACCOUNT_CURRENCY_UOM_ID");
        fields.put("contactMechId", "CONTACT_MECH_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("description", "DESCRIPTION");
        fields.put("externalAccountId", "EXTERNAL_ACCOUNT_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("BillingAccount", fields);
}
  public static enum Fields implements EntityFieldInterface<BillingAccount> {
    billingAccountId("billingAccountId"),
    accountLimit("accountLimit"),
    accountCurrencyUomId("accountCurrencyUomId"),
    contactMechId("contactMechId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    description("description"),
    externalAccountId("externalAccountId"),
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

   @org.hibernate.annotations.GenericGenerator(name="BillingAccount_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="BillingAccount_GEN")
   @Id
   @Column(name="BILLING_ACCOUNT_ID")
   private String billingAccountId;
   @Column(name="ACCOUNT_LIMIT")
   private BigDecimal accountLimit;
   @Column(name="ACCOUNT_CURRENCY_UOM_ID")
   private String accountCurrencyUomId;
   @Column(name="CONTACT_MECH_ID")
   private String contactMechId;
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="EXTERNAL_ACCOUNT_ID")
   private String externalAccountId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ContactMech contactMech = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACCOUNT_CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PostalAddress postalAddress = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<BillingAccountRole> billingAccountRoles = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<BillingAccountTerm> billingAccountTerms = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<Invoice> invoices = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<OrderHeader> orderHeaders = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<PaymentApplication> paymentApplications = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<ReturnHeader> returnHeaders = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="billingAccount", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BILLING_ACCOUNT_ID")
   
   private List<ReturnItemResponse> returnItemResponses = null;

  /**
   * Default constructor.
   */
  public BillingAccount() {
      super();
      this.baseEntityName = "BillingAccount";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("billingAccountId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("billingAccountId");this.allFieldsNames.add("accountLimit");this.allFieldsNames.add("accountCurrencyUomId");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("description");this.allFieldsNames.add("externalAccountId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public BillingAccount(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param billingAccountId the billingAccountId to set
     */
    public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
    /**
     * Auto generated value setter.
     * @param accountLimit the accountLimit to set
     */
    public void setAccountLimit(BigDecimal accountLimit) {
        this.accountLimit = accountLimit;
    }
    /**
     * Auto generated value setter.
     * @param accountCurrencyUomId the accountCurrencyUomId to set
     */
    public void setAccountCurrencyUomId(String accountCurrencyUomId) {
        this.accountCurrencyUomId = accountCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
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
     * @param externalAccountId the externalAccountId to set
     */
    public void setExternalAccountId(String externalAccountId) {
        this.externalAccountId = externalAccountId;
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
    public String getBillingAccountId() {
        return this.billingAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAccountLimit() {
        return this.accountLimit;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountCurrencyUomId() {
        return this.accountCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
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
     * @return <code>String</code>
     */
    public String getExternalAccountId() {
        return this.externalAccountId;
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
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMech getContactMech() throws RepositoryException {
        if (this.contactMech == null) {
            this.contactMech = getRelatedOne(ContactMech.class, "ContactMech");
        }
        return this.contactMech;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public Uom getUom() throws RepositoryException {
        if (this.uom == null) {
            this.uom = getRelatedOne(Uom.class, "Uom");
        }
        return this.uom;
    }
    /**
     * Auto generated method that gets the related <code>PostalAddress</code> by the relation named <code>PostalAddress</code>.
     * @return the <code>PostalAddress</code>
     * @throws RepositoryException if an error occurs
     */
    public PostalAddress getPostalAddress() throws RepositoryException {
        if (this.postalAddress == null) {
            this.postalAddress = getRelatedOne(PostalAddress.class, "PostalAddress");
        }
        return this.postalAddress;
    }
    /**
     * Auto generated method that gets the related <code>BillingAccountRole</code> by the relation named <code>BillingAccountRole</code>.
     * @return the list of <code>BillingAccountRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BillingAccountRole> getBillingAccountRoles() throws RepositoryException {
        if (this.billingAccountRoles == null) {
            this.billingAccountRoles = getRelated(BillingAccountRole.class, "BillingAccountRole");
        }
        return this.billingAccountRoles;
    }
    /**
     * Auto generated method that gets the related <code>BillingAccountTerm</code> by the relation named <code>BillingAccountTerm</code>.
     * @return the list of <code>BillingAccountTerm</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends BillingAccountTerm> getBillingAccountTerms() throws RepositoryException {
        if (this.billingAccountTerms == null) {
            this.billingAccountTerms = getRelated(BillingAccountTerm.class, "BillingAccountTerm");
        }
        return this.billingAccountTerms;
    }
    /**
     * Auto generated method that gets the related <code>Invoice</code> by the relation named <code>Invoice</code>.
     * @return the list of <code>Invoice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Invoice> getInvoices() throws RepositoryException {
        if (this.invoices == null) {
            this.invoices = getRelated(Invoice.class, "Invoice");
        }
        return this.invoices;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the list of <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderHeader> getOrderHeaders() throws RepositoryException {
        if (this.orderHeaders == null) {
            this.orderHeaders = getRelated(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeaders;
    }
    /**
     * Auto generated method that gets the related <code>PaymentApplication</code> by the relation named <code>PaymentApplication</code>.
     * @return the list of <code>PaymentApplication</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends PaymentApplication> getPaymentApplications() throws RepositoryException {
        if (this.paymentApplications == null) {
            this.paymentApplications = getRelated(PaymentApplication.class, "PaymentApplication");
        }
        return this.paymentApplications;
    }
    /**
     * Auto generated method that gets the related <code>ReturnHeader</code> by the relation named <code>ReturnHeader</code>.
     * @return the list of <code>ReturnHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnHeader> getReturnHeaders() throws RepositoryException {
        if (this.returnHeaders == null) {
            this.returnHeaders = getRelated(ReturnHeader.class, "ReturnHeader");
        }
        return this.returnHeaders;
    }
    /**
     * Auto generated method that gets the related <code>ReturnItemResponse</code> by the relation named <code>ReturnItemResponse</code>.
     * @return the list of <code>ReturnItemResponse</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnItemResponse> getReturnItemResponses() throws RepositoryException {
        if (this.returnItemResponses == null) {
            this.returnItemResponses = getRelated(ReturnItemResponse.class, "ReturnItemResponse");
        }
        return this.returnItemResponses;
    }

    /**
     * Auto generated value setter.
     * @param contactMech the contactMech to set
    */
    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
    /**
     * Auto generated value setter.
     * @param uom the uom to set
    */
    public void setUom(Uom uom) {
        this.uom = uom;
    }
    /**
     * Auto generated value setter.
     * @param postalAddress the postalAddress to set
    */
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountRoles the billingAccountRoles to set
    */
    public void setBillingAccountRoles(List<BillingAccountRole> billingAccountRoles) {
        this.billingAccountRoles = billingAccountRoles;
    }
    /**
     * Auto generated value setter.
     * @param billingAccountTerms the billingAccountTerms to set
    */
    public void setBillingAccountTerms(List<BillingAccountTerm> billingAccountTerms) {
        this.billingAccountTerms = billingAccountTerms;
    }
    /**
     * Auto generated value setter.
     * @param invoices the invoices to set
    */
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
    /**
     * Auto generated value setter.
     * @param orderHeaders the orderHeaders to set
    */
    public void setOrderHeaders(List<OrderHeader> orderHeaders) {
        this.orderHeaders = orderHeaders;
    }
    /**
     * Auto generated value setter.
     * @param paymentApplications the paymentApplications to set
    */
    public void setPaymentApplications(List<PaymentApplication> paymentApplications) {
        this.paymentApplications = paymentApplications;
    }
    /**
     * Auto generated value setter.
     * @param returnHeaders the returnHeaders to set
    */
    public void setReturnHeaders(List<ReturnHeader> returnHeaders) {
        this.returnHeaders = returnHeaders;
    }
    /**
     * Auto generated value setter.
     * @param returnItemResponses the returnItemResponses to set
    */
    public void setReturnItemResponses(List<ReturnItemResponse> returnItemResponses) {
        this.returnItemResponses = returnItemResponses;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addBillingAccountRole(BillingAccountRole billingAccountRole) {
        if (this.billingAccountRoles == null) {
            this.billingAccountRoles = new ArrayList<BillingAccountRole>();
        }
        this.billingAccountRoles.add(billingAccountRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeBillingAccountRole(BillingAccountRole billingAccountRole) {
        if (this.billingAccountRoles == null) {
            return;
        }
        this.billingAccountRoles.remove(billingAccountRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearBillingAccountRole() {
        if (this.billingAccountRoles == null) {
            return;
        }
        this.billingAccountRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBillingAccountId((String) mapValue.get("billingAccountId"));
        setAccountLimit(convertToBigDecimal(mapValue.get("accountLimit")));
        setAccountCurrencyUomId((String) mapValue.get("accountCurrencyUomId"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setDescription((String) mapValue.get("description"));
        setExternalAccountId((String) mapValue.get("externalAccountId"));
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
        mapValue.put("billingAccountId", getBillingAccountId());
        mapValue.put("accountLimit", getAccountLimit());
        mapValue.put("accountCurrencyUomId", getAccountCurrencyUomId());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("description", getDescription());
        mapValue.put("externalAccountId", getExternalAccountId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
