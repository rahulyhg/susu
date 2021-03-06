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
 * Auto generated base entity WorkEffortNoteAndData.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectWorkEffortNoteAndDatas", query="SELECT WEN.WORK_EFFORT_ID AS \"workEffortId\",WEN.INTERNAL_NOTE AS \"internalNote\",WEN.NOTE_ID AS \"noteId\",ND.NOTE_NAME AS \"noteName\",ND.NOTE_INFO AS \"noteInfo\",ND.NOTE_PARTY AS \"noteParty\",ND.NOTE_DATE_TIME AS \"noteDateTime\" FROM WORK_EFFORT_NOTE WEN INNER JOIN NOTE_DATA ND ON WEN.NOTE_ID = ND.NOTE_ID", resultSetMapping="WorkEffortNoteAndDataMapping")
@SqlResultSetMapping(name="WorkEffortNoteAndDataMapping", entities={
@EntityResult(entityClass=WorkEffortNoteAndData.class, fields = {
@FieldResult(name="workEffortId", column="workEffortId")
,@FieldResult(name="internalNote", column="internalNote")
,@FieldResult(name="noteId", column="noteId")
,@FieldResult(name="noteName", column="noteName")
,@FieldResult(name="noteInfo", column="noteInfo")
,@FieldResult(name="noteParty", column="noteParty")
,@FieldResult(name="noteDateTime", column="noteDateTime")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class WorkEffortNoteAndData extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortId", "WEN.WORK_EFFORT_ID");
        fields.put("internalNote", "WEN.INTERNAL_NOTE");
        fields.put("noteId", "WEN.NOTE_ID");
        fields.put("noteName", "ND.NOTE_NAME");
        fields.put("noteInfo", "ND.NOTE_INFO");
        fields.put("noteParty", "ND.NOTE_PARTY");
        fields.put("noteDateTime", "ND.NOTE_DATE_TIME");
fieldMapColumns.put("WorkEffortNoteAndData", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortNoteAndData> {
    workEffortId("workEffortId"),
    internalNote("internalNote"),
    noteId("noteId"),
    noteName("noteName"),
    noteInfo("noteInfo"),
    noteParty("noteParty"),
    noteDateTime("noteDateTime");
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
   private String workEffortId;
    
   private String internalNote;
    
   private String noteId;
    
   private String noteName;
    
   private String noteInfo;
    
   private String noteParty;
    
   private Timestamp noteDateTime;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="NOTE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private NoteData noteData = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="NOTE_PARTY", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   private transient Person person = null;

  /**
   * Default constructor.
   */
  public WorkEffortNoteAndData() {
      super();
      this.baseEntityName = "WorkEffortNoteAndData";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("noteId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("internalNote");this.allFieldsNames.add("noteId");this.allFieldsNames.add("noteName");this.allFieldsNames.add("noteInfo");this.allFieldsNames.add("noteParty");this.allFieldsNames.add("noteDateTime");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortNoteAndData(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
    /**
     * Auto generated value setter.
     * @param internalNote the internalNote to set
     */
    public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
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
     * @param noteParty the noteParty to set
     */
    public void setNoteParty(String noteParty) {
        this.noteParty = noteParty;
    }
    /**
     * Auto generated value setter.
     * @param noteDateTime the noteDateTime to set
     */
    public void setNoteDateTime(Timestamp noteDateTime) {
        this.noteDateTime = noteDateTime;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWorkEffortId() {
        return this.workEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInternalNote() {
        return this.internalNote;
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
     * @return <code>String</code>
     */
    public String getNoteParty() {
        return this.noteParty;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getNoteDateTime() {
        return this.noteDateTime;
    }

    /**
     * Auto generated method that gets the related <code>NoteData</code> by the relation named <code>NoteData</code>.
     * @return the <code>NoteData</code>
     * @throws RepositoryException if an error occurs
     */
    public NoteData getNoteData() throws RepositoryException {
        if (this.noteData == null) {
            this.noteData = getRelatedOne(NoteData.class, "NoteData");
        }
        return this.noteData;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffort</code> by the relation named <code>WorkEffort</code>.
     * @return the <code>WorkEffort</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffort getWorkEffort() throws RepositoryException {
        if (this.workEffort == null) {
            this.workEffort = getRelatedOne(WorkEffort.class, "WorkEffort");
        }
        return this.workEffort;
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
     * Auto generated value setter.
     * @param noteData the noteData to set
    */
    public void setNoteData(NoteData noteData) {
        this.noteData = noteData;
    }
    /**
     * Auto generated value setter.
     * @param workEffort the workEffort to set
    */
    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
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
     * @param person the person to set
    */
    public void setPerson(Person person) {
        this.person = person;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setInternalNote((String) mapValue.get("internalNote"));
        setNoteId((String) mapValue.get("noteId"));
        setNoteName((String) mapValue.get("noteName"));
        setNoteInfo((String) mapValue.get("noteInfo"));
        setNoteParty((String) mapValue.get("noteParty"));
        setNoteDateTime((Timestamp) mapValue.get("noteDateTime"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("internalNote", getInternalNote());
        mapValue.put("noteId", getNoteId());
        mapValue.put("noteName", getNoteName());
        mapValue.put("noteInfo", getNoteInfo());
        mapValue.put("noteParty", getNoteParty());
        mapValue.put("noteDateTime", getNoteDateTime());
        return mapValue;
    }


}
