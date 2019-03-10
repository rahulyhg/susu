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
 * Auto generated base entity PartyNameContactMechView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectPartyNameContactMechViews", query="SELECT PTY.PARTY_ID AS \"partyId\",PTY.PARTY_TYPE_ID AS \"partyTypeId\",PTY.STATUS_ID AS \"statusId\",PER.FIRST_NAME AS \"firstName\",PER.MIDDLE_NAME AS \"middleName\",PER.LAST_NAME AS \"lastName\",PER.FIRST_NAME_LOCAL AS \"firstNameLocal\",PER.LAST_NAME_LOCAL AS \"lastNameLocal\",PER.PERSONAL_TITLE AS \"personalTitle\",PER.SUFFIX AS \"suffix\",PTYGRP.GROUP_NAME AS \"groupName\",PTYGRP.GROUP_NAME_LOCAL AS \"groupNameLocal\",PTYPCM.CONTACT_MECH_ID AS \"contactMechId\",PTYPCM.FROM_DATE AS \"fromDate\",PTYPCM.THRU_DATE AS \"thruDate\",PTYCM.CONTACT_MECH_TYPE_ID AS \"contactMechTypeId\",PTYCM.INFO_STRING AS \"infoString\" FROM PARTY PTY LEFT JOIN PERSON PER ON PTY.PARTY_ID = PER.PARTY_ID LEFT JOIN PARTY_GROUP PTYGRP ON PTY.PARTY_ID = PTYGRP.PARTY_ID INNER JOIN PARTY_CONTACT_MECH PTYPCM ON PTY.PARTY_ID = PTYPCM.PARTY_ID INNER JOIN CONTACT_MECH PTYCM ON PTYPCM.CONTACT_MECH_ID = PTYCM.CONTACT_MECH_ID", resultSetMapping="PartyNameContactMechViewMapping")
