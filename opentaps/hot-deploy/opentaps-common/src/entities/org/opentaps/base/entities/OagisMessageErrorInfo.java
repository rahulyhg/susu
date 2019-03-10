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
 * Auto generated base entity OagisMessageErrorInfo.
 */
@javax.persistence.Entity
@Table(name="OAGIS_MESSAGE_ERROR_INFO")
public class OagisMessageErrorInfo extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("logicalId", "LOGICAL_ID");
        fields.put("component", "COMPONENT");
        fields.put("task", "TASK");
        fields.put("referenceId", "REFERENCE_ID");
        fields.put("errorSeqId", "ERROR_SEQ_ID");
        fields.put("reasonCode", "REASON_CODE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("OagisMessageErrorInfo", fields);
}
  public static enum Fields implements EntityFieldInterface<OagisMessageErrorInfo> {
    logicalId("logicalId"),
    component("component"),
    task("task"),
    referenceId("referenceId"),
    errorSeqId("errorSeqId"),
    reasonCode("reasonCode"),
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

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.OagisMessageErrorInfoPkBridge.class)
     private OagisMessageErrorInfoPk id = new OagisMessageErrorInfoPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>OagisMessageErrorInfoPk</code>
     */
      public OagisMessageErrorInfoPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>OagisMessageErrorInfoPk</code> value to set
    */   
      public void setId(OagisMessageErrorInfoPk id) {
         this.id = id;
      }
   @Column(name="REASON_CODE")
   private String reasonCode;
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
   private transient OagisMessageInfo oagisMessageInfo = null;

  /**
   * Default constructor.
   */
  public OagisMessageErrorInfo() {
      super();
      this.baseEntityName = "OagisMessageErrorInfo";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("logicalId");this.primaryKeyNames.add("component");this.primaryKeyNames.add("task");this.primaryKeyNames.add("referenceId");this.primaryKeyNames.add("errorSeqId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("logicalId");this.allFieldsNames.add("component");this.allFieldsNames.add("task");this.allFieldsNames.add("referenceId");this.allFieldsNames.add("errorSeqId");this.allFieldsNames.add("reasonCode");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public OagisMessageErrorInfo(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param logicalId the logicalId to set
     */
    public void setLogicalId(String logicalId) {
        id.setLogicalId(logicalId);
    }
    /**
     * Auto generated value setter.
     * @param component the component to set
     */
    public void setComponent(String component) {
        id.setComponent(component);
    }
    /**
     * Auto generated value setter.
     * @param task the task to set
     */
    public void setTask(String task) {
        id.setTask(task);
    }
    /**
     * Auto generated value setter.
     * @param referenceId the referenceId to set
     */
    public void setReferenceId(String referenceId) {
        id.setReferenceId(referenceId);
    }
    /**
     * Auto generated value setter.
     * @param errorSeqId the errorSeqId to set
     */
    public void setErrorSeqId(String errorSeqId) {
        id.setErrorSeqId(errorSeqId);
    }
    /**
     * Auto generated value setter.
     * @param reasonCode the reasonCode to set
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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
    public String getLogicalId() {
        return this.id.getLogicalId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getComponent() {
        return this.id.getComponent();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTask() {
        return this.id.getTask();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReferenceId() {
        return this.id.getReferenceId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getErrorSeqId() {
        return this.id.getErrorSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReasonCode() {
        return this.reasonCode;
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
     * Auto generated method that gets the related <code>OagisMessageInfo</code> by the relation named <code>OagisMessageInfo</code>.
     * @return the <code>OagisMessageInfo</code>
     * @throws RepositoryException if an error occurs
     */
    public OagisMessageInfo getOagisMessageInfo() throws RepositoryException {
        if (this.oagisMessageInfo == null) {
            this.oagisMessageInfo = getRelatedOne(OagisMessageInfo.class, "OagisMessageInfo");
        }
        return this.oagisMessageInfo;
    }

    /**
     * Auto generated value setter.
     * @param oagisMessageInfo the oagisMessageInfo to set
    */
    public void setOagisMessageInfo(OagisMessageInfo oagisMessageInfo) {
        this.oagisMessageInfo = oagisMessageInfo;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setLogicalId((String) mapValue.get("logicalId"));
        setComponent((String) mapValue.get("component"));
        setTask((String) mapValue.get("task"));
        setReferenceId((String) mapValue.get("referenceId"));
        setErrorSeqId((String) mapValue.get("errorSeqId"));
        setReasonCode((String) mapValue.get("reasonCode"));
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
        mapValue.put("logicalId", getLogicalId());
        mapValue.put("component", getComponent());
        mapValue.put("task", getTask());
        mapValue.put("referenceId", getReferenceId());
        mapValue.put("errorSeqId", getErrorSeqId());
        mapValue.put("reasonCode", getReasonCode());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
