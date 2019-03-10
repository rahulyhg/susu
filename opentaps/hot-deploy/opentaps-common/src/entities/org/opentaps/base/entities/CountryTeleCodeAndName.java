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

/**
 * Auto generated base entity CountryTeleCodeAndName.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectCountryTeleCodeAndNames", query="SELECT CT.TELE_CODE AS \"teleCode\",CC.COUNTRY_CODE AS \"countryCode\",CC.COUNTRY_NAME AS \"countryName\" FROM COUNTRY_CODE CC INNER JOIN COUNTRY_TELE_CODE CT ON CC.COUNTRY_CODE = CT.COUNTRY_CODE", resultSetMapping="CountryTeleCodeAndNameMapping")
@SqlResultSetMapping(name="CountryTeleCodeAndNameMapping", entities={
@EntityResult(entityClass=CountryTeleCodeAndName.class, fields = {
@FieldResult(name="teleCode", column="teleCode")
,@FieldResult(name="countryCode", column="countryCode")
,@FieldResult(name="countryName", column="countryName")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class CountryTeleCodeAndName extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("teleCode", "CT.TELE_CODE");
        fields.put("countryCode", "CC.COUNTRY_CODE");
        fields.put("countryName", "CC.COUNTRY_NAME");
fieldMapColumns.put("CountryTeleCodeAndName", fields);
}
  public static enum Fields implements EntityFieldInterface<CountryTeleCodeAndName> {
    teleCode("teleCode"),
    countryCode("countryCode"),
    countryName("countryName");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

    
   private String teleCode;
    @Id
   private String countryCode;
    
   private String countryName;

  /**
   * Default constructor.
   */
  public CountryTeleCodeAndName() {
      super();
      this.baseEntityName = "CountryTeleCodeAndName";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("teleCode");this.allFieldsNames.add("countryCode");this.allFieldsNames.add("countryName");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public CountryTeleCodeAndName(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param teleCode the teleCode to set
     */
    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }
    /**
     * Auto generated value setter.
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    /**
     * Auto generated value setter.
     * @param countryName the countryName to set
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTeleCode() {
        return this.teleCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getCountryName() {
        return this.countryName;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTeleCode((String) mapValue.get("teleCode"));
        setCountryCode((String) mapValue.get("countryCode"));
        setCountryName((String) mapValue.get("countryName"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("teleCode", getTeleCode());
        mapValue.put("countryCode", getCountryCode());
        mapValue.put("countryName", getCountryName());
        return mapValue;
    }


}
