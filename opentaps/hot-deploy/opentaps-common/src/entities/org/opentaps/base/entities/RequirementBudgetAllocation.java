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
 * Auto generated base entity RequirementBudgetAllocation.
 */
@javax.persistence.Entity
@Table(name="REQUIREMENT_BUDGET_ALLOCATION")
public class RequirementBudgetAllocation extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("budgetId", "BUDGET_ID");
        fields.put("budgetItemSeqId", "BUDGET_ITEM_SEQ_ID");
        fields.put("requirementId", "REQUIREMENT_ID");
        fields.put("amount", "AMOUNT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("RequirementBudgetAllocation", fields);
}
  public static enum Fields implements EntityFieldInterface<RequirementBudgetAllocation> {
    budgetId("budgetId"),
    budgetItemSeqId("budgetItemSeqId"),
    requirementId("requirementId"),
    amount("amount"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.RequirementBudgetAllocationPkBridge.class)
     private RequirementBudgetAllocationPk id = new RequirementBudgetAllocationPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>RequirementBudgetAllocationPk</code>
     */
      public RequirementBudgetAllocationPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>RequirementBudgetAllocationPk</code> value to set
    */   
      public void setId(RequirementBudgetAllocationPk id) {
         this.id = id;
      }
   @Column(name="AMOUNT")
   private BigDecimal amount;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BUDGET_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Budget budget = null;
   private transient BudgetItem budgetItem = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="REQUIREMENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Requirement requirement = null;

  /**
   * Default constructor.
   */
  public RequirementBudgetAllocation() {
      super();
      this.baseEntityName = "RequirementBudgetAllocation";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("budgetId");this.primaryKeyNames.add("budgetItemSeqId");this.primaryKeyNames.add("requirementId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("budgetId");this.allFieldsNames.add("budgetItemSeqId");this.allFieldsNames.add("requirementId");this.allFieldsNames.add("amount");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public RequirementBudgetAllocation(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param budgetId the budgetId to set
     */
    public void setBudgetId(String budgetId) {
        id.setBudgetId(budgetId);
    }
    /**
     * Auto generated value setter.
     * @param budgetItemSeqId the budgetItemSeqId to set
     */
    public void setBudgetItemSeqId(String budgetItemSeqId) {
        id.setBudgetItemSeqId(budgetItemSeqId);
    }
    /**
     * Auto generated value setter.
     * @param requirementId the requirementId to set
     */
    public void setRequirementId(String requirementId) {
        id.setRequirementId(requirementId);
    }
    /**
     * Auto generated value setter.
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    public String getBudgetId() {
        return this.id.getBudgetId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBudgetItemSeqId() {
        return this.id.getBudgetItemSeqId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequirementId() {
        return this.id.getRequirementId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmount() {
        return this.amount;
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
     * Auto generated method that gets the related <code>Budget</code> by the relation named <code>Budget</code>.
     * @return the <code>Budget</code>
     * @throws RepositoryException if an error occurs
     */
    public Budget getBudget() throws RepositoryException {
        if (this.budget == null) {
            this.budget = getRelatedOne(Budget.class, "Budget");
        }
        return this.budget;
    }
    /**
     * Auto generated method that gets the related <code>BudgetItem</code> by the relation named <code>BudgetItem</code>.
     * @return the <code>BudgetItem</code>
     * @throws RepositoryException if an error occurs
     */
    public BudgetItem getBudgetItem() throws RepositoryException {
        if (this.budgetItem == null) {
            this.budgetItem = getRelatedOne(BudgetItem.class, "BudgetItem");
        }
        return this.budgetItem;
    }
    /**
     * Auto generated method that gets the related <code>Requirement</code> by the relation named <code>Requirement</code>.
     * @return the <code>Requirement</code>
     * @throws RepositoryException if an error occurs
     */
    public Requirement getRequirement() throws RepositoryException {
        if (this.requirement == null) {
            this.requirement = getRelatedOne(Requirement.class, "Requirement");
        }
        return this.requirement;
    }

    /**
     * Auto generated value setter.
     * @param budget the budget to set
    */
    public void setBudget(Budget budget) {
        this.budget = budget;
    }
    /**
     * Auto generated value setter.
     * @param budgetItem the budgetItem to set
    */
    public void setBudgetItem(BudgetItem budgetItem) {
        this.budgetItem = budgetItem;
    }
    /**
     * Auto generated value setter.
     * @param requirement the requirement to set
    */
    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setBudgetId((String) mapValue.get("budgetId"));
        setBudgetItemSeqId((String) mapValue.get("budgetItemSeqId"));
        setRequirementId((String) mapValue.get("requirementId"));
        setAmount(convertToBigDecimal(mapValue.get("amount")));
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
        mapValue.put("budgetId", getBudgetId());
        mapValue.put("budgetItemSeqId", getBudgetItemSeqId());
        mapValue.put("requirementId", getRequirementId());
        mapValue.put("amount", getAmount());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
