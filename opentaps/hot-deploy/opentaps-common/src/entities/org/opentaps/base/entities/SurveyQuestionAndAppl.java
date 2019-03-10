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
 * Auto generated base entity SurveyQuestionAndAppl.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectSurveyQuestionAndAppls", query="SELECT SQ.SURVEY_QUESTION_ID AS \"surveyQuestionId\",SQ.SURVEY_QUESTION_CATEGORY_ID AS \"surveyQuestionCategoryId\",SQ.SURVEY_QUESTION_TYPE_ID AS \"surveyQuestionTypeId\",SQ.DESCRIPTION AS \"description\",SQ.QUESTION AS \"question\",SQ.HINT AS \"hint\",SQ.ENUM_TYPE_ID AS \"enumTypeId\",SQ.GEO_ID AS \"geoId\",SQ.FORMAT_STRING AS \"formatString\",SA.SURVEY_ID AS \"surveyId\",SA.FROM_DATE AS \"fromDate\",SA.THRU_DATE AS \"thruDate\",SA.SURVEY_PAGE_SEQ_ID AS \"surveyPageSeqId\",SA.SURVEY_MULTI_RESP_ID AS \"surveyMultiRespId\",SA.SURVEY_MULTI_RESP_COL_ID AS \"surveyMultiRespColId\",SA.REQUIRED_FIELD AS \"requiredField\",SA.SEQUENCE_NUM AS \"sequenceNum\",SA.EXTERNAL_FIELD_REF AS \"externalFieldRef\",SA.WITH_SURVEY_QUESTION_ID AS \"withSurveyQuestionId\",SA.WITH_SURVEY_OPTION_SEQ_ID AS \"withSurveyOptionSeqId\" FROM SURVEY_QUESTION SQ INNER JOIN SURVEY_QUESTION_APPL SA ON SQ.SURVEY_QUESTION_ID = SA.SURVEY_QUESTION_ID", resultSetMapping="SurveyQuestionAndApplMapping")
