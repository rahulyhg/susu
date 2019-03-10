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
 * Auto generated base entity Timesheet.
 */
@javax.persistence.Entity
@Table(name="TIMESHEET")
public class Timesheet extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("timesheetId", "TIMESHEET_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("clientPartyId", "CLIENT_PARTY_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("statusId", "STATUS_ID");
        fields.put("approvedByUserLoginId", "APPROVED_BY_USER_LOGIN_ID");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("Timesheet", fields);
}
  public static enum Fields implements EntityFieldInterface<Timesheet> {
    timesheetId("timesheetId"),
    partyId("partyId"),
    clientPartyId("clientPartyId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    statusId("statusId"),
    approvedByUserLoginId("approvedByUserLoginId"),
    comments("comments"),
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

   @org.hibernate.annotations.GenericGenerator(name="Timesheet_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="Timesheet_GEN")
   @Id
   @Column(name="TIMESHEET_ID")
   private String timesheetId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="CLIENT_PARTY_ID")
   private String clientPartyId;
   @Column(name="FROM_DATE")
   private Timestamp fromDate;
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="STATUS_ID")
   private String statusId;
   @Column(name="APPROVED_BY_USER_LOGIN_ID")
   private String approvedByUserLoginId;
   @Column(name="COMMENTS")
   private String comments;
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
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CLIENT_PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party clientParty = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem statusItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="APPROVED_BY_USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin approvedByUserLogin = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="timesheet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="TIMESHEET_ID")
   
   private List<TimeEntry> timeEntrys = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="timesheet", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="TIMESHEET_ID")
   
   private List<TimesheetRole> timesheetRoles = null;

  /**
   * Default constructor.
   */
  public Timesheet() {
      super();
      this.baseEntityName = "Timesheet";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("timesheetId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("timesheetId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("clientPartyId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("statusId");this.allFieldsNames.add("approvedByUserLoginId");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public Timesheet(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param timesheetId the timesheetId to set
     */
    public void setTimesheetId(String timesheetId) {
        this.timesheetId = timesheetId;
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
     * @param clientPartyId the clientPartyId to set
     */
    public void setClientPartyId(String clientPartyId) {
        this.clientPartyId = clientPartyId;
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
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param approvedByUserLoginId the approvedByUserLoginId to set
     */
    public void setApprovedByUserLoginId(String approvedByUserLoginId) {
        this.approvedByUserLoginId = approvedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
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
    public String getTimesheetId() {
        return this.timesheetId;
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
    public String getClientPartyId() {
        return this.clientPartyId;
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
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getApprovedByUserLoginId() {
        return this.approvedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComments() {
        return this.comments;
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
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>ClientParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getClientParty() throws RepositoryException {
        if (this.clientParty == null) {
            this.clientParty = getRelatedOne(Party.class, "ClientParty");
        }
        return this.clientParty;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>StatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getStatusItem() throws RepositoryException {
        if (this.statusItem == null) {
            this.statusItem = getRelatedOne(StatusItem.class, "StatusItem");
        }
        return this.statusItem;
    }
    /**
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>ApprovedByUserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getApprovedByUserLogin() throws RepositoryException {
        if (this.approvedByUserLogin == null) {
            this.approvedByUserLogin = getRelatedOne(UserLogin.class, "ApprovedByUserLogin");
        }
        return this.approvedByUserLogin;
    }
    /**
     * Auto generated method that gets the related <code>TimeEntry</code> by the relation named <code>TimeEntry</code>.
     * @return the list of <code>TimeEntry</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TimeEntry> getTimeEntrys() throws RepositoryException {
        if (this.timeEntrys == null) {
            this.timeEntrys = getRelated(TimeEntry.class, "TimeEntry");
        }
        return this.timeEntrys;
    }
    /**
     * Auto generated method that gets the related <code>TimesheetRole</code> by the relation named <code>TimesheetRole</code>.
     * @return the list of <code>TimesheetRole</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TimesheetRole> getTimesheetRoles() throws RepositoryException {
        if (this.timesheetRoles == null) {
            this.timesheetRoles = getRelated(TimesheetRole.class, "TimesheetRole");
        }
        return this.timesheetRoles;
    }

    /**
     * Auto generated value setter.
     * @param party the party to set
    */
    public void setParty(Party party) {
        this.party = party;
    }
    /**
     * Auto generated value setter.
     * @param clientParty the clientParty to set
    */
    public void setClientParty(Party clientParty) {
        this.clientParty = clientParty;
    }
    /**
     * Auto generated value setter.
     * @param statusItem the statusItem to set
    */
    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }
    /**
     * Auto generated value setter.
     * @param approvedByUserLogin the approvedByUserLogin to set
    */
    public void setApprovedByUserLogin(UserLogin approvedByUserLogin) {
        this.approvedByUserLogin = approvedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * @param timeEntrys the timeEntrys to set
    */
    public void setTimeEntrys(List<TimeEntry> timeEntrys) {
        this.timeEntrys = timeEntrys;
    }
    /**
     * Auto generated value setter.
     * @param timesheetRoles the timesheetRoles to set
    */
    public void setTimesheetRoles(List<TimesheetRole> timesheetRoles) {
        this.timesheetRoles = timesheetRoles;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addTimesheetRole(TimesheetRole timesheetRole) {
        if (this.timesheetRoles == null) {
            this.timesheetRoles = new ArrayList<TimesheetRole>();
        }
        this.timesheetRoles.add(timesheetRole);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeTimesheetRole(TimesheetRole timesheetRole) {
        if (this.timesheetRoles == null) {
            return;
        }
        this.timesheetRoles.remove(timesheetRole);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearTimesheetRole() {
        if (this.timesheetRoles == null) {
            return;
        }
        this.timesheetRoles.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTimesheetId((String) mapValue.get("timesheetId"));
        setPartyId((String) mapValue.get("partyId"));
        setClientPartyId((String) mapValue.get("clientPartyId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setStatusId((String) mapValue.get("statusId"));
        setApprovedByUserLoginId((String) mapValue.get("approvedByUserLoginId"));
        setComments((String) mapValue.get("comments"));
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
        mapValue.put("timesheetId", getTimesheetId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("clientPartyId", getClientPartyId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("statusId", getStatusId());
        mapValue.put("approvedByUserLoginId", getApprovedByUserLoginId());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
