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
 * Auto generated base entity GlReconciliation.
 */
@javax.persistence.Entity
@Table(name="GL_RECONCILIATION")
public class GlReconciliation extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glReconciliationId", "GL_RECONCILIATION_ID");
        fields.put("glReconciliationName", "GL_RECONCILIATION_NAME");
        fields.put("description", "DESCRIPTION");
        fields.put("createdByUserLogin", "CREATED_BY_USER_LOGIN");
        fields.put("lastModifiedByUserLogin", "LAST_MODIFIED_BY_USER_LOGIN");
        fields.put("glAccountId", "GL_ACCOUNT_ID");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("reconciledBalance", "RECONCILED_BALANCE");
        fields.put("reconciledDate", "RECONCILED_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("GlReconciliation", fields);
}
  public static enum Fields implements EntityFieldInterface<GlReconciliation> {
    glReconciliationId("glReconciliationId"),
    glReconciliationName("glReconciliationName"),
    description("description"),
    createdByUserLogin("createdByUserLogin"),
    lastModifiedByUserLogin("lastModifiedByUserLogin"),
    glAccountId("glAccountId"),
    organizationPartyId("organizationPartyId"),
    reconciledBalance("reconciledBalance"),
    reconciledDate("reconciledDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="GlReconciliation_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="GlReconciliation_GEN")
   @Id
   @Column(name="GL_RECONCILIATION_ID")
   private String glReconciliationId;
   @Column(name="GL_RECONCILIATION_NAME")
   private String glReconciliationName;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="CREATED_BY_USER_LOGIN")
   private String createdByUserLogin;
   @Column(name="LAST_MODIFIED_BY_USER_LOGIN")
   private String lastModifiedByUserLogin;
   @Column(name="GL_ACCOUNT_ID")
   private String glAccountId;
   @Column(name="ORGANIZATION_PARTY_ID")
   private String organizationPartyId;
   @Column(name="RECONCILED_BALANCE")
   private BigDecimal reconciledBalance;
   @Column(name="RECONCILED_DATE")
   private Timestamp reconciledDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GL_ACCOUNT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private GlAccount glAccount = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="glReconciliation", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="GL_RECONCILIATION_ID")
   
   private List<GlReconciliationEntry> glReconciliationEntrys = null;

  /**
   * Default constructor.
   */
  public GlReconciliation() {
      super();
      this.baseEntityName = "GlReconciliation";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glReconciliationId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glReconciliationId");this.allFieldsNames.add("glReconciliationName");this.allFieldsNames.add("description");this.allFieldsNames.add("createdByUserLogin");this.allFieldsNames.add("lastModifiedByUserLogin");this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("reconciledBalance");this.allFieldsNames.add("reconciledDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlReconciliation(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param glReconciliationId the glReconciliationId to set
     */
    public void setGlReconciliationId(String glReconciliationId) {
        this.glReconciliationId = glReconciliationId;
    }
    /**
     * Auto generated value setter.
     * @param glReconciliationName the glReconciliationName to set
     */
    public void setGlReconciliationName(String glReconciliationName) {
        this.glReconciliationName = glReconciliationName;
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
     * @param createdByUserLogin the createdByUserLogin to set
     */
    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param lastModifiedByUserLogin the lastModifiedByUserLogin to set
     */
    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param reconciledBalance the reconciledBalance to set
     */
    public void setReconciledBalance(BigDecimal reconciledBalance) {
        this.reconciledBalance = reconciledBalance;
    }
    /**
     * Auto generated value setter.
     * @param reconciledDate the reconciledDate to set
     */
    public void setReconciledDate(Timestamp reconciledDate) {
        this.reconciledDate = reconciledDate;
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
    public String getGlReconciliationId() {
        return this.glReconciliationId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlReconciliationName() {
        return this.glReconciliationName;
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
    public String getCreatedByUserLogin() {
        return this.createdByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastModifiedByUserLogin() {
        return this.lastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGlAccountId() {
        return this.glAccountId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getReconciledBalance() {
        return this.reconciledBalance;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getReconciledDate() {
        return this.reconciledDate;
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
     * Auto generated method that gets the related <code>GlAccount</code> by the relation named <code>GlAccount</code>.
     * @return the <code>GlAccount</code>
     * @throws RepositoryException if an error occurs
     */
    public GlAccount getGlAccount() throws RepositoryException {
        if (this.glAccount == null) {
            this.glAccount = getRelatedOne(GlAccount.class, "GlAccount");
        }
        return this.glAccount;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>Party</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getParty() throws RepositoryException {
        if (this.party == null) {
            this.party = getRelatedOne(Party.class, "Party");
        }
        return this.party;
    }
    /**
     * Auto generated method that gets the related <code>GlReconciliationEntry</code> by the relation named <code>GlReconciliationEntry</code>.
     * @return the list of <code>GlReconciliationEntry</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends GlReconciliationEntry> getGlReconciliationEntrys() throws RepositoryException {
        if (this.glReconciliationEntrys == null) {
            this.glReconciliationEntrys = getRelated(GlReconciliationEntry.class, "GlReconciliationEntry");
        }
        return this.glReconciliationEntrys;
    }

    /**
     * Auto generated value setter.
     * @param glAccount the glAccount to set
    */
    public void setGlAccount(GlAccount glAccount) {
        this.glAccount = glAccount;
    }
    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param glReconciliationEntrys the glReconciliationEntrys to set
    */
    public void setGlReconciliationEntrys(List<GlReconciliationEntry> glReconciliationEntrys) {
        this.glReconciliationEntrys = glReconciliationEntrys;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addGlReconciliationEntry(GlReconciliationEntry glReconciliationEntry) {
        if (this.glReconciliationEntrys == null) {
            this.glReconciliationEntrys = new ArrayList<GlReconciliationEntry>();
        }
        this.glReconciliationEntrys.add(glReconciliationEntry);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeGlReconciliationEntry(GlReconciliationEntry glReconciliationEntry) {
        if (this.glReconciliationEntrys == null) {
            return;
        }
        this.glReconciliationEntrys.remove(glReconciliationEntry);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearGlReconciliationEntry() {
        if (this.glReconciliationEntrys == null) {
            return;
        }
        this.glReconciliationEntrys.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlReconciliationId((String) mapValue.get("glReconciliationId"));
        setGlReconciliationName((String) mapValue.get("glReconciliationName"));
        setDescription((String) mapValue.get("description"));
        setCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        setLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        setGlAccountId((String) mapValue.get("glAccountId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setReconciledBalance(convertToBigDecimal(mapValue.get("reconciledBalance")));
        setReconciledDate((Timestamp) mapValue.get("reconciledDate"));
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
        mapValue.put("glReconciliationId", getGlReconciliationId());
        mapValue.put("glReconciliationName", getGlReconciliationName());
        mapValue.put("description", getDescription());
        mapValue.put("createdByUserLogin", getCreatedByUserLogin());
        mapValue.put("lastModifiedByUserLogin", getLastModifiedByUserLogin());
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("reconciledBalance", getReconciledBalance());
        mapValue.put("reconciledDate", getReconciledDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
