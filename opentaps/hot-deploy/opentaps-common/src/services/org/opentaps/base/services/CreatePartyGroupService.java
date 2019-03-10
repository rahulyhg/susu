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
 * Create a PartyGroup.
 * Auto generated base service entity createPartyGroup.
 *
 * Engine: java
 * Location: org.ofbiz.party.party.PartyServices
 * Invoke: createPartyGroup
 * Defined in: applications/party/servicedef/services.xml
 */
public class CreatePartyGroupService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createPartyGroup";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        annualRevenue("annualRevenue"),
        comments("comments"),
        description("description"),
        externalId("externalId"),
        federalTaxId("federalTaxId"),
        groupName("groupName"),
        groupNameLocal("groupNameLocal"),
        isIncorporated("isIncorporated"),
        locale("locale"),
        logoImageUrl("logoImageUrl"),
        numEmployees("numEmployees"),
        officeSiteName("officeSiteName"),
        partyId("partyId"),
        partyTypeId("partyTypeId"),
        preferredCurrencyUomId("preferredCurrencyUomId"),
        requires1099("requires1099"),
        statusId("statusId"),
        tickerSymbol("tickerSymbol"),
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
        partyId("partyId"),
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
     * Creates a new <code>CreatePartyGroupService</code> instance.
     */
    public CreatePartyGroupService() {
        super();
    }


    private BigDecimal inAnnualRevenue;
    private String inComments;
    private String inDescription;
    private String inExternalId;
    private String inFederalTaxId;
    private String inGroupName;
    private String inGroupNameLocal;
    private String inIsIncorporated;
    private Locale inLocale;
    private String inLogoImageUrl;
    private Long inNumEmployees;
    private String inOfficeSiteName;
    private String inPartyId;
    private String inPartyTypeId;
    private String inPreferredCurrencyUomId;
    private String inRequires1099;
    private String inStatusId;
    private String inTickerSymbol;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outPartyId;
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
    public BigDecimal getInAnnualRevenue() {
        return this.inAnnualRevenue;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInComments() {
        return this.inComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInExternalId() {
        return this.inExternalId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFederalTaxId() {
        return this.inFederalTaxId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInGroupName() {
        return this.inGroupName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGroupNameLocal() {
        return this.inGroupNameLocal;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsIncorporated() {
        return this.inIsIncorporated;
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
    public String getInLogoImageUrl() {
        return this.inLogoImageUrl;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInNumEmployees() {
        return this.inNumEmployees;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInOfficeSiteName() {
        return this.inOfficeSiteName;
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
    public String getInPartyTypeId() {
        return this.inPartyTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPreferredCurrencyUomId() {
        return this.inPreferredCurrencyUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRequires1099() {
        return this.inRequires1099;
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
     * @return <code>String</code>
     */
    public String getInTickerSymbol() {
        return this.inTickerSymbol;
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
    public String getOutPartyId() {
        return this.outPartyId;
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
     * @param inAnnualRevenue the inAnnualRevenue to set
    */
    public void setInAnnualRevenue(BigDecimal inAnnualRevenue) {
        this.inParameters.add("annualRevenue");
        this.inAnnualRevenue = inAnnualRevenue;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inComments the inComments to set
    */
    public void setInComments(String inComments) {
        this.inParameters.add("comments");
        this.inComments = inComments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inExternalId the inExternalId to set
    */
    public void setInExternalId(String inExternalId) {
        this.inParameters.add("externalId");
        this.inExternalId = inExternalId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFederalTaxId the inFederalTaxId to set
    */
    public void setInFederalTaxId(String inFederalTaxId) {
        this.inParameters.add("federalTaxId");
        this.inFederalTaxId = inFederalTaxId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inGroupName the inGroupName to set
    */
    public void setInGroupName(String inGroupName) {
        this.inParameters.add("groupName");
        this.inGroupName = inGroupName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGroupNameLocal the inGroupNameLocal to set
    */
    public void setInGroupNameLocal(String inGroupNameLocal) {
        this.inParameters.add("groupNameLocal");
        this.inGroupNameLocal = inGroupNameLocal;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsIncorporated the inIsIncorporated to set
    */
    public void setInIsIncorporated(String inIsIncorporated) {
        this.inParameters.add("isIncorporated");
        this.inIsIncorporated = inIsIncorporated;
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
     * @param inLogoImageUrl the inLogoImageUrl to set
    */
    public void setInLogoImageUrl(String inLogoImageUrl) {
        this.inParameters.add("logoImageUrl");
        this.inLogoImageUrl = inLogoImageUrl;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inNumEmployees the inNumEmployees to set
    */
    public void setInNumEmployees(Long inNumEmployees) {
        this.inParameters.add("numEmployees");
        this.inNumEmployees = inNumEmployees;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inOfficeSiteName the inOfficeSiteName to set
    */
    public void setInOfficeSiteName(String inOfficeSiteName) {
        this.inParameters.add("officeSiteName");
        this.inOfficeSiteName = inOfficeSiteName;
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
     * @param inPartyTypeId the inPartyTypeId to set
    */
    public void setInPartyTypeId(String inPartyTypeId) {
        this.inParameters.add("partyTypeId");
        this.inPartyTypeId = inPartyTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPreferredCurrencyUomId the inPreferredCurrencyUomId to set
    */
    public void setInPreferredCurrencyUomId(String inPreferredCurrencyUomId) {
        this.inParameters.add("preferredCurrencyUomId");
        this.inPreferredCurrencyUomId = inPreferredCurrencyUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequires1099 the inRequires1099 to set
    */
    public void setInRequires1099(String inRequires1099) {
        this.inParameters.add("requires1099");
        this.inRequires1099 = inRequires1099;
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
     * @param inTickerSymbol the inTickerSymbol to set
    */
    public void setInTickerSymbol(String inTickerSymbol) {
        this.inParameters.add("tickerSymbol");
        this.inTickerSymbol = inTickerSymbol;
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
     * @param outPartyId the outPartyId to set
    */
    public void setOutPartyId(String outPartyId) {
        this.outParameters.add("partyId");
        this.outPartyId = outPartyId;
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
        if (inParameters.contains("annualRevenue")) mapValue.put("annualRevenue", getInAnnualRevenue());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("externalId")) mapValue.put("externalId", getInExternalId());
        if (inParameters.contains("federalTaxId")) mapValue.put("federalTaxId", getInFederalTaxId());
        if (inParameters.contains("groupName")) mapValue.put("groupName", getInGroupName());
        if (inParameters.contains("groupNameLocal")) mapValue.put("groupNameLocal", getInGroupNameLocal());
        if (inParameters.contains("isIncorporated")) mapValue.put("isIncorporated", getInIsIncorporated());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("logoImageUrl")) mapValue.put("logoImageUrl", getInLogoImageUrl());
        if (inParameters.contains("numEmployees")) mapValue.put("numEmployees", getInNumEmployees());
        if (inParameters.contains("officeSiteName")) mapValue.put("officeSiteName", getInOfficeSiteName());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("partyTypeId")) mapValue.put("partyTypeId", getInPartyTypeId());
        if (inParameters.contains("preferredCurrencyUomId")) mapValue.put("preferredCurrencyUomId", getInPreferredCurrencyUomId());
        if (inParameters.contains("requires1099")) mapValue.put("requires1099", getInRequires1099());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("tickerSymbol")) mapValue.put("tickerSymbol", getInTickerSymbol());
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
        if (outParameters.contains("partyId")) mapValue.put("partyId", getOutPartyId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("annualRevenue")) setInAnnualRevenue((BigDecimal) mapValue.get("annualRevenue"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("externalId")) setInExternalId((String) mapValue.get("externalId"));
        if (mapValue.containsKey("federalTaxId")) setInFederalTaxId((String) mapValue.get("federalTaxId"));
        if (mapValue.containsKey("groupName")) setInGroupName((String) mapValue.get("groupName"));
        if (mapValue.containsKey("groupNameLocal")) setInGroupNameLocal((String) mapValue.get("groupNameLocal"));
        if (mapValue.containsKey("isIncorporated")) setInIsIncorporated((String) mapValue.get("isIncorporated"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("logoImageUrl")) setInLogoImageUrl((String) mapValue.get("logoImageUrl"));
        if (mapValue.containsKey("numEmployees")) setInNumEmployees((Long) mapValue.get("numEmployees"));
        if (mapValue.containsKey("officeSiteName")) setInOfficeSiteName((String) mapValue.get("officeSiteName"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("partyTypeId")) setInPartyTypeId((String) mapValue.get("partyTypeId"));
        if (mapValue.containsKey("preferredCurrencyUomId")) setInPreferredCurrencyUomId((String) mapValue.get("preferredCurrencyUomId"));
        if (mapValue.containsKey("requires1099")) setInRequires1099((String) mapValue.get("requires1099"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("tickerSymbol")) setInTickerSymbol((String) mapValue.get("tickerSymbol"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setOutPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreatePartyGroupService</code> from the input values of the given <code>CreatePartyGroupService</code>.
     * @param input a <code>CreatePartyGroupService</code>
     */
    public static CreatePartyGroupService fromInput(CreatePartyGroupService input) {
        CreatePartyGroupService service = new CreatePartyGroupService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreatePartyGroupService</code> from the output values of the given <code>CreatePartyGroupService</code>.
     * @param output a <code>CreatePartyGroupService</code>
     */
    public static CreatePartyGroupService fromOutput(CreatePartyGroupService output) {
        CreatePartyGroupService service = new CreatePartyGroupService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreatePartyGroupService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreatePartyGroupService fromInput(Map<String, Object> mapValue) {
        CreatePartyGroupService service = new CreatePartyGroupService();
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
     * Construct a <code>CreatePartyGroupService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreatePartyGroupService fromOutput(Map<String, Object> mapValue) {
        CreatePartyGroupService service = new CreatePartyGroupService();
        service.putAllOutput(mapValue);
        return service;
    }
}
