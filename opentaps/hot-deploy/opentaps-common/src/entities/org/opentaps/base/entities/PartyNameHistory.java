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
 * Auto generated base entity PartyNameHistory.
 */
@javax.persistence.Entity
@Table(name="PARTY_NAME_HISTORY")
public class PartyNameHistory extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PARTY_ID");
        fields.put("changeDate", "CHANGE_DATE");
        fields.put("groupName", "GROUP_NAME");
        fields.put("firstName", "FIRST_NAME");
        fields.put("middleName", "MIDDLE_NAME");
        fields.put("lastName", "LAST_NAME");
        fields.put("personalTitle", "PERSONAL_TITLE");
        fields.put("suffix", "SUFFIX");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyNameHistory", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyNameHistory> {
    partyId("partyId"),
    changeDate("changeDate"),
    groupName("groupName"),
    firstName("firstName"),
    middleName("middleName"),
    lastName("lastName"),
    personalTitle("personalTitle"),
    suffix("suffix"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PartyNameHistoryPkBridge.class)
     private PartyNameHistoryPk id = new PartyNameHistoryPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PartyNameHistoryPk</code>
     */
      public PartyNameHistoryPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PartyNameHistoryPk</code> value to set
    */   
      public void setId(PartyNameHistoryPk id) {
         this.id = id;
      }
   @Column(name="GROUP_NAME")
   private String groupName;
   @Column(name="FIRST_NAME")
   private String firstName;
   @Column(name="MIDDLE_NAME")
   private String middleName;
   @Column(name="LAST_NAME")
   private String lastName;
   @Column(name="PERSONAL_TITLE")
   private String personalTitle;
   @Column(name="SUFFIX")
   private String suffix;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;

  /**
   * Default constructor.
   */
  public PartyNameHistory() {
      super();
      this.baseEntityName = "PartyNameHistory";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("changeDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("changeDate");this.allFieldsNames.add("groupName");this.allFieldsNames.add("firstName");this.allFieldsNames.add("middleName");this.allFieldsNames.add("lastName");this.allFieldsNames.add("personalTitle");this.allFieldsNames.add("suffix");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyNameHistory(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        id.setPartyId(partyId);
    }
    /**
     * Auto generated value setter.
     * @param changeDate the changeDate to set
     */
    public void setChangeDate(Timestamp changeDate) {
        id.setChangeDate(changeDate);
    }
    /**
     * Auto generated value setter.
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Auto generated value setter.
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * Auto generated value setter.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Auto generated value setter.
     * @param personalTitle the personalTitle to set
     */
    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }
    /**
     * Auto generated value setter.
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
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
    public String getPartyId() {
        return this.id.getPartyId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getChangeDate() {
        return this.id.getChangeDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPersonalTitle() {
        return this.personalTitle;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSuffix() {
        return this.suffix;
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
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setPartyId((String) mapValue.get("partyId"));
        setChangeDate((Timestamp) mapValue.get("changeDate"));
        setGroupName((String) mapValue.get("groupName"));
        setFirstName((String) mapValue.get("firstName"));
        setMiddleName((String) mapValue.get("middleName"));
        setLastName((String) mapValue.get("lastName"));
        setPersonalTitle((String) mapValue.get("personalTitle"));
        setSuffix((String) mapValue.get("suffix"));
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
        mapValue.put("partyId", getPartyId());
        mapValue.put("changeDate", getChangeDate());
        mapValue.put("groupName", getGroupName());
        mapValue.put("firstName", getFirstName());
        mapValue.put("middleName", getMiddleName());
        mapValue.put("lastName", getLastName());
        mapValue.put("personalTitle", getPersonalTitle());
        mapValue.put("suffix", getSuffix());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
