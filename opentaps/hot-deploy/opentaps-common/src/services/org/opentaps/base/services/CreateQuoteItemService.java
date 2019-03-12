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
 * Creates a QuoteItem.
 * Auto generated base service entity createQuoteItem.
 *
 * Engine: java
 * Location: com.opensourcestrategies.crmsfa.quotes.QuoteServices
 * Invoke: createQuoteItem
 * Defined in: hot-deploy/crmsfa/servicedef/services_quotes.xml
 */
public class CreateQuoteItemService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createQuoteItem";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        comments("comments"),
        configId("configId"),
        custRequestId("custRequestId"),
        custRequestItemSeqId("custRequestItemSeqId"),
        deliverableTypeId("deliverableTypeId"),
        description("description"),
        estimatedDeliveryDate("estimatedDeliveryDate"),
        isPromo("isPromo"),
        locale("locale"),
        partyId("partyId"),
        productFeatureId("productFeatureId"),
        productId("productId"),
        quantities("quantities"),
        quantity("quantity"),
        quoteId("quoteId"),
        quoteItemSeqId("quoteItemSeqId"),
        quoteUnitPrice("quoteUnitPrice"),
        reservLength("reservLength"),
        reservPersons("reservPersons"),
        reservStart("reservStart"),
        selectedAmount("selectedAmount"),
        skillTypeId("skillTypeId"),
        timeZone("timeZone"),
        unitPrices("unitPrices"),
        uomId("uomId"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        quoteId("quoteId"),
        quoteItemSeqId("quoteItemSeqId"),
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
     * Creates a new <code>CreateQuoteItemService</code> instance.
     */
    public CreateQuoteItemService() {
        super();
    }

    /**
     * Creates a new <code>CreateQuoteItemService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateQuoteItemService(User user) {
        super(user);
    }

    private String inComments;
    private String inConfigId;
    private String inCustRequestId;
    private String inCustRequestItemSeqId;
    private String inDeliverableTypeId;
    private String inDescription;
    private Timestamp inEstimatedDeliveryDate;
    private String inIsPromo;
    private Locale inLocale;
    private String inPartyId;
    private String inProductFeatureId;
    private String inProductId;
    private Map inQuantities;
    private BigDecimal inQuantity;
    private String inQuoteId;
    private String inQuoteItemSeqId;
    private BigDecimal inQuoteUnitPrice;
    private BigDecimal inReservLength;
    private BigDecimal inReservPersons;
    private Timestamp inReservStart;
    private BigDecimal inSelectedAmount;
    private String inSkillTypeId;
    private TimeZone inTimeZone;
    private Map inUnitPrices;
    private String inUomId;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outQuoteId;
    private String outQuoteItemSeqId;
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
    public String getInComments() {
        return this.inComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInConfigId() {
        return this.inConfigId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestId() {
        return this.inCustRequestId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCustRequestItemSeqId() {
        return this.inCustRequestItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDeliverableTypeId() {
        return this.inDeliverableTypeId;
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
     * @return <code>Timestamp</code>
     */
    public Timestamp getInEstimatedDeliveryDate() {
        return this.inEstimatedDeliveryDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsPromo() {
        return this.inIsPromo;
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
    public String getInPartyId() {
        return this.inPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductFeatureId() {
        return this.inProductFeatureId;
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
     * @return <code>Map</code>
     */
    public Map getInQuantities() {
        return this.inQuantities;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuantity() {
        return this.inQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInQuoteId() {
        return this.inQuoteId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInQuoteItemSeqId() {
        return this.inQuoteItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuoteUnitPrice() {
        return this.inQuoteUnitPrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInReservLength() {
        return this.inReservLength;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInReservPersons() {
        return this.inReservPersons;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInReservStart() {
        return this.inReservStart;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInSelectedAmount() {
        return this.inSelectedAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSkillTypeId() {
        return this.inSkillTypeId;
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
     * @return <code>Map</code>
     */
    public Map getInUnitPrices() {
        return this.inUnitPrices;
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
    public String getInWorkEffortId() {
        return this.inWorkEffortId;
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
    public String getOutQuoteId() {
        return this.outQuoteId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutQuoteItemSeqId() {
        return this.outQuoteItemSeqId;
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
     * @param inComments the inComments to set
    */
    public void setInComments(String inComments) {
        this.inParameters.add("comments");
        this.inComments = inComments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inConfigId the inConfigId to set
    */
    public void setInConfigId(String inConfigId) {
        this.inParameters.add("configId");
        this.inConfigId = inConfigId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestId the inCustRequestId to set
    */
    public void setInCustRequestId(String inCustRequestId) {
        this.inParameters.add("custRequestId");
        this.inCustRequestId = inCustRequestId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCustRequestItemSeqId the inCustRequestItemSeqId to set
    */
    public void setInCustRequestItemSeqId(String inCustRequestItemSeqId) {
        this.inParameters.add("custRequestItemSeqId");
        this.inCustRequestItemSeqId = inCustRequestItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDeliverableTypeId the inDeliverableTypeId to set
    */
    public void setInDeliverableTypeId(String inDeliverableTypeId) {
        this.inParameters.add("deliverableTypeId");
        this.inDeliverableTypeId = inDeliverableTypeId;
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
     * @param inEstimatedDeliveryDate the inEstimatedDeliveryDate to set
    */
    public void setInEstimatedDeliveryDate(Timestamp inEstimatedDeliveryDate) {
        this.inParameters.add("estimatedDeliveryDate");
        this.inEstimatedDeliveryDate = inEstimatedDeliveryDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsPromo the inIsPromo to set
    */
    public void setInIsPromo(String inIsPromo) {
        this.inParameters.add("isPromo");
        this.inIsPromo = inIsPromo;
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
     * @param inPartyId the inPartyId to set
    */
    public void setInPartyId(String inPartyId) {
        this.inParameters.add("partyId");
        this.inPartyId = inPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductFeatureId the inProductFeatureId to set
    */
    public void setInProductFeatureId(String inProductFeatureId) {
        this.inParameters.add("productFeatureId");
        this.inProductFeatureId = inProductFeatureId;
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
     * @param inQuantities the inQuantities to set
    */
    public void setInQuantities(Map inQuantities) {
        this.inParameters.add("quantities");
        this.inQuantities = inQuantities;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuantity the inQuantity to set
    */
    public void setInQuantity(BigDecimal inQuantity) {
        this.inParameters.add("quantity");
        this.inQuantity = inQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuoteId the inQuoteId to set
    */
    public void setInQuoteId(String inQuoteId) {
        this.inParameters.add("quoteId");
        this.inQuoteId = inQuoteId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuoteItemSeqId the inQuoteItemSeqId to set
    */
    public void setInQuoteItemSeqId(String inQuoteItemSeqId) {
        this.inParameters.add("quoteItemSeqId");
        this.inQuoteItemSeqId = inQuoteItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inQuoteUnitPrice the inQuoteUnitPrice to set
    */
    public void setInQuoteUnitPrice(BigDecimal inQuoteUnitPrice) {
        this.inParameters.add("quoteUnitPrice");
        this.inQuoteUnitPrice = inQuoteUnitPrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReservLength the inReservLength to set
    */
    public void setInReservLength(BigDecimal inReservLength) {
        this.inParameters.add("reservLength");
        this.inReservLength = inReservLength;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReservPersons the inReservPersons to set
    */
    public void setInReservPersons(BigDecimal inReservPersons) {
        this.inParameters.add("reservPersons");
        this.inReservPersons = inReservPersons;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReservStart the inReservStart to set
    */
    public void setInReservStart(Timestamp inReservStart) {
        this.inParameters.add("reservStart");
        this.inReservStart = inReservStart;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSelectedAmount the inSelectedAmount to set
    */
    public void setInSelectedAmount(BigDecimal inSelectedAmount) {
        this.inParameters.add("selectedAmount");
        this.inSelectedAmount = inSelectedAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSkillTypeId the inSkillTypeId to set
    */
    public void setInSkillTypeId(String inSkillTypeId) {
        this.inParameters.add("skillTypeId");
        this.inSkillTypeId = inSkillTypeId;
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
     * @param inUnitPrices the inUnitPrices to set
    */
    public void setInUnitPrices(Map inUnitPrices) {
        this.inParameters.add("unitPrices");
        this.inUnitPrices = inUnitPrices;
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
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
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
     * @param outQuoteId the outQuoteId to set
    */
    public void setOutQuoteId(String outQuoteId) {
        this.outParameters.add("quoteId");
        this.outQuoteId = outQuoteId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outQuoteItemSeqId the outQuoteItemSeqId to set
    */
    public void setOutQuoteItemSeqId(String outQuoteItemSeqId) {
        this.outParameters.add("quoteItemSeqId");
        this.outQuoteItemSeqId = outQuoteItemSeqId;
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
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("configId")) mapValue.put("configId", getInConfigId());
        if (inParameters.contains("custRequestId")) mapValue.put("custRequestId", getInCustRequestId());
        if (inParameters.contains("custRequestItemSeqId")) mapValue.put("custRequestItemSeqId", getInCustRequestItemSeqId());
        if (inParameters.contains("deliverableTypeId")) mapValue.put("deliverableTypeId", getInDeliverableTypeId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("estimatedDeliveryDate")) mapValue.put("estimatedDeliveryDate", getInEstimatedDeliveryDate());
        if (inParameters.contains("isPromo")) mapValue.put("isPromo", getInIsPromo());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productFeatureId")) mapValue.put("productFeatureId", getInProductFeatureId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("quantities")) mapValue.put("quantities", getInQuantities());
        if (inParameters.contains("quantity")) mapValue.put("quantity", getInQuantity());
        if (inParameters.contains("quoteId")) mapValue.put("quoteId", getInQuoteId());
        if (inParameters.contains("quoteItemSeqId")) mapValue.put("quoteItemSeqId", getInQuoteItemSeqId());
        if (inParameters.contains("quoteUnitPrice")) mapValue.put("quoteUnitPrice", getInQuoteUnitPrice());
        if (inParameters.contains("reservLength")) mapValue.put("reservLength", getInReservLength());
        if (inParameters.contains("reservPersons")) mapValue.put("reservPersons", getInReservPersons());
        if (inParameters.contains("reservStart")) mapValue.put("reservStart", getInReservStart());
        if (inParameters.contains("selectedAmount")) mapValue.put("selectedAmount", getInSelectedAmount());
        if (inParameters.contains("skillTypeId")) mapValue.put("skillTypeId", getInSkillTypeId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("unitPrices")) mapValue.put("unitPrices", getInUnitPrices());
        if (inParameters.contains("uomId")) mapValue.put("uomId", getInUomId());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
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
        if (outParameters.contains("quoteId")) mapValue.put("quoteId", getOutQuoteId());
        if (outParameters.contains("quoteItemSeqId")) mapValue.put("quoteItemSeqId", getOutQuoteItemSeqId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("configId")) setInConfigId((String) mapValue.get("configId"));
        if (mapValue.containsKey("custRequestId")) setInCustRequestId((String) mapValue.get("custRequestId"));
        if (mapValue.containsKey("custRequestItemSeqId")) setInCustRequestItemSeqId((String) mapValue.get("custRequestItemSeqId"));
        if (mapValue.containsKey("deliverableTypeId")) setInDeliverableTypeId((String) mapValue.get("deliverableTypeId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("estimatedDeliveryDate")) setInEstimatedDeliveryDate((Timestamp) mapValue.get("estimatedDeliveryDate"));
        if (mapValue.containsKey("isPromo")) setInIsPromo((String) mapValue.get("isPromo"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productFeatureId")) setInProductFeatureId((String) mapValue.get("productFeatureId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("quantities")) setInQuantities((Map) mapValue.get("quantities"));
        if (mapValue.containsKey("quantity")) setInQuantity((BigDecimal) mapValue.get("quantity"));
        if (mapValue.containsKey("quoteId")) setInQuoteId((String) mapValue.get("quoteId"));
        if (mapValue.containsKey("quoteItemSeqId")) setInQuoteItemSeqId((String) mapValue.get("quoteItemSeqId"));
        if (mapValue.containsKey("quoteUnitPrice")) setInQuoteUnitPrice((BigDecimal) mapValue.get("quoteUnitPrice"));
        if (mapValue.containsKey("reservLength")) setInReservLength((BigDecimal) mapValue.get("reservLength"));
        if (mapValue.containsKey("reservPersons")) setInReservPersons((BigDecimal) mapValue.get("reservPersons"));
        if (mapValue.containsKey("reservStart")) setInReservStart((Timestamp) mapValue.get("reservStart"));
        if (mapValue.containsKey("selectedAmount")) setInSelectedAmount((BigDecimal) mapValue.get("selectedAmount"));
        if (mapValue.containsKey("skillTypeId")) setInSkillTypeId((String) mapValue.get("skillTypeId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("unitPrices")) setInUnitPrices((Map) mapValue.get("unitPrices"));
        if (mapValue.containsKey("uomId")) setInUomId((String) mapValue.get("uomId"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("quoteId")) setOutQuoteId((String) mapValue.get("quoteId"));
        if (mapValue.containsKey("quoteItemSeqId")) setOutQuoteItemSeqId((String) mapValue.get("quoteItemSeqId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CreateQuoteItemService</code> from the input values of the given <code>CreateQuoteItemService</code>.
     * @param input a <code>CreateQuoteItemService</code>
     */
    public static CreateQuoteItemService fromInput(CreateQuoteItemService input) {
        CreateQuoteItemService service = new CreateQuoteItemService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateQuoteItemService</code> from the output values of the given <code>CreateQuoteItemService</code>.
     * @param output a <code>CreateQuoteItemService</code>
     */
    public static CreateQuoteItemService fromOutput(CreateQuoteItemService output) {
        CreateQuoteItemService service = new CreateQuoteItemService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateQuoteItemService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateQuoteItemService fromInput(Map<String, Object> mapValue) {
        CreateQuoteItemService service = new CreateQuoteItemService();
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
     * Construct a <code>CreateQuoteItemService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateQuoteItemService fromOutput(Map<String, Object> mapValue) {
        CreateQuoteItemService service = new CreateQuoteItemService();
        service.putAllOutput(mapValue);
        return service;
    }
}