@SqlResultSetMapping(name="SurveyQuestionAndApplMapping", entities={
@EntityResult(entityClass=SurveyQuestionAndAppl.class, fields = {
@FieldResult(name="surveyQuestionId", column="surveyQuestionId")
,@FieldResult(name="surveyQuestionCategoryId", column="surveyQuestionCategoryId")
,@FieldResult(name="surveyQuestionTypeId", column="surveyQuestionTypeId")
,@FieldResult(name="description", column="description")
,@FieldResult(name="question", column="question")
,@FieldResult(name="hint", column="hint")
,@FieldResult(name="enumTypeId", column="enumTypeId")
,@FieldResult(name="geoId", column="geoId")
,@FieldResult(name="formatString", column="formatString")
,@FieldResult(name="surveyId", column="surveyId")
,@FieldResult(name="fromDate", column="fromDate")
,@FieldResult(name="thruDate", column="thruDate")
,@FieldResult(name="surveyPageSeqId", column="surveyPageSeqId")
,@FieldResult(name="surveyMultiRespId", column="surveyMultiRespId")
,@FieldResult(name="surveyMultiRespColId", column="surveyMultiRespColId")
,@FieldResult(name="requiredField", column="requiredField")
,@FieldResult(name="sequenceNum", column="sequenceNum")
,@FieldResult(name="externalFieldRef", column="externalFieldRef")
,@FieldResult(name="withSurveyQuestionId", column="withSurveyQuestionId")
,@FieldResult(name="withSurveyOptionSeqId", column="withSurveyOptionSeqId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class SurveyQuestionAndAppl extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("surveyQuestionId", "SQ.SURVEY_QUESTION_ID");
        fields.put("surveyQuestionCategoryId", "SQ.SURVEY_QUESTION_CATEGORY_ID");
        fields.put("surveyQuestionTypeId", "SQ.SURVEY_QUESTION_TYPE_ID");
        fields.put("description", "SQ.DESCRIPTION");
        fields.put("question", "SQ.QUESTION");
        fields.put("hint", "SQ.HINT");
        fields.put("enumTypeId", "SQ.ENUM_TYPE_ID");
        fields.put("geoId", "SQ.GEO_ID");
        fields.put("formatString", "SQ.FORMAT_STRING");
        fields.put("surveyId", "SA.SURVEY_ID");
        fields.put("fromDate", "SA.FROM_DATE");
        fields.put("thruDate", "SA.THRU_DATE");
        fields.put("surveyPageSeqId", "SA.SURVEY_PAGE_SEQ_ID");
        fields.put("surveyMultiRespId", "SA.SURVEY_MULTI_RESP_ID");
        fields.put("surveyMultiRespColId", "SA.SURVEY_MULTI_RESP_COL_ID");
        fields.put("requiredField", "SA.REQUIRED_FIELD");
        fields.put("sequenceNum", "SA.SEQUENCE_NUM");
        fields.put("externalFieldRef", "SA.EXTERNAL_FIELD_REF");
        fields.put("withSurveyQuestionId", "SA.WITH_SURVEY_QUESTION_ID");
        fields.put("withSurveyOptionSeqId", "SA.WITH_SURVEY_OPTION_SEQ_ID");
fieldMapColumns.put("SurveyQuestionAndAppl", fields);
}
  public static enum Fields implements EntityFieldInterface<SurveyQuestionAndAppl> {
    surveyQuestionId("surveyQuestionId"),
    surveyQuestionCategoryId("surveyQuestionCategoryId"),
    surveyQuestionTypeId("surveyQuestionTypeId"),
    description("description"),
    question("question"),
    hint("hint"),
    enumTypeId("enumTypeId"),
    geoId("geoId"),
    formatString("formatString"),
    surveyId("surveyId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    surveyPageSeqId("surveyPageSeqId"),
    surveyMultiRespId("surveyMultiRespId"),
    surveyMultiRespColId("surveyMultiRespColId"),
    requiredField("requiredField"),
    sequenceNum("sequenceNum"),
    externalFieldRef("externalFieldRef"),
    withSurveyQuestionId("withSurveyQuestionId"),
    withSurveyOptionSeqId("withSurveyOptionSeqId");
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
   private String surveyQuestionId;
    
   private String surveyQuestionCategoryId;
    
   private String surveyQuestionTypeId;
    
   private String description;
    
   private String question;
    
   private String hint;
    
   private String enumTypeId;
    
   private String geoId;
    
   private String formatString;
    
   private String surveyId;
    
   private Timestamp fromDate;
    
   private Timestamp thruDate;
    
   private String surveyPageSeqId;
    
   private String surveyMultiRespId;
    
   private String surveyMultiRespColId;
    
   private String requiredField;
    
   private Long sequenceNum;
    
   private String externalFieldRef;
    
   private String withSurveyQuestionId;
    
   private String withSurveyOptionSeqId;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_QUESTION_CATEGORY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestionCategory surveyQuestionCategory = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_QUESTION_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private SurveyQuestionType surveyQuestionType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="SURVEY_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Survey survey = null;
   private transient List<SurveyQuestionOption> surveyQuestionOptions = null;
   private transient List<Enumeration> enumerations = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="GEO_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Geo geo = null;
   private transient SurveyPage surveyPage = null;
   private transient SurveyMultiResp surveyMultiResp = null;
   private transient SurveyMultiRespColumn surveyMultiRespColumn = null;

  /**
   * Default constructor.
   */
  public SurveyQuestionAndAppl() {
      super();
      this.baseEntityName = "SurveyQuestionAndAppl";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("surveyQuestionId");this.primaryKeyNames.add("surveyId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("surveyQuestionId");this.allFieldsNames.add("surveyQuestionCategoryId");this.allFieldsNames.add("surveyQuestionTypeId");this.allFieldsNames.add("description");this.allFieldsNames.add("question");this.allFieldsNames.add("hint");this.allFieldsNames.add("enumTypeId");this.allFieldsNames.add("geoId");this.allFieldsNames.add("formatString");this.allFieldsNames.add("surveyId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("surveyPageSeqId");this.allFieldsNames.add("surveyMultiRespId");this.allFieldsNames.add("surveyMultiRespColId");this.allFieldsNames.add("requiredField");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("externalFieldRef");this.allFieldsNames.add("withSurveyQuestionId");this.allFieldsNames.add("withSurveyOptionSeqId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SurveyQuestionAndAppl(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param surveyQuestionId the surveyQuestionId to set
     */
    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionCategoryId the surveyQuestionCategoryId to set
     */
    public void setSurveyQuestionCategoryId(String surveyQuestionCategoryId) {
        this.surveyQuestionCategoryId = surveyQuestionCategoryId;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionTypeId the surveyQuestionTypeId to set
     */
    public void setSurveyQuestionTypeId(String surveyQuestionTypeId) {
        this.surveyQuestionTypeId = surveyQuestionTypeId;
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
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * Auto generated value setter.
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
    /**
     * Auto generated value setter.
     * @param enumTypeId the enumTypeId to set
     */
    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }
    /**
     * Auto generated value setter.
     * @param geoId the geoId to set
     */
    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }
    /**
     * Auto generated value setter.
     * @param formatString the formatString to set
     */
    public void setFormatString(String formatString) {
        this.formatString = formatString;
    }
    /**
     * Auto generated value setter.
     * @param surveyId the surveyId to set
     */
    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param surveyPageSeqId the surveyPageSeqId to set
     */
    public void setSurveyPageSeqId(String surveyPageSeqId) {
        this.surveyPageSeqId = surveyPageSeqId;
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
     * @param surveyMultiRespColId the surveyMultiRespColId to set
     */
    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }
    /**
     * Auto generated value setter.
     * @param requiredField the requiredField to set
     */
    public void setRequiredField(String requiredField) {
        this.requiredField = requiredField;
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
     * @param externalFieldRef the externalFieldRef to set
     */
    public void setExternalFieldRef(String externalFieldRef) {
        this.externalFieldRef = externalFieldRef;
    }
    /**
     * Auto generated value setter.
     * @param withSurveyQuestionId the withSurveyQuestionId to set
     */
    public void setWithSurveyQuestionId(String withSurveyQuestionId) {
        this.withSurveyQuestionId = withSurveyQuestionId;
    }
    /**
     * Auto generated value setter.
     * @param withSurveyOptionSeqId the withSurveyOptionSeqId to set
     */
    public void setWithSurveyOptionSeqId(String withSurveyOptionSeqId) {
        this.withSurveyOptionSeqId = withSurveyOptionSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyQuestionId() {
        return this.surveyQuestionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyQuestionCategoryId() {
        return this.surveyQuestionCategoryId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyQuestionTypeId() {
        return this.surveyQuestionTypeId;
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
     * @return <code>String</code>
     */
    public String getQuestion() {
        return this.question;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHint() {
        return this.hint;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEnumTypeId() {
        return this.enumTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getGeoId() {
        return this.geoId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getFormatString() {
        return this.formatString;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyId() {
        return this.surveyId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSurveyPageSeqId() {
        return this.surveyPageSeqId;
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
    public String getSurveyMultiRespColId() {
        return this.surveyMultiRespColId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRequiredField() {
        return this.requiredField;
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
    public String getExternalFieldRef() {
        return this.externalFieldRef;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWithSurveyQuestionId() {
        return this.withSurveyQuestionId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getWithSurveyOptionSeqId() {
        return this.withSurveyOptionSeqId;
    }

    /**
     * Auto generated method that gets the related <code>SurveyQuestionCategory</code> by the relation named <code>SurveyQuestionCategory</code>.
     * @return the <code>SurveyQuestionCategory</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestionCategory getSurveyQuestionCategory() throws RepositoryException {
        if (this.surveyQuestionCategory == null) {
            this.surveyQuestionCategory = getRelatedOne(SurveyQuestionCategory.class, "SurveyQuestionCategory");
        }
        return this.surveyQuestionCategory;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionType</code> by the relation named <code>SurveyQuestionType</code>.
     * @return the <code>SurveyQuestionType</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyQuestionType getSurveyQuestionType() throws RepositoryException {
        if (this.surveyQuestionType == null) {
            this.surveyQuestionType = getRelatedOne(SurveyQuestionType.class, "SurveyQuestionType");
        }
        return this.surveyQuestionType;
    }
    /**
     * Auto generated method that gets the related <code>Survey</code> by the relation named <code>Survey</code>.
     * @return the <code>Survey</code>
     * @throws RepositoryException if an error occurs
     */
    public Survey getSurvey() throws RepositoryException {
        if (this.survey == null) {
            this.survey = getRelatedOne(Survey.class, "Survey");
        }
        return this.survey;
    }
    /**
     * Auto generated method that gets the related <code>SurveyQuestionOption</code> by the relation named <code>SurveyQuestionOption</code>.
     * @return the list of <code>SurveyQuestionOption</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SurveyQuestionOption> getSurveyQuestionOptions() throws RepositoryException {
        if (this.surveyQuestionOptions == null) {
            this.surveyQuestionOptions = getRelated(SurveyQuestionOption.class, "SurveyQuestionOption");
        }
        return this.surveyQuestionOptions;
    }
    /**
     * Auto generated method that gets the related <code>Enumeration</code> by the relation named <code>Enumeration</code>.
     * @return the list of <code>Enumeration</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends Enumeration> getEnumerations() throws RepositoryException {
        if (this.enumerations == null) {
            this.enumerations = getRelated(Enumeration.class, "Enumeration");
        }
        return this.enumerations;
    }
    /**
     * Auto generated method that gets the related <code>Geo</code> by the relation named <code>Geo</code>.
     * @return the <code>Geo</code>
     * @throws RepositoryException if an error occurs
     */
    public Geo getGeo() throws RepositoryException {
        if (this.geo == null) {
            this.geo = getRelatedOne(Geo.class, "Geo");
        }
        return this.geo;
    }
    /**
     * Auto generated method that gets the related <code>SurveyPage</code> by the relation named <code>SurveyPage</code>.
     * @return the <code>SurveyPage</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyPage getSurveyPage() throws RepositoryException {
        if (this.surveyPage == null) {
            this.surveyPage = getRelatedOne(SurveyPage.class, "SurveyPage");
        }
        return this.surveyPage;
    }
    /**
     * Auto generated method that gets the related <code>SurveyMultiResp</code> by the relation named <code>SurveyMultiResp</code>.
     * @return the <code>SurveyMultiResp</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyMultiResp getSurveyMultiResp() throws RepositoryException {
        if (this.surveyMultiResp == null) {
            this.surveyMultiResp = getRelatedOne(SurveyMultiResp.class, "SurveyMultiResp");
        }
        return this.surveyMultiResp;
    }
    /**
     * Auto generated method that gets the related <code>SurveyMultiRespColumn</code> by the relation named <code>SurveyMultiRespColumn</code>.
     * @return the <code>SurveyMultiRespColumn</code>
     * @throws RepositoryException if an error occurs
     */
    public SurveyMultiRespColumn getSurveyMultiRespColumn() throws RepositoryException {
        if (this.surveyMultiRespColumn == null) {
            this.surveyMultiRespColumn = getRelatedOne(SurveyMultiRespColumn.class, "SurveyMultiRespColumn");
        }
        return this.surveyMultiRespColumn;
    }

    /**
     * Auto generated value setter.
     * @param surveyQuestionCategory the surveyQuestionCategory to set
    */
    public void setSurveyQuestionCategory(SurveyQuestionCategory surveyQuestionCategory) {
        this.surveyQuestionCategory = surveyQuestionCategory;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionType the surveyQuestionType to set
    */
    public void setSurveyQuestionType(SurveyQuestionType surveyQuestionType) {
        this.surveyQuestionType = surveyQuestionType;
    }
    /**
     * Auto generated value setter.
     * @param survey the survey to set
    */
    public void setSurvey(Survey survey) {
        this.survey = survey;
    }
    /**
     * Auto generated value setter.
     * @param surveyQuestionOptions the surveyQuestionOptions to set
    */
    public void setSurveyQuestionOptions(List<SurveyQuestionOption> surveyQuestionOptions) {
        this.surveyQuestionOptions = surveyQuestionOptions;
    }
    /**
     * Auto generated value setter.
     * @param enumerations the enumerations to set
    */
    public void setEnumerations(List<Enumeration> enumerations) {
        this.enumerations = enumerations;
    }
    /**
     * Auto generated value setter.
     * @param geo the geo to set
    */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }
    /**
     * Auto generated value setter.
     * @param surveyPage the surveyPage to set
    */
    public void setSurveyPage(SurveyPage surveyPage) {
        this.surveyPage = surveyPage;
    }
    /**
     * Auto generated value setter.
     * @param surveyMultiResp the surveyMultiResp to set
    */
    public void setSurveyMultiResp(SurveyMultiResp surveyMultiResp) {
        this.surveyMultiResp = surveyMultiResp;
    }
    /**
     * Auto generated value setter.
     * @param surveyMultiRespColumn the surveyMultiRespColumn to set
    */
    public void setSurveyMultiRespColumn(SurveyMultiRespColumn surveyMultiRespColumn) {
        this.surveyMultiRespColumn = surveyMultiRespColumn;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSurveyQuestionId((String) mapValue.get("surveyQuestionId"));
        setSurveyQuestionCategoryId((String) mapValue.get("surveyQuestionCategoryId"));
        setSurveyQuestionTypeId((String) mapValue.get("surveyQuestionTypeId"));
        setDescription((String) mapValue.get("description"));
        setQuestion((String) mapValue.get("question"));
        setHint((String) mapValue.get("hint"));
        setEnumTypeId((String) mapValue.get("enumTypeId"));
        setGeoId((String) mapValue.get("geoId"));
        setFormatString((String) mapValue.get("formatString"));
        setSurveyId((String) mapValue.get("surveyId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setSurveyPageSeqId((String) mapValue.get("surveyPageSeqId"));
        setSurveyMultiRespId((String) mapValue.get("surveyMultiRespId"));
        setSurveyMultiRespColId((String) mapValue.get("surveyMultiRespColId"));
        setRequiredField((String) mapValue.get("requiredField"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        setExternalFieldRef((String) mapValue.get("externalFieldRef"));
        setWithSurveyQuestionId((String) mapValue.get("withSurveyQuestionId"));
        setWithSurveyOptionSeqId((String) mapValue.get("withSurveyOptionSeqId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("surveyQuestionId", getSurveyQuestionId());
        mapValue.put("surveyQuestionCategoryId", getSurveyQuestionCategoryId());
        mapValue.put("surveyQuestionTypeId", getSurveyQuestionTypeId());
        mapValue.put("description", getDescription());
        mapValue.put("question", getQuestion());
        mapValue.put("hint", getHint());
        mapValue.put("enumTypeId", getEnumTypeId());
        mapValue.put("geoId", getGeoId());
        mapValue.put("formatString", getFormatString());
        mapValue.put("surveyId", getSurveyId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("surveyPageSeqId", getSurveyPageSeqId());
        mapValue.put("surveyMultiRespId", getSurveyMultiRespId());
        mapValue.put("surveyMultiRespColId", getSurveyMultiRespColId());
        mapValue.put("requiredField", getRequiredField());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("externalFieldRef", getExternalFieldRef());
        mapValue.put("withSurveyQuestionId", getWithSurveyQuestionId());
        mapValue.put("withSurveyOptionSeqId", getWithSurveyOptionSeqId());
        return mapValue;
    }


}
