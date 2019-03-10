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
 * Auto generated base entity KeyboardShortcut.
 */
@javax.persistence.Entity
@Table(name="KEYBOARD_SHORTCUT")
public class KeyboardShortcut extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("shortcutId", "SHORTCUT_ID");
        fields.put("userLoginId", "USER_LOGIN_ID");
        fields.put("applicationName", "APPLICATION_NAME");
        fields.put("screenName", "SCREEN_NAME");
        fields.put("shortcut", "SHORTCUT");
        fields.put("actionTypeId", "ACTION_TYPE_ID");
        fields.put("actionTarget", "ACTION_TARGET");
        fields.put("description", "DESCRIPTION");
        fields.put("sequenceNum", "SEQUENCE_NUM");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("KeyboardShortcut", fields);
}
  public static enum Fields implements EntityFieldInterface<KeyboardShortcut> {
    shortcutId("shortcutId"),
    userLoginId("userLoginId"),
    applicationName("applicationName"),
    screenName("screenName"),
    shortcut("shortcut"),
    actionTypeId("actionTypeId"),
    actionTarget("actionTarget"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="KeyboardShortcut_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="KeyboardShortcut_GEN")
   @Id
   @Column(name="SHORTCUT_ID")
   private String shortcutId;
   @Column(name="USER_LOGIN_ID")
   private String userLoginId;
   @Column(name="APPLICATION_NAME")
   private String applicationName;
   @Column(name="SCREEN_NAME")
   private String screenName;
   @Column(name="SHORTCUT")
   private String shortcut;
   @Column(name="ACTION_TYPE_ID")
   private String actionTypeId;
   @Column(name="ACTION_TARGET")
   private String actionTarget;
   @Column(name="DESCRIPTION")
   private String description;
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
   @JoinColumn(name="USER_LOGIN_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private UserLogin userLogin = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="ACTION_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private KeyboardShortcutHandler keyboardShortcutHandler = null;

  /**
   * Default constructor.
   */
  public KeyboardShortcut() {
      super();
      this.baseEntityName = "KeyboardShortcut";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("shortcutId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("shortcutId");this.allFieldsNames.add("userLoginId");this.allFieldsNames.add("applicationName");this.allFieldsNames.add("screenName");this.allFieldsNames.add("shortcut");this.allFieldsNames.add("actionTypeId");this.allFieldsNames.add("actionTarget");this.allFieldsNames.add("description");this.allFieldsNames.add("sequenceNum");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public KeyboardShortcut(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param shortcutId the shortcutId to set
     */
    public void setShortcutId(String shortcutId) {
        this.shortcutId = shortcutId;
    }
    /**
     * Auto generated value setter.
     * @param userLoginId the userLoginId to set
     */
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
    /**
     * Auto generated value setter.
     * @param applicationName the applicationName to set
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    /**
     * Auto generated value setter.
     * @param screenName the screenName to set
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
    /**
     * Auto generated value setter.
     * @param shortcut the shortcut to set
     */
    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }
    /**
     * Auto generated value setter.
     * @param actionTypeId the actionTypeId to set
     */
    public void setActionTypeId(String actionTypeId) {
        this.actionTypeId = actionTypeId;
    }
    /**
     * Auto generated value setter.
     * @param actionTarget the actionTarget to set
     */
    public void setActionTarget(String actionTarget) {
        this.actionTarget = actionTarget;
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
    public String getShortcutId() {
        return this.shortcutId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUserLoginId() {
        return this.userLoginId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getScreenName() {
        return this.screenName;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShortcut() {
        return this.shortcut;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getActionTypeId() {
        return this.actionTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getActionTarget() {
        return this.actionTarget;
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
     * Auto generated method that gets the related <code>UserLogin</code> by the relation named <code>UserLogin</code>.
     * @return the <code>UserLogin</code>
     * @throws RepositoryException if an error occurs
     */
    public UserLogin getUserLogin() throws RepositoryException {
        if (this.userLogin == null) {
            this.userLogin = getRelatedOne(UserLogin.class, "UserLogin");
        }
        return this.userLogin;
    }
    /**
     * Auto generated method that gets the related <code>KeyboardShortcutHandler</code> by the relation named <code>KeyboardShortcutHandler</code>.
     * @return the <code>KeyboardShortcutHandler</code>
     * @throws RepositoryException if an error occurs
     */
    public KeyboardShortcutHandler getKeyboardShortcutHandler() throws RepositoryException {
        if (this.keyboardShortcutHandler == null) {
            this.keyboardShortcutHandler = getRelatedOne(KeyboardShortcutHandler.class, "KeyboardShortcutHandler");
        }
        return this.keyboardShortcutHandler;
    }

    /**
     * Auto generated value setter.
     * @param userLogin the userLogin to set
    */
    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }
    /**
     * Auto generated value setter.
     * @param keyboardShortcutHandler the keyboardShortcutHandler to set
    */
    public void setKeyboardShortcutHandler(KeyboardShortcutHandler keyboardShortcutHandler) {
        this.keyboardShortcutHandler = keyboardShortcutHandler;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setShortcutId((String) mapValue.get("shortcutId"));
        setUserLoginId((String) mapValue.get("userLoginId"));
        setApplicationName((String) mapValue.get("applicationName"));
        setScreenName((String) mapValue.get("screenName"));
        setShortcut((String) mapValue.get("shortcut"));
        setActionTypeId((String) mapValue.get("actionTypeId"));
        setActionTarget((String) mapValue.get("actionTarget"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("shortcutId", getShortcutId());
        mapValue.put("userLoginId", getUserLoginId());
        mapValue.put("applicationName", getApplicationName());
        mapValue.put("screenName", getScreenName());
        mapValue.put("shortcut", getShortcut());
        mapValue.put("actionTypeId", getActionTypeId());
        mapValue.put("actionTarget", getActionTarget());
        mapValue.put("description", getDescription());
        mapValue.put("sequenceNum", getSequenceNum());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
