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
import java.lang.Long;
import java.lang.String;
import java.sql.Timestamp;

/**
 * Auto generated base entity ContentApproval.
 */
@javax.persistence.Entity
@Table(name="CONTENT_APPROVAL")
public class ContentApproval extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("contentApprovalId", "CONTENT_APPROVAL_ID");
        fields.put("contentId", "CONTENT_ID");
        fields.put("contentRevisionSeqId", "CONTENT_REVISION_SEQ_ID");
        fields.put("partyId", "PARTY_ID");
        fields.put("roleTypeId", "ROLE_TYPE_ID");
        fields.put("approvalStatusId", "APPROVAL_STATUS_ID");
        fields.put("approvalDate", "APPROVAL_DATE");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("comments", "COMMENTS");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("ContentApproval", fields);
}
  public static enum Fields implements EntityFieldInterface<ContentApproval> {
    contentApprovalId("contentApprovalId"),
    contentId("contentId"),
    contentRevisionSeqId("contentRevisionSeqId"),
    partyId("partyId"),
    roleTypeId("roleTypeId"),
    approvalStatusId("approvalStatusId"),
    approvalDate("approvalDate"),
    sequenceNum("sequenceNum"),
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

   @org.hibernate.annotations.GenericGenerator(name="ContentApproval_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="ContentApproval_GEN")
   @Id
   @Column(name="CONTENT_APPROVAL_ID")
   private String contentApprovalId;
   @Column(name="CONTENT_ID")
   private String contentId;
   @Column(name="CONTENT_REVISION_SEQ_ID")
   private String contentRevisionSeqId;
   @Column(name="PARTY_ID")
   private String partyId;
   @Column(name="ROLE_TYPE_ID")
   private String roleTypeId;
   @Column(name="APPROVAL_STATUS_ID")
   private String approvalStatusId;
   @Column(name="APPROVAL_DATE")
   private Timestamp approvalDate;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
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
   @JoinColumn(name="CONTENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Content content = null;
   private transient ContentRevision contentRevision = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party party = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ROLE_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private RoleType roleType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="APPROVAL_STATUS_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private StatusItem approvalStatusItem = null;

  /**
   * Default constructor.
   */
  public ContentApproval() {
      super();
      this.baseEntityName = "ContentApproval";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("contentApprovalId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("contentApprovalId");this.allFieldsNames.add("contentId");this.allFieldsNames.add("contentRevisionSeqId");this.allFieldsNames.add("partyId");this.allFieldsNames.add("roleTypeId");this.allFieldsNames.add("approvalStatusId");this.allFieldsNames.add("approvalDate");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("comments");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ContentApproval(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param contentApprovalId the contentApprovalId to set
     */
    public void setContentApprovalId(String contentApprovalId) {
        this.contentApprovalId = contentApprovalId;
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
    /**
     * Auto generated value setter.
     * @param contentRevisionSeqId the contentRevisionSeqId to set
     */
    public void setContentRevisionSeqId(String contentRevisionSeqId) {
        this.contentRevisionSeqId = contentRevisionSeqId;
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
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param approvalStatusId the approvalStatusId to set
     */
    public void setApprovalStatusId(String approvalStatusId) {
        this.approvalStatusId = approvalStatusId;
    }
    /**
     * Auto generated value setter.
     * @param approvalDate the approvalDate to set
     */
    public void setApprovalDate(Timestamp approvalDate) {
        this.approvalDate = approvalDate;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
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
    public String getContentApprovalId() {
        return this.contentApprovalId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentRevisionSeqId() {
        return this.contentRevisionSeqId;
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
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getApprovalStatusId() {
        return this.approvalStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getApprovalDate() {
        return this.approvalDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
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
     * Auto generated method that gets the related <code>Content</code> by the relation named <code>Content</code>.
     * @return the <code>Content</code>
     * @throws RepositoryException if an error occurs
     */
    public Content getContent() throws RepositoryException {
        if (this.content == null) {
            this.content = getRelatedOne(Content.class, "Content");
        }
        return this.content;
    }
    /**
     * Auto generated method that gets the related <code>ContentRevision</code> by the relation named <code>ContentRevision</code>.
     * @return the <code>ContentRevision</code>
     * @throws RepositoryException if an error occurs
     */
    public ContentRevision getContentRevision() throws RepositoryException {
        if (this.contentRevision == null) {
            this.contentRevision = getRelatedOne(ContentRevision.class, "ContentRevision");
        }
        return this.contentRevision;
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
     * Auto generated method that gets the related <code>RoleType</code> by the relation named <code>RoleType</code>.
     * @return the <code>RoleType</code>
     * @throws RepositoryException if an error occurs
     */
    public RoleType getRoleType() throws RepositoryException {
        if (this.roleType == null) {
            this.roleType = getRelatedOne(RoleType.class, "RoleType");
        }
        return this.roleType;
    }
    /**
     * Auto generated method that gets the related <code>StatusItem</code> by the relation named <code>ApprovalStatusItem</code>.
     * @return the <code>StatusItem</code>
     * @throws RepositoryException if an error occurs
     */
    public StatusItem getApprovalStatusItem() throws RepositoryException {
        if (this.approvalStatusItem == null) {
            this.approvalStatusItem = getRelatedOne(StatusItem.class, "ApprovalStatusItem");
        }
        return this.approvalStatusItem;
    }

    /**
     * Auto generated value setter.
     * @param content the content to set
    */
    public void setContent(Content content) {
        this.content = content;
    }
    /**
     * Auto generated value setter.
     * @param contentRevision the contentRevision to set
    */
    public void setContentRevision(ContentRevision contentRevision) {
        this.contentRevision = contentRevision;
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
     * @param roleType the roleType to set
    */
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    /**
     * Auto generated value setter.
     * @param approvalStatusItem the approvalStatusItem to set
    */
    public void setApprovalStatusItem(StatusItem approvalStatusItem) {
        this.approvalStatusItem = approvalStatusItem;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setContentApprovalId((String) mapValue.get("contentApprovalId"));
        setContentId((String) mapValue.get("contentId"));
        setContentRevisionSeqId((String) mapValue.get("contentRevisionSeqId"));
        setPartyId((String) mapValue.get("partyId"));
        setRoleTypeId((String) mapValue.get("roleTypeId"));
        setApprovalStatusId((String) mapValue.get("approvalStatusId"));
        setApprovalDate((Timestamp) mapValue.get("approvalDate"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("contentApprovalId", getContentApprovalId());
        mapValue.put("contentId", getContentId());
        mapValue.put("contentRevisionSeqId", getContentRevisionSeqId());
        mapValue.put("partyId", getPartyId());
        mapValue.put("roleTypeId", getRoleTypeId());
        mapValue.put("approvalStatusId", getApprovalStatusId());
        mapValue.put("approvalDate", getApprovalDate());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("comments", getComments());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
