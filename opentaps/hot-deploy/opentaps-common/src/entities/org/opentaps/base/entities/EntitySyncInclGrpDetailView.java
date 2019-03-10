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
 * Auto generated base entity EntitySyncInclGrpDetailView.
 */
@javax.persistence.Entity
@NamedNativeQuery(name="selectEntitySyncInclGrpDetailViews", query="SELECT ESIG.ENTITY_SYNC_ID AS \"entitySyncId\",ESIG.ENTITY_GROUP_ID AS \"entityGroupId\",EGE.ENTITY_OR_PACKAGE AS \"entityOrPackage\",EGE.APPL_ENUM_ID AS \"applEnumId\" FROM ENTITY_SYNC_INCLUDE_GROUP ESIG INNER JOIN ENTITY_GROUP_ENTRY EGE ON ESIG.ENTITY_GROUP_ID = EGE.ENTITY_GROUP_ID", resultSetMapping="EntitySyncInclGrpDetailViewMapping")
@SqlResultSetMapping(name="EntitySyncInclGrpDetailViewMapping", entities={
@EntityResult(entityClass=EntitySyncInclGrpDetailView.class, fields = {
@FieldResult(name="entitySyncId", column="entitySyncId")
,@FieldResult(name="entityGroupId", column="entityGroupId")
,@FieldResult(name="entityOrPackage", column="entityOrPackage")
,@FieldResult(name="applEnumId", column="applEnumId")
})})
@org.hibernate.annotations.Entity(mutable = false)
@org.hibernate.annotations.AccessType("field")
public class EntitySyncInclGrpDetailView extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("entitySyncId", "ESIG.ENTITY_SYNC_ID");
        fields.put("entityGroupId", "ESIG.ENTITY_GROUP_ID");
        fields.put("entityOrPackage", "EGE.ENTITY_OR_PACKAGE");
        fields.put("applEnumId", "EGE.APPL_ENUM_ID");
fieldMapColumns.put("EntitySyncInclGrpDetailView", fields);
}
  public static enum Fields implements EntityFieldInterface<EntitySyncInclGrpDetailView> {
    entitySyncId("entitySyncId"),
    entityGroupId("entityGroupId"),
    entityOrPackage("entityOrPackage"),
    applEnumId("applEnumId");
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
   private String entitySyncId;
    
   private String entityGroupId;
    
   private String entityOrPackage;
    
   private String applEnumId;

  /**
   * Default constructor.
   */
  public EntitySyncInclGrpDetailView() {
      super();
      this.baseEntityName = "EntitySyncInclGrpDetailView";
      this.isView = true;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("entitySyncId");this.primaryKeyNames.add("entityGroupId");this.primaryKeyNames.add("entityOrPackage");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("entitySyncId");this.allFieldsNames.add("entityGroupId");this.allFieldsNames.add("entityOrPackage");this.allFieldsNames.add("applEnumId");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public EntitySyncInclGrpDetailView(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * This is a view-entity, so the setter methods will be private to this class and for use in its fromMap constructor only
     */
    /**
     * Auto generated value setter.
     * @param entitySyncId the entitySyncId to set
     */
    public void setEntitySyncId(String entitySyncId) {
        this.entitySyncId = entitySyncId;
    }
    /**
     * Auto generated value setter.
     * @param entityGroupId the entityGroupId to set
     */
    public void setEntityGroupId(String entityGroupId) {
        this.entityGroupId = entityGroupId;
    }
    /**
     * Auto generated value setter.
     * @param entityOrPackage the entityOrPackage to set
     */
    public void setEntityOrPackage(String entityOrPackage) {
        this.entityOrPackage = entityOrPackage;
    }
    /**
     * Auto generated value setter.
     * @param applEnumId the applEnumId to set
     */
    public void setApplEnumId(String applEnumId) {
        this.applEnumId = applEnumId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEntitySyncId() {
        return this.entitySyncId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEntityGroupId() {
        return this.entityGroupId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getEntityOrPackage() {
        return this.entityOrPackage;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getApplEnumId() {
        return this.applEnumId;
    }




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setEntitySyncId((String) mapValue.get("entitySyncId"));
        setEntityGroupId((String) mapValue.get("entityGroupId"));
        setEntityOrPackage((String) mapValue.get("entityOrPackage"));
        setApplEnumId((String) mapValue.get("applEnumId"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("entitySyncId", getEntitySyncId());
        mapValue.put("entityGroupId", getEntityGroupId());
        mapValue.put("entityOrPackage", getEntityOrPackage());
        mapValue.put("applEnumId", getApplEnumId());
        return mapValue;
    }


}
