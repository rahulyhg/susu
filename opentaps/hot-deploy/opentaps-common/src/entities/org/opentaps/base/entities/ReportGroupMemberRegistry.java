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

/**
 * Auto generated base entity ReportGroupMemberRegistry.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectReportGroupMemberRegistrys", query="SELECT RR.REPORT_ID AS \"reportId\",RR.SHORT_NAME AS \"shortName\",RR.DESCRIPTION AS \"description\",RR.REPORT_LOCATION AS \"reportLocation\",RR.SETUP_URI AS \"setupUri\",RGM.REPORT_GROUP_ID AS \"reportGroupId\",RGM.SEQUENCE_NUM AS \"sequenceNum\" FROM REPORT_GROUP_MEMBER RGM INNER JOIN REPORT_REGISTRY RR ON RGM.REPORT_ID = RR.REPORT_ID", resultSetMapping="ReportGroupMemberRegistryMapping")
@SqlResultSetMapping(name="ReportGroupMemberRegistryMapping", entities={
@EntityResult(entityClass=ReportGroupMemberRegistry.class, fields = {
@FieldResult(name="reportId", column="reportId")
,@FieldResult(name="shortName", column="shortName")
,@FieldResult(name="description", column="description")
,@FieldResult(name="reportLocation", column="reportLocation")
,@FieldResult(name="setupUri", column="setupUri")
,@FieldResult(name="reportGroupId", column="reportGroupId")
,@FieldResult(name="sequenceNum", column="sequenceNum")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class ReportGroupMemberRegistry extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("reportId", "RR.REPORT_ID");
        fields.put("shortName", "RR.SHORT_NAME");
        fields.put("description", "RR.DESCRIPTION");
        fields.put("reportLocation", "RR.REPORT_LOCATION");
        fields.put("setupUri", "RR.SETUP_URI");
        fields.put("reportGroupId", "RGM.REPORT_GROUP_ID");
        fields.put("sequenceNum", "RGM.SEQUENCE_NUM");
fieldMapColumns.put("ReportGroupMemberRegistry", fields);
}
  public static enum Fields implements EntityFieldInterface<ReportGroupMemberRegistry> {
    reportId("reportId"),
    shortName("shortName"),
    description("description"),
    reportLocation("reportLocation"),
    setupUri("setupUri"),
    reportGroupId("reportGroupId"),
    sequenceNum("sequenceNum");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String reportId;
    
   private String shortName;
    
   private String description;
    
   private String reportLocation;
    
   private String setupUri;
    @Id
   private String reportGroupId;
    
   private Long sequenceNum;

  /**
   * Default constructor.
   */
  public ReportGroupMemberRegistry() {
      super();
      this.baseEntityName = "ReportGroupMemberRegistry";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("reportId");this.primaryKeyNames.add("reportGroupId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("reportId");this.allFieldsNames.add("shortName");this.allFieldsNames.add("description");this.allFieldsNames.add("reportLocation");this.allFieldsNames.add("setupUri");this.allFieldsNames.add("reportGroupId");this.allFieldsNames.add("sequenceNum");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public ReportGroupMemberRegistry(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param reportId the reportId to set
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }
    /**
     * Auto generated value setter.
     * @param shortName the shortName to set
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
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
     * @param reportLocation the reportLocation to set
     */
    public void setReportLocation(String reportLocation) {
        this.reportLocation = reportLocation;
    }
    /**
     * Auto generated value setter.
     * @param setupUri the setupUri to set
     */
    public void setSetupUri(String setupUri) {
        this.setupUri = setupUri;
    }
    /**
     * Auto generated value setter.
     * @param reportGroupId the reportGroupId to set
     */
    public void setReportGroupId(String reportGroupId) {
        this.reportGroupId = reportGroupId;
    }
    /**
     * Auto generated value setter.
     * @param sequenceNum the sequenceNum to set
     */
    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReportId() {
        return this.reportId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShortName() {
        return this.shortName;
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
    public String getReportLocation() {
        return this.reportLocation;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getSetupUri() {
        return this.setupUri;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getReportGroupId() {
        return this.reportGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getSequenceNum() {
        return this.sequenceNum;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setReportId((String) mapValue.get("reportId"));
        setShortName((String) mapValue.get("shortName"));
        setDescription((String) mapValue.get("description"));
        setReportLocation((String) mapValue.get("reportLocation"));
        setSetupUri((String) mapValue.get("setupUri"));
        setReportGroupId((String) mapValue.get("reportGroupId"));
        setSequenceNum((Long) mapValue.get("sequenceNum"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("reportId", getReportId());
        mapValue.put("shortName", getShortName());
        mapValue.put("description", getDescription());
        mapValue.put("reportLocation", getReportLocation());
        mapValue.put("setupUri", getSetupUri());
        mapValue.put("reportGroupId", getReportGroupId());
        mapValue.put("sequenceNum", getSequenceNum());
        return mapValue;
    }


}
