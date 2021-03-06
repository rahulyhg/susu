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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity WorkEffortSkillStandard.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_SKILL_STANDARD")
public class WorkEffortSkillStandard extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortId", "WORK_EFFORT_ID");
        fields.put("skillTypeId", "SKILL_TYPE_ID");
        fields.put("estimatedNumPeople", "ESTIMATED_NUM_PEOPLE");
        fields.put("estimatedDuration", "ESTIMATED_DURATION");
        fields.put("estimatedCost", "ESTIMATED_COST");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortSkillStandard", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortSkillStandard> {
    workEffortId("workEffortId"),
    skillTypeId("skillTypeId"),
    estimatedNumPeople("estimatedNumPeople"),
    estimatedDuration("estimatedDuration"),
    estimatedCost("estimatedCost"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.WorkEffortSkillStandardPkBridge.class)
     private WorkEffortSkillStandardPk id = new WorkEffortSkillStandardPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>WorkEffortSkillStandardPk</code>
     */
      public WorkEffortSkillStandardPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>WorkEffortSkillStandardPk</code> value to set
    */   
      public void setId(WorkEffortSkillStandardPk id) {
         this.id = id;
      }
   @Column(name="ESTIMATED_NUM_PEOPLE")
   private BigDecimal estimatedNumPeople;
   @Column(name="ESTIMATED_DURATION")
   private BigDecimal estimatedDuration;
   @Column(name="ESTIMATED_COST")
   private BigDecimal estimatedCost;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="WORK_EFFORT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private WorkEffort workEffort = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SKILL_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SkillType skillType = null;

  /**
   * Default constructor.
   */
  public WorkEffortSkillStandard() {
      super();
      this.baseEntityName = "WorkEffortSkillStandard";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortId");this.primaryKeyNames.add("skillTypeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortId");this.allFieldsNames.add("skillTypeId");this.allFieldsNames.add("estimatedNumPeople");this.allFieldsNames.add("estimatedDuration");this.allFieldsNames.add("estimatedCost");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortSkillStandard(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortId the workEffortId to set
     */
    public void setWorkEffortId(String workEffortId) {
        id.setWorkEffortId(workEffortId);
    }
    /**
     * Auto generated value setter.
     * @param skillTypeId the skillTypeId to set
     */
    public void setSkillTypeId(String skillTypeId) {
        id.setSkillTypeId(skillTypeId);
    }
    /**
     * Auto generated value setter.
     * @param estimatedNumPeople the estimatedNumPeople to set
     */
    public void setEstimatedNumPeople(BigDecimal estimatedNumPeople) {
        this.estimatedNumPeople = estimatedNumPeople;
    }
    /**
     * Auto generated value setter.
     * @param estimatedDuration the estimatedDuration to set
     */
    public void setEstimatedDuration(BigDecimal estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }
    /**
     * Auto generated value setter.
     * @param estimatedCost the estimatedCost to set
     */
    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
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
    public String getWorkEffortId() {
        return this.id.getWorkEffortId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSkillTypeId() {
        return this.id.getSkillTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedNumPeople() {
        return this.estimatedNumPeople;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedDuration() {
        return this.estimatedDuration;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedCost() {
        return this.estimatedCost;
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
     * Auto generated method that gets the related <code>SkillType</code> by the relation named <code>SkillType</code>.
     * @return the <code>SkillType</code>
     * @throws RepositoryException if an error occurs
     */
    public SkillType getSkillType() throws RepositoryException {
        if (this.skillType == null) {
            this.skillType = getRelatedOne(SkillType.class, "SkillType");
        }
        return this.skillType;
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
     * @param skillType the skillType to set
    */
    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortId((String) mapValue.get("workEffortId"));
        setSkillTypeId((String) mapValue.get("skillTypeId"));
        setEstimatedNumPeople(convertToBigDecimal(mapValue.get("estimatedNumPeople")));
        setEstimatedDuration(convertToBigDecimal(mapValue.get("estimatedDuration")));
        setEstimatedCost(convertToBigDecimal(mapValue.get("estimatedCost")));
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
        mapValue.put("workEffortId", getWorkEffortId());
        mapValue.put("skillTypeId", getSkillTypeId());
        mapValue.put("estimatedNumPeople", getEstimatedNumPeople());
        mapValue.put("estimatedDuration", getEstimatedDuration());
        mapValue.put("estimatedCost", getEstimatedCost());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
