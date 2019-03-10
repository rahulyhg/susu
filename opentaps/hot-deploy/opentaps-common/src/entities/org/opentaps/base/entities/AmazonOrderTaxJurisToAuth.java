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
 * Auto generated base entity AmazonOrderTaxJurisToAuth.
 */
@javax.persistence.Entity
@Table(name="AMAZON_ORDER_TAX_JURIS_TO_AUTH")
public class AmazonOrderTaxJurisToAuth extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("taxJurisDistrict", "TAX_JURIS_DISTRICT");
        fields.put("taxJurisCity", "TAX_JURIS_CITY");
        fields.put("taxJurisCounty", "TAX_JURIS_COUNTY");
        fields.put("taxJurisState", "TAX_JURIS_STATE");
        fields.put("taxAuthPartyId", "TAX_AUTH_PARTY_ID");
        fields.put("taxAuthGeoId", "TAX_AUTH_GEO_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonOrderTaxJurisToAuth", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonOrderTaxJurisToAuth> {
    taxJurisDistrict("taxJurisDistrict"),
    taxJurisCity("taxJurisCity"),
    taxJurisCounty("taxJurisCounty"),
    taxJurisState("taxJurisState"),
    taxAuthPartyId("taxAuthPartyId"),
    taxAuthGeoId("taxAuthGeoId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.AmazonOrderTaxJurisToAuthPkBridge.class)
     private AmazonOrderTaxJurisToAuthPk id = new AmazonOrderTaxJurisToAuthPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>AmazonOrderTaxJurisToAuthPk</code>
     */
      public AmazonOrderTaxJurisToAuthPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>AmazonOrderTaxJurisToAuthPk</code> value to set
    */   
      public void setId(AmazonOrderTaxJurisToAuthPk id) {
         this.id = id;
      }
   @Column(name="TAX_AUTH_PARTY_ID")
   private String taxAuthPartyId;
   @Column(name="TAX_AUTH_GEO_ID")
   private String taxAuthGeoId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient TaxAuthority taxAuthority = null;
   private transient List<AmazonOrderItemTaxJurisdtn> amazonOrderItemTaxJurisdtns = null;

  /**
   * Default constructor.
   */
  public AmazonOrderTaxJurisToAuth() {
      super();
      this.baseEntityName = "AmazonOrderTaxJurisToAuth";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("taxJurisDistrict");this.primaryKeyNames.add("taxJurisCity");this.primaryKeyNames.add("taxJurisCounty");this.primaryKeyNames.add("taxJurisState");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("taxJurisDistrict");this.allFieldsNames.add("taxJurisCity");this.allFieldsNames.add("taxJurisCounty");this.allFieldsNames.add("taxJurisState");this.allFieldsNames.add("taxAuthPartyId");this.allFieldsNames.add("taxAuthGeoId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonOrderTaxJurisToAuth(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param taxJurisDistrict the taxJurisDistrict to set
     */
    public void setTaxJurisDistrict(String taxJurisDistrict) {
        id.setTaxJurisDistrict(taxJurisDistrict);
    }
    /**
     * Auto generated value setter.
     * @param taxJurisCity the taxJurisCity to set
     */
    public void setTaxJurisCity(String taxJurisCity) {
        id.setTaxJurisCity(taxJurisCity);
    }
    /**
     * Auto generated value setter.
     * @param taxJurisCounty the taxJurisCounty to set
     */
    public void setTaxJurisCounty(String taxJurisCounty) {
        id.setTaxJurisCounty(taxJurisCounty);
    }
    /**
     * Auto generated value setter.
     * @param taxJurisState the taxJurisState to set
     */
    public void setTaxJurisState(String taxJurisState) {
        id.setTaxJurisState(taxJurisState);
    }
    /**
     * Auto generated value setter.
     * @param taxAuthPartyId the taxAuthPartyId to set
     */
    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * @param taxAuthGeoId the taxAuthGeoId to set
     */
    public void setTaxAuthGeoId(String taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
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
    public String getTaxJurisDistrict() {
        return this.id.getTaxJurisDistrict();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisCity() {
        return this.id.getTaxJurisCity();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisCounty() {
        return this.id.getTaxJurisCounty();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxJurisState() {
        return this.id.getTaxJurisState();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthPartyId() {
        return this.taxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTaxAuthGeoId() {
        return this.taxAuthGeoId;
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
     * Auto generated method that gets the related <code>TaxAuthority</code> by the relation named <code>TaxAuthority</code>.
     * @return the <code>TaxAuthority</code>
     * @throws RepositoryException if an error occurs
     */
    public TaxAuthority getTaxAuthority() throws RepositoryException {
        if (this.taxAuthority == null) {
            this.taxAuthority = getRelatedOne(TaxAuthority.class, "TaxAuthority");
        }
        return this.taxAuthority;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrderItemTaxJurisdtn</code> by the relation named <code>AmazonOrderItemTaxJurisdtn</code>.
     * @return the list of <code>AmazonOrderItemTaxJurisdtn</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AmazonOrderItemTaxJurisdtn> getAmazonOrderItemTaxJurisdtns() throws RepositoryException {
        if (this.amazonOrderItemTaxJurisdtns == null) {
            this.amazonOrderItemTaxJurisdtns = getRelated(AmazonOrderItemTaxJurisdtn.class, "AmazonOrderItemTaxJurisdtn");
        }
        return this.amazonOrderItemTaxJurisdtns;
    }

    /**
     * Auto generated value setter.
     * @param taxAuthority the taxAuthority to set
    */
    public void setTaxAuthority(TaxAuthority taxAuthority) {
        this.taxAuthority = taxAuthority;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrderItemTaxJurisdtns the amazonOrderItemTaxJurisdtns to set
    */
    public void setAmazonOrderItemTaxJurisdtns(List<AmazonOrderItemTaxJurisdtn> amazonOrderItemTaxJurisdtns) {
        this.amazonOrderItemTaxJurisdtns = amazonOrderItemTaxJurisdtns;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTaxJurisDistrict((String) mapValue.get("taxJurisDistrict"));
        setTaxJurisCity((String) mapValue.get("taxJurisCity"));
        setTaxJurisCounty((String) mapValue.get("taxJurisCounty"));
        setTaxJurisState((String) mapValue.get("taxJurisState"));
        setTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        setTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
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
        mapValue.put("taxJurisDistrict", getTaxJurisDistrict());
        mapValue.put("taxJurisCity", getTaxJurisCity());
        mapValue.put("taxJurisCounty", getTaxJurisCounty());
        mapValue.put("taxJurisState", getTaxJurisState());
        mapValue.put("taxAuthPartyId", getTaxAuthPartyId());
        mapValue.put("taxAuthGeoId", getTaxAuthGeoId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
