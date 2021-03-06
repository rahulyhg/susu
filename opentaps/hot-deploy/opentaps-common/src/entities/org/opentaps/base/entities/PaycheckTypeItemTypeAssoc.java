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
 * Auto generated base entity PaycheckTypeItemTypeAssoc.
 */
@javax.persistence.Entity
@Table(name="PAYCHECK_TYPE_ITEM_TYPE_ASSOC")
public class PaycheckTypeItemTypeAssoc extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("paymentTypeId", "PAYMENT_TYPE_ID");
        fields.put("paycheckItemTypeId", "PAYCHECK_ITEM_TYPE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PaycheckTypeItemTypeAssoc", fields);
}
  public static enum Fields implements EntityFieldInterface<PaycheckTypeItemTypeAssoc> {
    paymentTypeId("paymentTypeId"),
    paycheckItemTypeId("paycheckItemTypeId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PaycheckTypeItemTypeAssocPkBridge.class)
     private PaycheckTypeItemTypeAssocPk id = new PaycheckTypeItemTypeAssocPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PaycheckTypeItemTypeAssocPk</code>
     */
      public PaycheckTypeItemTypeAssocPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PaycheckTypeItemTypeAssocPk</code> value to set
    */   
      public void setId(PaycheckTypeItemTypeAssocPk id) {
         this.id = id;
      }
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYMENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaymentType paymentType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PAYCHECK_ITEM_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PaycheckItemType paycheckItemType = null;

  /**
   * Default constructor.
   */
  public PaycheckTypeItemTypeAssoc() {
      super();
      this.baseEntityName = "PaycheckTypeItemTypeAssoc";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("paymentTypeId");this.primaryKeyNames.add("paycheckItemTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("paymentTypeId");this.allFieldsNames.add("paycheckItemTypeId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PaycheckTypeItemTypeAssoc(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param paymentTypeId the paymentTypeId to set
     */
    public void setPaymentTypeId(String paymentTypeId) {
        id.setPaymentTypeId(paymentTypeId);
    }
    /**
     * Auto generated value setter.
     * @param paycheckItemTypeId the paycheckItemTypeId to set
     */
    public void setPaycheckItemTypeId(String paycheckItemTypeId) {
        id.setPaycheckItemTypeId(paycheckItemTypeId);
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
    public String getPaymentTypeId() {
        return this.id.getPaymentTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPaycheckItemTypeId() {
        return this.id.getPaycheckItemTypeId();
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
     * Auto generated method that gets the related <code>PaymentType</code> by the relation named <code>PaymentType</code>.
     * @return the <code>PaymentType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaymentType getPaymentType() throws RepositoryException {
        if (this.paymentType == null) {
            this.paymentType = getRelatedOne(PaymentType.class, "PaymentType");
        }
        return this.paymentType;
    }
    /**
     * Auto generated method that gets the related <code>PaycheckItemType</code> by the relation named <code>PaycheckItemType</code>.
     * @return the <code>PaycheckItemType</code>
     * @throws RepositoryException if an error occurs
     */
    public PaycheckItemType getPaycheckItemType() throws RepositoryException {
        if (this.paycheckItemType == null) {
            this.paycheckItemType = getRelatedOne(PaycheckItemType.class, "PaycheckItemType");
        }
        return this.paycheckItemType;
    }

    /**
     * Auto generated value setter.
     * @param paymentType the paymentType to set
    */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    /**
     * Auto generated value setter.
     * @param paycheckItemType the paycheckItemType to set
    */
    public void setPaycheckItemType(PaycheckItemType paycheckItemType) {
        this.paycheckItemType = paycheckItemType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPaymentTypeId((String) mapValue.get("paymentTypeId"));
        setPaycheckItemTypeId((String) mapValue.get("paycheckItemTypeId"));
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
        mapValue.put("paymentTypeId", getPaymentTypeId());
        mapValue.put("paycheckItemTypeId", getPaycheckItemTypeId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
