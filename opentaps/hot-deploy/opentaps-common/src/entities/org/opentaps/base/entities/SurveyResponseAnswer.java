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
 * Auto generated base entity SurveyResponseAnswer.
 */
@javax.persistence.Entity
@Table(name="SURVEY_RESPONSE_ANSWER")
public class SurveyResponseAnswer extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("surveyResponseId", "SURVEY_RESPONSE_ID");
        fields.put("surveyQuestionId", "SURVEY_QUESTION_ID");
        fields.put("surveyMultiRespColId", "SURVEY_MULTI_RESP_COL_ID");
        fields.put("surveyMultiRespId", "SURVEY_MULTI_RESP_ID");
        fields.put("booleanResponse", "BOOLEAN_RESPONSE");
        fields.put("currencyResponse", "CURRENCY_RESPONSE");
        fields.put("floatResponse", "FLOAT_RESPONSE");
        fields.put("numericResponse", "NUMERIC_RESPONSE");
        fields.put("textResponse", "TEXT_RESPONSE");
        fields.put("surveyOptionSeqId", "SURVEY_OPTION_SEQ_ID");
        fields.put("contentId", "CONTENT_ID");
        fields.put("answeredDate", "ANSWERED_DATE");
        fields.put("amountBase", "AMOUNT_BASE");
        fields.put("amountBaseUomId", "AMOUNT_BASE_UOM_ID");
        fields.put("weightFactor", "WEIGHT_FACTOR");
        fields.put("duration", "DURATION");
        fields.put("durationUomId", "DURATION_UOM_ID");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SurveyResponseAnswer", fields);
}
  public static enum Fields implements EntityFieldInterface<SurveyResponseAnswer> {
    surveyResponseId("surveyResponseId"),
    surveyQuestionId("surveyQuestionId"),
    surveyMultiRespColId("surveyMultiRespColId"),
    surveyMultiRespId("surveyMultiRespId"),
    booleanResponse("booleanResponse"),
    currencyResponse("currencyResponse"),
    floatResponse("floatResponse"),
    numericResponse("numericResponse"),
    textResponse("textResponse"),
    surveyOptionSeqId("surveyOptionSeqId"),
    contentId("contentId"),
    answeredDate("answeredDate"),
    amountBase("amountBase"),
    amountBaseUomId("amountBaseUomId"),
    weightFactor("weightFactor"),
    duration("duration"),
    durationUomId("durationUomId"),
    sequenceNum("sequenceNum"),
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

   @FieldBridge(impl = org.opentaps.base.entities.bridge.SurveyResponseAnswerPkBridge.class)
     private SurveyResponseAnswerPk id = new SurveyResponseAnswerPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>SurveyResponseAnswerPk</code>
     */
      public SurveyResponseAnswerPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>SurveyResponseAnswerPk</code> value to set
    */   
      public void setId(SurveyResponseAnswerPk id) {
         this.id = id;
      }
   @Column(name="SURVEY_MULTI_RESP_ID")
   private String surveyMultiRespId;
   @Column(name="BOOLEAN_RESPONSE")
   private String booleanResponse;
   @Column(name="CURRENCY_RESPONSE")
   private BigDecimal currencyResponse;
   @Column(name="FLOAT_RESPONSE")
   private BigDecimal floatResponse;
   @Column(name="NUMERIC_RESPONSE")
   private Long numericResponse;
   @Column(name="TEXT_RESPONSE")
   private String textResponse;
   @Column(name="SURVEY_OPTION_SEQ_ID")
   private String surveyOptionSeqId;
   @Column(name="CONTENT_ID")
   private String contentId;
   @Column(name="ANSWERED_DATE")
   private Timestamp answeredDate;
   @Column(name="AMOUNT_BASE")
   private BigDecimal amountBase;
   @Column(name="AMOUNT_BASE_UOM_ID")
   private String amountBaseUomId;
   @Column(name="WEIGHT_FACTOR")
   private BigDecimal weightFactor;
   @Column(name="DURATION")
   private Long duration;
   @Column(name="DURATION_UOM_ID")
   private String durationUomId;
   @Column(name="SEQUENCE_NUM")
   private Long sequenceNum;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_RESPONSE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyResponse surveyResponse = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_QUESTION_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestion surveyQuestion = null;
   private transient SurveyQuestionOption surveyQuestionOption = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="CONTENT_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Content content = null;

  /**
   * Default constructor.
   */
  public SurveyResponseAnswer() {
      super();
      this.baseEntityName = "SurveyResponseAnswer";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("surveyResponseId");this.primaryKeyNames.add("surveyQuestionId");this.primaryKeyNames.add("surveyMultiRespColId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("surveyResponseId");this.allFieldsNames.add("surveyQuestionId");this.allFieldsNames.add("surveyMultiRespColId");this.allFieldsNames.add("surveyMultiRespId");this.allFieldsNames.add("booleanResponse");this.allFieldsNames.add("currencyResponse");this.allFieldsNames.add("floatResponse");this.allFieldsNames.add("numericResponse");this.allFieldsNames.add("textResponse");this.allFieldsNames.add("surveyOptionSeqId");this.allFieldsNames.add("contentId");this.allFieldsNames.add("answeredDate");this.allFieldsNames.add("amountBase");this.allFieldsNames.add("amountBaseUomId");this.allFieldsNames.add("weightFactor");this.allFieldsNames.add("duration");this.allFieldsNames.add("durationUomId");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SurveyResponseAnswer(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param surveyResponseId the surveyResponseId to set
     */
    public void setSurveyResponseId(String surveyResponseId) {
        id.setSurveyResponseId(surveyResponseId);
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionId the surveyQuestionId to set
     */
    public void setSurveyQuestionId(String surveyQuestionId) {
        id.setSurveyQuestionId(surveyQuestionId);
    }
    /**
     * Auto generated value setter.
     * @param surveyMultiRespColId the surveyMultiRespColId to set
     */
    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        id.setSurveyMultiRespColId(surveyMultiRespColId);
    }
    /**
     * Auto generated value setter.
     * @param surveyMultiRespId the surveyMultiRespId to set
     */
    public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }
    /**
     * Auto generated value setter.
     * @param booleanResponse the booleanResponse to set
     */
    public void setBooleanResponse(String booleanResponse) {
        this.booleanResponse = booleanResponse;
    }
    /**
     * Auto generated value setter.
     * @param currencyResponse the currencyResponse to set
     */
    public void setCurrencyResponse(BigDecimal currencyResponse) {
        this.currencyResponse = currencyResponse;
    }
    /**
     * Auto generated value setter.
     * @param floatResponse the floatResponse to set
     */
    public void setFloatResponse(BigDecimal floatResponse) {
        this.floatResponse = floatResponse;
    }
    /**
     * Auto generated value setter.
     * @param numericResponse the numericResponse to set
     */
    public void setNumericResponse(Long numericResponse) {
        this.numericResponse = numericResponse;
    }
    /**
     * Auto generated value setter.
     * @param textResponse the textResponse to set
     */
    public void setTextResponse(String textResponse) {
        this.textResponse = textResponse;
    }
    /**
     * Auto generated value setter.
     * @param surveyOptionSeqId the surveyOptionSeqId to set
     */
    public void setSurveyOptionSeqId(String surveyOptionSeqId) {
        this.surveyOptionSeqId = surveyOptionSeqId;
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
     * @param answeredDate the answeredDate to set
     */
    public void setAnsweredDate(Timestamp answeredDate) {
        this.answeredDate = answeredDate;
    }
    /**
     * Auto generated value setter.
     * @param amountBase the amountBase to set
     */
    public void setAmountBase(BigDecimal amountBase) {
        this.amountBase = amountBase;
    }
    /**
     * Auto generated value setter.
     * @param amountBaseUomId the amountBaseUomId to set
     */
    public void setAmountBaseUomId(String amountBaseUomId) {
        this.amountBaseUomId = amountBaseUomId;
    }
    /**
     * Auto generated value setter.
     * @param weightFactor the weightFactor to set
     */
    public void setWeightFactor(BigDecimal weightFactor) {
        this.weightFactor = weightFactor;
    }
    /**
     * Auto generated value setter.
     * @param duration the duration to set
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    /**
     * Auto generated value setter.
     * @param durationUomId the durationUomId to set
     */
    public void setDurationUomId(String durationUomId) {
        this.durationUomId = durationUomId;
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
    public String getSurveyResponseId() {
        return this.id.getSurveyResponseId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyQuestionId() {
        return this.id.getSurveyQuestionId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyMultiRespColId() {
        return this.id.getSurveyMultiRespColId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyMultiRespId() {
        return this.surveyMultiRespId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBooleanResponse() {
        return this.booleanResponse;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCurrencyResponse() {
        return this.currencyResponse;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getFloatResponse() {
        return this.floatResponse;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getNumericResponse() {
        return this.numericResponse;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTextResponse() {
        return this.textResponse;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyOptionSeqId() {
        return this.surveyOptionSeqId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getAnsweredDate() {
        return this.answeredDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getAmountBase() {
        return this.amountBase;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAmountBaseUomId() {
        return this.amountBaseUomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getWeightFactor() {
        return this.weightFactor;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getDuration() {
        return this.duration;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getDurationUomId() {
        return this.durationUomId;
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
     * Auto generated method that gets the related <code>SurveyResponse</code> by the relation named <code>SurveyResponse</code>.
     * @return the <code>SurveyResponse</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyResponse getSurveyResponse() throws RepositoryException {
        if (this.surveyResponse == null) {
            this.surveyResponse = getRelatedOne(SurveyResponse.class, "SurveyResponse");
        }
        return this.surveyResponse;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestion</code> by the relation named <code>SurveyQuestion</code>.
     * @return the <code>SurveyQuestion</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestion getSurveyQuestion() throws RepositoryException {
        if (this.surveyQuestion == null) {
            this.surveyQuestion = getRelatedOne(SurveyQuestion.class, "SurveyQuestion");
        }
        return this.surveyQuestion;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionOption</code> by the relation named <code>SurveyQuestionOption</code>.
     * @return the <code>SurveyQuestionOption</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestionOption getSurveyQuestionOption() throws RepositoryException {
        if (this.surveyQuestionOption == null) {
            this.surveyQuestionOption = getRelatedOne(SurveyQuestionOption.class, "SurveyQuestionOption");
        }
        return this.surveyQuestionOption;
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
     * Auto generated value setter.
     * @param surveyResponse the surveyResponse to set
    */
    public void setSurveyResponse(SurveyResponse surveyResponse) {
        this.surveyResponse = surveyResponse;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestion the surveyQuestion to set
    */
    public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionOption the surveyQuestionOption to set
    */
    public void setSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
        this.surveyQuestionOption = surveyQuestionOption;
    }
    /**
     * Auto generated value setter.
     * @param content the content to set
    */
    public void setContent(Content content) {
        this.content = content;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSurveyResponseId((String) mapValue.get("surveyResponseId"));
        setSurveyQuestionId((String) mapValue.get("surveyQuestionId"));
        setSurveyMultiRespColId((String) mapValue.get("surveyMultiRespColId"));
        setSurveyMultiRespId((String) mapValue.get("surveyMultiRespId"));
        setBooleanResponse((String) mapValue.get("booleanResponse"));
        setCurrencyResponse(convertToBigDecimal(mapValue.get("currencyResponse")));
        setFloatResponse(convertToBigDecimal(mapValue.get("floatResponse")));
        setNumericResponse((Long) mapValue.get("numericResponse"));
        setTextResponse((String) mapValue.get("textResponse"));
        setSurveyOptionSeqId((String) mapValue.get("surveyOptionSeqId"));
        setContentId((String) mapValue.get("contentId"));
        setAnsweredDate((Timestamp) mapValue.get("answeredDate"));
        setAmountBase(convertToBigDecimal(mapValue.get("amountBase")));
        setAmountBaseUomId((String) mapValue.get("amountBaseUomId"));
        setWeightFactor(convertToBigDecimal(mapValue.get("weightFactor")));
        setDuration((Long) mapValue.get("duration"));
        setDurationUomId((String) mapValue.get("durationUomId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
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
        mapValue.put("surveyResponseId", getSurveyResponseId());
        mapValue.put("surveyQuestionId", getSurveyQuestionId());
        mapValue.put("surveyMultiRespColId", getSurveyMultiRespColId());
        mapValue.put("surveyMultiRespId", getSurveyMultiRespId());
        mapValue.put("booleanResponse", getBooleanResponse());
        mapValue.put("currencyResponse", getCurrencyResponse());
        mapValue.put("floatResponse", getFloatResponse());
        mapValue.put("numericResponse", getNumericResponse());
        mapValue.put("textResponse", getTextResponse());
        mapValue.put("surveyOptionSeqId", getSurveyOptionSeqId());
        mapValue.put("contentId", getContentId());
        mapValue.put("answeredDate", getAnsweredDate());
        mapValue.put("amountBase", getAmountBase());
        mapValue.put("amountBaseUomId", getAmountBaseUomId());
        mapValue.put("weightFactor", getWeightFactor());
        mapValue.put("duration", getDuration());
        mapValue.put("durationUomId", getDurationUomId());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
