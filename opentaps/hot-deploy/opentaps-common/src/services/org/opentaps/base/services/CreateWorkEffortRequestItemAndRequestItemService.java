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

import java.lang.String;
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
 * Creates a CustRequestItem entity and CustRequestItemWorkEffort.
 * Auto generated base service entity createWorkEffortRequestItemAndRequestItem.
 *
 * Engine: group
 * Location: createWorkEffortRequestItemAndRequestItem
 * Invoke: 
 * Defined in: applications/workeffort/servicedef/services.xml
 */
public class CreateWorkEffortRequestItemAndRequestItemService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createWorkEffortRequestItemAndRequestItem";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        configId("configId"),
        custRequestId("custRequestId"),
        custRequestItemExists("custRequestItemExists"),
        custRequestItemSeqId("custRequestItemSeqId"),
        custRequestResolutionId("custRequestResolutionId"),
        description("description"),
        locale("locale"),
        maximumAmount("maximumAmount"),
        priority("priority"),
        productId("productId"),
        quantity("quantity"),
        requiredByDate("requiredByDate"),
        reservLength("reservLength"),
        reservPersons("reservPersons"),
        reservStart("reservStart"),
        selectedAmount("selectedAmount"),
        sequenceNum("sequenceNum"),
        statusId("statusId"),
        story("story"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        workEffortId("workEffortId");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        custRequestItemExists("custRequestItemExists"),
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
     * Creates a new <code>CreateWorkEffortRequestItemAndRequestItemService</code> instance.
     */
    public CreateWorkEffortRequestItemAndRequestItemService() {
        super();
    }

    /**
     * Creates a new <code>CreateWorkEffortRequestItemAndRequestItemService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateWorkEffortRequestItemAndRequestItemService(User user) {
        super(user);
    }

    private String inConfigId;
    private String inCustRequestId;
    private String inCustRequestItemExists;
    private String inCustRequestItemSeqId;
    private String inCustRequestResolutionId;
    private String inDescription;
    private Locale inLocale;
    private BigDecimal inMaximumAmount;
    private Long inPriority;
    private String inProductId;
    private BigDecimal inQuantity;
    private Timestamp inRequiredByDate;
    private BigDecimal inReservLength;
    private BigDecimal inReservPersons;
    private Timestamp inReservStart;
    private BigDecimal inSelectedAmount;
    private Long inSequenceNum;
    private String inStatusId;
    private String inStory;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String inWorkEffortId;
    private String outCustRequestItemExists;
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
    public String getInCustRequestItemExists() {
        return this.inCustRequestItemExists;
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
    public String getInCustRequestResolutionId() {
        return this.inCustRequestResolutionId;
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
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMaximumAmount() {
        return this.inMaximumAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInPriority() {
        return this.inPriority;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuantity() {
        return this.inQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInRequiredByDate() {
        return this.inRequiredByDate;
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
     * @return <code>Long</code>
     */
    public Long getInSequenceNum() {
        return this.inSequenceNum;
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
    public String getInStory() {
        return this.inStory;
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
     * This parameter is required.
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
    public String getOutCustRequestItemExists() {
        return this.outCustRequestItemExists;
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
     * @param inCustRequestItemExists the inCustRequestItemExists to set
    */
    public void setInCustRequestItemExists(String inCustRequestItemExists) {
        this.inParameters.add("custRequestItemExists");
        this.inCustRequestItemExists = inCustRequestItemExists;
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
     * @param inCustRequestResolutionId the inCustRequestResolutionId to set
    */
    public void setInCustRequestResolutionId(String inCustRequestResolutionId) {
        this.inParameters.add("custRequestResolutionId");
        this.inCustRequestResolutionId = inCustRequestResolutionId;
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
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaximumAmount the inMaximumAmount to set
    */
    public void setInMaximumAmount(BigDecimal inMaximumAmount) {
        this.inParameters.add("maximumAmount");
        this.inMaximumAmount = inMaximumAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPriority the inPriority to set
    */
    public void setInPriority(Long inPriority) {
        this.inParameters.add("priority");
        this.inPriority = inPriority;
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
     * @param inQuantity the inQuantity to set
    */
    public void setInQuantity(BigDecimal inQuantity) {
        this.inParameters.add("quantity");
        this.inQuantity = inQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRequiredByDate the inRequiredByDate to set
    */
    public void setInRequiredByDate(Timestamp inRequiredByDate) {
        this.inParameters.add("requiredByDate");
        this.inRequiredByDate = inRequiredByDate;
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
     * @param inSequenceNum the inSequenceNum to set
    */
    public void setInSequenceNum(Long inSequenceNum) {
        this.inParameters.add("sequenceNum");
        this.inSequenceNum = inSequenceNum;
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
     * @param inStory the inStory to set
    */
    public void setInStory(String inStory) {
        this.inParameters.add("story");
        this.inStory = inStory;
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
     * This parameter is required.
     * @param inWorkEffortId the inWorkEffortId to set
    */
    public void setInWorkEffortId(String inWorkEffortId) {
        this.inParameters.add("workEffortId");
        this.inWorkEffortId = inWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCustRequestItemExists the outCustRequestItemExists to set
    */
    public void setOutCustRequestItemExists(String outCustRequestItemExists) {
        this.outParameters.add("custRequestItemExists");
        this.outCustRequestItemExists = outCustRequestItemExists;
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
        if (inParameters.contains("configId")) mapValue.put("configId", getInConfigId());
        if (inParameters.contains("custRequestId")) mapValue.put("custRequestId", getInCustRequestId());
        if (inParameters.contains("custRequestItemExists")) mapValue.put("custRequestItemExists", getInCustRequestItemExists());
        if (inParameters.contains("custRequestItemSeqId")) mapValue.put("custRequestItemSeqId", getInCustRequestItemSeqId());
        if (inParameters.contains("custRequestResolutionId")) mapValue.put("custRequestResolutionId", getInCustRequestResolutionId());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maximumAmount")) mapValue.put("maximumAmount", getInMaximumAmount());
        if (inParameters.contains("priority")) mapValue.put("priority", getInPriority());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("quantity")) mapValue.put("quantity", getInQuantity());
        if (inParameters.contains("requiredByDate")) mapValue.put("requiredByDate", getInRequiredByDate());
        if (inParameters.contains("reservLength")) mapValue.put("reservLength", getInReservLength());
        if (inParameters.contains("reservPersons")) mapValue.put("reservPersons", getInReservPersons());
        if (inParameters.contains("reservStart")) mapValue.put("reservStart", getInReservStart());
        if (inParameters.contains("selectedAmount")) mapValue.put("selectedAmount", getInSelectedAmount());
        if (inParameters.contains("sequenceNum")) mapValue.put("sequenceNum", getInSequenceNum());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("story")) mapValue.put("story", getInStory());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("workEffortId")) mapValue.put("workEffortId", getInWorkEffortId());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("custRequestItemExists")) mapValue.put("custRequestItemExists", getOutCustRequestItemExists());
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
        if (mapValue.containsKey("configId")) setInConfigId((String) mapValue.get("configId"));
        if (mapValue.containsKey("custRequestId")) setInCustRequestId((String) mapValue.get("custRequestId"));
        if (mapValue.containsKey("custRequestItemExists")) setInCustRequestItemExists((String) mapValue.get("custRequestItemExists"));
        if (mapValue.containsKey("custRequestItemSeqId")) setInCustRequestItemSeqId((String) mapValue.get("custRequestItemSeqId"));
        if (mapValue.containsKey("custRequestResolutionId")) setInCustRequestResolutionId((String) mapValue.get("custRequestResolutionId"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maximumAmount")) setInMaximumAmount((BigDecimal) mapValue.get("maximumAmount"));
        if (mapValue.containsKey("priority")) setInPriority((Long) mapValue.get("priority"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("quantity")) setInQuantity((BigDecimal) mapValue.get("quantity"));
        if (mapValue.containsKey("requiredByDate")) setInRequiredByDate((Timestamp) mapValue.get("requiredByDate"));
        if (mapValue.containsKey("reservLength")) setInReservLength((BigDecimal) mapValue.get("reservLength"));
        if (mapValue.containsKey("reservPersons")) setInReservPersons((BigDecimal) mapValue.get("reservPersons"));
        if (mapValue.containsKey("reservStart")) setInReservStart((Timestamp) mapValue.get("reservStart"));
        if (mapValue.containsKey("selectedAmount")) setInSelectedAmount((BigDecimal) mapValue.get("selectedAmount"));
        if (mapValue.containsKey("sequenceNum")) setInSequenceNum((Long) mapValue.get("sequenceNum"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("story")) setInStory((String) mapValue.get("story"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("workEffortId")) setInWorkEffortId((String) mapValue.get("workEffortId"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("custRequestItemExists")) setOutCustRequestItemExists((String) mapValue.get("custRequestItemExists"));
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
     * Construct a <code>CreateWorkEffortRequestItemAndRequestItemService</code> from the input values of the given <code>CreateWorkEffortRequestItemAndRequestItemService</code>.
     * @param input a <code>CreateWorkEffortRequestItemAndRequestItemService</code>
     */
    public static CreateWorkEffortRequestItemAndRequestItemService fromInput(CreateWorkEffortRequestItemAndRequestItemService input) {
        CreateWorkEffortRequestItemAndRequestItemService service = new CreateWorkEffortRequestItemAndRequestItemService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateWorkEffortRequestItemAndRequestItemService</code> from the output values of the given <code>CreateWorkEffortRequestItemAndRequestItemService</code>.
     * @param output a <code>CreateWorkEffortRequestItemAndRequestItemService</code>
     */
    public static CreateWorkEffortRequestItemAndRequestItemService fromOutput(CreateWorkEffortRequestItemAndRequestItemService output) {
        CreateWorkEffortRequestItemAndRequestItemService service = new CreateWorkEffortRequestItemAndRequestItemService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateWorkEffortRequestItemAndRequestItemService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateWorkEffortRequestItemAndRequestItemService fromInput(Map<String, Object> mapValue) {
        CreateWorkEffortRequestItemAndRequestItemService service = new CreateWorkEffortRequestItemAndRequestItemService();
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
     * Construct a <code>CreateWorkEffortRequestItemAndRequestItemService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateWorkEffortRequestItemAndRequestItemService fromOutput(Map<String, Object> mapValue) {
        CreateWorkEffortRequestItemAndRequestItemService service = new CreateWorkEffortRequestItemAndRequestItemService();
        service.putAllOutput(mapValue);
        return service;
    }
}
