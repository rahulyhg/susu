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
 * Finds and returns a List of AcctgTransAndEntries based on organizationPartyId, fromDate, thruDate, fiscalTypeId,
            subject to the glAccountClassIds in the glAccountClasses List or the glAccountTypeIds in the glAccountTypes List.
            Optional productId and partyId allow you to do analysis at the product or customer level..
 * Auto generated base service entity getAcctgTransAndEntriesByType.
 *
 * Engine: java
 * Location: com.opensourcestrategies.financials.financials.FinancialServices
 * Invoke: getAcctgTransAndEntriesByType
 * Defined in: hot-deploy/financials/servicedef/services_financials.xml
 */
public class GetAcctgTransAndEntriesByTypeService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getAcctgTransAndEntriesByType";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.FALSE;

    /** The enumeration of input parameters. */
    public static enum In {
        accountingTagUsage("accountingTagUsage"),
        fromDate("fromDate"),
        glAccountClasses("glAccountClasses"),
        glAccountTypes("glAccountTypes"),
        glFiscalTypeId("glFiscalTypeId"),
        ignoreAcctgTransTypeIds("ignoreAcctgTransTypeIds"),
        locale("locale"),
        organizationPartyId("organizationPartyId"),
        partyId("partyId"),
        productId("productId"),
        tag1("tag1"),
        tag10("tag10"),
        tag2("tag2"),
        tag3("tag3"),
        tag4("tag4"),
        tag5("tag5"),
        tag6("tag6"),
        tag7("tag7"),
        tag8("tag8"),
        tag9("tag9"),
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
        locale("locale"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        transactionEntries("transactionEntries"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetAcctgTransAndEntriesByTypeService</code> instance.
     */
    public GetAcctgTransAndEntriesByTypeService() {
        super();
    }

    /**
     * Creates a new <code>GetAcctgTransAndEntriesByTypeService</code> instance.
     * @param user an <code>User</code> value
     */
    public GetAcctgTransAndEntriesByTypeService(User user) {
        super(user);
    }

    private String inAccountingTagUsage;
    private Timestamp inFromDate;
    private List inGlAccountClasses;
    private List inGlAccountTypes;
    private String inGlFiscalTypeId;
    private List inIgnoreAcctgTransTypeIds;
    private Locale inLocale;
    private String inOrganizationPartyId;
    private String inPartyId;
    private String inProductId;
    private String inTag1;
    private String inTag10;
    private String inTag2;
    private String inTag3;
    private String inTag4;
    private String inTag5;
    private String inTag6;
    private String inTag7;
    private String inTag8;
    private String inTag9;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private List outTransactionEntries;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAccountingTagUsage() {
        return this.inAccountingTagUsage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInGlAccountClasses() {
        return this.inGlAccountClasses;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInGlAccountTypes() {
        return this.inGlAccountTypes;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInGlFiscalTypeId() {
        return this.inGlFiscalTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInIgnoreAcctgTransTypeIds() {
        return this.inIgnoreAcctgTransTypeIds;
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
     * This parameter is required.
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag1() {
        return this.inTag1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag10() {
        return this.inTag10;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag2() {
        return this.inTag2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag3() {
        return this.inTag3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag4() {
        return this.inTag4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag5() {
        return this.inTag5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag6() {
        return this.inTag6;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag7() {
        return this.inTag7;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag8() {
        return this.inTag8;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTag9() {
        return this.inTag9;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
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
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getOutTransactionEntries() {
        return this.outTransactionEntries;
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
     * @param inAccountingTagUsage the inAccountingTagUsage to set
    */
    public void setInAccountingTagUsage(String inAccountingTagUsage) {
        this.inParameters.add("accountingTagUsage");
        this.inAccountingTagUsage = inAccountingTagUsage;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlAccountClasses the inGlAccountClasses to set
    */
    public void setInGlAccountClasses(List inGlAccountClasses) {
        this.inParameters.add("glAccountClasses");
        this.inGlAccountClasses = inGlAccountClasses;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlAccountTypes the inGlAccountTypes to set
    */
    public void setInGlAccountTypes(List inGlAccountTypes) {
        this.inParameters.add("glAccountTypes");
        this.inGlAccountTypes = inGlAccountTypes;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inGlFiscalTypeId the inGlFiscalTypeId to set
    */
    public void setInGlFiscalTypeId(String inGlFiscalTypeId) {
        this.inParameters.add("glFiscalTypeId");
        this.inGlFiscalTypeId = inGlFiscalTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIgnoreAcctgTransTypeIds the inIgnoreAcctgTransTypeIds to set
    */
    public void setInIgnoreAcctgTransTypeIds(List inIgnoreAcctgTransTypeIds) {
        this.inParameters.add("ignoreAcctgTransTypeIds");
        this.inIgnoreAcctgTransTypeIds = inIgnoreAcctgTransTypeIds;
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
     * This parameter is required.
     * @param inOrganizationPartyId the inOrganizationPartyId to set
    */
    public void setInOrganizationPartyId(String inOrganizationPartyId) {
        this.inParameters.add("organizationPartyId");
        this.inOrganizationPartyId = inOrganizationPartyId;
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
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag1 the inTag1 to set
    */
    public void setInTag1(String inTag1) {
        this.inParameters.add("tag1");
        this.inTag1 = inTag1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag10 the inTag10 to set
    */
    public void setInTag10(String inTag10) {
        this.inParameters.add("tag10");
        this.inTag10 = inTag10;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag2 the inTag2 to set
    */
    public void setInTag2(String inTag2) {
        this.inParameters.add("tag2");
        this.inTag2 = inTag2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag3 the inTag3 to set
    */
    public void setInTag3(String inTag3) {
        this.inParameters.add("tag3");
        this.inTag3 = inTag3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag4 the inTag4 to set
    */
    public void setInTag4(String inTag4) {
        this.inParameters.add("tag4");
        this.inTag4 = inTag4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag5 the inTag5 to set
    */
    public void setInTag5(String inTag5) {
        this.inParameters.add("tag5");
        this.inTag5 = inTag5;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag6 the inTag6 to set
    */
    public void setInTag6(String inTag6) {
        this.inParameters.add("tag6");
        this.inTag6 = inTag6;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag7 the inTag7 to set
    */
    public void setInTag7(String inTag7) {
        this.inParameters.add("tag7");
        this.inTag7 = inTag7;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag8 the inTag8 to set
    */
    public void setInTag8(String inTag8) {
        this.inParameters.add("tag8");
        this.inTag8 = inTag8;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTag9 the inTag9 to set
    */
    public void setInTag9(String inTag9) {
        this.inParameters.add("tag9");
        this.inTag9 = inTag9;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
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
     * This parameter is required.
     * @param outTransactionEntries the outTransactionEntries to set
    */
    public void setOutTransactionEntries(List outTransactionEntries) {
        this.outParameters.add("transactionEntries");
        this.outTransactionEntries = outTransactionEntries;
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
        if (inParameters.contains("accountingTagUsage")) mapValue.put("accountingTagUsage", getInAccountingTagUsage());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("glAccountClasses")) mapValue.put("glAccountClasses", getInGlAccountClasses());
        if (inParameters.contains("glAccountTypes")) mapValue.put("glAccountTypes", getInGlAccountTypes());
        if (inParameters.contains("glFiscalTypeId")) mapValue.put("glFiscalTypeId", getInGlFiscalTypeId());
        if (inParameters.contains("ignoreAcctgTransTypeIds")) mapValue.put("ignoreAcctgTransTypeIds", getInIgnoreAcctgTransTypeIds());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("organizationPartyId")) mapValue.put("organizationPartyId", getInOrganizationPartyId());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("tag1")) mapValue.put("tag1", getInTag1());
        if (inParameters.contains("tag10")) mapValue.put("tag10", getInTag10());
        if (inParameters.contains("tag2")) mapValue.put("tag2", getInTag2());
        if (inParameters.contains("tag3")) mapValue.put("tag3", getInTag3());
        if (inParameters.contains("tag4")) mapValue.put("tag4", getInTag4());
        if (inParameters.contains("tag5")) mapValue.put("tag5", getInTag5());
        if (inParameters.contains("tag6")) mapValue.put("tag6", getInTag6());
        if (inParameters.contains("tag7")) mapValue.put("tag7", getInTag7());
        if (inParameters.contains("tag8")) mapValue.put("tag8", getInTag8());
        if (inParameters.contains("tag9")) mapValue.put("tag9", getInTag9());
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
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("transactionEntries")) mapValue.put("transactionEntries", getOutTransactionEntries());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("accountingTagUsage")) setInAccountingTagUsage((String) mapValue.get("accountingTagUsage"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("glAccountClasses")) setInGlAccountClasses((List) mapValue.get("glAccountClasses"));
        if (mapValue.containsKey("glAccountTypes")) setInGlAccountTypes((List) mapValue.get("glAccountTypes"));
        if (mapValue.containsKey("glFiscalTypeId")) setInGlFiscalTypeId((String) mapValue.get("glFiscalTypeId"));
        if (mapValue.containsKey("ignoreAcctgTransTypeIds")) setInIgnoreAcctgTransTypeIds((List) mapValue.get("ignoreAcctgTransTypeIds"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("organizationPartyId")) setInOrganizationPartyId((String) mapValue.get("organizationPartyId"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("tag1")) setInTag1((String) mapValue.get("tag1"));
        if (mapValue.containsKey("tag10")) setInTag10((String) mapValue.get("tag10"));
        if (mapValue.containsKey("tag2")) setInTag2((String) mapValue.get("tag2"));
        if (mapValue.containsKey("tag3")) setInTag3((String) mapValue.get("tag3"));
        if (mapValue.containsKey("tag4")) setInTag4((String) mapValue.get("tag4"));
        if (mapValue.containsKey("tag5")) setInTag5((String) mapValue.get("tag5"));
        if (mapValue.containsKey("tag6")) setInTag6((String) mapValue.get("tag6"));
        if (mapValue.containsKey("tag7")) setInTag7((String) mapValue.get("tag7"));
        if (mapValue.containsKey("tag8")) setInTag8((String) mapValue.get("tag8"));
        if (mapValue.containsKey("tag9")) setInTag9((String) mapValue.get("tag9"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
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
        if (mapValue.containsKey("transactionEntries")) setOutTransactionEntries((List) mapValue.get("transactionEntries"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetAcctgTransAndEntriesByTypeService</code> from the input values of the given <code>GetAcctgTransAndEntriesByTypeService</code>.
     * @param input a <code>GetAcctgTransAndEntriesByTypeService</code>
     */
    public static GetAcctgTransAndEntriesByTypeService fromInput(GetAcctgTransAndEntriesByTypeService input) {
        GetAcctgTransAndEntriesByTypeService service = new GetAcctgTransAndEntriesByTypeService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetAcctgTransAndEntriesByTypeService</code> from the output values of the given <code>GetAcctgTransAndEntriesByTypeService</code>.
     * @param output a <code>GetAcctgTransAndEntriesByTypeService</code>
     */
    public static GetAcctgTransAndEntriesByTypeService fromOutput(GetAcctgTransAndEntriesByTypeService output) {
        GetAcctgTransAndEntriesByTypeService service = new GetAcctgTransAndEntriesByTypeService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetAcctgTransAndEntriesByTypeService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetAcctgTransAndEntriesByTypeService fromInput(Map<String, Object> mapValue) {
        GetAcctgTransAndEntriesByTypeService service = new GetAcctgTransAndEntriesByTypeService();
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
     * Construct a <code>GetAcctgTransAndEntriesByTypeService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetAcctgTransAndEntriesByTypeService fromOutput(Map<String, Object> mapValue) {
        GetAcctgTransAndEntriesByTypeService service = new GetAcctgTransAndEntriesByTypeService();
        service.putAllOutput(mapValue);
        return service;
    }
}