@SqlResultSetMapping(name="PartyNameContactMechViewMapping", entities={
@EntityResult(entityClass=PartyNameContactMechView.class, fields = {
@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="partyTypeId", column="partyTypeId")
,@FieldResult(name="statusId", column="statusId")
,@FieldResult(name="firstName", column="firstName")
,@FieldResult(name="middleName", column="middleName")
,@FieldResult(name="lastName", column="lastName")
,@FieldResult(name="firstNameLocal", column="firstNameLocal")
,@FieldResult(name="lastNameLocal", column="lastNameLocal")
,@FieldResult(name="personalTitle", column="personalTitle")
,@FieldResult(name="suffix", column="suffix")
,@FieldResult(name="groupName", column="groupName")
,@FieldResult(name="groupNameLocal", column="groupNameLocal")
,@FieldResult(name="contactMechId", column="contactMechId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="contactMechTypeId", column="contactMechTypeId")
,@FieldResult(name="infoString", column="infoString")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class PartyNameContactMechView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("partyId", "PTY.PARTY_ID");
        fields.put("partyTypeId", "PTY.PARTY_TYPE_ID");
        fields.put("statusId", "PTY.STATUS_ID");
        fields.put("firstName", "PER.FIRST_NAME");
        fields.put("middleName", "PER.MIDDLE_NAME");
        fields.put("lastName", "PER.LAST_NAME");
        fields.put("firstNameLocal", "PER.FIRST_NAME_LOCAL");
        fields.put("lastNameLocal", "PER.LAST_NAME_LOCAL");
        fields.put("personalTitle", "PER.PERSONAL_TITLE");
        fields.put("suffix", "PER.SUFFIX");
        fields.put("groupName", "PTYGRP.GROUP_NAME");
        fields.put("groupNameLocal", "PTYGRP.GROUP_NAME_LOCAL");
        fields.put("contactMechId", "PTYPCM.CONTACT_MECH_ID");
        fields.put("fromDate", "PTYPCM.FROM_DATE");
        fields.put("thruDate", "PTYPCM.THRU_DATE");
        fields.put("contactMechTypeId", "PTYCM.CONTACT_MECH_TYPE_ID");
        fields.put("infoString", "PTYCM.INFO_STRING");
fieldMapColumns.put("PartyNameContactMechView", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyNameContactMechView> {
    partyId("partyId"),
    partyTypeId("partyTypeId"),
    statusId("statusId"),
    firstName("firstName"),
    middleName("middleName"),
    lastName("lastName"),
    firstNameLocal("firstNameLocal"),
    lastNameLocal("lastNameLocal"),
    personalTitle("personalTitle"),
    suffix("suffix"),
    groupName("groupName"),
    groupNameLocal("groupNameLocal"),
    contactMechId("contactMechId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    contactMechTypeId("contactMechTypeId"),
    infoString("infoString");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    @Id
   private String partyId;
    
   private String partyTypeId;
    
   private String statusId;
    
   private String firstName;
    
   private String middleName;
    
   private String lastName;
    
   private String firstNameLocal;
    
   private String lastNameLocal;
    
   private String personalTitle;
    
   private String suffix;
    
   private String groupName;
    
   private String groupNameLocal;
    
   private String contactMechId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String contactMechTypeId;
    
   private String infoString;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;

  /**
   * Default constructor.
   */
  public PartyNameContactMechView() {
      super();
      this.baseEntityName = "PartyNameContactMechView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("partyId");this.primaryKeyNames.add("contactMechId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("partyId");this.allFieldsNames.add("partyTypeId");this.allFieldsNames.add("statusId");this.allFieldsNames.add("firstName");this.allFieldsNames.add("middleName");this.allFieldsNames.add("lastName");this.allFieldsNames.add("firstNameLocal");this.allFieldsNames.add("lastNameLocal");this.allFieldsNames.add("personalTitle");this.allFieldsNames.add("suffix");this.allFieldsNames.add("groupName");this.allFieldsNames.add("groupNameLocal");this.allFieldsNames.add("contactMechId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("contactMechTypeId");this.allFieldsNames.add("infoString");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyNameContactMechView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param partyId the partyId to set
     */
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
    /**
     * Auto generated value setter.
     * @param partyTypeId the partyTypeId to set
     */
    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
     * @param firstNameLocal the firstNameLocal to set
     */
    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param lastNameLocal the lastNameLocal to set
     */
    public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
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
     * @param groupName the groupName to set
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * Auto generated value setter.
     * @param groupNameLocal the groupNameLocal to set
     */
    public void setGroupNameLocal(String groupNameLocal) {
        this.groupNameLocal = groupNameLocal;
    }
    /**
     * Auto generated value setter.
     * @param contactMechId the contactMechId to set
     */
    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param contactMechTypeId the contactMechTypeId to set
     */
    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }
    /**
     * Auto generated value setter.
     * @param infoString the infoString to set
     */
    public void setInfoString(String infoString) {
        this.infoString = infoString;
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
    public String getPartyTypeId() {
        return this.partyTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
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
    public String getFirstNameLocal() {
        return this.firstNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastNameLocal() {
        return this.lastNameLocal;
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
     * @return <code>String</code>
     */
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGroupNameLocal() {
        return this.groupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechId() {
        return this.contactMechId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContactMechTypeId() {
        return this.contactMechTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInfoString() {
        return this.infoString;
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
        setPartyTypeId((String) mapValue.get("partyTypeId"));
        setStatusId((String) mapValue.get("statusId"));
        setFirstName((String) mapValue.get("firstName"));
        setMiddleName((String) mapValue.get("middleName"));
        setLastName((String) mapValue.get("lastName"));
        setFirstNameLocal((String) mapValue.get("firstNameLocal"));
        setLastNameLocal((String) mapValue.get("lastNameLocal"));
        setPersonalTitle((String) mapValue.get("personalTitle"));
        setSuffix((String) mapValue.get("suffix"));
        setGroupName((String) mapValue.get("groupName"));
        setGroupNameLocal((String) mapValue.get("groupNameLocal"));
        setContactMechId((String) mapValue.get("contactMechId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setContactMechTypeId((String) mapValue.get("contactMechTypeId"));
        setInfoString((String) mapValue.get("infoString"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("partyId", getPartyId());
        mapValue.put("partyTypeId", getPartyTypeId());
        mapValue.put("statusId", getStatusId());
        mapValue.put("firstName", getFirstName());
        mapValue.put("middleName", getMiddleName());
        mapValue.put("lastName", getLastName());
        mapValue.put("firstNameLocal", getFirstNameLocal());
        mapValue.put("lastNameLocal", getLastNameLocal());
        mapValue.put("personalTitle", getPersonalTitle());
        mapValue.put("suffix", getSuffix());
        mapValue.put("groupName", getGroupName());
        mapValue.put("groupNameLocal", getGroupNameLocal());
        mapValue.put("contactMechId", getContactMechId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("contactMechTypeId", getContactMechTypeId());
        mapValue.put("infoString", getInfoString());
        return mapValue;
    }


}
