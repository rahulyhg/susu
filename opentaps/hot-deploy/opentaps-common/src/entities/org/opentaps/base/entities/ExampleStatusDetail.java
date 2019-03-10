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
 * Auto generated base entity ExampleStatusDetail.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectExampleStatusDetails", query="SELECT EXPL.STATUS_ID AS \"statusId\",.STATUS_DELAY AS \"statusDelay\",EXPL.EXAMPLE_ID AS \"exampleId\",EXPL.EXAMPLE_TYPE_ID AS \"exampleTypeId\",EXPL.EXAMPLE_NAME AS \"exampleName\",EXPL.DESCRIPTION AS \"description\",EXPL.LONG_DESCRIPTION AS \"longDescription\",EXPL.COMMENTS AS \"comments\",EXPL.EXAMPLE_SIZE AS \"exampleSize\",EXPL.EXAMPLE_DATE AS \"exampleDate\",EXPL.ANOTHER_DATE AS \"anotherDate\",EXPL.ANOTHER_TEXT AS \"anotherText\",EXST.STATUS_DATE AS \"statusDate\",EXST.STATUS_END_DATE AS \"statusEndDate\",EXST.STATUS_ID AS \"statusId\" FROM EXAMPLE EXPL INNER JOIN EXAMPLE_STATUS EXST ON EXPL.EXAMPLE_ID = EXST.EXAMPLE_ID", resultSetMapping="ExampleStatusDetailMapping")
