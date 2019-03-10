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
import java.sql.Timestamp;

/**
 * Auto generated base entity PosTerminalLog.
 */
@javax.persistence.Entity
@Table(name="POS_TERMINAL_LOG")
public class PosTerminalLog extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("posTerminalLogId", "POS_TERMINAL_LOG_ID");
        fields.put("posTerminalId", "POS_TERMINAL_ID");
        fields.put("transactionId", "TRANSACTION_ID");
        fields.put("itemCount", "ITEM_COUNT");
        fields.put("orderId", "ORDER_ID");
        fields.put("returnId", "RETURN_ID");
        fields.put("userLoginId", "USER_LOGIN_ID");
        fields.put("statusId", "STATUS_ID");
        fields.put("logStartDateTime", "LOG_START_DATE_TIME");
        fields.put("logEndDateTime", "LOG_END_DATE_TIME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PosTerminalLog", fields);
}
  public static enum Fields implements EntityFieldInterface<PosTerminalLog> {
    posTerminalLogId("posTerminalLogId"),
    posTerminalId("posTerminalId"),
    transactionId("transactionId"),
    itemCount("itemCount"),
    orderId("orderId"),
    returnId("returnId"),
    userLoginId("userLoginId"),
    statusId("statusId"),
    logStartDateTime("logStartDateTime"),
    logEndDateTime("logEndDateTime"),
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

   @org.hibernate.annotations.GenericGenerator(name="PosTerminalLog_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="PosTerminalLog_GEN")
   @Id
   @Column(name="POS_TERMINAL_LOG_ID")
   private String posTerminalLogId;
   @Column(name="POS_TERMINAL_ID")
   private String posTerminalId;
   @Column(name="TRANSACTION_ID")
   private String transactionId;
   @Column(name="ITEM_COUNT")
   private Long itemCount;
   @Column(name="ORDER_ID")
   private String orderId;
   @Column(name="RETURN_ID")
   private String returnId;
   @Column(name="USER_LOGIN_ID")
   private String userLoginId;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="LOG_START_DATE_TIME")
   private Timestamp logStartDateTime;
   @Column(name="LOG_END_DATE_TIME")
   private Timestamp logEndDateTime;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="POS_TERMINAL_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PosTerminal posTerminal = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="RETURN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ReturnHeader returnHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="POS_TERMINAL_LOG_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PosTerminalInternTx posTerminalInternTx = null;

  /**
   * Default constructor.
   */
  public PosTerminalLog() {
      super();
      this.baseEntityName = "PosTerminalLog";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("posTerminalLogId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("posTerminalLogId");this.allFieldsNames.add("posTerminalId");this.allFieldsNames.add("transactionId");this.allFieldsNames.add("itemCount");this.allFieldsNames.add("orderId");this.allFieldsNames.add("returnId");this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("logStartDateTime");this.allFieldsNames.add("logEndDateTime");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PosTerminalLog(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param posTerminalLogId the posTerminalLogId to set
     */
    public void setPosTerminalLogId(String posTerminalLogId) {
        this.posTerminalLogId = posTerminalLogId;
    }
    /**
     * Auto generated value setter.
     * @param posTerminalId the posTerminalId to set
     */
    public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }
    /**
     * Auto generated value setter.
     * @param transactionId the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    /**
     * Auto generated value setter.
     * @param itemCount the itemCount to set
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }
    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    /**
     * Auto generated value setter.
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param logStartDateTime the logStartDateTime to set
     */
    public void setLogStartDateTime(Timestamp logStartDateTime) {
        this.logStartDateTime = logStartDateTime;
    }
    /**
     * Auto generated value setter.
     * @param logEndDateTime the logEndDateTime to set
     */
    public void setLogEndDateTime(Timestamp logEndDateTime) {
        this.logEndDateTime = logEndDateTime;
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
    public String getPosTerminalLogId() {
        return this.posTerminalLogId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPosTerminalId() {
        return this.posTerminalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getItemCount() {
        return this.itemCount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReturnId() {
        return this.returnId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLogStartDateTime() {
        return this.logStartDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLogEndDateTime() {
        return this.logEndDateTime;
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
     * Auto generated method that gets the related <code>PosTerminal</code> by the relation named <code>PosTerminal</code>.
     * @return the <code>PosTerminal</code>
     * @throws RepositoryException if an error occurs
     */
    public PosTerminal getPosTerminal() throws RepositoryException {
        if (this.posTerminal == null) {
            this.posTerminal = getRelatedOne(PosTerminal.class, "PosTerminal");
        }
        return this.posTerminal;
    }
    /**
     * Auto generated method that gets the related <code>OrderHeader</code> by the relation named <code>OrderHeader</code>.
     * @return the <code>OrderHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public OrderHeader getOrderHeader() throws RepositoryException {
        if (this.orderHeader == null) {
            this.orderHeader = getRelatedOne(OrderHeader.class, "OrderHeader");
        }
        return this.orderHeader;
    }
    /**
     * Auto generated method that gets the related <code>ReturnHeader</code> by the relation named <code>ReturnHeader</code>.
     * @return the <code>ReturnHeader</code>
     * @throws RepositoryException if an error occurs
     */
    public ReturnHeader getReturnHeader() throws RepositoryException {
        if (this.returnHeader == null) {
            this.returnHeader = getRelatedOne(ReturnHeader.class, "ReturnHeader");
        }
        return this.returnHeader;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>PosTerminalInternTx</code> by the relation named <code>PosTerminalInternTx</code>.
     * @return the <code>PosTerminalInternTx</code>
     * @throws RepositoryException if an error occurs
     */
    public PosTerminalInternTx getPosTerminalInternTx() throws RepositoryException {
        if (this.posTerminalInternTx == null) {
            this.posTerminalInternTx = getRelatedOne(PosTerminalInternTx.class, "PosTerminalInternTx");
        }
        return this.posTerminalInternTx;
    }

    /**
     * Auto generated value setter.
     * @param posTerminal the posTerminal to set
    */
    public void setPosTerminal(PosTerminal posTerminal) {
        this.posTerminal = posTerminal;
    }
    /**
     * Auto generated value setter.
     * @param orderHeader the orderHeader to set
    */
    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }
    /**
     * Auto generated value setter.
     * @param returnHeader the returnHeader to set
    */
    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param posTerminalInternTx the posTerminalInternTx to set
    */
    public void setPosTerminalInternTx(PosTerminalInternTx posTerminalInternTx) {
        this.posTerminalInternTx = posTerminalInternTx;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPosTerminalLogId((String) mapValue.get("posTerminalLogId"));
        setPosTerminalId((String) mapValue.get("posTerminalId"));
        setTransactionId((String) mapValue.get("transactionId"));
        setItemCount((Long) mapValue.get("itemCount"));
        setOrderId((String) mapValue.get("orderId"));
        setReturnId((String) mapValue.get("returnId"));
        setUserLoginId((String) mapValue.get("userLoginId"));
        setStatusId((String) mapValue.get("statusId"));
        setLogStartDateTime((Timestamp) mapValue.get("logStartDateTime"));
        setLogEndDateTime((Timestamp) mapValue.get("logEndDateTime"));
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
        mapValue.put("posTerminalLogId", getPosTerminalLogId());
        mapValue.put("posTerminalId", getPosTerminalId());
        mapValue.put("transactionId", getTransactionId());
        mapValue.put("itemCount", getItemCount());
        mapValue.put("orderId", getOrderId());
        mapValue.put("returnId", getReturnId());
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("logStartDateTime", getLogStartDateTime());
        mapValue.put("logEndDateTime", getLogEndDateTime());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
