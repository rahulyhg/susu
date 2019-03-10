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
 * Auto generated base entity SubscriptionActivity.
 */
@javax.persistence.Entity
@Table(name="SUBSCRIPTION_ACTIVITY")
public class SubscriptionActivity extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("subscriptionActivityId", "SUBSCRIPTION_ACTIVITY_ID");
        fields.put("comments", "COMMENTS");
        fields.put("dateSent", "DATE_SENT");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("SubscriptionActivity", fields);
}
  public static enum Fields implements EntityFieldInterface<SubscriptionActivity> {
    subscriptionActivityId("subscriptionActivityId"),
    comments("comments"),
    dateSent("dateSent"),
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

   @org.hibernate.annotations.GenericGenerator(name="SubscriptionActivity_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="SubscriptionActivity_GEN")
   @Id
   @Column(name="SUBSCRIPTION_ACTIVITY_ID")
   private String subscriptionActivityId;
   @Column(name="COMMENTS")
   private String comments;
   @Column(name="DATE_SENT")
   private Timestamp dateSent;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @OneToMany(fetch=FetchType.LAZY, mappedBy="subscriptionActivity", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
   @JoinColumn(name="SUBSCRIPTION_ACTIVITY_ID")
   
   private List<SubscriptionFulfillmentPiece> subscriptionFulfillmentPieces = null;

  /**
   * Default constructor.
   */
  public SubscriptionActivity() {
      super();
      this.baseEntityName = "SubscriptionActivity";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("subscriptionActivityId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("subscriptionActivityId");this.allFieldsNames.add("comments");this.allFieldsNames.add("dateSent");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public SubscriptionActivity(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param subscriptionActivityId the subscriptionActivityId to set
     */
    public void setSubscriptionActivityId(String subscriptionActivityId) {
        this.subscriptionActivityId = subscriptionActivityId;
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
     * @param dateSent the dateSent to set
     */
    public void setDateSent(Timestamp dateSent) {
        this.dateSent = dateSent;
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
    public String getSubscriptionActivityId() {
        return this.subscriptionActivityId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getDateSent() {
        return this.dateSent;
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
     * Auto generated method that gets the related <code>SubscriptionFulfillmentPiece</code> by the relation named <code>SubscriptionFulfillmentPiece</code>.
     * @return the list of <code>SubscriptionFulfillmentPiece</code>
     * @throws RepositoryException if an error occurs
     */
    public List<? extends SubscriptionFulfillmentPiece> getSubscriptionFulfillmentPieces() throws RepositoryException {
        if (this.subscriptionFulfillmentPieces == null) {
            this.subscriptionFulfillmentPieces = getRelated(SubscriptionFulfillmentPiece.class, "SubscriptionFulfillmentPiece");
        }
        return this.subscriptionFulfillmentPieces;
    }

    /**
     * Auto generated value setter.
     * @param subscriptionFulfillmentPieces the subscriptionFulfillmentPieces to set
    */
    public void setSubscriptionFulfillmentPieces(List<SubscriptionFulfillmentPiece> subscriptionFulfillmentPieces) {
        this.subscriptionFulfillmentPieces = subscriptionFulfillmentPieces;
    }

    /**
     * Auto generated method that add item to collection.
     */
    public void addSubscriptionFulfillmentPiece(SubscriptionFulfillmentPiece subscriptionFulfillmentPiece) {
        if (this.subscriptionFulfillmentPieces == null) {
            this.subscriptionFulfillmentPieces = new ArrayList<SubscriptionFulfillmentPiece>();
        }
        this.subscriptionFulfillmentPieces.add(subscriptionFulfillmentPiece);
    }
    /**
     * Auto generated method that remove item from collection.
     */
    public void removeSubscriptionFulfillmentPiece(SubscriptionFulfillmentPiece subscriptionFulfillmentPiece) {
        if (this.subscriptionFulfillmentPieces == null) {
            return;
        }
        this.subscriptionFulfillmentPieces.remove(subscriptionFulfillmentPiece);
    }
    /**
     * Auto generated method that clear items from collection.
     */
    public void clearSubscriptionFulfillmentPiece() {
        if (this.subscriptionFulfillmentPieces == null) {
            return;
        }
        this.subscriptionFulfillmentPieces.clear();
    }

    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setSubscriptionActivityId((String) mapValue.get("subscriptionActivityId"));
        setComments((String) mapValue.get("comments"));
        setDateSent((Timestamp) mapValue.get("dateSent"));
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
        mapValue.put("subscriptionActivityId", getSubscriptionActivityId());
        mapValue.put("comments", getComments());
        mapValue.put("dateSent", getDateSent());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