@SqlResultSetMapping(name="ExampleStatusDetailMapping", entities={
@EntityResult(entityClass=ExampleStatusDetail.class, fields = {
@FieldResult(name="currentStatusId", column="currentStatusId")
,@FieldResult(name="statusDelay", column="statusDelay")
,@FieldResult(name="exampleId", column="exampleId")
,@FieldResult(name="exampleTypeId", column="exampleTypeId")
,@FieldResult(name="exampleName", column="exampleName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="longDescription", column="longDescription")
,@FieldResult(name="comments", column="comments")
,@FieldResult(name="exampleSize", column="exampleSize")
,@FieldResult(name="exampleDate", column="exampleDate")
,@FieldResult(name="anotherDate", column="anotherDate")
,@FieldResult(name="anotherText", column="anotherText")
,@FieldResult(name="statusDate", column="statusDate")
,@FieldResult(name="statusEndDate", column="statusEndDate")
,@FieldResult(name="statusId", column="statusId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ExampleStatusDetail extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("currentStatusId", "EXPL.STATUS_ID");
        fields.put("statusDelay", ".STATUS_DELAY");
        fields.put("exampleId", "EXPL.EXAMPLE_ID");
        fields.put("exampleTypeId", "EXPL.EXAMPLE_TYPE_ID");
        fields.put("exampleName", "EXPL.EXAMPLE_NAME");
        fields.put("description", "EXPL.DESCRIPTION");
        fields.put("longDescription", "EXPL.LONG_DESCRIPTION");
        fields.put("comments", "EXPL.COMMENTS");
        fields.put("exampleSize", "EXPL.EXAMPLE_SIZE");
        fields.put("exampleDate", "EXPL.EXAMPLE_DATE");
        fields.put("anotherDate", "EXPL.ANOTHER_DATE");
        fields.put("anotherText", "EXPL.ANOTHER_TEXT");
        fields.put("statusDate", "EXST.STATUS_DATE");
        fields.put("statusEndDate", "EXST.STATUS_END_DATE");
        fields.put("statusId", "EXST.STATUS_ID");
fieldMapColumns.put("ExampleStatusDetail", fields);
}
  public static enum Fields implements EntityFieldInterface<ExampleStatusDetail> {
    currentStatusId("currentStatusId"),
    statusDelay("statusDelay"),
    exampleId("exampleId"),
    exampleTypeId("exampleTypeId"),
    exampleName("exampleName"),
    description("description"),
    longDescription("longDescription"),
    comments("comments"),
    exampleSize("exampleSize"),
    exampleDate("exampleDate"),
    anotherDate("anotherDate"),
    anotherText("anotherText"),
    statusDate("statusDate"),
    statusEndDate("statusEndDate"),
    statusId("statusId");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String currentStatusId;
    
   private Timestamp statusDelay;
    @Id
   private String exampleId;
    
   private String exampleTypeId;
    
   private String exampleName;
    
   private String description;
    
   private String longDescription;
    
   private String comments;
    
   private Long exampleSize;
    
   private Timestamp exampleDate;
    
   private Timestamp anotherDate;
    
   private String anotherText;
    
   private Timestamp statusDate;
    
   private Timestamp statusEndDate;
    
   private String statusId;

  /**
   * Default constructor.
   */
  public ExampleStatusDetail() {
      super();
      this.baseEntityName = "ExampleStatusDetail";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("exampleId");this.primaryKeyNames.add("statusDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("currentStatusId");this.allFieldsNames.add("statusDelay");this.allFieldsNames.add("exampleId");this.allFieldsNames.add("exampleTypeId");this.allFieldsNames.add("exampleName");this.allFieldsNames.add("description");this.allFieldsNames.add("longDescription");this.allFieldsNames.add("comments");this.allFieldsNames.add("exampleSize");this.allFieldsNames.add("exampleDate");this.allFieldsNames.add("anotherDate");this.allFieldsNames.add("anotherText");this.allFieldsNames.add("statusDate");this.allFieldsNames.add("statusEndDate");this.allFieldsNames.add("statusId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ExampleStatusDetail(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param currentStatusId the currentStatusId to set
     */
    public void setCurrentStatusId(String currentStatusId) {
        this.currentStatusId = currentStatusId;
    }
    /**
     * Auto generated value setter.
     * @param statusDelay the statusDelay to set
     */
    public void setStatusDelay(Timestamp statusDelay) {
        this.statusDelay = statusDelay;
    }
    /**
     * Auto generated value setter.
     * @param exampleId the exampleId to set
     */
    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }
    /**
     * Auto generated value setter.
     * @param exampleTypeId the exampleTypeId to set
     */
    public void setExampleTypeId(String exampleTypeId) {
        this.exampleTypeId = exampleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param exampleName the exampleName to set
     */
    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
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
     * @param longDescription the longDescription to set
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
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
     * @param exampleSize the exampleSize to set
     */
    public void setExampleSize(Long exampleSize) {
        this.exampleSize = exampleSize;
    }
    /**
     * Auto generated value setter.
     * @param exampleDate the exampleDate to set
     */
    public void setExampleDate(Timestamp exampleDate) {
        this.exampleDate = exampleDate;
    }
    /**
     * Auto generated value setter.
     * @param anotherDate the anotherDate to set
     */
    public void setAnotherDate(Timestamp anotherDate) {
        this.anotherDate = anotherDate;
    }
    /**
     * Auto generated value setter.
     * @param anotherText the anotherText to set
     */
    public void setAnotherText(String anotherText) {
        this.anotherText = anotherText;
    }
    /**
     * Auto generated value setter.
     * @param statusDate the statusDate to set
     */
    public void setStatusDate(Timestamp statusDate) {
        this.statusDate = statusDate;
    }
    /**
     * Auto generated value setter.
     * @param statusEndDate the statusEndDate to set
     */
    public void setStatusEndDate(Timestamp statusEndDate) {
        this.statusEndDate = statusEndDate;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCurrentStatusId() {
        return this.currentStatusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStatusDelay() {
        return this.statusDelay;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleId() {
        return this.exampleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleTypeId() {
        return this.exampleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleName() {
        return this.exampleName;
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
    public String getLongDescription() {
        return this.longDescription;
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
     * @return <code>Long</code>
     */
    public Long getExampleSize() {
        return this.exampleSize;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getExampleDate() {
        return this.exampleDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getAnotherDate() {
        return this.anotherDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getAnotherText() {
        return this.anotherText;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStatusDate() {
        return this.statusDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getStatusEndDate() {
        return this.statusEndDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setCurrentStatusId((String) mapValue.get("currentStatusId"));
        setStatusDelay((Timestamp) mapValue.get("statusDelay"));
        setExampleId((String) mapValue.get("exampleId"));
        setExampleTypeId((String) mapValue.get("exampleTypeId"));
        setExampleName((String) mapValue.get("exampleName"));
        setDescription((String) mapValue.get("description"));
        setLongDescription((String) mapValue.get("longDescription"));
        setComments((String) mapValue.get("comments"));
        setExampleSize((Long) mapValue.get("exampleSize"));
        setExampleDate((Timestamp) mapValue.get("exampleDate"));
        setAnotherDate((Timestamp) mapValue.get("anotherDate"));
        setAnotherText((String) mapValue.get("anotherText"));
        setStatusDate((Timestamp) mapValue.get("statusDate"));
        setStatusEndDate((Timestamp) mapValue.get("statusEndDate"));
        setStatusId((String) mapValue.get("statusId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("currentStatusId", getCurrentStatusId());
        mapValue.put("statusDelay", getStatusDelay());
        mapValue.put("exampleId", getExampleId());
        mapValue.put("exampleTypeId", getExampleTypeId());
        mapValue.put("exampleName", getExampleName());
        mapValue.put("description", getDescription());
        mapValue.put("longDescription", getLongDescription());
        mapValue.put("comments", getComments());
        mapValue.put("exampleSize", getExampleSize());
        mapValue.put("exampleDate", getExampleDate());
        mapValue.put("anotherDate", getAnotherDate());
        mapValue.put("anotherText", getAnotherText());
        mapValue.put("statusDate", getStatusDate());
        mapValue.put("statusEndDate", getStatusEndDate());
        mapValue.put("statusId", getStatusId());
        return mapValue;
    }


}
