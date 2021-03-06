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
 * Auto generated base entity AccountBalanceHistory.
 */
@javax.persistence.Entity
@Table(name="ACCOUNT_BALANCE_HISTORY")
public class AccountBalanceHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("accountBalanceHistoryId", "ACCOUNT_BALANCE_HISTORY_ID");
        fields.put("organizationPartyId", "ORGANIZATION_PARTY_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("asOfDatetime", "AS_OF_DATETIME");
        fields.put("balanceTypeEnumId", "BALANCE_TYPE_ENUM_ID");
        fields.put("totalBalance", "TOTAL_BALANCE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AccountBalanceHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<AccountBalanceHistory> {
    accountBalanceHistoryId("accountBalanceHistoryId"),
    organizationPartyId("organizationPartyId"),
    partyId("partyId"),
    asOfDatetime("asOfDatetime"),
    balanceTypeEnumId("balanceTypeEnumId"),
    totalBalance("totalBalance"),
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

   @org.hibernate.annotations.GenericGenerator(name="AccountBalanceHistory_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="AccountBalanceHistory_GEN")
   @Id
   @Column(name="ACCOUNT_BALANCE_HISTORY_ID")
   private String accountBalanceHistoryId;
   @Column(name="ORGANIZATION_PARTY_ID")
   private String organizationPartyId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="AS_OF_DATETIME")
   private Timestamp asOfDatetime;
   @Column(name="BALANCE_TYPE_ENUM_ID")
   private String balanceTypeEnumId;
   @Column(name="TOTAL_BALANCE")
   private BigDecimal totalBalance;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORGANIZATION_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party organizationParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BALANCE_TYPE_ENUM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Enumeration balanceTypeEnumeration = null;

  /**
   * Default constructor.
   */
  public AccountBalanceHistory() {
      super();
      this.baseEntityName = "AccountBalanceHistory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("accountBalanceHistoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("accountBalanceHistoryId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("asOfDatetime");this.allFieldsNames.add("balanceTypeEnumId");this.allFieldsNames.add("totalBalance");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AccountBalanceHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param accountBalanceHistoryId the accountBalanceHistoryId to set
     */
    public void setAccountBalanceHistoryId(String accountBalanceHistoryId) {
        this.accountBalanceHistoryId = accountBalanceHistoryId;
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
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param asOfDatetime the asOfDatetime to set
     */
    public void setAsOfDatetime(Timestamp asOfDatetime) {
        this.asOfDatetime = asOfDatetime;
    }
    /**
     * Auto generated value setter.
     * @param balanceTypeEnumId the balanceTypeEnumId to set
     */
    public void setBalanceTypeEnumId(String balanceTypeEnumId) {
        this.balanceTypeEnumId = balanceTypeEnumId;
    }
    /**
     * Auto generated value setter.
     * @param totalBalance the totalBalance to set
     */
    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
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
    public String getAccountBalanceHistoryId() {
        return this.accountBalanceHistoryId;
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
     * @return <code>String</code>
     */
    public String getPartyId() {
        return this.partyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAsOfDatetime() {
        return this.asOfDatetime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBalanceTypeEnumId() {
        return this.balanceTypeEnumId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTotalBalance() {
        return this.totalBalance;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>OrganizationParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getOrganizationParty() throws RepositoryException {
        if (this.organizationParty == null) {
            this.organizationParty = getRelatedOne(Party.class, "OrganizationParty");
        }
        return this.organizationParty;
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
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>BalanceTypeEnumeration</code>.
     * @return the <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public Enumeration getBalanceTypeEnumeration() throws RepositoryException {
        if (this.balanceTypeEnumeration == null) {
            this.balanceTypeEnumeration = getRelatedOne(Enumeration.class, "BalanceTypeEnumeration");
        }
        return this.balanceTypeEnumeration;
    }

    /**
     * Auto generated value setter.
     * @param organizationParty the organizationParty to set
    */
    public void setOrganizationParty(Party organizationParty) {
        this.organizationParty = organizationParty;
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
     * @param balanceTypeEnumeration the balanceTypeEnumeration to set
    */
    public void setBalanceTypeEnumeration(Enumeration balanceTypeEnumeration) {
        this.balanceTypeEnumeration = balanceTypeEnumeration;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAccountBalanceHistoryId((String) mapValue.get("accountBalanceHistoryId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setPartyId((String) mapValue.get("partyId"));
        setAsOfDatetime((Timestamp) mapValue.get("asOfDatetime"));
        setBalanceTypeEnumId((String) mapValue.get("balanceTypeEnumId"));
        setTotalBalance(convertToBigDecimal(mapValue.get("totalBalance")));
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
        mapValue.put("accountBalanceHistoryId", getAccountBalanceHistoryId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("asOfDatetime", getAsOfDatetime());
        mapValue.put("balanceTypeEnumId", getBalanceTypeEnumId());
        mapValue.put("totalBalance", getTotalBalance());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
