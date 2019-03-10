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
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity AddressLabelSpecification.
 */
@javax.persistence.Entity
@Table(name="ADDRESS_LABEL_SPECIFICATION")
public class AddressLabelSpecification extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("addressLabelId", "ADDRESS_LABEL_ID");
        fields.put("description", "DESCRIPTION");
        fields.put("topMargin", "TOP_MARGIN");
        fields.put("bottomMargin", "BOTTOM_MARGIN");
        fields.put("leftMargin", "LEFT_MARGIN");
        fields.put("rightMargin", "RIGHT_MARGIN");
        fields.put("pageColumns", "PAGE_COLUMNS");
        fields.put("pageRows", "PAGE_ROWS");
        fields.put("labelHeight", "LABEL_HEIGHT");
        fields.put("labelWidth", "LABEL_WIDTH");
        fields.put("heightBtwLabel", "HEIGHT_BTW_LABEL");
        fields.put("widthBtwLabel", "WIDTH_BTW_LABEL");
        fields.put("pageWidth", "PAGE_WIDTH");
        fields.put("pageHeight", "PAGE_HEIGHT");
        fields.put("continuousFeed", "CONTINUOUS_FEED");
        fields.put("uomId", "UOM_ID");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("AddressLabelSpecification", fields);
}
  public static enum Fields implements EntityFieldInterface<AddressLabelSpecification> {
    addressLabelId("addressLabelId"),
    description("description"),
    topMargin("topMargin"),
    bottomMargin("bottomMargin"),
    leftMargin("leftMargin"),
    rightMargin("rightMargin"),
    pageColumns("pageColumns"),
    pageRows("pageRows"),
    labelHeight("labelHeight"),
    labelWidth("labelWidth"),
    heightBtwLabel("heightBtwLabel"),
    widthBtwLabel("widthBtwLabel"),
    pageWidth("pageWidth"),
    pageHeight("pageHeight"),
    continuousFeed("continuousFeed"),
    uomId("uomId"),
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

   @org.hibernate.annotations.GenericGenerator(name="AddressLabelSpecification_GEN",  strategy="org.opentaps.foundation.entity.hibernate.OpentapsIdentifierGenerator")
   @GeneratedValue(generator="AddressLabelSpecification_GEN")
   @Id
   @Column(name="ADDRESS_LABEL_ID")
   private String addressLabelId;
   @Column(name="DESCRIPTION")
   private String description;
   @Column(name="TOP_MARGIN")
   private BigDecimal topMargin;
   @Column(name="BOTTOM_MARGIN")
   private BigDecimal bottomMargin;
   @Column(name="LEFT_MARGIN")
   private BigDecimal leftMargin;
   @Column(name="RIGHT_MARGIN")
   private BigDecimal rightMargin;
   @Column(name="PAGE_COLUMNS")
   private BigDecimal pageColumns;
   @Column(name="PAGE_ROWS")
   private BigDecimal pageRows;
   @Column(name="LABEL_HEIGHT")
   private BigDecimal labelHeight;
   @Column(name="LABEL_WIDTH")
   private BigDecimal labelWidth;
   @Column(name="HEIGHT_BTW_LABEL")
   private BigDecimal heightBtwLabel;
   @Column(name="WIDTH_BTW_LABEL")
   private BigDecimal widthBtwLabel;
   @Column(name="PAGE_WIDTH")
   private BigDecimal pageWidth;
   @Column(name="PAGE_HEIGHT")
   private BigDecimal pageHeight;
   @Column(name="CONTINUOUS_FEED")
   private String continuousFeed;
   @Column(name="UOM_ID")
   private String uomId;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;

  /**
   * Default constructor.
   */
  public AddressLabelSpecification() {
      super();
      this.baseEntityName = "AddressLabelSpecification";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("addressLabelId");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("addressLabelId");this.allFieldsNames.add("description");this.allFieldsNames.add("topMargin");this.allFieldsNames.add("bottomMargin");this.allFieldsNames.add("leftMargin");this.allFieldsNames.add("rightMargin");this.allFieldsNames.add("pageColumns");this.allFieldsNames.add("pageRows");this.allFieldsNames.add("labelHeight");this.allFieldsNames.add("labelWidth");this.allFieldsNames.add("heightBtwLabel");this.allFieldsNames.add("widthBtwLabel");this.allFieldsNames.add("pageWidth");this.allFieldsNames.add("pageHeight");this.allFieldsNames.add("continuousFeed");this.allFieldsNames.add("uomId");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public AddressLabelSpecification(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param addressLabelId the addressLabelId to set
     */
    public void setAddressLabelId(String addressLabelId) {
        this.addressLabelId = addressLabelId;
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
     * @param topMargin the topMargin to set
     */
    public void setTopMargin(BigDecimal topMargin) {
        this.topMargin = topMargin;
    }
    /**
     * Auto generated value setter.
     * @param bottomMargin the bottomMargin to set
     */
    public void setBottomMargin(BigDecimal bottomMargin) {
        this.bottomMargin = bottomMargin;
    }
    /**
     * Auto generated value setter.
     * @param leftMargin the leftMargin to set
     */
    public void setLeftMargin(BigDecimal leftMargin) {
        this.leftMargin = leftMargin;
    }
    /**
     * Auto generated value setter.
     * @param rightMargin the rightMargin to set
     */
    public void setRightMargin(BigDecimal rightMargin) {
        this.rightMargin = rightMargin;
    }
    /**
     * Auto generated value setter.
     * @param pageColumns the pageColumns to set
     */
    public void setPageColumns(BigDecimal pageColumns) {
        this.pageColumns = pageColumns;
    }
    /**
     * Auto generated value setter.
     * @param pageRows the pageRows to set
     */
    public void setPageRows(BigDecimal pageRows) {
        this.pageRows = pageRows;
    }
    /**
     * Auto generated value setter.
     * @param labelHeight the labelHeight to set
     */
    public void setLabelHeight(BigDecimal labelHeight) {
        this.labelHeight = labelHeight;
    }
    /**
     * Auto generated value setter.
     * @param labelWidth the labelWidth to set
     */
    public void setLabelWidth(BigDecimal labelWidth) {
        this.labelWidth = labelWidth;
    }
    /**
     * Auto generated value setter.
     * @param heightBtwLabel the heightBtwLabel to set
     */
    public void setHeightBtwLabel(BigDecimal heightBtwLabel) {
        this.heightBtwLabel = heightBtwLabel;
    }
    /**
     * Auto generated value setter.
     * @param widthBtwLabel the widthBtwLabel to set
     */
    public void setWidthBtwLabel(BigDecimal widthBtwLabel) {
        this.widthBtwLabel = widthBtwLabel;
    }
    /**
     * Auto generated value setter.
     * @param pageWidth the pageWidth to set
     */
    public void setPageWidth(BigDecimal pageWidth) {
        this.pageWidth = pageWidth;
    }
    /**
     * Auto generated value setter.
     * @param pageHeight the pageHeight to set
     */
    public void setPageHeight(BigDecimal pageHeight) {
        this.pageHeight = pageHeight;
    }
    /**
     * Auto generated value setter.
     * @param continuousFeed the continuousFeed to set
     */
    public void setContinuousFeed(String continuousFeed) {
        this.continuousFeed = continuousFeed;
    }
    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
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
    public String getAddressLabelId() {
        return this.addressLabelId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getTopMargin() {
        return this.topMargin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getBottomMargin() {
        return this.bottomMargin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getLeftMargin() {
        return this.leftMargin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getRightMargin() {
        return this.rightMargin;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPageColumns() {
        return this.pageColumns;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPageRows() {
        return this.pageRows;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getLabelHeight() {
        return this.labelHeight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getLabelWidth() {
        return this.labelWidth;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getHeightBtwLabel() {
        return this.heightBtwLabel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getWidthBtwLabel() {
        return this.widthBtwLabel;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPageWidth() {
        return this.pageWidth;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getPageHeight() {
        return this.pageHeight;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContinuousFeed() {
        return this.continuousFeed;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomId() {
        return this.uomId;
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




    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setAddressLabelId((String) mapValue.get("addressLabelId"));
        setDescription((String) mapValue.get("description"));
        setTopMargin(convertToBigDecimal(mapValue.get("topMargin")));
        setBottomMargin(convertToBigDecimal(mapValue.get("bottomMargin")));
        setLeftMargin(convertToBigDecimal(mapValue.get("leftMargin")));
        setRightMargin(convertToBigDecimal(mapValue.get("rightMargin")));
        setPageColumns(convertToBigDecimal(mapValue.get("pageColumns")));
        setPageRows(convertToBigDecimal(mapValue.get("pageRows")));
        setLabelHeight(convertToBigDecimal(mapValue.get("labelHeight")));
        setLabelWidth(convertToBigDecimal(mapValue.get("labelWidth")));
        setHeightBtwLabel(convertToBigDecimal(mapValue.get("heightBtwLabel")));
        setWidthBtwLabel(convertToBigDecimal(mapValue.get("widthBtwLabel")));
        setPageWidth(convertToBigDecimal(mapValue.get("pageWidth")));
        setPageHeight(convertToBigDecimal(mapValue.get("pageHeight")));
        setContinuousFeed((String) mapValue.get("continuousFeed"));
        setUomId((String) mapValue.get("uomId"));
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
        mapValue.put("addressLabelId", getAddressLabelId());
        mapValue.put("description", getDescription());
        mapValue.put("topMargin", getTopMargin());
        mapValue.put("bottomMargin", getBottomMargin());
        mapValue.put("leftMargin", getLeftMargin());
        mapValue.put("rightMargin", getRightMargin());
        mapValue.put("pageColumns", getPageColumns());
        mapValue.put("pageRows", getPageRows());
        mapValue.put("labelHeight", getLabelHeight());
        mapValue.put("labelWidth", getLabelWidth());
        mapValue.put("heightBtwLabel", getHeightBtwLabel());
        mapValue.put("widthBtwLabel", getWidthBtwLabel());
        mapValue.put("pageWidth", getPageWidth());
        mapValue.put("pageHeight", getPageHeight());
        mapValue.put("continuousFeed", getContinuousFeed());
        mapValue.put("uomId", getUomId());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}
