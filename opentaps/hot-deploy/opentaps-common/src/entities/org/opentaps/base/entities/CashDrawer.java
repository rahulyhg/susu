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
 * Auto generated base entity CashDrawer.
 */
@javax.persistence.Entity
@Table(name="CASH_DRAWER")
public class CashDrawer extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("cashDrawerId", "CASH_DRAWER_ID");
        fields.put("openUserLoginId", "OPEN_USER_LOGIN_ID");
        fields.put("operatorUserLoginId", "OPERATOR_USER_LOGIN_ID");
        fields.put("closeUserLoginId", "CLOSE_USER_LOGIN_ID");
        fields.put("openTimestamp", "OPEN_TIMESTAMP");
        fields.put("closeTimestamp", "CLOSE_TIMESTAMP");
        fields.put("currencyUomId", "CURRENCY_UOM_ID");
        fields.put("initialAmount", "INITIAL_AMOUNT");
        fields.put("finalAmount", "FINAL_AMOUNT");
        fields.put("closingVarianceAmount", "CLOSING_VARIANCE_AMOUNT");
        fields.put("openingComments", "OPENING_COMMENTS");
        fields.put("closingComments", "CLOSING_COMMENTS");
        fields.put("forcedClose", "FORCED_CLOSE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CashDrawer", fields);
}
  public static enum Fields implements EntityFieldInterface<CashDrawer> {
    cashDrawerId("cashDrawerId"),
    openUserLoginId("openUserLoginId"),
    operatorUserLoginId("operatorUserLoginId"),
    closeUserLoginId("closeUserLoginId"),
    openTimestamp("openTimestamp"),
    closeTimestamp("closeTimestamp"),
    currencyUomId("currencyUomId"),
    initialAmount("initialAmount"),
    finalAmount("finalAmount"),
    closingVarianceAmount("closingVarianceAmount"),
    openingComments("openingComments"),
    closingComments("closingComments"),
    forcedClose("forcedClose"),
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

   @org.hibernate.annotations.GenericGenerator(name="CashDrawer_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="CashDrawer_GEN")
   @Id
   @Column(name="CASH_DRAWER_ID")
   private String cashDrawerId;
   @Column(name="OPEN_USER_LOGIN_ID")
   private String openUserLoginId;
   @Column(name="OPERATOR_USER_LOGIN_ID")
   private String operatorUserLoginId;
   @Column(name="CLOSE_USER_LOGIN_ID")
   private String closeUserLoginId;
   @Column(name="OPEN_TIMESTAMP")
   private Timestamp openTimestamp;
   @Column(name="CLOSE_TIMESTAMP")
   private Timestamp closeTimestamp;
   @Column(name="CURRENCY_UOM_ID")
   private String currencyUomId;
   @Column(name="INITIAL_AMOUNT")
   private BigDecimal initialAmount;
   @Column(name="FINAL_AMOUNT")
   private BigDecimal finalAmount;
   @Column(name="CLOSING_VARIANCE_AMOUNT")
   private BigDecimal closingVarianceAmount;
   @Column(name="OPENING_COMMENTS")
   private String openingComments;
   @Column(name="CLOSING_COMMENTS")
   private String closingComments;
   @Column(name="FORCED_CLOSE")
   private String forcedClose;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="OPEN_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin openUserLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="OPERATOR_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin operatorUserLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CLOSE_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin closeUserLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CURRENCY_UOM_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Uom uom = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="cashDrawer", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="CASH_DRAWER_ID")
   
   private List<CashDrawerTransaction> cashDrawerTransactions = null;

  /**
   * Default constructor.
   */
  public CashDrawer() {
      super();
      this.baseEntityName = "CashDrawer";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("cashDrawerId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("cashDrawerId");this.allFieldsNames.add("openUserLoginId");this.allFieldsNames.add("operatorUserLoginId");this.allFieldsNames.add("closeUserLoginId");this.allFieldsNames.add("openTimestamp");this.allFieldsNames.add("closeTimestamp");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("initialAmount");this.allFieldsNames.add("finalAmount");this.allFieldsNames.add("closingVarianceAmount");this.allFieldsNames.add("openingComments");this.allFieldsNames.add("closingComments");this.allFieldsNames.add("forcedClose");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CashDrawer(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param cashDrawerId the cashDrawerId to set
     */
    public void setCashDrawerId(String cashDrawerId) {
        this.cashDrawerId = cashDrawerId;
    }
    /**
     * Auto generated value setter.
     * @param openUserLoginId the openUserLoginId to set
     */
    public void setOpenUserLoginId(String openUserLoginId) {
        this.openUserLoginId = openUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param operatorUserLoginId the operatorUserLoginId to set
     */
    public void setOperatorUserLoginId(String operatorUserLoginId) {
        this.operatorUserLoginId = operatorUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param closeUserLoginId the closeUserLoginId to set
     */
    public void setCloseUserLoginId(String closeUserLoginId) {
        this.closeUserLoginId = closeUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param openTimestamp the openTimestamp to set
     */
    public void setOpenTimestamp(Timestamp openTimestamp) {
        this.openTimestamp = openTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param closeTimestamp the closeTimestamp to set
     */
    public void setCloseTimestamp(Timestamp closeTimestamp) {
        this.closeTimestamp = closeTimestamp;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param initialAmount the initialAmount to set
     */
    public void setInitialAmount(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }
    /**
     * Auto generated value setter.
     * @param finalAmount the finalAmount to set
     */
    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }
    /**
     * Auto generated value setter.
     * @param closingVarianceAmount the closingVarianceAmount to set
     */
    public void setClosingVarianceAmount(BigDecimal closingVarianceAmount) {
        this.closingVarianceAmount = closingVarianceAmount;
    }
    /**
     * Auto generated value setter.
     * @param openingComments the openingComments to set
     */
    public void setOpeningComments(String openingComments) {
        this.openingComments = openingComments;
    }
    /**
     * Auto generated value setter.
     * @param closingComments the closingComments to set
     */
    public void setClosingComments(String closingComments) {
        this.closingComments = closingComments;
    }
    /**
     * Auto generated value setter.
     * @param forcedClose the forcedClose to set
     */
    public void setForcedClose(String forcedClose) {
        this.forcedClose = forcedClose;
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
    public String getCashDrawerId() {
        return this.cashDrawerId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOpenUserLoginId() {
        return this.openUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOperatorUserLoginId() {
        return this.operatorUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCloseUserLoginId() {
        return this.closeUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getOpenTimestamp() {
        return this.openTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCloseTimestamp() {
        return this.closeTimestamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInitialAmount() {
        return this.initialAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getFinalAmount() {
        return this.finalAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getClosingVarianceAmount() {
        return this.closingVarianceAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOpeningComments() {
        return this.openingComments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getClosingComments() {
        return this.closingComments;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getForcedClose() {
        return this.forcedClose;
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
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>OpenUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getOpenUserLogin() throws RepositoryException {
        if (this.openUserLogin == null) {
            this.openUserLogin = getRelatedOne(UserLogin.class, "OpenUserLogin");
        }
        return this.openUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>OperatorUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getOperatorUserLogin() throws RepositoryException {
        if (this.operatorUserLogin == null) {
            this.operatorUserLogin = getRelatedOne(UserLogin.class, "OperatorUserLogin");
        }
        return this.operatorUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>CloseUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getCloseUserLogin() throws RepositoryException {
        if (this.closeUserLogin == null) {
            this.closeUserLogin = getRelatedOne(UserLogin.class, "CloseUserLogin");
        }
        return this.closeUserLogin;
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
     * Auto generated method that gets the related <code>CashDrawerTransaction</code> by the relation named <code>CashDrawerTransaction</code>.
     * @return the list of <code>CashDrawerTransaction</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends CashDrawerTransaction> getCashDrawerTransactions() throws RepositoryException {
        if (this.cashDrawerTransactions == null) {
            this.cashDrawerTransactions = getRelated(CashDrawerTransaction.class, "CashDrawerTransaction");
        }
        return this.cashDrawerTransactions;
    }

    /**
     * Auto generated value setter.
     * @param openUserLogin the openUserLogin to set
    */
    public void setOpenUserLogin(UserLogin openUserLogin) {
        this.openUserLogin = openUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param operatorUserLogin the operatorUserLogin to set
    */
    public void setOperatorUserLogin(UserLogin operatorUserLogin) {
        this.operatorUserLogin = operatorUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param closeUserLogin the closeUserLogin to set
    */
    public void setCloseUserLogin(UserLogin closeUserLogin) {
        this.closeUserLogin = closeUserLogin;
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
     * @param cashDrawerTransactions the cashDrawerTransactions to set
    */
    public void setCashDrawerTransactions(List<CashDrawerTransaction> cashDrawerTransactions) {
        this.cashDrawerTransactions = cashDrawerTransactions;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addCashDrawerTransaction(CashDrawerTransaction cashDrawerTransaction) {
        if (this.cashDrawerTransactions == null) {
            this.cashDrawerTransactions = new ArrayList<CashDrawerTransaction>();
        }
        this.cashDrawerTransactions.add(cashDrawerTransaction);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeCashDrawerTransaction(CashDrawerTransaction cashDrawerTransaction) {
        if (this.cashDrawerTransactions == null) {
            return;
        }
        this.cashDrawerTransactions.remove(cashDrawerTransaction);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearCashDrawerTransaction() {
        if (this.cashDrawerTransactions == null) {
            return;
        }
        this.cashDrawerTransactions.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCashDrawerId((String) mapValue.get("cashDrawerId"));
        setOpenUserLoginId((String) mapValue.get("openUserLoginId"));
        setOperatorUserLoginId((String) mapValue.get("operatorUserLoginId"));
        setCloseUserLoginId((String) mapValue.get("closeUserLoginId"));
        setOpenTimestamp((Timestamp) mapValue.get("openTimestamp"));
        setCloseTimestamp((Timestamp) mapValue.get("closeTimestamp"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setInitialAmount(convertToBigDecimal(mapValue.get("initialAmount")));
        setFinalAmount(convertToBigDecimal(mapValue.get("finalAmount")));
        setClosingVarianceAmount(convertToBigDecimal(mapValue.get("closingVarianceAmount")));
        setOpeningComments((String) mapValue.get("openingComments"));
        setClosingComments((String) mapValue.get("closingComments"));
        setForcedClose((String) mapValue.get("forcedClose"));
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
        mapValue.put("cashDrawerId", getCashDrawerId());
        mapValue.put("openUserLoginId", getOpenUserLoginId());
        mapValue.put("operatorUserLoginId", getOperatorUserLoginId());
        mapValue.put("closeUserLoginId", getCloseUserLoginId());
        mapValue.put("openTimestamp", getOpenTimestamp());
        mapValue.put("closeTimestamp", getCloseTimestamp());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("initialAmount", getInitialAmount());
        mapValue.put("finalAmount", getFinalAmount());
        mapValue.put("closingVarianceAmount", getClosingVarianceAmount());
        mapValue.put("openingComments", getOpeningComments());
        mapValue.put("closingComments", getClosingComments());
        mapValue.put("forcedClose", getForcedClose());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
