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

/**
 * Auto generated base entity SalesOpportunityEstimatedAmountTotalByStage.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectSalesOpportunityEstimatedAmountTotalByStages", query="SELECT SO.OPPORTUNITY_STAGE_ID AS \"opportunityStageId\",SO.CURRENCY_UOM_ID AS \"currencyUomId\",SO.ESTIMATED_AMOUNT AS \"estimatedAmount\" FROM SALES_OPPORTUNITY SO", resultSetMapping="SalesOpportunityEstimatedAmountTotalByStageMapping")
@SqlResultSetMapping(name="SalesOpportunityEstimatedAmountTotalByStageMapping", entities={
@EntityResult(entityClass=SalesOpportunityEstimatedAmountTotalByStage.class, fields = {
@FieldResult(name="opportunityStageId", column="opportunityStageId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="estimatedAmountTotal", column="estimatedAmountTotal")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class SalesOpportunityEstimatedAmountTotalByStage extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("opportunityStageId", "SO.OPPORTUNITY_STAGE_ID");
        fields.put("currencyUomId", "SO.CURRENCY_UOM_ID");
        fields.put("estimatedAmountTotal", "SO.ESTIMATED_AMOUNT");
fieldMapColumns.put("SalesOpportunityEstimatedAmountTotalByStage", fields);
}
  public static enum Fields implements EntityFieldInterface<SalesOpportunityEstimatedAmountTotalByStage> {
    opportunityStageId("opportunityStageId"),
    currencyUomId("currencyUomId"),
    estimatedAmountTotal("estimatedAmountTotal");
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
   private String opportunityStageId;
    
   private String currencyUomId;
    
   private BigDecimal estimatedAmountTotal;

  /**
   * Default constructor.
   */
  public SalesOpportunityEstimatedAmountTotalByStage() {
      super();
      this.baseEntityName = "SalesOpportunityEstimatedAmountTotalByStage";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("opportunityStageId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("estimatedAmountTotal");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalesOpportunityEstimatedAmountTotalByStage(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param opportunityStageId the opportunityStageId to set
     */
    public void setOpportunityStageId(String opportunityStageId) {
        this.opportunityStageId = opportunityStageId;
    }
    /**
     * Auto generated value setter.
     * @param currencyUomId the currencyUomId to set
     */
    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }
    /**
     * Auto generated value setter.
     * @param estimatedAmountTotal the estimatedAmountTotal to set
     */
    public void setEstimatedAmountTotal(BigDecimal estimatedAmountTotal) {
        this.estimatedAmountTotal = estimatedAmountTotal;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOpportunityStageId() {
        return this.opportunityStageId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrencyUomId() {
        return this.currencyUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getEstimatedAmountTotal() {
        return this.estimatedAmountTotal;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setOpportunityStageId((String) mapValue.get("opportunityStageId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setEstimatedAmountTotal(convertToBigDecimal(mapValue.get("estimatedAmountTotal")));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("opportunityStageId", getOpportunityStageId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("estimatedAmountTotal", getEstimatedAmountTotal());
        return mapValue;
    }


}
