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
 * Auto generated base entity WorkEffortGoodStandardType.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_GOOD_STANDARD_TYPE")
public class WorkEffortGoodStandardType extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortGoodStdTypeId", "WORK_EFFORT_GOOD_STD_TYPE_ID");
        fields.put("parentTypeId", "PARENT_TYPE_ID");
        fields.put("hasTable", "HAS_TABLE");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortGoodStandardType", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortGoodStandardType> {
    workEffortGoodStdTypeId("workEffortGoodStdTypeId"),
    parentTypeId("parentTypeId"),
    hasTable("hasTable"),
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

   @org.hibernate.annotations.GenericGenerator(name="WorkEffortGoodStandardType_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="WorkEffortGoodStandardType_GEN")
   @Id
   @Column(name="WORK_EFFORT_GOOD_STD_TYPE_ID")
   private String workEffortGoodStdTypeId;
   @Column(name="PARENT_TYPE_ID")
   private String parentTypeId;
   @Column(name="HAS_TABLE")
   private String hasTable;
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
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARENT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffortGoodStandardType parentWorkEffortGoodStandardType = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="workEffortGoodStandardType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="WORK_EFFORT_GOOD_STD_TYPE_ID")
   
   private List<WorkEffortGoodStandard> workEffortGoodStandards = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="parentWorkEffortGoodStandardType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PARENT_TYPE_ID")
   
   private List<WorkEffortGoodStandardType> childWorkEffortGoodStandardTypes = null;

  /**
   * Default constructor.
   */
  public WorkEffortGoodStandardType() {
      super();
      this.baseEntityName = "WorkEffortGoodStandardType";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortGoodStdTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortGoodStdTypeId");this.allFieldsNames.add("parentTypeId");this.allFieldsNames.add("hasTable");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortGoodStandardType(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortGoodStdTypeId the workEffortGoodStdTypeId to set
     */
    public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
    }
    /**
     * Auto generated value setter.
     * @param parentTypeId the parentTypeId to set
     */
    public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
    /**
     * Auto generated value setter.
     * @param hasTable the hasTable to set
     */
    public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
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
    public String getWorkEffortGoodStdTypeId() {
        return this.workEffortGoodStdTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentTypeId() {
        return this.parentTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHasTable() {
        return this.hasTable;
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
     * Auto generated method that gets the related <code>WorkEffortGoodStandardType</code> by the relation named <code>ParentWorkEffortGoodStandardType</code>.
     * @return the <code>WorkEffortGoodStandardType</code>
     * @throws RepositoryException if an error occurs
     */
    public WorkEffortGoodStandardType getParentWorkEffortGoodStandardType() throws RepositoryException {
        if (this.parentWorkEffortGoodStandardType == null) {
            this.parentWorkEffortGoodStandardType = getRelatedOne(WorkEffortGoodStandardType.class, "ParentWorkEffortGoodStandardType");
        }
        return this.parentWorkEffortGoodStandardType;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortGoodStandard</code> by the relation named <code>WorkEffortGoodStandard</code>.
     * @return the list of <code>WorkEffortGoodStandard</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortGoodStandard> getWorkEffortGoodStandards() throws RepositoryException {
        if (this.workEffortGoodStandards == null) {
            this.workEffortGoodStandards = getRelated(WorkEffortGoodStandard.class, "WorkEffortGoodStandard");
        }
        return this.workEffortGoodStandards;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortGoodStandardType</code> by the relation named <code>ChildWorkEffortGoodStandardType</code>.
     * @return the list of <code>WorkEffortGoodStandardType</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortGoodStandardType> getChildWorkEffortGoodStandardTypes() throws RepositoryException {
        if (this.childWorkEffortGoodStandardTypes == null) {
            this.childWorkEffortGoodStandardTypes = getRelated(WorkEffortGoodStandardType.class, "ChildWorkEffortGoodStandardType");
        }
        return this.childWorkEffortGoodStandardTypes;
    }

    /**
     * Auto generated value setter.
     * @param parentWorkEffortGoodStandardType the parentWorkEffortGoodStandardType to set
    */
    public void setParentWorkEffortGoodStandardType(WorkEffortGoodStandardType parentWorkEffortGoodStandardType) {
        this.parentWorkEffortGoodStandardType = parentWorkEffortGoodStandardType;
    }
    /**
     * Auto generated value setter.
     * @param workEffortGoodStandards the workEffortGoodStandards to set
    */
    public void setWorkEffortGoodStandards(List<WorkEffortGoodStandard> workEffortGoodStandards) {
        this.workEffortGoodStandards = workEffortGoodStandards;
    }
    /**
     * Auto generated value setter.
     * @param childWorkEffortGoodStandardTypes the childWorkEffortGoodStandardTypes to set
    */
    public void setChildWorkEffortGoodStandardTypes(List<WorkEffortGoodStandardType> childWorkEffortGoodStandardTypes) {
        this.childWorkEffortGoodStandardTypes = childWorkEffortGoodStandardTypes;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortGoodStandard(WorkEffortGoodStandard workEffortGoodStandard) {
        if (this.workEffortGoodStandards == null) {
            this.workEffortGoodStandards = new ArrayList<WorkEffortGoodStandard>();
        }
        this.workEffortGoodStandards.add(workEffortGoodStandard);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortGoodStandard(WorkEffortGoodStandard workEffortGoodStandard) {
        if (this.workEffortGoodStandards == null) {
            return;
        }
        this.workEffortGoodStandards.remove(workEffortGoodStandard);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortGoodStandard() {
        if (this.workEffortGoodStandards == null) {
            return;
        }
        this.workEffortGoodStandards.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortGoodStdTypeId((String) mapValue.get("workEffortGoodStdTypeId"));
        setParentTypeId((String) mapValue.get("parentTypeId"));
        setHasTable((String) mapValue.get("hasTable"));
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
        mapValue.put("workEffortGoodStdTypeId", getWorkEffortGoodStdTypeId());
        mapValue.put("parentTypeId", getParentTypeId());
        mapValue.put("hasTable", getHasTable());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}