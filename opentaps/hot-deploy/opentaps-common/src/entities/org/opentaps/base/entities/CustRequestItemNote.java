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
 * Auto generated base entity CustRequestItemNote.
 */
@javax.persistence.Entity
@Table(name="CUST_REQUEST_ITEM_NOTE")
public class CustRequestItemNote extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("custRequestId", "CUST_REQUEST_ID");
        fields.put("custRequestItemSeqId", "CUST_REQUEST_ITEM_SEQ_ID");
        fields.put("noteId", "NOTE_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("CustRequestItemNote", fields);
}
  public static enum Fields implements EntityFieldInterface<CustRequestItemNote> {
    custRequestId("custRequestId"),
    custRequestItemSeqId("custRequestItemSeqId"),
    noteId("noteId"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.CustRequestItemNotePkBridge.class)
     private CustRequestItemNotePk id = new CustRequestItemNotePk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>CustRequestItemNotePk</code>
     */
      public CustRequestItemNotePk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>CustRequestItemNotePk</code> value to set
    */   
      public void setId(CustRequestItemNotePk id) {
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
   private transient CustRequestItem custRequestItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="NOTE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private NoteData noteData = null;

  /**
   * Default constructor.
   */
  public CustRequestItemNote() {
      super();
      this.baseEntityName = "CustRequestItemNote";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("custRequestId");this.primaryKeyNames.add("custRequestItemSeqId");this.primaryKeyNames.add("noteId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("custRequestId");this.allFieldsNames.add("custRequestItemSeqId");this.allFieldsNames.add("noteId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CustRequestItemNote(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param custRequestId the custRequestId to set
     */
    public void setCustRequestId(String custRequestId) {
        id.setCustRequestId(custRequestId);
    }
    /**
     * Auto generated value setter.
     * @param custRequestItemSeqId the custRequestItemSeqId to set
     */
    public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        id.setCustRequestItemSeqId(custRequestItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param noteId the noteId to set
     */
    public void setNoteId(String noteId) {
        id.setNoteId(noteId);
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
    public String getCustRequestId() {
        return this.id.getCustRequestId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustRequestItemSeqId() {
        return this.id.getCustRequestItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getNoteId() {
        return this.id.getNoteId();
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
     * Auto generated method that gets the related <code>CustRequestItem</code> by the relation named <code>CustRequestItem</code>.
     * @return the <code>CustRequestItem</code>
     * @throws RepositoryException if an error occurs
     */
    public CustRequestItem getCustRequestItem() throws RepositoryException {
        if (this.custRequestItem == null) {
            this.custRequestItem = getRelatedOne(CustRequestItem.class, "CustRequestItem");
        }
        return this.custRequestItem;
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
     * Auto generated value setter.
     * @param custRequestItem the custRequestItem to set
    */
    public void setCustRequestItem(CustRequestItem custRequestItem) {
        this.custRequestItem = custRequestItem;
    }
    /**
     * Auto generated value setter.
     * @param noteData the noteData to set
    */
    public void setNoteData(NoteData noteData) {
        this.noteData = noteData;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCustRequestId((String) mapValue.get("custRequestId"));
        setCustRequestItemSeqId((String) mapValue.get("custRequestItemSeqId"));
        setNoteId((String) mapValue.get("noteId"));
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
        mapValue.put("custRequestId", getCustRequestId());
        mapValue.put("custRequestItemSeqId", getCustRequestItemSeqId());
        mapValue.put("noteId", getNoteId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
