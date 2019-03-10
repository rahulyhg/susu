package org.opentaps.base.services;

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

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Update a Fixed Asset.
 * Auto generated base service entity updateFixedAsset.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/fixedasset/FixedAssetServices.xml
 * Invoke: updateFixedAsset
 * Defined in: applications/accounting/servicedef/services_fixedasset.xml
 */
public class UpdateFixedAssetService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateFixedAsset";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        acquireOrderId("acquireOrderId"),
        acquireOrderItemSeqId("acquireOrderItemSeqId"),
        actualEndOfLife("actualEndOfLife"),
        calendarId("calendarId"),
        classEnumId("classEnumId"),
        dateAcquired("dateAcquired"),
        dateLastServiced("dateLastServiced"),
        dateNextService("dateNextService"),
        depreciation("depreciation"),
        expectedEndOfLife("expectedEndOfLife"),
        fixedAssetId("fixedAssetId"),
        fixedAssetName("fixedAssetName"),
        fixedAssetTypeId("fixedAssetTypeId"),
        instanceOfProductId("instanceOfProductId"),
        locale("locale"),
        locatedAtFacilityId("locatedAtFacilityId"),
        locatedAtLocationSeqId("locatedAtLocationSeqId"),
        parentFixedAssetId("parentFixedAssetId"),
        partyId("partyId"),
        productionCapacity("productionCapacity"),
        purchaseCost("purchaseCost"),
        purchaseCostUomId("purchaseCostUomId"),
        roleTypeId("roleTypeId"),
        salvageValue("salvageValue"),
        serialNumber("serialNumber"),
        timeZone("timeZone"),
        uomId("uomId"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateFixedAssetService</code> instance.
     */
    public UpdateFixedAssetService() {
        super();
    }

    /**
     * Creates a new <code>UpdateFixedAssetService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateFixedAssetService(User user) {
        super(user);
    }

    private String inAcquireOrderId;
    private String inAcquireOrderItemSeqId;
    private Date inActualEndOfLife;
    private String inCalendarId;
    private String inClassEnumId;
    private Timestamp inDateAcquired;
    private Timestamp inDateLastServiced;
    private Timestamp inDateNextService;
    private BigDecimal inDepreciation;
    private Date inExpectedEndOfLife;
    private String inFixedAssetId;
    private String inFixedAssetName;
    private String inFixedAssetTypeId;
    private String inInstanceOfProductId;
    private Locale inLocale;
    private String inLocatedAtFacilityId;
    private String inLocatedAtLocationSeqId;
    private String inParentFixedAssetId;
    private String inPartyId;
    private BigDecimal inProductionCapacity;
    private BigDecimal inPurchaseCost;
    private String inPurchaseCostUomId;
    private String inRoleTypeId;
    private BigDecimal inSalvageValue;
    private String inSerialNumber;
    private TimeZone inTimeZone;
    private String inUomId;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcquireOrderId() {
        return this.inAcquireOrderId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAcquireOrderItemSeqId() {
        return this.inAcquireOrderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Date</code>
     */
    public Date getInActualEndOfLife() {
        return this.inActualEndOfLife;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCalendarId() {
        return this.inCalendarId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInClassEnumId() {
        return this.inClassEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDateAcquired() {
        return this.inDateAcquired;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDateLastServiced() {
        return this.inDateLastServiced;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInDateNextService() {
        return this.inDateNextService;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInDepreciation() {
        return this.inDepreciation;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Date</code>
     */
    public Date getInExpectedEndOfLife() {
        return this.inExpectedEndOfLife;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFixedAssetId() {
        return this.inFixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFixedAssetName() {
        return this.inFixedAssetName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFixedAssetTypeId() {
        return this.inFixedAssetTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInInstanceOfProductId() {
        return this.inInstanceOfProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLocatedAtFacilityId() {
        return this.inLocatedAtFacilityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLocatedAtLocationSeqId() {
        return this.inLocatedAtLocationSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInParentFixedAssetId() {
        return this.inParentFixedAssetId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInProductionCapacity() {
        return this.inProductionCapacity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPurchaseCost() {
        return this.inPurchaseCost;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPurchaseCostUomId() {
        return this.inPurchaseCostUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInSalvageValue() {
        return this.inSalvageValue;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSerialNumber() {
        return this.inSerialNumber;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getInTimeZone() {
        return this.inTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUomId() {
        return this.inUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInUserLogin() {
        return this.inUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutErrorMessage() {
        return this.outErrorMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutErrorMessageList() {
        return this.outErrorMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Locale</code>
     */
    public Locale getOutLocale() {
        return this.outLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutResponseMessage() {
        return this.outResponseMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutSuccessMessage() {
        return this.outSuccessMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getOutSuccessMessageList() {
        return this.outSuccessMessageList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>TimeZone</code>
     */
    public TimeZone getOutTimeZone() {
        return this.outTimeZone;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcquireOrderId the inAcquireOrderId to set
    */
    public void setInAcquireOrderId(String inAcquireOrderId) {
        this.inParameters.add("acquireOrderId");
        this.inAcquireOrderId = inAcquireOrderId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAcquireOrderItemSeqId the inAcquireOrderItemSeqId to set
    */
    public void setInAcquireOrderItemSeqId(String inAcquireOrderItemSeqId) {
        this.inParameters.add("acquireOrderItemSeqId");
        this.inAcquireOrderItemSeqId = inAcquireOrderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inActualEndOfLife the inActualEndOfLife to set
    */
    public void setInActualEndOfLife(Date inActualEndOfLife) {
        this.inParameters.add("actualEndOfLife");
        this.inActualEndOfLife = inActualEndOfLife;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCalendarId the inCalendarId to set
    */
    public void setInCalendarId(String inCalendarId) {
        this.inParameters.add("calendarId");
        this.inCalendarId = inCalendarId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inClassEnumId the inClassEnumId to set
    */
    public void setInClassEnumId(String inClassEnumId) {
        this.inParameters.add("classEnumId");
        this.inClassEnumId = inClassEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDateAcquired the inDateAcquired to set
    */
    public void setInDateAcquired(Timestamp inDateAcquired) {
        this.inParameters.add("dateAcquired");
        this.inDateAcquired = inDateAcquired;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDateLastServiced the inDateLastServiced to set
    */
    public void setInDateLastServiced(Timestamp inDateLastServiced) {
        this.inParameters.add("dateLastServiced");
        this.inDateLastServiced = inDateLastServiced;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDateNextService the inDateNextService to set
    */
    public void setInDateNextService(Timestamp inDateNextService) {
        this.inParameters.add("dateNextService");
        this.inDateNextService = inDateNextService;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDepreciation the inDepreciation to set
    */
    public void setInDepreciation(BigDecimal inDepreciation) {
        this.inParameters.add("depreciation");
        this.inDepreciation = inDepreciation;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExpectedEndOfLife the inExpectedEndOfLife to set
    */
    public void setInExpectedEndOfLife(Date inExpectedEndOfLife) {
        this.inParameters.add("expectedEndOfLife");
        this.inExpectedEndOfLife = inExpectedEndOfLife;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFixedAssetId the inFixedAssetId to set
    */
    public void setInFixedAssetId(String inFixedAssetId) {
        this.inParameters.add("fixedAssetId");
        this.inFixedAssetId = inFixedAssetId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFixedAssetName the inFixedAssetName to set
    */
    public void setInFixedAssetName(String inFixedAssetName) {
        this.inParameters.add("fixedAssetName");
        this.inFixedAssetName = inFixedAssetName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFixedAssetTypeId the inFixedAssetTypeId to set
    */
    public void setInFixedAssetTypeId(String inFixedAssetTypeId) {
        this.inParameters.add("fixedAssetTypeId");
        this.inFixedAssetTypeId = inFixedAssetTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inInstanceOfProductId the inInstanceOfProductId to set
    */
    public void setInInstanceOfProductId(String inInstanceOfProductId) {
        this.inParameters.add("instanceOfProductId");
        this.inInstanceOfProductId = inInstanceOfProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocatedAtFacilityId the inLocatedAtFacilityId to set
    */
    public void setInLocatedAtFacilityId(String inLocatedAtFacilityId) {
        this.inParameters.add("locatedAtFacilityId");
        this.inLocatedAtFacilityId = inLocatedAtFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocatedAtLocationSeqId the inLocatedAtLocationSeqId to set
    */
    public void setInLocatedAtLocationSeqId(String inLocatedAtLocationSeqId) {
        this.inParameters.add("locatedAtLocationSeqId");
        this.inLocatedAtLocationSeqId = inLocatedAtLocationSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inParentFixedAssetId the inParentFixedAssetId to set
    */
    public void setInParentFixedAssetId(String inParentFixedAssetId) {
        this.inParameters.add("parentFixedAssetId");
        this.inParentFixedAssetId = inParentFixedAssetId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductionCapacity the inProductionCapacity to set
    */
    public void setInProductionCapacity(BigDecimal inProductionCapacity) {
        this.inParameters.add("productionCapacity");
        this.inProductionCapacity = inProductionCapacity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPurchaseCost the inPurchaseCost to set
    */
    public void setInPurchaseCost(BigDecimal inPurchaseCost) {
        this.inParameters.add("purchaseCost");
        this.inPurchaseCost = inPurchaseCost;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPurchaseCostUomId the inPurchaseCostUomId to set
    */
    public void setInPurchaseCostUomId(String inPurchaseCostUomId) {
        this.inParameters.add("purchaseCostUomId");
        this.inPurchaseCostUomId = inPurchaseCostUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSalvageValue the inSalvageValue to set
    */
    public void setInSalvageValue(BigDecimal inSalvageValue) {
        this.inParameters.add("salvageValue");
        this.inSalvageValue = inSalvageValue;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSerialNumber the inSerialNumber to set
    */
    public void setInSerialNumber(String inSerialNumber) {
        this.inParameters.add("serialNumber");
        this.inSerialNumber = inSerialNumber;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTimeZone the inTimeZone to set
    */
    public void setInTimeZone(TimeZone inTimeZone) {
        this.inParameters.add("timeZone");
        this.inTimeZone = inTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUomId the inUomId to set
    */
    public void setInUomId(String inUomId) {
        this.inParameters.add("uomId");
        this.inUomId = inUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUserLogin the inUserLogin to set
    */
    public void setInUserLogin(GenericValue inUserLogin) {
        this.inParameters.add("userLogin");
        this.inUserLogin = inUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessage the outErrorMessage to set
    */
    public void setOutErrorMessage(String outErrorMessage) {
        this.outParameters.add("errorMessage");
        this.outErrorMessage = outErrorMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outErrorMessageList the outErrorMessageList to set
    */
    public void setOutErrorMessageList(List outErrorMessageList) {
        this.outParameters.add("errorMessageList");
        this.outErrorMessageList = outErrorMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outLocale the outLocale to set
    */
    public void setOutLocale(Locale outLocale) {
        this.outParameters.add("locale");
        this.outLocale = outLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outResponseMessage the outResponseMessage to set
    */
    public void setOutResponseMessage(String outResponseMessage) {
        this.outParameters.add("responseMessage");
        this.outResponseMessage = outResponseMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessage the outSuccessMessage to set
    */
    public void setOutSuccessMessage(String outSuccessMessage) {
        this.outParameters.add("successMessage");
        this.outSuccessMessage = outSuccessMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outSuccessMessageList the outSuccessMessageList to set
    */
    public void setOutSuccessMessageList(List outSuccessMessageList) {
        this.outParameters.add("successMessageList");
        this.outSuccessMessageList = outSuccessMessageList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outTimeZone the outTimeZone to set
    */
    public void setOutTimeZone(TimeZone outTimeZone) {
        this.outParameters.add("timeZone");
        this.outTimeZone = outTimeZone;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outUserLogin the outUserLogin to set
    */
    public void setOutUserLogin(GenericValue outUserLogin) {
        this.outParameters.add("userLogin");
        this.outUserLogin = outUserLogin;
    }

    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (inParameters.contains("acquireOrderId")) mapValue.put("acquireOrderId", getInAcquireOrderId());
        if (inParameters.contains("acquireOrderItemSeqId")) mapValue.put("acquireOrderItemSeqId", getInAcquireOrderItemSeqId());
        if (inParameters.contains("actualEndOfLife")) mapValue.put("actualEndOfLife", getInActualEndOfLife());
        if (inParameters.contains("calendarId")) mapValue.put("calendarId", getInCalendarId());
        if (inParameters.contains("classEnumId")) mapValue.put("classEnumId", getInClassEnumId());
        if (inParameters.contains("dateAcquired")) mapValue.put("dateAcquired", getInDateAcquired());
        if (inParameters.contains("dateLastServiced")) mapValue.put("dateLastServiced", getInDateLastServiced());
        if (inParameters.contains("dateNextService")) mapValue.put("dateNextService", getInDateNextService());
        if (inParameters.contains("depreciation")) mapValue.put("depreciation", getInDepreciation());
        if (inParameters.contains("expectedEndOfLife")) mapValue.put("expectedEndOfLife", getInExpectedEndOfLife());
        if (inParameters.contains("fixedAssetId")) mapValue.put("fixedAssetId", getInFixedAssetId());
        if (inParameters.contains("fixedAssetName")) mapValue.put("fixedAssetName", getInFixedAssetName());
        if (inParameters.contains("fixedAssetTypeId")) mapValue.put("fixedAssetTypeId", getInFixedAssetTypeId());
        if (inParameters.contains("instanceOfProductId")) mapValue.put("instanceOfProductId", getInInstanceOfProductId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("locatedAtFacilityId")) mapValue.put("locatedAtFacilityId", getInLocatedAtFacilityId());
        if (inParameters.contains("locatedAtLocationSeqId")) mapValue.put("locatedAtLocationSeqId", getInLocatedAtLocationSeqId());
        if (inParameters.contains("parentFixedAssetId")) mapValue.put("parentFixedAssetId", getInParentFixedAssetId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productionCapacity")) mapValue.put("productionCapacity", getInProductionCapacity());
        if (inParameters.contains("purchaseCost")) mapValue.put("purchaseCost", getInPurchaseCost());
        if (inParameters.contains("purchaseCostUomId")) mapValue.put("purchaseCostUomId", getInPurchaseCostUomId());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("salvageValue")) mapValue.put("salvageValue", getInSalvageValue());
        if (inParameters.contains("serialNumber")) mapValue.put("serialNumber", getInSerialNumber());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("uomId")) mapValue.put("uomId", getInUomId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("acquireOrderId")) setInAcquireOrderId((String) mapValue.get("acquireOrderId"));
        if (mapValue.containsKey("acquireOrderItemSeqId")) setInAcquireOrderItemSeqId((String) mapValue.get("acquireOrderItemSeqId"));
        if (mapValue.containsKey("actualEndOfLife")) setInActualEndOfLife((Date) mapValue.get("actualEndOfLife"));
        if (mapValue.containsKey("calendarId")) setInCalendarId((String) mapValue.get("calendarId"));
        if (mapValue.containsKey("classEnumId")) setInClassEnumId((String) mapValue.get("classEnumId"));
        if (mapValue.containsKey("dateAcquired")) setInDateAcquired((Timestamp) mapValue.get("dateAcquired"));
        if (mapValue.containsKey("dateLastServiced")) setInDateLastServiced((Timestamp) mapValue.get("dateLastServiced"));
        if (mapValue.containsKey("dateNextService")) setInDateNextService((Timestamp) mapValue.get("dateNextService"));
        if (mapValue.containsKey("depreciation")) setInDepreciation((BigDecimal) mapValue.get("depreciation"));
        if (mapValue.containsKey("expectedEndOfLife")) setInExpectedEndOfLife((Date) mapValue.get("expectedEndOfLife"));
        if (mapValue.containsKey("fixedAssetId")) setInFixedAssetId((String) mapValue.get("fixedAssetId"));
        if (mapValue.containsKey("fixedAssetName")) setInFixedAssetName((String) mapValue.get("fixedAssetName"));
        if (mapValue.containsKey("fixedAssetTypeId")) setInFixedAssetTypeId((String) mapValue.get("fixedAssetTypeId"));
        if (mapValue.containsKey("instanceOfProductId")) setInInstanceOfProductId((String) mapValue.get("instanceOfProductId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("locatedAtFacilityId")) setInLocatedAtFacilityId((String) mapValue.get("locatedAtFacilityId"));
        if (mapValue.containsKey("locatedAtLocationSeqId")) setInLocatedAtLocationSeqId((String) mapValue.get("locatedAtLocationSeqId"));
        if (mapValue.containsKey("parentFixedAssetId")) setInParentFixedAssetId((String) mapValue.get("parentFixedAssetId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productionCapacity")) setInProductionCapacity((BigDecimal) mapValue.get("productionCapacity"));
        if (mapValue.containsKey("purchaseCost")) setInPurchaseCost((BigDecimal) mapValue.get("purchaseCost"));
        if (mapValue.containsKey("purchaseCostUomId")) setInPurchaseCostUomId((String) mapValue.get("purchaseCostUomId"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("salvageValue")) setInSalvageValue((BigDecimal) mapValue.get("salvageValue"));
        if (mapValue.containsKey("serialNumber")) setInSerialNumber((String) mapValue.get("serialNumber"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("uomId")) setInUomId((String) mapValue.get("uomId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateFixedAssetService</code> from the input values of the given <code>UpdateFixedAssetService</code>.
     * @param input a <code>UpdateFixedAssetService</code>
     */
    public static UpdateFixedAssetService fromInput(UpdateFixedAssetService input) {
        UpdateFixedAssetService service = new UpdateFixedAssetService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateFixedAssetService</code> from the output values of the given <code>UpdateFixedAssetService</code>.
     * @param output a <code>UpdateFixedAssetService</code>
     */
    public static UpdateFixedAssetService fromOutput(UpdateFixedAssetService output) {
        UpdateFixedAssetService service = new UpdateFixedAssetService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateFixedAssetService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateFixedAssetService fromInput(Map<String, Object> mapValue) {
        UpdateFixedAssetService service = new UpdateFixedAssetService();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>UpdateFixedAssetService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateFixedAssetService fromOutput(Map<String, Object> mapValue) {
        UpdateFixedAssetService service = new UpdateFixedAssetService();
        service.putAllOutput(mapValue);
        return service;
    }
}
