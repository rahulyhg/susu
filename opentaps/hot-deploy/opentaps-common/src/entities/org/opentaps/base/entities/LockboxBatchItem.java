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
 * Auto generated base entity LockboxBatchItem.
 */
@javax.persistence.Entity
@Table(name="LOCKBOX_BATCH_ITEM")
public class LockboxBatchItem extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("lockboxBatchId", "LOCKBOX_BATCH_ID");
        fields.put("itemSeqId", "ITEM_SEQ_ID");
        fields.put("routingNumber", "ROUTING_NUMBER");
        fields.put("accountNumber", "ACCOUNT_NUMBER");
        fields.put("paymentDate", "PAYMENT_DATE");
        fields.put("checkNumber", "CHECK_NUMBER");
        fields.put("checkAmount", "CHECK_AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("LockboxBatchItem", fields);
}
  public static enum Fields implements EntityFieldInterface<LockboxBatchItem> {
    lockboxBatchId("lockboxBatchId"),
    itemSeqId("itemSeqId"),
    routingNumber("routingNumber"),
    accountNumber("accountNumber"),
    paymentDate("paymentDate"),
    checkNumber("checkNumber"),
    checkAmount("checkAmount"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.LockboxBatchItemPkBridge.class)
     private LockboxBatchItemPk id = new LockboxBatchItemPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>LockboxBatchItemPk</code>
     */
      public LockboxBatchItemPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>LockboxBatchItemPk</code> value to set
    */   
      public void setId(LockboxBatchItemPk id) {
         this.id = id;
      }
   @Column(name="ROUTING_NUMBER")
   private String routingNumber;
   @Column(name="ACCOUNT_NUMBER")
   private String accountNumber;
   @Column(name="PAYMENT_DATE")
   private Timestamp paymentDate;
   @Column(name="CHECK_NUMBER")
   private String checkNumber;
   @Column(name="CHECK_AMOUNT")
   private BigDecimal checkAmount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="LOCKBOX_BATCH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private LockboxBatch lockboxBatch = null;
   private transient List<LockboxBatchItemDetail> lockboxBatchItemDetails = null;

  /**
   * Default constructor.
   */
  public LockboxBatchItem() {
      super();
      this.baseEntityName = "LockboxBatchItem";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("lockboxBatchId");this.primaryKeyNames.add("itemSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("lockboxBatchId");this.allFieldsNames.add("itemSeqId");this.allFieldsNames.add("routingNumber");this.allFieldsNames.add("accountNumber");this.allFieldsNames.add("paymentDate");this.allFieldsNames.add("checkNumber");this.allFieldsNames.add("checkAmount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public LockboxBatchItem(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param lockboxBatchId the lockboxBatchId to set
     */
    public void setLockboxBatchId(String lockboxBatchId) {
        id.setLockboxBatchId(lockboxBatchId);
    }
    /**
     * Auto generated value setter.
     * @param itemSeqId the itemSeqId to set
     */
    public void setItemSeqId(String itemSeqId) {
        id.setItemSeqId(itemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param routingNumber the routingNumber to set
     */
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    /**
     * Auto generated value setter.
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    /**
     * Auto generated value setter.
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }
    /**
     * Auto generated value setter.
     * @param checkNumber the checkNumber to set
     */
    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }
    /**
     * Auto generated value setter.
     * @param checkAmount the checkAmount to set
     */
    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
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
    public String getLockboxBatchId() {
        return this.id.getLockboxBatchId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getItemSeqId() {
        return this.id.getItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoutingNumber() {
        return this.routingNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getPaymentDate() {
        return this.paymentDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCheckNumber() {
        return this.checkNumber;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCheckAmount() {
        return this.checkAmount;
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
     * Auto generated method that gets the related <code>LockboxBatch</code> by the relation named <code>LockboxBatch</code>.
     * @return the <code>LockboxBatch</code>
     * @throws RepositoryException if an error occurs
     */
    public LockboxBatch getLockboxBatch() throws RepositoryException {
        if (this.lockboxBatch == null) {
            this.lockboxBatch = getRelatedOne(LockboxBatch.class, "LockboxBatch");
        }
        return this.lockboxBatch;
    }
    /**
     * Auto generated method that gets the related <code>LockboxBatchItemDetail</code> by the relation named <code>LockboxBatchItemDetail</code>.
     * @return the list of <code>LockboxBatchItemDetail</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends LockboxBatchItemDetail> getLockboxBatchItemDetails() throws RepositoryException {
        if (this.lockboxBatchItemDetails == null) {
            this.lockboxBatchItemDetails = getRelated(LockboxBatchItemDetail.class, "LockboxBatchItemDetail");
        }
        return this.lockboxBatchItemDetails;
    }

    /**
     * Auto generated value setter.
     * @param lockboxBatch the lockboxBatch to set
    */
    public void setLockboxBatch(LockboxBatch lockboxBatch) {
        this.lockboxBatch = lockboxBatch;
    }
    /**
     * Auto generated value setter.
     * @param lockboxBatchItemDetails the lockboxBatchItemDetails to set
    */
    public void setLockboxBatchItemDetails(List<LockboxBatchItemDetail> lockboxBatchItemDetails) {
        this.lockboxBatchItemDetails = lockboxBatchItemDetails;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setLockboxBatchId((String) mapValue.get("lockboxBatchId"));
        setItemSeqId((String) mapValue.get("itemSeqId"));
        setRoutingNumber((String) mapValue.get("routingNumber"));
        setAccountNumber((String) mapValue.get("accountNumber"));
        setPaymentDate((Timestamp) mapValue.get("paymentDate"));
        setCheckNumber((String) mapValue.get("checkNumber"));
        setCheckAmount(convertToBigDecimal(mapValue.get("checkAmount")));
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
        mapValue.put("lockboxBatchId", getLockboxBatchId());
        mapValue.put("itemSeqId", getItemSeqId());
        mapValue.put("routingNumber", getRoutingNumber());
        mapValue.put("accountNumber", getAccountNumber());
        mapValue.put("paymentDate", getPaymentDate());
        mapValue.put("checkNumber", getCheckNumber());
        mapValue.put("checkAmount", getCheckAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
