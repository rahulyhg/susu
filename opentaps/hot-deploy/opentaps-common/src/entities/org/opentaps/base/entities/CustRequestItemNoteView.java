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
 * Auto generated base entity CustRequestItemNoteView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCustRequestItemNoteViews", query="SELECT CR.CUST_REQUEST_ID AS \"custRequestId\",CR.CUST_REQUEST_ITEM_SEQ_ID AS \"custRequestItemSeqId\",ND.NOTE_ID AS \"noteId\",ND.NOTE_NAME AS \"noteName\",ND.NOTE_INFO AS \"noteInfo\",ND.NOTE_DATE_TIME AS \"noteDateTime\",PR.PARTY_ID AS \"partyId\",PR.FIRST_NAME AS \"firstName\",PR.LAST_NAME AS \"lastName\" FROM PERSON PR INNER JOIN NOTE_DATA ND ON CR.NOTE_ID = ND.NOTE_ID INNER JOIN NOTE_DATA ND ON ND.NOTE_PARTY = PR.PARTY_ID", resultSetMapping="CustRequestItemNoteViewMapping")
@SqlResultSetMapping(name="CustRequestItemNoteViewMapping", entities={
@EntityResult(entityClass=CustRequestItemNoteView.class, fields = {
@FieldResult(name="custRequestId", column="custRequestId")
,@FieldResult(name="custRequestItemSeqId", column="custRequestItemSeqId")
,@FieldResult(name="noteId", column="noteId")
,@FieldResult(name="noteName", column="noteName")
,@FieldResult(name="noteInfo", column="noteInfo")
,@FieldResult(name="noteDateTime", column="noteDateTime")
,@FieldResult(name="partyId", column="partyId")
,@FieldResult(name="firstName", column="firstName")
,@FieldResult(name="lastName", column="lastName")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CustRequestItemNoteView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestId", "CR.CUST_REQUEST_ID");
        fields.put("custRequestItemSeqId", "CR.CUST_REQUEST_ITEM_SEQ_ID");
        fields.put("noteId", "ND.NOTE_ID");
        fields.put("noteName", "ND.NOTE_NAME");
        fields.put("noteInfo", "ND.NOTE_INFO");
        fields.put("noteDateTime", "ND.NOTE_DATE_TIME");
        fields.put("partyId", "PR.PARTY_ID");
        fields.put("firstName", "PR.FIRST_NAME");
        fields.put("lastName", "PR.LAST_NAME");
fieldMapColumns.put("CustRequestItemNoteView", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestItemNoteView> {
    custRequestId("custRequestId"),
    custRequestItemSeqId("custRequestItemSeqId"),
    noteId("noteId"),
    noteName("noteName"),
    noteInfo("noteInfo"),
    noteDateTime("noteDateTime"),
    partyId("partyId"),
    firstName("firstName"),
    lastName("lastName");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String custRequestId;
    
   private String custRequestItemSeqId;
    
   private String noteId;
    
   private String noteName;
    
   private String noteInfo;
    
   private Timestamp noteDateTime;
    @Id
   private String partyId;
    
   private String firstName;
    
   private String lastName;

  /**
   * Default constructor.
   */
  public CustRequestItemNoteView() {
      super();
      this.baseEntityName = "CustRequestItemNoteView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestId");this.primaryKeyNames.add("custRequestItemSeqId");this.primaryKeyNames.add("noteId");this.primaryKeyNames.add("partyId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("custRequestItemSeqId");this.allFieldsNames.add("noteId");this.allFieldsNames.add("noteName");this.allFieldsNames.add("noteInfo");this.allFieldsNames.add("noteDateTime");this.allFieldsNames.add("partyId");this.allFieldsNames.add("firstName");this.allFieldsNames.add("lastName");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestItemNoteView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemSeqId the custRequestItemSeqId to set
     */
    public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param noteId the noteId to set
     */
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }
    /**
     * Auto generated value setter.
     * @param noteName the noteName to set
     */
    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }
    /**
     * Auto generated value setter.
     * @param noteInfo the noteInfo to set
     */
    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo;
    }
    /**
     * Auto generated value setter.
     * @param noteDateTime the noteDateTime to set
     */
    public void setNoteDateTime(Timestamp noteDateTime) {
        this.noteDateTime = noteDateTime;
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
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Auto generated value setter.
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestId() {
        return this.custRequestId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestItemSeqId() {
        return this.custRequestItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteId() {
        return this.noteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteName() {
        return this.noteName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteInfo() {
        return this.noteInfo;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getNoteDateTime() {
        return this.noteDateTime;
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
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getLastName() {
        return this.lastName;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCustRequestItemSeqId((String) mapValue.get("custRequestItemSeqId"));
        setNoteId((String) mapValue.get("noteId"));
        setNoteName((String) mapValue.get("noteName"));
        setNoteInfo((String) mapValue.get("noteInfo"));
        setNoteDateTime((Timestamp) mapValue.get("noteDateTime"));
        setPartyId((String) mapValue.get("partyId"));
        setFirstName((String) mapValue.get("firstName"));
        setLastName((String) mapValue.get("lastName"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("custRequestItemSeqId", getCustRequestItemSeqId());
        mapValue.put("noteId", getNoteId());
        mapValue.put("noteName", getNoteName());
        mapValue.put("noteInfo", getNoteInfo());
        mapValue.put("noteDateTime", getNoteDateTime());
        mapValue.put("partyId", getPartyId());
        mapValue.put("firstName", getFirstName());
        mapValue.put("lastName", getLastName());
        return mapValue;
    }


}
