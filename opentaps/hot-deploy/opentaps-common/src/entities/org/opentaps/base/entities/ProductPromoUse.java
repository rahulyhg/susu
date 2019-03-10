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
 * Auto generated base entity ProductPromoUse.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PROMO_USE")
public class ProductPromoUse extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("orderId", "ORDER_ID");
        fields.put("promoSequenceId", "PROMO_SEQUENCE_ID");
        fields.put("productPromoId", "PRODUCT_PROMO_ID");
        fields.put("productPromoCodeId", "PRODUCT_PROMO_CODE_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("totalDiscountAmount", "TOTAL_DISCOUNT_AMOUNT");
        fields.put("quantityLeftInActions", "QUANTITY_LEFT_IN_ACTIONS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPromoUse", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPromoUse> {
    orderId("orderId"),
    promoSequenceId("promoSequenceId"),
    productPromoId("productPromoId"),
    productPromoCodeId("productPromoCodeId"),
    partyId("partyId"),
    totalDiscountAmount("totalDiscountAmount"),
    quantityLeftInActions("quantityLeftInActions"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductPromoUsePkBridge.class)
     private ProductPromoUsePk id = new ProductPromoUsePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductPromoUsePk</code>
     */
      public ProductPromoUsePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductPromoUsePk</code> value to set
    */   
      public void setId(ProductPromoUsePk id) {
         this.id = id;
      }
   @Column(name="PRODUCT_PROMO_ID")
   private String productPromoId;
   @Column(name="PRODUCT_PROMO_CODE_ID")
   private String productPromoCodeId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="TOTAL_DISCOUNT_AMOUNT")
   private BigDecimal totalDiscountAmount;
   @Column(name="QUANTITY_LEFT_IN_ACTIONS")
   private BigDecimal quantityLeftInActions;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPromo productPromo = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_PROMO_CODE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductPromoCode productPromoCode = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ORDER_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private OrderHeader orderHeader = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;

  /**
   * Default constructor.
   */
  public ProductPromoUse() {
      super();
      this.baseEntityName = "ProductPromoUse";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("orderId");this.primaryKeyNames.add("promoSequenceId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("orderId");this.allFieldsNames.add("promoSequenceId");this.allFieldsNames.add("productPromoId");this.allFieldsNames.add("productPromoCodeId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("totalDiscountAmount");this.allFieldsNames.add("quantityLeftInActions");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPromoUse(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        id.setOrderId(orderId);
    }
    /**
     * Auto generated value setter.
     * @param promoSequenceId the promoSequenceId to set
     */
    public void setPromoSequenceId(String promoSequenceId) {
        id.setPromoSequenceId(promoSequenceId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    public void setProductPromoId(String productPromoId) {
        this.productPromoId = productPromoId;
    }
    /**
     * Auto generated value setter.
     * @param productPromoCodeId the productPromoCodeId to set
     */
    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
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
     * @param totalDiscountAmount the totalDiscountAmount to set
     */
    public void setTotalDiscountAmount(BigDecimal totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }
    /**
     * Auto generated value setter.
     * @param quantityLeftInActions the quantityLeftInActions to set
     */
    public void setQuantityLeftInActions(BigDecimal quantityLeftInActions) {
        this.quantityLeftInActions = quantityLeftInActions;
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
    public String getOrderId() {
        return this.id.getOrderId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPromoSequenceId() {
        return this.id.getPromoSequenceId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoId() {
        return this.productPromoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoCodeId() {
        return this.productPromoCodeId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTotalDiscountAmount() {
        return this.totalDiscountAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getQuantityLeftInActions() {
        return this.quantityLeftInActions;
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
     * Auto generated method that gets the related <code>ProductPromo</code> by the relation named <code>ProductPromo</code>.
     * @return the <code>ProductPromo</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPromo getProductPromo() throws RepositoryException {
        if (this.productPromo == null) {
            this.productPromo = getRelatedOne(ProductPromo.class, "ProductPromo");
        }
        return this.productPromo;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoCode</code> by the relation named <code>ProductPromoCode</code>.
     * @return the <code>ProductPromoCode</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductPromoCode getProductPromoCode() throws RepositoryException {
        if (this.productPromoCode == null) {
            this.productPromoCode = getRelatedOne(ProductPromoCode.class, "ProductPromoCode");
        }
        return this.productPromoCode;
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
     * Auto generated value setter.
     * @param productPromo the productPromo to set
    */
    public void setProductPromo(ProductPromo productPromo) {
        this.productPromo = productPromo;
    }
    /**
     * Auto generated value setter.
     * @param productPromoCode the productPromoCode to set
    */
    public void setProductPromoCode(ProductPromoCode productPromoCode) {
        this.productPromoCode = productPromoCode;
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
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOrderId((String) mapValue.get("orderId"));
        setPromoSequenceId((String) mapValue.get("promoSequenceId"));
        setProductPromoId((String) mapValue.get("productPromoId"));
        setProductPromoCodeId((String) mapValue.get("productPromoCodeId"));
        setPartyId((String) mapValue.get("partyId"));
        setTotalDiscountAmount(convertToBigDecimal(mapValue.get("totalDiscountAmount")));
        setQuantityLeftInActions(convertToBigDecimal(mapValue.get("quantityLeftInActions")));
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
        mapValue.put("orderId", getOrderId());
        mapValue.put("promoSequenceId", getPromoSequenceId());
        mapValue.put("productPromoId", getProductPromoId());
        mapValue.put("productPromoCodeId", getProductPromoCodeId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("totalDiscountAmount", getTotalDiscountAmount());
        mapValue.put("quantityLeftInActions", getQuantityLeftInActions());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
