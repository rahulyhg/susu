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
 * Auto generated base entity UomType.
 */
@javax.persistence.Entity
@Table(name="UOM_TYPE")
public class UomType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("uomTypeId", "UOM_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("UomType", fields);
}
  public static enum Fields implements EntityFieldInterface<UomType> {
    uomTypeId("uomTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
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

   @org.hibernate.annotations.GenericGenerator(name="UomType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="UomType_GEN")
   @Id
   @Column(name="UOM_TYPE_ID")
   private String uomTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
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
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UomType parentUomType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="amountUomType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="AMOUNT_UOM_TYPE_ID")
   
   private List<Product> amountProducts = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="uomType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="UOM_TYPE_ID")
   
   private List<TermTypeToUomTypeMap> termTypeToUomTypeMaps = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="uomType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="UOM_TYPE_ID")
   
   private List<Uom> uoms = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentUomType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<UomType> childUomTypes = null;

  /**
   * Default constructor.
   */
  public UomType() {
      super();
      this.baseEntityName = "UomType";
      this.isView = false;
      this.resourceName = "CommonEntityLabels";
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("uomTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("uomTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public UomType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param uomTypeId the uomTypeId to set
     */
    public void setUomTypeId(String uomTypeId) {
        this.uomTypeId = uomTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
    public String getUomTypeId() {
        return this.uomTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
     * Auto generated method that gets the related <code>UomType</code> by the relation named <code>ParentUomType</code>.
     * @return the <code>UomType</code>
     * @throws RepositoryException if an error occurs
     */
    public UomType getParentUomType() throws RepositoryException {
        if (this.parentUomType == null) {
            this.parentUomType = getRelatedOne(UomType.class, "ParentUomType");
        }
        return this.parentUomType;
    }
    /**
     * Auto generated method that gets the related <code>Product</code> by the relation named <code>AmountProduct</code>.
     * @return the list of <code>Product</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Product> getAmountProducts() throws RepositoryException {
        if (this.amountProducts == null) {
            this.amountProducts = getRelated(Product.class, "AmountProduct");
        }
        return this.amountProducts;
    }
    /**
     * Auto generated method that gets the related <code>TermTypeToUomTypeMap</code> by the relation named <code>TermTypeToUomTypeMap</code>.
     * @return the list of <code>TermTypeToUomTypeMap</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TermTypeToUomTypeMap> getTermTypeToUomTypeMaps() throws RepositoryException {
        if (this.termTypeToUomTypeMaps == null) {
            this.termTypeToUomTypeMaps = getRelated(TermTypeToUomTypeMap.class, "TermTypeToUomTypeMap");
        }
        return this.termTypeToUomTypeMaps;
    }
    /**
     * Auto generated method that gets the related <code>Uom</code> by the relation named <code>Uom</code>.
     * @return the list of <code>Uom</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Uom> getUoms() throws RepositoryException {
        if (this.uoms == null) {
            this.uoms = getRelated(Uom.class, "Uom");
        }
        return this.uoms;
    }
    /**
     * Auto generated method that gets the related <code>UomType</code> by the relation named <code>ChildUomType</code>.
     * @return the list of <code>UomType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends UomType> getChildUomTypes() throws RepositoryException {
        if (this.childUomTypes == null) {
            this.childUomTypes = getRelated(UomType.class, "ChildUomType");
        }
        return this.childUomTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentUomType the parentUomType to set
    */
    public void setParentUomType(UomType parentUomType) {
        this.parentUomType = parentUomType;
    }
    /**
     * Auto generated value setter.
     * @param amountProducts the amountProducts to set
    */
    public void setAmountProducts(List<Product> amountProducts) {
        this.amountProducts = amountProducts;
    }
    /**
     * Auto generated value setter.
     * @param termTypeToUomTypeMaps the termTypeToUomTypeMaps to set
    */
    public void setTermTypeToUomTypeMaps(List<TermTypeToUomTypeMap> termTypeToUomTypeMaps) {
        this.termTypeToUomTypeMaps = termTypeToUomTypeMaps;
    }
    /**
     * Auto generated value setter.
     * @param uoms the uoms to set
    */
    public void setUoms(List<Uom> uoms) {
        this.uoms = uoms;
    }
    /**
     * Auto generated value setter.
     * @param childUomTypes the childUomTypes to set
    */
    public void setChildUomTypes(List<UomType> childUomTypes) {
        this.childUomTypes = childUomTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addTermTypeToUomTypeMap(TermTypeToUomTypeMap termTypeToUomTypeMap) {
        if (this.termTypeToUomTypeMaps == null) {
            this.termTypeToUomTypeMaps = new ArrayList<TermTypeToUomTypeMap>();
        }
        this.termTypeToUomTypeMaps.add(termTypeToUomTypeMap);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeTermTypeToUomTypeMap(TermTypeToUomTypeMap termTypeToUomTypeMap) {
        if (this.termTypeToUomTypeMaps == null) {
            return;
        }
        this.termTypeToUomTypeMaps.remove(termTypeToUomTypeMap);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearTermTypeToUomTypeMap() {
        if (this.termTypeToUomTypeMaps == null) {
            return;
        }
        this.termTypeToUomTypeMaps.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setUomTypeId((String) mapValue.get("uomTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
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
        mapValue.put("uomTypeId", getUomTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
