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
 * Auto generated base entity GlAccOrgAndAcctgTransAndEntry.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectGlAccOrgAndAcctgTransAndEntrys", query="SELECT GAO.GL_ACCOUNT_ID AS \"glAccountId\",ATE.DEBIT_CREDIT_FLAG AS \"debitCreditFlag\",ATR.IS_POSTED AS \"isPosted\",ATR.TRANSACTION_DATE AS \"transactionDate\",ATE.ACCTG_TRANS_ID AS \"acctgTransId\",ATE.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",ATE.AMOUNT AS \"amount\",GAO.FROM_DATE AS \"fromDate\",GAO.THRU_DATE AS \"thruDate\" FROM GL_ACCOUNT_ORGANIZATION GAO INNER JOIN ACCTG_TRANS_ENTRY ATE ON GAO.GL_ACCOUNT_ID = ATE.GL_ACCOUNT_ID AND GAO.ORGANIZATION_PARTY_ID = ATE.ORGANIZATION_PARTY_ID INNER JOIN ACCTG_TRANS ATR ON ATE.ACCTG_TRANS_ID = ATR.ACCTG_TRANS_ID", resultSetMapping="GlAccOrgAndAcctgTransAndEntryMapping")
@SqlResultSetMapping(name="GlAccOrgAndAcctgTransAndEntryMapping", entities={
@EntityResult(entityClass=GlAccOrgAndAcctgTransAndEntry.class, fields = {
@FieldResult(name="glAccountId", column="glAccountId")
,@FieldResult(name="debitCreditFlag", column="debitCreditFlag")
,@FieldResult(name="isPosted", column="isPosted")
,@FieldResult(name="transactionDate", column="transactionDate")
,@FieldResult(name="acctgTransId", column="acctgTransId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="totalAmount", column="totalAmount")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class GlAccOrgAndAcctgTransAndEntry extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("glAccountId", "GAO.GL_ACCOUNT_ID");
        fields.put("debitCreditFlag", "ATE.DEBIT_CREDIT_FLAG");
        fields.put("isPosted", "ATR.IS_POSTED");
        fields.put("transactionDate", "ATR.TRANSACTION_DATE");
        fields.put("acctgTransId", "ATE.ACCTG_TRANS_ID");
        fields.put("organizationPartyId", "ATE.ORGANIZATION_PARTY_ID");
        fields.put("totalAmount", "ATE.AMOUNT");
        fields.put("fromDate", "GAO.FROM_DATE");
        fields.put("thruDate", "GAO.THRU_DATE");
fieldMapColumns.put("GlAccOrgAndAcctgTransAndEntry", fields);
}
  public static enum Fields implements EntityFieldInterface<GlAccOrgAndAcctgTransAndEntry> {
    glAccountId("glAccountId"),
    debitCreditFlag("debitCreditFlag"),
    isPosted("isPosted"),
    transactionDate("transactionDate"),
    acctgTransId("acctgTransId"),
    organizationPartyId("organizationPartyId"),
    totalAmount("totalAmount"),
    fromDate("fromDate"),
    thruDate("thruDate");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String glAccountId;
    
   private String debitCreditFlag;
    
   private String isPosted;
    
   private Timestamp transactionDate;
    
   private String acctgTransId;
    
   private String organizationPartyId;
    
   private BigDecimal totalAmount;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;

  /**
   * Default constructor.
   */
  public GlAccOrgAndAcctgTransAndEntry() {
      super();
      this.baseEntityName = "GlAccOrgAndAcctgTransAndEntry";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("glAccountId");this.primaryKeyNames.add("acctgTransId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("glAccountId");this.allFieldsNames.add("debitCreditFlag");this.allFieldsNames.add("isPosted");this.allFieldsNames.add("transactionDate");this.allFieldsNames.add("acctgTransId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("totalAmount");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public GlAccOrgAndAcctgTransAndEntry(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param glAccountId the glAccountId to set
     */
    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }
    /**
     * Auto generated value setter.
     * @param debitCreditFlag the debitCreditFlag to set
     */
    public void setDebitCreditFlag(String debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }
    /**
     * Auto generated value setter.
     * @param isPosted the isPosted to set
     */
    public void setIsPosted(String isPosted) {
        this.isPosted = isPosted;
    }
    /**
     * Auto generated value setter.
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
    /**
     * Auto generated value setter.
     * @param acctgTransId the acctgTransId to set
     */
    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
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
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
    public String getDebitCreditFlag() {
        return this.debitCreditFlag;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsPosted() {
        return this.isPosted;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getTransactionDate() {
        return this.transactionDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAcctgTransId() {
        return this.acctgTransId;
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
    public BigDecimal getTotalAmount() {
        return this.totalAmount;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setGlAccountId((String) mapValue.get("glAccountId"));
        setDebitCreditFlag((String) mapValue.get("debitCreditFlag"));
        setIsPosted((String) mapValue.get("isPosted"));
        setTransactionDate((Timestamp) mapValue.get("transactionDate"));
        setAcctgTransId((String) mapValue.get("acctgTransId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setTotalAmount(convertToBigDecimal(mapValue.get("totalAmount")));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("glAccountId", getGlAccountId());
        mapValue.put("debitCreditFlag", getDebitCreditFlag());
        mapValue.put("isPosted", getIsPosted());
        mapValue.put("transactionDate", getTransactionDate());
        mapValue.put("acctgTransId", getAcctgTransId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("totalAmount", getTotalAmount());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        return mapValue;
    }


}
