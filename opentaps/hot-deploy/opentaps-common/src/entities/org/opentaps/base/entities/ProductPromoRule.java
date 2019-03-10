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
 * Auto generated base entity ProductPromoRule.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PROMO_RULE")
public class ProductPromoRule extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productPromoId", "PRODUCT_PROMO_ID");
        fields.put("productPromoRuleId", "PRODUCT_PROMO_RULE_ID");
        fields.put("ruleName", "RULE_NAME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPromoRule", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPromoRule> {
    productPromoId("productPromoId"),
    productPromoRuleId("productPromoRuleId"),
    ruleName("ruleName"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.ProductPromoRulePkBridge.class)
     private ProductPromoRulePk id = new ProductPromoRulePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>ProductPromoRulePk</code>
     */
      public ProductPromoRulePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>ProductPromoRulePk</code> value to set
    */   
      public void setId(ProductPromoRulePk id) {
         this.id = id;
      }
   @Column(name="RULE_NAME")
   private String ruleName;
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
   private transient List<OrderAdjustment> orderAdjustments = null;
   private transient List<ProductPromoAction> productPromoActions = null;
   private transient List<ProductPromoCond> productPromoConds = null;
   private transient List<QuoteAdjustment> quoteAdjustments = null;
   private transient List<ReturnAdjustment> returnAdjustments = null;

  /**
   * Default constructor.
   */
  public ProductPromoRule() {
      super();
      this.baseEntityName = "ProductPromoRule";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productPromoId");this.primaryKeyNames.add("productPromoRuleId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productPromoId");this.allFieldsNames.add("productPromoRuleId");this.allFieldsNames.add("ruleName");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPromoRule(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productPromoId the productPromoId to set
     */
    public void setProductPromoId(String productPromoId) {
        id.setProductPromoId(productPromoId);
    }
    /**
     * Auto generated value setter.
     * @param productPromoRuleId the productPromoRuleId to set
     */
    public void setProductPromoRuleId(String productPromoRuleId) {
        id.setProductPromoRuleId(productPromoRuleId);
    }
    /**
     * Auto generated value setter.
     * @param ruleName the ruleName to set
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
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
    public String getProductPromoId() {
        return this.id.getProductPromoId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductPromoRuleId() {
        return this.id.getProductPromoRuleId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRuleName() {
        return this.ruleName;
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
     * Auto generated method that gets the related <code>OrderAdjustment</code> by the relation named <code>OrderAdjustment</code>.
     * @return the list of <code>OrderAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends OrderAdjustment> getOrderAdjustments() throws RepositoryException {
        if (this.orderAdjustments == null) {
            this.orderAdjustments = getRelated(OrderAdjustment.class, "OrderAdjustment");
        }
        return this.orderAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoAction</code> by the relation named <code>ProductPromoAction</code>.
     * @return the list of <code>ProductPromoAction</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPromoAction> getProductPromoActions() throws RepositoryException {
        if (this.productPromoActions == null) {
            this.productPromoActions = getRelated(ProductPromoAction.class, "ProductPromoAction");
        }
        return this.productPromoActions;
    }
    /**
     * Auto generated method that gets the related <code>ProductPromoCond</code> by the relation named <code>ProductPromoCond</code>.
     * @return the list of <code>ProductPromoCond</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPromoCond> getProductPromoConds() throws RepositoryException {
        if (this.productPromoConds == null) {
            this.productPromoConds = getRelated(ProductPromoCond.class, "ProductPromoCond");
        }
        return this.productPromoConds;
    }
    /**
     * Auto generated method that gets the related <code>QuoteAdjustment</code> by the relation named <code>QuoteAdjustment</code>.
     * @return the list of <code>QuoteAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends QuoteAdjustment> getQuoteAdjustments() throws RepositoryException {
        if (this.quoteAdjustments == null) {
            this.quoteAdjustments = getRelated(QuoteAdjustment.class, "QuoteAdjustment");
        }
        return this.quoteAdjustments;
    }
    /**
     * Auto generated method that gets the related <code>ReturnAdjustment</code> by the relation named <code>ReturnAdjustment</code>.
     * @return the list of <code>ReturnAdjustment</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ReturnAdjustment> getReturnAdjustments() throws RepositoryException {
        if (this.returnAdjustments == null) {
            this.returnAdjustments = getRelated(ReturnAdjustment.class, "ReturnAdjustment");
        }
        return this.returnAdjustments;
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
     * @param orderAdjustments the orderAdjustments to set
    */
    public void setOrderAdjustments(List<OrderAdjustment> orderAdjustments) {
        this.orderAdjustments = orderAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param productPromoActions the productPromoActions to set
    */
    public void setProductPromoActions(List<ProductPromoAction> productPromoActions) {
        this.productPromoActions = productPromoActions;
    }
    /**
     * Auto generated value setter.
     * @param productPromoConds the productPromoConds to set
    */
    public void setProductPromoConds(List<ProductPromoCond> productPromoConds) {
        this.productPromoConds = productPromoConds;
    }
    /**
     * Auto generated value setter.
     * @param quoteAdjustments the quoteAdjustments to set
    */
    public void setQuoteAdjustments(List<QuoteAdjustment> quoteAdjustments) {
        this.quoteAdjustments = quoteAdjustments;
    }
    /**
     * Auto generated value setter.
     * @param returnAdjustments the returnAdjustments to set
    */
    public void setReturnAdjustments(List<ReturnAdjustment> returnAdjustments) {
        this.returnAdjustments = returnAdjustments;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductPromoId((String) mapValue.get("productPromoId"));
        setProductPromoRuleId((String) mapValue.get("productPromoRuleId"));
        setRuleName((String) mapValue.get("ruleName"));
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
        mapValue.put("productPromoId", getProductPromoId());
        mapValue.put("productPromoRuleId", getProductPromoRuleId());
        mapValue.put("ruleName", getRuleName());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
