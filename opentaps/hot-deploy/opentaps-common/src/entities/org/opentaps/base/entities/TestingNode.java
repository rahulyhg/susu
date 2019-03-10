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
import java.sql.Timestamp;

/**
 * Auto generated base entity TestingNode.
 */
@javax.persistence.Entity
@Table(name="TESTING_NODE")
public class TestingNode extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("testingNodeId", "TESTING_NODE_ID");
        fields.put("primaryParentNodeId", "PRIMARY_PARENT_NODE_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("TestingNode", fields);
}
  public static enum Fields implements EntityFieldInterface<TestingNode> {
    testingNodeId("testingNodeId"),
    primaryParentNodeId("primaryParentNodeId"),
    description("description"),
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

   @org.hibernate.annotations.GenericGenerator(name="TestingNode_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="TestingNode_GEN")
   @Id
   @Column(name="TESTING_NODE_ID")
   private String testingNodeId;
   @Column(name="PRIMARY_PARENT_NODE_ID")
   private String primaryParentNodeId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PRIMARY_PARENT_NODE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private TestingNode primaryParentTestingNode = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="primaryParentTestingNode", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="PRIMARY_PARENT_NODE_ID")
   
   private List<TestingNode> primaryChildTestingNodes = null;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="testingNode", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="TESTING_NODE_ID")
   
   private List<TestingNodeMember> testingNodeMembers = null;

  /**
   * Default constructor.
   */
  public TestingNode() {
      super();
      this.baseEntityName = "TestingNode";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("testingNodeId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("testingNodeId");this.allFieldsNames.add("primaryParentNodeId");this.allFieldsNames.add("description");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public TestingNode(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param testingNodeId the testingNodeId to set
     */
    public void setTestingNodeId(String testingNodeId) {
        this.testingNodeId = testingNodeId;
    }
    /**
     * Auto generated value setter.
     * @param primaryParentNodeId the primaryParentNodeId to set
     */
    public void setPrimaryParentNodeId(String primaryParentNodeId) {
        this.primaryParentNodeId = primaryParentNodeId;
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
    public String getTestingNodeId() {
        return this.testingNodeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrimaryParentNodeId() {
        return this.primaryParentNodeId;
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
     * Auto generated method that gets the related <code>TestingNode</code> by the relation named <code>PrimaryParentTestingNode</code>.
     * @return the <code>TestingNode</code>
     * @throws RepositoryException if an error occurs
     */
    public TestingNode getPrimaryParentTestingNode() throws RepositoryException {
        if (this.primaryParentTestingNode == null) {
            this.primaryParentTestingNode = getRelatedOne(TestingNode.class, "PrimaryParentTestingNode");
        }
        return this.primaryParentTestingNode;
    }
    /**
     * Auto generated method that gets the related <code>TestingNode</code> by the relation named <code>PrimaryChildTestingNode</code>.
     * @return the list of <code>TestingNode</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TestingNode> getPrimaryChildTestingNodes() throws RepositoryException {
        if (this.primaryChildTestingNodes == null) {
            this.primaryChildTestingNodes = getRelated(TestingNode.class, "PrimaryChildTestingNode");
        }
        return this.primaryChildTestingNodes;
    }
    /**
     * Auto generated method that gets the related <code>TestingNodeMember</code> by the relation named <code>TestingNodeMember</code>.
     * @return the list of <code>TestingNodeMember</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends TestingNodeMember> getTestingNodeMembers() throws RepositoryException {
        if (this.testingNodeMembers == null) {
            this.testingNodeMembers = getRelated(TestingNodeMember.class, "TestingNodeMember");
        }
        return this.testingNodeMembers;
    }

    /**
     * Auto generated value setter.
     * @param primaryParentTestingNode the primaryParentTestingNode to set
    */
    public void setPrimaryParentTestingNode(TestingNode primaryParentTestingNode) {
        this.primaryParentTestingNode = primaryParentTestingNode;
    }
    /**
     * Auto generated value setter.
     * @param primaryChildTestingNodes the primaryChildTestingNodes to set
    */
    public void setPrimaryChildTestingNodes(List<TestingNode> primaryChildTestingNodes) {
        this.primaryChildTestingNodes = primaryChildTestingNodes;
    }
    /**
     * Auto generated value setter.
     * @param testingNodeMembers the testingNodeMembers to set
    */
    public void setTestingNodeMembers(List<TestingNodeMember> testingNodeMembers) {
        this.testingNodeMembers = testingNodeMembers;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addTestingNodeMember(TestingNodeMember testingNodeMember) {
        if (this.testingNodeMembers == null) {
            this.testingNodeMembers = new ArrayList<TestingNodeMember>();
        }
        this.testingNodeMembers.add(testingNodeMember);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeTestingNodeMember(TestingNodeMember testingNodeMember) {
        if (this.testingNodeMembers == null) {
            return;
        }
        this.testingNodeMembers.remove(testingNodeMember);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearTestingNodeMember() {
        if (this.testingNodeMembers == null) {
            return;
        }
        this.testingNodeMembers.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setTestingNodeId((String) mapValue.get("testingNodeId"));
        setPrimaryParentNodeId((String) mapValue.get("primaryParentNodeId"));
        setDescription((String) mapValue.get("description"));
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
        mapValue.put("testingNodeId", getTestingNodeId());
        mapValue.put("primaryParentNodeId", getPrimaryParentNodeId());
        mapValue.put("description", getDescription());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
