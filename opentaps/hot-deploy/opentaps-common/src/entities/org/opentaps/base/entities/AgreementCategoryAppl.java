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
 * Auto generated base entity AgreementCategoryAppl.
 */
@javax.persistence.Entity
@Table(name="AGREEMENT_CATEGORY_APPL")
public class AgreementCategoryAppl extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("agreementId", "AGREEMENT_ID");
        fields.put("agreementItemSeqId", "AGREEMENT_ITEM_SEQ_ID");
        fields.put("productCategoryId", "PRODUCT_CATEGORY_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AgreementCategoryAppl", fields);
}
  public static enum Fields implements EntityFieldInterface<AgreementCategoryAppl> {
    agreementId("agreementId"),
    agreementItemSeqId("agreementItemSeqId"),
    productCategoryId("productCategoryId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.AgreementCategoryApplPkBridge.class)
     private AgreementCategoryApplPk id = new AgreementCategoryApplPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AgreementCategoryApplPk</code>
     */
      public AgreementCategoryApplPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AgreementCategoryApplPk</code> value to set
    */   
      public void setId(AgreementCategoryApplPk id) {
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
   @JoinColumn(name="AGREEMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Agreement agreement = null;
   private transient AgreementItem agreementItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRODUCT_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ProductCategory productCategory = null;

  /**
   * Default constructor.
   */
  public AgreementCategoryAppl() {
      super();
      this.baseEntityName = "AgreementCategoryAppl";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("agreementId");this.primaryKeyNames.add("agreementItemSeqId");this.primaryKeyNames.add("productCategoryId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("agreementId");this.allFieldsNames.add("agreementItemSeqId");this.allFieldsNames.add("productCategoryId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AgreementCategoryAppl(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param agreementId the agreementId to set
     */
    public void setAgreementId(String agreementId) {
        id.setAgreementId(agreementId);
    }
    /**
     * Auto generated value setter.
     * @param agreementItemSeqId the agreementItemSeqId to set
     */
    public void setAgreementItemSeqId(String agreementItemSeqId) {
        id.setAgreementItemSeqId(agreementItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param productCategoryId the productCategoryId to set
     */
    public void setProductCategoryId(String productCategoryId) {
        id.setProductCategoryId(productCategoryId);
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
    public String getAgreementId() {
        return this.id.getAgreementId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAgreementItemSeqId() {
        return this.id.getAgreementItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductCategoryId() {
        return this.id.getProductCategoryId();
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
     * Auto generated method that gets the related <code>Agreement</code> by the relation named <code>Agreement</code>.
     * @return the <code>Agreement</code>
     * @throws RepositoryException if an error occurs
     */
    public Agreement getAgreement() throws RepositoryException {
        if (this.agreement == null) {
            this.agreement = getRelatedOne(Agreement.class, "Agreement");
        }
        return this.agreement;
    }
    /**
     * Auto generated method that gets the related <code>AgreementItem</code> by the relation named <code>AgreementItem</code>.
     * @return the <code>AgreementItem</code>
     * @throws RepositoryException if an error occurs
     */
    public AgreementItem getAgreementItem() throws RepositoryException {
        if (this.agreementItem == null) {
            this.agreementItem = getRelatedOne(AgreementItem.class, "AgreementItem");
        }
        return this.agreementItem;
    }
    /**
     * Auto generated method that gets the related <code>ProductCategory</code> by the relation named <code>ProductCategory</code>.
     * @return the <code>ProductCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public ProductCategory getProductCategory() throws RepositoryException {
        if (this.productCategory == null) {
            this.productCategory = getRelatedOne(ProductCategory.class, "ProductCategory");
        }
        return this.productCategory;
    }

    /**
     * Auto generated value setter.
     * @param agreement the agreement to set
    */
    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }
    /**
     * Auto generated value setter.
     * @param agreementItem the agreementItem to set
    */
    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }
    /**
     * Auto generated value setter.
     * @param productCategory the productCategory to set
    */
    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAgreementId((String) mapValue.get("agreementId"));
        setAgreementItemSeqId((String) mapValue.get("agreementItemSeqId"));
        setProductCategoryId((String) mapValue.get("productCategoryId"));
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
        mapValue.put("agreementId", getAgreementId());
        mapValue.put("agreementItemSeqId", getAgreementItemSeqId());
        mapValue.put("productCategoryId", getProductCategoryId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
