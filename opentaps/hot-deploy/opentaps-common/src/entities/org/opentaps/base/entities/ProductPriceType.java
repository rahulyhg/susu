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
 * Auto generated base entity ProductPriceType.
 */
@javax.persistence.Entity
@Table(name="PRODUCT_PRICE_TYPE")
public class ProductPriceType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("productPriceTypeId", "PRODUCT_PRICE_TYPE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ProductPriceType", fields);
}
  public static enum Fields implements EntityFieldInterface<ProductPriceType> {
    productPriceTypeId("productPriceTypeId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="ProductPriceType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ProductPriceType_GEN")
   @Id
   @Column(name="PRODUCT_PRICE_TYPE_ID")
   private String productPriceTypeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productPriceType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_PRICE_TYPE_ID")
   
   private List<ProductFeaturePrice> productFeaturePrices = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="productPriceType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRODUCT_PRICE_TYPE_ID")
   
   private List<ProductPrice> productPrices = null;

  /**
   * Default constructor.
   */
  public ProductPriceType() {
      super();
      this.baseEntityName = "ProductPriceType";
      this.isView = false;
      this.resourceName = "ProductEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("productPriceTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("productPriceTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ProductPriceType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param productPriceTypeId the productPriceTypeId to set
     */
    public void setProductPriceTypeId(String productPriceTypeId) {
        this.productPriceTypeId = productPriceTypeId;
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
    public String getProductPriceTypeId() {
        return this.productPriceTypeId;
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
     * Auto generated method that gets the related <code>ProductFeaturePrice</code> by the relation named <code>ProductFeaturePrice</code>.
     * @return the list of <code>ProductFeaturePrice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductFeaturePrice> getProductFeaturePrices() throws RepositoryException {
        if (this.productFeaturePrices == null) {
            this.productFeaturePrices = getRelated(ProductFeaturePrice.class, "ProductFeaturePrice");
        }
        return this.productFeaturePrices;
    }
    /**
     * Auto generated method that gets the related <code>ProductPrice</code> by the relation named <code>ProductPrice</code>.
     * @return the list of <code>ProductPrice</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends ProductPrice> getProductPrices() throws RepositoryException {
        if (this.productPrices == null) {
            this.productPrices = getRelated(ProductPrice.class, "ProductPrice");
        }
        return this.productPrices;
    }

    /**
     * Auto generated value setter.
     * @param productFeaturePrices the productFeaturePrices to set
    */
    public void setProductFeaturePrices(List<ProductFeaturePrice> productFeaturePrices) {
        this.productFeaturePrices = productFeaturePrices;
    }
    /**
     * Auto generated value setter.
     * @param productPrices the productPrices to set
    */
    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addProductFeaturePrice(ProductFeaturePrice productFeaturePrice) {
        if (this.productFeaturePrices == null) {
            this.productFeaturePrices = new ArrayList<ProductFeaturePrice>();
        }
        this.productFeaturePrices.add(productFeaturePrice);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductFeaturePrice(ProductFeaturePrice productFeaturePrice) {
        if (this.productFeaturePrices == null) {
            return;
        }
        this.productFeaturePrices.remove(productFeaturePrice);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductFeaturePrice() {
        if (this.productFeaturePrices == null) {
            return;
        }
        this.productFeaturePrices.clear();
    }
    /**
     * Auto generated method that add item to collection.
     */
    public void addProductPrice(ProductPrice productPrice) {
        if (this.productPrices == null) {
            this.productPrices = new ArrayList<ProductPrice>();
        }
        this.productPrices.add(productPrice);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeProductPrice(ProductPrice productPrice) {
        if (this.productPrices == null) {
            return;
        }
        this.productPrices.remove(productPrice);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearProductPrice() {
        if (this.productPrices == null) {
            return;
        }
        this.productPrices.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setProductPriceTypeId((String) mapValue.get("productPriceTypeId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("productPriceTypeId", getProductPriceTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}