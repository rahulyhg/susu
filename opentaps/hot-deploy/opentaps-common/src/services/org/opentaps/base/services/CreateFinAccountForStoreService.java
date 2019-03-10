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
 * Creates a new FinAccount, using defaults from the ProductStoreFinActSetting for expiration date and to generate an automatic account code.
            Note this would override any user values for from, thru, and acount code.
 * Auto generated base service entity createFinAccountForStore.
 *
 * Engine: java
 * Location: org.ofbiz.accounting.finaccount.FinAccountServices
 * Invoke: createFinAccountForStore
 * Defined in: applications/accounting/servicedef/services_finaccount.xml
 */
public class CreateFinAccountForStoreService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createFinAccountForStore";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        actualBalance("actualBalance"),
        availableBalance("availableBalance"),
        currencyUomId("currencyUomId"),
        finAccountCode("finAccountCode"),
        finAccountName("finAccountName"),
        finAccountPin("finAccountPin"),
        finAccountTypeId("finAccountTypeId"),
        fromDate("fromDate"),
        isRefundable("isRefundable"),
        locale("locale"),
        organizationPartyId("organizationPartyId"),
        ownerPartyId("ownerPartyId"),
        postToGlAccountId("postToGlAccountId"),
        productStoreId("productStoreId"),
        replenishLevel("replenishLevel"),
        replenishPaymentId("replenishPaymentId"),
        statusId("statusId"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        finAccountCode("finAccountCode"),
        finAccountId("finAccountId"),
        finAccountPin("finAccountPin"),
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
     * Creates a new <code>CreateFinAccountForStoreService</code> instance.
     */
    public CreateFinAccountForStoreService() {
        super();
    }


    private BigDecimal inActualBalance;
    private BigDecimal inAvailableBalance;
    private String inCurrencyUomId;
    private String inFinAccountCode;
    private String inFinAccountName;
    private String inFinAccountPin;
    private String inFinAccountTypeId;
    private Timestamp inFromDate;
    private String inIsRefundable;
    private Locale inLocale;
    private String inOrganizationPartyId;
    private String inOwnerPartyId;
    private String inPostToGlAccountId;
    private String inProductStoreId;
    private BigDecimal inReplenishLevel;
    private String inReplenishPaymentId;
    private String inStatusId;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private String outFinAccountCode;
    private String outFinAccountId;
    private String outFinAccountPin;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInActualBalance() {
        return this.inActualBalance;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAvailableBalance() {
        return this.inAvailableBalance;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrencyUomId() {
        return this.inCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFinAccountCode() {
        return this.inFinAccountCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFinAccountName() {
        return this.inFinAccountName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFinAccountPin() {
        return this.inFinAccountPin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFinAccountTypeId() {
        return this.inFinAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsRefundable() {
        return this.inIsRefundable;
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
    public String getInOrganizationPartyId() {
        return this.inOrganizationPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOwnerPartyId() {
        return this.inOwnerPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPostToGlAccountId() {
        return this.inPostToGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInReplenishLevel() {
        return this.inReplenishLevel;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReplenishPaymentId() {
        return this.inReplenishPaymentId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInThruDate() {
        return this.inThruDate;
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
     * @return <code>String</code>
     */
    public String getOutFinAccountCode() {
        return this.outFinAccountCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutFinAccountId() {
        return this.outFinAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutFinAccountPin() {
        return this.outFinAccountPin;
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
     * @param inActualBalance the inActualBalance to set
    */
    public void setInActualBalance(BigDecimal inActualBalance) {
        this.inParameters.add("actualBalance");
        this.inActualBalance = inActualBalance;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAvailableBalance the inAvailableBalance to set
    */
    public void setInAvailableBalance(BigDecimal inAvailableBalance) {
        this.inParameters.add("availableBalance");
        this.inAvailableBalance = inAvailableBalance;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrencyUomId the inCurrencyUomId to set
    */
    public void setInCurrencyUomId(String inCurrencyUomId) {
        this.inParameters.add("currencyUomId");
        this.inCurrencyUomId = inCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFinAccountCode the inFinAccountCode to set
    */
    public void setInFinAccountCode(String inFinAccountCode) {
        this.inParameters.add("finAccountCode");
        this.inFinAccountCode = inFinAccountCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFinAccountName the inFinAccountName to set
    */
    public void setInFinAccountName(String inFinAccountName) {
        this.inParameters.add("finAccountName");
        this.inFinAccountName = inFinAccountName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFinAccountPin the inFinAccountPin to set
    */
    public void setInFinAccountPin(String inFinAccountPin) {
        this.inParameters.add("finAccountPin");
        this.inFinAccountPin = inFinAccountPin;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFinAccountTypeId the inFinAccountTypeId to set
    */
    public void setInFinAccountTypeId(String inFinAccountTypeId) {
        this.inParameters.add("finAccountTypeId");
        this.inFinAccountTypeId = inFinAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsRefundable the inIsRefundable to set
    */
    public void setInIsRefundable(String inIsRefundable) {
        this.inParameters.add("isRefundable");
        this.inIsRefundable = inIsRefundable;
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
     * @param inOrganizationPartyId the inOrganizationPartyId to set
    */
    public void setInOrganizationPartyId(String inOrganizationPartyId) {
        this.inParameters.add("organizationPartyId");
        this.inOrganizationPartyId = inOrganizationPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOwnerPartyId the inOwnerPartyId to set
    */
    public void setInOwnerPartyId(String inOwnerPartyId) {
        this.inParameters.add("ownerPartyId");
        this.inOwnerPartyId = inOwnerPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostToGlAccountId the inPostToGlAccountId to set
    */
    public void setInPostToGlAccountId(String inPostToGlAccountId) {
        this.inParameters.add("postToGlAccountId");
        this.inPostToGlAccountId = inPostToGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReplenishLevel the inReplenishLevel to set
    */
    public void setInReplenishLevel(BigDecimal inReplenishLevel) {
        this.inParameters.add("replenishLevel");
        this.inReplenishLevel = inReplenishLevel;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReplenishPaymentId the inReplenishPaymentId to set
    */
    public void setInReplenishPaymentId(String inReplenishPaymentId) {
        this.inParameters.add("replenishPaymentId");
        this.inReplenishPaymentId = inReplenishPaymentId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(Timestamp inThruDate) {
        this.inParameters.add("thruDate");
        this.inThruDate = inThruDate;
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
     * @param outFinAccountCode the outFinAccountCode to set
    */
    public void setOutFinAccountCode(String outFinAccountCode) {
        this.outParameters.add("finAccountCode");
        this.outFinAccountCode = outFinAccountCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outFinAccountId the outFinAccountId to set
    */
    public void setOutFinAccountId(String outFinAccountId) {
        this.outParameters.add("finAccountId");
        this.outFinAccountId = outFinAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outFinAccountPin the outFinAccountPin to set
    */
    public void setOutFinAccountPin(String outFinAccountPin) {
        this.outParameters.add("finAccountPin");
        this.outFinAccountPin = outFinAccountPin;
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
        if (inParameters.contains("actualBalance")) mapValue.put("actualBalance", getInActualBalance());
        if (inParameters.contains("availableBalance")) mapValue.put("availableBalance", getInAvailableBalance());
        if (inParameters.contains("currencyUomId")) mapValue.put("currencyUomId", getInCurrencyUomId());
        if (inParameters.contains("finAccountCode")) mapValue.put("finAccountCode", getInFinAccountCode());
        if (inParameters.contains("finAccountName")) mapValue.put("finAccountName", getInFinAccountName());
        if (inParameters.contains("finAccountPin")) mapValue.put("finAccountPin", getInFinAccountPin());
        if (inParameters.contains("finAccountTypeId")) mapValue.put("finAccountTypeId", getInFinAccountTypeId());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("isRefundable")) mapValue.put("isRefundable", getInIsRefundable());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("organizationPartyId")) mapValue.put("organizationPartyId", getInOrganizationPartyId());
        if (inParameters.contains("ownerPartyId")) mapValue.put("ownerPartyId", getInOwnerPartyId());
        if (inParameters.contains("postToGlAccountId")) mapValue.put("postToGlAccountId", getInPostToGlAccountId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("replenishLevel")) mapValue.put("replenishLevel", getInReplenishLevel());
        if (inParameters.contains("replenishPaymentId")) mapValue.put("replenishPaymentId", getInReplenishPaymentId());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
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
        if (outParameters.contains("finAccountCode")) mapValue.put("finAccountCode", getOutFinAccountCode());
        if (outParameters.contains("finAccountId")) mapValue.put("finAccountId", getOutFinAccountId());
        if (outParameters.contains("finAccountPin")) mapValue.put("finAccountPin", getOutFinAccountPin());
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
        if (mapValue.containsKey("actualBalance")) setInActualBalance((BigDecimal) mapValue.get("actualBalance"));
        if (mapValue.containsKey("availableBalance")) setInAvailableBalance((BigDecimal) mapValue.get("availableBalance"));
        if (mapValue.containsKey("currencyUomId")) setInCurrencyUomId((String) mapValue.get("currencyUomId"));
        if (mapValue.containsKey("finAccountCode")) setInFinAccountCode((String) mapValue.get("finAccountCode"));
        if (mapValue.containsKey("finAccountName")) setInFinAccountName((String) mapValue.get("finAccountName"));
        if (mapValue.containsKey("finAccountPin")) setInFinAccountPin((String) mapValue.get("finAccountPin"));
        if (mapValue.containsKey("finAccountTypeId")) setInFinAccountTypeId((String) mapValue.get("finAccountTypeId"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("isRefundable")) setInIsRefundable((String) mapValue.get("isRefundable"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("organizationPartyId")) setInOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        if (mapValue.containsKey("ownerPartyId")) setInOwnerPartyId((String) mapValue.get("ownerPartyId"));
        if (mapValue.containsKey("postToGlAccountId")) setInPostToGlAccountId((String) mapValue.get("postToGlAccountId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("replenishLevel")) setInReplenishLevel((BigDecimal) mapValue.get("replenishLevel"));
        if (mapValue.containsKey("replenishPaymentId")) setInReplenishPaymentId((String) mapValue.get("replenishPaymentId"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("finAccountCode")) setOutFinAccountCode((String) mapValue.get("finAccountCode"));
        if (mapValue.containsKey("finAccountId")) setOutFinAccountId((String) mapValue.get("finAccountId"));
        if (mapValue.containsKey("finAccountPin")) setOutFinAccountPin((String) mapValue.get("finAccountPin"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateFinAccountForStoreService</code> from the input values of the given <code>CreateFinAccountForStoreService</code>.
     * @param input a <code>CreateFinAccountForStoreService</code>
     */
    public static CreateFinAccountForStoreService fromInput(CreateFinAccountForStoreService input) {
        CreateFinAccountForStoreService service = new CreateFinAccountForStoreService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateFinAccountForStoreService</code> from the output values of the given <code>CreateFinAccountForStoreService</code>.
     * @param output a <code>CreateFinAccountForStoreService</code>
     */
    public static CreateFinAccountForStoreService fromOutput(CreateFinAccountForStoreService output) {
        CreateFinAccountForStoreService service = new CreateFinAccountForStoreService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateFinAccountForStoreService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateFinAccountForStoreService fromInput(Map<String, Object> mapValue) {
        CreateFinAccountForStoreService service = new CreateFinAccountForStoreService();
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
     * Construct a <code>CreateFinAccountForStoreService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateFinAccountForStoreService fromOutput(Map<String, Object> mapValue) {
        CreateFinAccountForStoreService service = new CreateFinAccountForStoreService();
        service.putAllOutput(mapValue);
        return service;
    }
}
