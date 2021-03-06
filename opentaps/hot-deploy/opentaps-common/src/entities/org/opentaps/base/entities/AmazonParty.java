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
 * Auto generated base entity AmazonParty.
 */
@javax.persistence.Entity
@Table(name="AMAZON_PARTY")
public class AmazonParty extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("buyerEmailAddress", "BUYER_EMAIL_ADDRESS");
        fields.put("partyId", "PARTY_ID");
        fields.put("emailContactMechId", "EMAIL_CONTACT_MECH_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AmazonParty", fields);
}
  public static enum Fields implements EntityFieldInterface<AmazonParty> {
    buyerEmailAddress("buyerEmailAddress"),
    partyId("partyId"),
    emailContactMechId("emailContactMechId"),
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

   @org.hibernate.annotations.GenericGenerator(name="AmazonParty_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="AmazonParty_GEN")
   @Id
   @Column(name="BUYER_EMAIL_ADDRESS")
   private String buyerEmailAddress;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="EMAIL_CONTACT_MECH_ID")
   private String emailContactMechId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   private transient Person person = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="EMAIL_CONTACT_MECH_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private ContactMech contactMech = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="amazonParty", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="BUYER_EMAIL_ADDRESS")
   
   private List<AmazonOrder> amazonOrders = null;

  /**
   * Default constructor.
   */
  public AmazonParty() {
      super();
      this.baseEntityName = "AmazonParty";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("buyerEmailAddress");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("buyerEmailAddress");this.allFieldsNames.add("partyId");this.allFieldsNames.add("emailContactMechId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AmazonParty(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param buyerEmailAddress the buyerEmailAddress to set
     */
    public void setBuyerEmailAddress(String buyerEmailAddress) {
        this.buyerEmailAddress = buyerEmailAddress;
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
     * @param emailContactMechId the emailContactMechId to set
     */
    public void setEmailContactMechId(String emailContactMechId) {
        this.emailContactMechId = emailContactMechId;
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
    public String getBuyerEmailAddress() {
        return this.buyerEmailAddress;
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
     * @return <code>String</code>
     */
    public String getEmailContactMechId() {
        return this.emailContactMechId;
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
     * Auto generated method that gets the related <code>Person</code> by the relation named <code>Person</code>.
     * @return the <code>Person</code>
     * @throws RepositoryException if an error occurs
     */
    public Person getPerson() throws RepositoryException {
        if (this.person == null) {
            this.person = getRelatedOne(Person.class, "Person");
        }
        return this.person;
    }
    /**
     * Auto generated method that gets the related <code>ContactMech</code> by the relation named <code>ContactMech</code>.
     * @return the <code>ContactMech</code>
     * @throws RepositoryException if an error occurs
     */
    public ContactMech getContactMech() throws RepositoryException {
        if (this.contactMech == null) {
            this.contactMech = getRelatedOne(ContactMech.class, "ContactMech");
        }
        return this.contactMech;
    }
    /**
     * Auto generated method that gets the related <code>AmazonOrder</code> by the relation named <code>AmazonOrder</code>.
     * @return the list of <code>AmazonOrder</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends AmazonOrder> getAmazonOrders() throws RepositoryException {
        if (this.amazonOrders == null) {
            this.amazonOrders = getRelated(AmazonOrder.class, "AmazonOrder");
        }
        return this.amazonOrders;
    }

    /**
     * Auto generated value setter.
     * @param person the person to set
    */
    public void setPerson(Person person) {
        this.person = person;
    }
    /**
     * Auto generated value setter.
     * @param contactMech the contactMech to set
    */
    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
    /**
     * Auto generated value setter.
     * @param amazonOrders the amazonOrders to set
    */
    public void setAmazonOrders(List<AmazonOrder> amazonOrders) {
        this.amazonOrders = amazonOrders;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBuyerEmailAddress((String) mapValue.get("buyerEmailAddress"));
        setPartyId((String) mapValue.get("partyId"));
        setEmailContactMechId((String) mapValue.get("emailContactMechId"));
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
        mapValue.put("buyerEmailAddress", getBuyerEmailAddress());
        mapValue.put("partyId", getPartyId());
        mapValue.put("emailContactMechId", getEmailContactMechId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
