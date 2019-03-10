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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity WorkEffortSearchResult.
 */
@javax.persistence.Entity
@Table(name="WORK_EFFORT_SEARCH_RESULT")
public class WorkEffortSearchResult extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("workEffortSearchResultId", "WORK_EFFORT_SEARCH_RESULT_ID");
        fields.put("visitId", "VISIT_ID");
        fields.put("orderByName", "ORDER_BY_NAME");
        fields.put("isAscending", "IS_ASCENDING");
        fields.put("numResults", "NUM_RESULTS");
        fields.put("secondsTotal", "SECONDS_TOTAL");
        fields.put("searchDate", "SEARCH_DATE");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("WorkEffortSearchResult", fields);
}
  public static enum Fields implements EntityFieldInterface<WorkEffortSearchResult> {
    workEffortSearchResultId("workEffortSearchResultId"),
    visitId("visitId"),
    orderByName("orderByName"),
    isAscending("isAscending"),
    numResults("numResults"),
    secondsTotal("secondsTotal"),
    searchDate("searchDate"),
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

   @org.hibernate.annotations.GenericGenerator(name="WorkEffortSearchResult_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="WorkEffortSearchResult_GEN")
   @Id
   @Column(name="WORK_EFFORT_SEARCH_RESULT_ID")
   private String workEffortSearchResultId;
   @Column(name="VISIT_ID")
   private String visitId;
   @Column(name="ORDER_BY_NAME")
   private String orderByName;
   @Column(name="IS_ASCENDING")
   private String isAscending;
   @Column(name="NUM_RESULTS")
   private Long numResults;
   @Column(name="SECONDS_TOTAL")
   private BigDecimal secondsTotal;
   @Column(name="SEARCH_DATE")
   private Timestamp searchDate;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="VISIT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Visit visit = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="workEffortSearchResult", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="WORK_EFFORT_SEARCH_RESULT_ID")
   
   private List<WorkEffortSearchConstraint> workEffortSearchConstraints = null;

  /**
   * Default constructor.
   */
  public WorkEffortSearchResult() {
      super();
      this.baseEntityName = "WorkEffortSearchResult";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("workEffortSearchResultId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("workEffortSearchResultId");this.allFieldsNames.add("visitId");this.allFieldsNames.add("orderByName");this.allFieldsNames.add("isAscending");this.allFieldsNames.add("numResults");this.allFieldsNames.add("secondsTotal");this.allFieldsNames.add("searchDate");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public WorkEffortSearchResult(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param workEffortSearchResultId the workEffortSearchResultId to set
     */
    public void setWorkEffortSearchResultId(String workEffortSearchResultId) {
        this.workEffortSearchResultId = workEffortSearchResultId;
    }
    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**
     * Auto generated value setter.
     * @param orderByName the orderByName to set
     */
    public void setOrderByName(String orderByName) {
        this.orderByName = orderByName;
    }
    /**
     * Auto generated value setter.
     * @param isAscending the isAscending to set
     */
    public void setIsAscending(String isAscending) {
        this.isAscending = isAscending;
    }
    /**
     * Auto generated value setter.
     * @param numResults the numResults to set
     */
    public void setNumResults(Long numResults) {
        this.numResults = numResults;
    }
    /**
     * Auto generated value setter.
     * @param secondsTotal the secondsTotal to set
     */
    public void setSecondsTotal(BigDecimal secondsTotal) {
        this.secondsTotal = secondsTotal;
    }
    /**
     * Auto generated value setter.
     * @param searchDate the searchDate to set
     */
    public void setSearchDate(Timestamp searchDate) {
        this.searchDate = searchDate;
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
    public String getWorkEffortSearchResultId() {
        return this.workEffortSearchResultId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisitId() {
        return this.visitId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrderByName() {
        return this.orderByName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsAscending() {
        return this.isAscending;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumResults() {
        return this.numResults;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getSecondsTotal() {
        return this.secondsTotal;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getSearchDate() {
        return this.searchDate;
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
     * Auto generated method that gets the related <code>Visit</code> by the relation named <code>Visit</code>.
     * @return the <code>Visit</code>
     * @throws RepositoryException if an error occurs
     */
    public Visit getVisit() throws RepositoryException {
        if (this.visit == null) {
            this.visit = getRelatedOne(Visit.class, "Visit");
        }
        return this.visit;
    }
    /**
     * Auto generated method that gets the related <code>WorkEffortSearchConstraint</code> by the relation named <code>WorkEffortSearchConstraint</code>.
     * @return the list of <code>WorkEffortSearchConstraint</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends WorkEffortSearchConstraint> getWorkEffortSearchConstraints() throws RepositoryException {
        if (this.workEffortSearchConstraints == null) {
            this.workEffortSearchConstraints = getRelated(WorkEffortSearchConstraint.class, "WorkEffortSearchConstraint");
        }
        return this.workEffortSearchConstraints;
    }

    /**
     * Auto generated value setter.
     * @param visit the visit to set
    */
    public void setVisit(Visit visit) {
        this.visit = visit;
    }
    /**
     * Auto generated value setter.
     * @param workEffortSearchConstraints the workEffortSearchConstraints to set
    */
    public void setWorkEffortSearchConstraints(List<WorkEffortSearchConstraint> workEffortSearchConstraints) {
        this.workEffortSearchConstraints = workEffortSearchConstraints;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addWorkEffortSearchConstraint(WorkEffortSearchConstraint workEffortSearchConstraint) {
        if (this.workEffortSearchConstraints == null) {
            this.workEffortSearchConstraints = new ArrayList<WorkEffortSearchConstraint>();
        }
        this.workEffortSearchConstraints.add(workEffortSearchConstraint);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeWorkEffortSearchConstraint(WorkEffortSearchConstraint workEffortSearchConstraint) {
        if (this.workEffortSearchConstraints == null) {
            return;
        }
        this.workEffortSearchConstraints.remove(workEffortSearchConstraint);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearWorkEffortSearchConstraint() {
        if (this.workEffortSearchConstraints == null) {
            return;
        }
        this.workEffortSearchConstraints.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setWorkEffortSearchResultId((String) mapValue.get("workEffortSearchResultId"));
        setVisitId((String) mapValue.get("visitId"));
        setOrderByName((String) mapValue.get("orderByName"));
        setIsAscending((String) mapValue.get("isAscending"));
        setNumResults((Long) mapValue.get("numResults"));
        setSecondsTotal(convertToBigDecimal(mapValue.get("secondsTotal")));
        setSearchDate((Timestamp) mapValue.get("searchDate"));
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
        mapValue.put("workEffortSearchResultId", getWorkEffortSearchResultId());
        mapValue.put("visitId", getVisitId());
        mapValue.put("orderByName", getOrderByName());
        mapValue.put("isAscending", getIsAscending());
        mapValue.put("numResults", getNumResults());
        mapValue.put("secondsTotal", getSecondsTotal());
        mapValue.put("searchDate", getSearchDate());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
