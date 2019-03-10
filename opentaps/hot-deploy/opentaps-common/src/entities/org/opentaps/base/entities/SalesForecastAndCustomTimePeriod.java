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
import java.sql.Date;

/**
 * Auto generated base entity SalesForecastAndCustomTimePeriod.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectSalesForecastAndCustomTimePeriods", query="SELECT SF.SALES_FORECAST_ID AS \"salesForecastId\",SF.PARENT_SALES_FORECAST_ID AS \"parentSalesForecastId\",SF.ORGANIZATION_PARTY_ID AS \"organizationPartyId\",SF.INTERNAL_PARTY_ID AS \"internalPartyId\",SF.CUSTOM_TIME_PERIOD_ID AS \"customTimePeriodId\",SF.CURRENCY_UOM_ID AS \"currencyUomId\",SF.QUOTA_AMOUNT AS \"quotaAmount\",SF.FORECAST_AMOUNT AS \"forecastAmount\",SF.BEST_CASE_AMOUNT AS \"bestCaseAmount\",SF.CLOSED_AMOUNT AS \"closedAmount\",SF.PERCENT_OF_QUOTA_FORECAST AS \"percentOfQuotaForecast\",SF.PERCENT_OF_QUOTA_CLOSED AS \"percentOfQuotaClosed\",SF.PIPELINE_AMOUNT AS \"pipelineAmount\",SF.CREATED_BY_USER_LOGIN_ID AS \"createdByUserLoginId\",SF.MODIFIED_BY_USER_LOGIN_ID AS \"modifiedByUserLoginId\",CTP.PARENT_PERIOD_ID AS \"parentPeriodId\",CTP.PERIOD_TYPE_ID AS \"periodTypeId\",CTP.PERIOD_NUM AS \"periodNum\",CTP.PERIOD_NAME AS \"periodName\",CTP.FROM_DATE AS \"fromDate\",CTP.THRU_DATE AS \"thruDate\",CTP.IS_CLOSED AS \"isClosed\" FROM SALES_FORECAST SF INNER JOIN CUSTOM_TIME_PERIOD CTP ON SF.CUSTOM_TIME_PERIOD_ID = CTP.CUSTOM_TIME_PERIOD_ID", resultSetMapping="SalesForecastAndCustomTimePeriodMapping")
@SqlResultSetMapping(name="SalesForecastAndCustomTimePeriodMapping", entities={
@EntityResult(entityClass=SalesForecastAndCustomTimePeriod.class, fields = {
@FieldResult(name="salesForecastId", column="salesForecastId")
,@FieldResult(name="parentSalesForecastId", column="parentSalesForecastId")
,@FieldResult(name="organizationPartyId", column="organizationPartyId")
,@FieldResult(name="internalPartyId", column="internalPartyId")
,@FieldResult(name="customTimePeriodId", column="customTimePeriodId")
,@FieldResult(name="currencyUomId", column="currencyUomId")
,@FieldResult(name="quotaAmount", column="quotaAmount")
,@FieldResult(name="forecastAmount", column="forecastAmount")
,@FieldResult(name="bestCaseAmount", column="bestCaseAmount")
,@FieldResult(name="closedAmount", column="closedAmount")
,@FieldResult(name="percentOfQuotaForecast", column="percentOfQuotaForecast")
,@FieldResult(name="percentOfQuotaClosed", column="percentOfQuotaClosed")
,@FieldResult(name="pipelineAmount", column="pipelineAmount")
,@FieldResult(name="createdByUserLoginId", column="createdByUserLoginId")
,@FieldResult(name="modifiedByUserLoginId", column="modifiedByUserLoginId")
,@FieldResult(name="parentPeriodId", column="parentPeriodId")
,@FieldResult(name="periodTypeId", column="periodTypeId")
,@FieldResult(name="periodNum", column="periodNum")
,@FieldResult(name="periodName", column="periodName")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="isClosed", column="isClosed")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class SalesForecastAndCustomTimePeriod extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("salesForecastId", "SF.SALES_FORECAST_ID");
        fields.put("parentSalesForecastId", "SF.PARENT_SALES_FORECAST_ID");
        fields.put("organizationPartyId", "SF.ORGANIZATION_PARTY_ID");
        fields.put("internalPartyId", "SF.INTERNAL_PARTY_ID");
        fields.put("customTimePeriodId", "SF.CUSTOM_TIME_PERIOD_ID");
        fields.put("currencyUomId", "SF.CURRENCY_UOM_ID");
        fields.put("quotaAmount", "SF.QUOTA_AMOUNT");
        fields.put("forecastAmount", "SF.FORECAST_AMOUNT");
        fields.put("bestCaseAmount", "SF.BEST_CASE_AMOUNT");
        fields.put("closedAmount", "SF.CLOSED_AMOUNT");
        fields.put("percentOfQuotaForecast", "SF.PERCENT_OF_QUOTA_FORECAST");
        fields.put("percentOfQuotaClosed", "SF.PERCENT_OF_QUOTA_CLOSED");
        fields.put("pipelineAmount", "SF.PIPELINE_AMOUNT");
        fields.put("createdByUserLoginId", "SF.CREATED_BY_USER_LOGIN_ID");
        fields.put("modifiedByUserLoginId", "SF.MODIFIED_BY_USER_LOGIN_ID");
        fields.put("parentPeriodId", "CTP.PARENT_PERIOD_ID");
        fields.put("periodTypeId", "CTP.PERIOD_TYPE_ID");
        fields.put("periodNum", "CTP.PERIOD_NUM");
        fields.put("periodName", "CTP.PERIOD_NAME");
        fields.put("fromDate", "CTP.FROM_DATE");
        fields.put("thruDate", "CTP.THRU_DATE");
        fields.put("isClosed", "CTP.IS_CLOSED");
fieldMapColumns.put("SalesForecastAndCustomTimePeriod", fields);
}
  public static enum Fields implements EntityFieldInterface<SalesForecastAndCustomTimePeriod> {
    salesForecastId("salesForecastId"),
    parentSalesForecastId("parentSalesForecastId"),
    organizationPartyId("organizationPartyId"),
    internalPartyId("internalPartyId"),
    customTimePeriodId("customTimePeriodId"),
    currencyUomId("currencyUomId"),
    quotaAmount("quotaAmount"),
    forecastAmount("forecastAmount"),
    bestCaseAmount("bestCaseAmount"),
    closedAmount("closedAmount"),
    percentOfQuotaForecast("percentOfQuotaForecast"),
    percentOfQuotaClosed("percentOfQuotaClosed"),
    pipelineAmount("pipelineAmount"),
    createdByUserLoginId("createdByUserLoginId"),
    modifiedByUserLoginId("modifiedByUserLoginId"),
    parentPeriodId("parentPeriodId"),
    periodTypeId("periodTypeId"),
    periodNum("periodNum"),
    periodName("periodName"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    isClosed("isClosed");
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
   private String salesForecastId;
    
   private String parentSalesForecastId;
    
   private String organizationPartyId;
    
   private String internalPartyId;
    
   private String customTimePeriodId;
    
   private String currencyUomId;
    
   private BigDecimal quotaAmount;
    
   private BigDecimal forecastAmount;
    
   private BigDecimal bestCaseAmount;
    
   private BigDecimal closedAmount;
    
   private BigDecimal percentOfQuotaForecast;
    
   private BigDecimal percentOfQuotaClosed;
    
   private BigDecimal pipelineAmount;
    
   private String createdByUserLoginId;
    
   private String modifiedByUserLoginId;
    
   private String parentPeriodId;
    
   private String periodTypeId;
    
   private Long periodNum;
    
   private String periodName;
    
   private Date fromDate;
    
   private Date thruDate;
    
   private String isClosed;

  /**
   * Default constructor.
   */
  public SalesForecastAndCustomTimePeriod() {
      super();
      this.baseEntityName = "SalesForecastAndCustomTimePeriod";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("salesForecastId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("salesForecastId");this.allFieldsNames.add("parentSalesForecastId");this.allFieldsNames.add("organizationPartyId");this.allFieldsNames.add("internalPartyId");this.allFieldsNames.add("customTimePeriodId");this.allFieldsNames.add("currencyUomId");this.allFieldsNames.add("quotaAmount");this.allFieldsNames.add("forecastAmount");this.allFieldsNames.add("bestCaseAmount");this.allFieldsNames.add("closedAmount");this.allFieldsNames.add("percentOfQuotaForecast");this.allFieldsNames.add("percentOfQuotaClosed");this.allFieldsNames.add("pipelineAmount");this.allFieldsNames.add("createdByUserLoginId");this.allFieldsNames.add("modifiedByUserLoginId");this.allFieldsNames.add("parentPeriodId");this.allFieldsNames.add("periodTypeId");this.allFieldsNames.add("periodNum");this.allFieldsNames.add("periodName");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("isClosed");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SalesForecastAndCustomTimePeriod(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param salesForecastId the salesForecastId to set
     */
    public void setSalesForecastId(String salesForecastId) {
        this.salesForecastId = salesForecastId;
    }
    /**
     * Auto generated value setter.
     * @param parentSalesForecastId the parentSalesForecastId to set
     */
    public void setParentSalesForecastId(String parentSalesForecastId) {
        this.parentSalesForecastId = parentSalesForecastId;
    }
    /**
     * Auto generated value setter.
     * @param organizationPartyId the organizationPartyId to set
     */
    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }
    /**
     * Auto generated value setter.
     * @param internalPartyId the internalPartyId to set
     */
    public void setInternalPartyId(String internalPartyId) {
        this.internalPartyId = internalPartyId;
    }
    /**
     * Auto generated value setter.
     * @param customTimePeriodId the customTimePeriodId to set
     */
    public void setCustomTimePeriodId(String customTimePeriodId) {
        this.customTimePeriodId = customTimePeriodId;
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
     * @param quotaAmount the quotaAmount to set
     */
    public void setQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
    }
    /**
     * Auto generated value setter.
     * @param forecastAmount the forecastAmount to set
     */
    public void setForecastAmount(BigDecimal forecastAmount) {
        this.forecastAmount = forecastAmount;
    }
    /**
     * Auto generated value setter.
     * @param bestCaseAmount the bestCaseAmount to set
     */
    public void setBestCaseAmount(BigDecimal bestCaseAmount) {
        this.bestCaseAmount = bestCaseAmount;
    }
    /**
     * Auto generated value setter.
     * @param closedAmount the closedAmount to set
     */
    public void setClosedAmount(BigDecimal closedAmount) {
        this.closedAmount = closedAmount;
    }
    /**
     * Auto generated value setter.
     * @param percentOfQuotaForecast the percentOfQuotaForecast to set
     */
    public void setPercentOfQuotaForecast(BigDecimal percentOfQuotaForecast) {
        this.percentOfQuotaForecast = percentOfQuotaForecast;
    }
    /**
     * Auto generated value setter.
     * @param percentOfQuotaClosed the percentOfQuotaClosed to set
     */
    public void setPercentOfQuotaClosed(BigDecimal percentOfQuotaClosed) {
        this.percentOfQuotaClosed = percentOfQuotaClosed;
    }
    /**
     * Auto generated value setter.
     * @param pipelineAmount the pipelineAmount to set
     */
    public void setPipelineAmount(BigDecimal pipelineAmount) {
        this.pipelineAmount = pipelineAmount;
    }
    /**
     * Auto generated value setter.
     * @param createdByUserLoginId the createdByUserLoginId to set
     */
    public void setCreatedByUserLoginId(String createdByUserLoginId) {
        this.createdByUserLoginId = createdByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param modifiedByUserLoginId the modifiedByUserLoginId to set
     */
    public void setModifiedByUserLoginId(String modifiedByUserLoginId) {
        this.modifiedByUserLoginId = modifiedByUserLoginId;
    }
    /**
     * Auto generated value setter.
     * @param parentPeriodId the parentPeriodId to set
     */
    public void setParentPeriodId(String parentPeriodId) {
        this.parentPeriodId = parentPeriodId;
    }
    /**
     * Auto generated value setter.
     * @param periodTypeId the periodTypeId to set
     */
    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param periodNum the periodNum to set
     */
    public void setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
    }
    /**
     * Auto generated value setter.
     * @param periodName the periodName to set
     */
    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param isClosed the isClosed to set
     */
    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSalesForecastId() {
        return this.salesForecastId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentSalesForecastId() {
        return this.parentSalesForecastId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getOrganizationPartyId() {
        return this.organizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInternalPartyId() {
        return this.internalPartyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCustomTimePeriodId() {
        return this.customTimePeriodId;
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
    public BigDecimal getQuotaAmount() {
        return this.quotaAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getForecastAmount() {
        return this.forecastAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getBestCaseAmount() {
        return this.bestCaseAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getClosedAmount() {
        return this.closedAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPercentOfQuotaForecast() {
        return this.percentOfQuotaForecast;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPercentOfQuotaClosed() {
        return this.percentOfQuotaClosed;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPipelineAmount() {
        return this.pipelineAmount;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCreatedByUserLoginId() {
        return this.createdByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getModifiedByUserLoginId() {
        return this.modifiedByUserLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getParentPeriodId() {
        return this.parentPeriodId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPeriodTypeId() {
        return this.periodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getPeriodNum() {
        return this.periodNum;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPeriodName() {
        return this.periodName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Date</code>
     */
    public Date getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Date</code>
     */
    public Date getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getIsClosed() {
        return this.isClosed;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSalesForecastId((String) mapValue.get("salesForecastId"));
        setParentSalesForecastId((String) mapValue.get("parentSalesForecastId"));
        setOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        setInternalPartyId((String) mapValue.get("internalPartyId"));
        setCustomTimePeriodId((String) mapValue.get("customTimePeriodId"));
        setCurrencyUomId((String) mapValue.get("currencyUomId"));
        setQuotaAmount(convertToBigDecimal(mapValue.get("quotaAmount")));
        setForecastAmount(convertToBigDecimal(mapValue.get("forecastAmount")));
        setBestCaseAmount(convertToBigDecimal(mapValue.get("bestCaseAmount")));
        setClosedAmount(convertToBigDecimal(mapValue.get("closedAmount")));
        setPercentOfQuotaForecast(convertToBigDecimal(mapValue.get("percentOfQuotaForecast")));
        setPercentOfQuotaClosed(convertToBigDecimal(mapValue.get("percentOfQuotaClosed")));
        setPipelineAmount(convertToBigDecimal(mapValue.get("pipelineAmount")));
        setCreatedByUserLoginId((String) mapValue.get("createdByUserLoginId"));
        setModifiedByUserLoginId((String) mapValue.get("modifiedByUserLoginId"));
        setParentPeriodId((String) mapValue.get("parentPeriodId"));
        setPeriodTypeId((String) mapValue.get("periodTypeId"));
        setPeriodNum((Long) mapValue.get("periodNum"));
        setPeriodName((String) mapValue.get("periodName"));
        setFromDate((Date) mapValue.get("fromDate"));
        setThruDate((Date) mapValue.get("thruDate"));
        setIsClosed((String) mapValue.get("isClosed"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("salesForecastId", getSalesForecastId());
        mapValue.put("parentSalesForecastId", getParentSalesForecastId());
        mapValue.put("organizationPartyId", getOrganizationPartyId());
        mapValue.put("internalPartyId", getInternalPartyId());
        mapValue.put("customTimePeriodId", getCustomTimePeriodId());
        mapValue.put("currencyUomId", getCurrencyUomId());
        mapValue.put("quotaAmount", getQuotaAmount());
        mapValue.put("forecastAmount", getForecastAmount());
        mapValue.put("bestCaseAmount", getBestCaseAmount());
        mapValue.put("closedAmount", getClosedAmount());
        mapValue.put("percentOfQuotaForecast", getPercentOfQuotaForecast());
        mapValue.put("percentOfQuotaClosed", getPercentOfQuotaClosed());
        mapValue.put("pipelineAmount", getPipelineAmount());
        mapValue.put("createdByUserLoginId", getCreatedByUserLoginId());
        mapValue.put("modifiedByUserLoginId", getModifiedByUserLoginId());
        mapValue.put("parentPeriodId", getParentPeriodId());
        mapValue.put("periodTypeId", getPeriodTypeId());
        mapValue.put("periodNum", getPeriodNum());
        mapValue.put("periodName", getPeriodName());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("isClosed", getIsClosed());
        return mapValue;
    }


}
