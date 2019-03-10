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
 * Generic Payment Credit Interface.
 * Auto generated base service entity paymentCreditInterface.
 *
 * Engine: interface
 * Location: 
 * Invoke: 
 * Defined in: applications/accounting/servicedef/services_paymentmethod.xml
 */
public class PaymentCreditInterfaceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "paymentCreditInterface";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        billToEmail("billToEmail"),
        billToParty("billToParty"),
        billingAddress("billingAddress"),
        creditAmount("creditAmount"),
        currency("currency"),
        locale("locale"),
        orderItems("orderItems"),
        paymentConfig("paymentConfig"),
        paymentGatewayConfigId("paymentGatewayConfigId"),
        referenceCode("referenceCode"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        creditAltRefNum("creditAltRefNum"),
        creditAmount("creditAmount"),
        creditCode("creditCode"),
        creditFlag("creditFlag"),
        creditMessage("creditMessage"),
        creditRefNum("creditRefNum"),
        creditResult("creditResult"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        internalRespMsgs("internalRespMsgs"),
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
     * Creates a new <code>PaymentCreditInterfaceService</code> instance.
     */
    public PaymentCreditInterfaceService() {
        super();
    }


    private GenericValue inBillToEmail;
    private GenericValue inBillToParty;
    private GenericValue inBillingAddress;
    private BigDecimal inCreditAmount;
    private String inCurrency;
    private Locale inLocale;
    private List inOrderItems;
    private String inPaymentConfig;
    private String inPaymentGatewayConfigId;
    private String inReferenceCode;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outCreditAltRefNum;
    private BigDecimal outCreditAmount;
    private String outCreditCode;
    private String outCreditFlag;
    private String outCreditMessage;
    private String outCreditRefNum;
    private Boolean outCreditResult;
    private String outErrorMessage;
    private List outErrorMessageList;
    private List outInternalRespMsgs;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getInBillToEmail() {
        return this.inBillToEmail;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInBillToParty() {
        return this.inBillToParty;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getInBillingAddress() {
        return this.inBillingAddress;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInCreditAmount() {
        return this.inCreditAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCurrency() {
        return this.inCurrency;
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
     * @return <code>List</code>
     */
    public List getInOrderItems() {
        return this.inOrderItems;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentConfig() {
        return this.inPaymentConfig;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPaymentGatewayConfigId() {
        return this.inPaymentGatewayConfigId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInReferenceCode() {
        return this.inReferenceCode;
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
    public String getOutCreditAltRefNum() {
        return this.outCreditAltRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutCreditAmount() {
        return this.outCreditAmount;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCreditCode() {
        return this.outCreditCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCreditFlag() {
        return this.outCreditFlag;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutCreditMessage() {
        return this.outCreditMessage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutCreditRefNum() {
        return this.outCreditRefNum;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Boolean</code>
     */
    public Boolean getOutCreditResult() {
        return this.outCreditResult;
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
     * @return <code>List</code>
     */
    public List getOutInternalRespMsgs() {
        return this.outInternalRespMsgs;
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
     * @param inBillToEmail the inBillToEmail to set
    */
    public void setInBillToEmail(GenericValue inBillToEmail) {
        this.inParameters.add("billToEmail");
        this.inBillToEmail = inBillToEmail;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inBillToParty the inBillToParty to set
    */
    public void setInBillToParty(GenericValue inBillToParty) {
        this.inParameters.add("billToParty");
        this.inBillToParty = inBillToParty;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inBillingAddress the inBillingAddress to set
    */
    public void setInBillingAddress(GenericValue inBillingAddress) {
        this.inParameters.add("billingAddress");
        this.inBillingAddress = inBillingAddress;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inCreditAmount the inCreditAmount to set
    */
    public void setInCreditAmount(BigDecimal inCreditAmount) {
        this.inParameters.add("creditAmount");
        this.inCreditAmount = inCreditAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCurrency the inCurrency to set
    */
    public void setInCurrency(String inCurrency) {
        this.inParameters.add("currency");
        this.inCurrency = inCurrency;
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
     * @param inOrderItems the inOrderItems to set
    */
    public void setInOrderItems(List inOrderItems) {
        this.inParameters.add("orderItems");
        this.inOrderItems = inOrderItems;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentConfig the inPaymentConfig to set
    */
    public void setInPaymentConfig(String inPaymentConfig) {
        this.inParameters.add("paymentConfig");
        this.inPaymentConfig = inPaymentConfig;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPaymentGatewayConfigId the inPaymentGatewayConfigId to set
    */
    public void setInPaymentGatewayConfigId(String inPaymentGatewayConfigId) {
        this.inParameters.add("paymentGatewayConfigId");
        this.inPaymentGatewayConfigId = inPaymentGatewayConfigId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inReferenceCode the inReferenceCode to set
    */
    public void setInReferenceCode(String inReferenceCode) {
        this.inParameters.add("referenceCode");
        this.inReferenceCode = inReferenceCode;
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
     * @param outCreditAltRefNum the outCreditAltRefNum to set
    */
    public void setOutCreditAltRefNum(String outCreditAltRefNum) {
        this.outParameters.add("creditAltRefNum");
        this.outCreditAltRefNum = outCreditAltRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCreditAmount the outCreditAmount to set
    */
    public void setOutCreditAmount(BigDecimal outCreditAmount) {
        this.outParameters.add("creditAmount");
        this.outCreditAmount = outCreditAmount;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCreditCode the outCreditCode to set
    */
    public void setOutCreditCode(String outCreditCode) {
        this.outParameters.add("creditCode");
        this.outCreditCode = outCreditCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCreditFlag the outCreditFlag to set
    */
    public void setOutCreditFlag(String outCreditFlag) {
        this.outParameters.add("creditFlag");
        this.outCreditFlag = outCreditFlag;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outCreditMessage the outCreditMessage to set
    */
    public void setOutCreditMessage(String outCreditMessage) {
        this.outParameters.add("creditMessage");
        this.outCreditMessage = outCreditMessage;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCreditRefNum the outCreditRefNum to set
    */
    public void setOutCreditRefNum(String outCreditRefNum) {
        this.outParameters.add("creditRefNum");
        this.outCreditRefNum = outCreditRefNum;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outCreditResult the outCreditResult to set
    */
    public void setOutCreditResult(Boolean outCreditResult) {
        this.outParameters.add("creditResult");
        this.outCreditResult = outCreditResult;
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
     * @param outInternalRespMsgs the outInternalRespMsgs to set
    */
    public void setOutInternalRespMsgs(List outInternalRespMsgs) {
        this.outParameters.add("internalRespMsgs");
        this.outInternalRespMsgs = outInternalRespMsgs;
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
        if (inParameters.contains("billToEmail")) mapValue.put("billToEmail", getInBillToEmail());
        if (inParameters.contains("billToParty")) mapValue.put("billToParty", getInBillToParty());
        if (inParameters.contains("billingAddress")) mapValue.put("billingAddress", getInBillingAddress());
        if (inParameters.contains("creditAmount")) mapValue.put("creditAmount", getInCreditAmount());
        if (inParameters.contains("currency")) mapValue.put("currency", getInCurrency());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderItems")) mapValue.put("orderItems", getInOrderItems());
        if (inParameters.contains("paymentConfig")) mapValue.put("paymentConfig", getInPaymentConfig());
        if (inParameters.contains("paymentGatewayConfigId")) mapValue.put("paymentGatewayConfigId", getInPaymentGatewayConfigId());
        if (inParameters.contains("referenceCode")) mapValue.put("referenceCode", getInReferenceCode());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("creditAltRefNum")) mapValue.put("creditAltRefNum", getOutCreditAltRefNum());
        if (outParameters.contains("creditAmount")) mapValue.put("creditAmount", getOutCreditAmount());
        if (outParameters.contains("creditCode")) mapValue.put("creditCode", getOutCreditCode());
        if (outParameters.contains("creditFlag")) mapValue.put("creditFlag", getOutCreditFlag());
        if (outParameters.contains("creditMessage")) mapValue.put("creditMessage", getOutCreditMessage());
        if (outParameters.contains("creditRefNum")) mapValue.put("creditRefNum", getOutCreditRefNum());
        if (outParameters.contains("creditResult")) mapValue.put("creditResult", getOutCreditResult());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("internalRespMsgs")) mapValue.put("internalRespMsgs", getOutInternalRespMsgs());
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
        if (mapValue.containsKey("billToEmail")) setInBillToEmail((GenericValue) mapValue.get("billToEmail"));
        if (mapValue.containsKey("billToParty")) setInBillToParty((GenericValue) mapValue.get("billToParty"));
        if (mapValue.containsKey("billingAddress")) setInBillingAddress((GenericValue) mapValue.get("billingAddress"));
        if (mapValue.containsKey("creditAmount")) setInCreditAmount((BigDecimal) mapValue.get("creditAmount"));
        if (mapValue.containsKey("currency")) setInCurrency((String) mapValue.get("currency"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderItems")) setInOrderItems((List) mapValue.get("orderItems"));
        if (mapValue.containsKey("paymentConfig")) setInPaymentConfig((String) mapValue.get("paymentConfig"));
        if (mapValue.containsKey("paymentGatewayConfigId")) setInPaymentGatewayConfigId((String) mapValue.get("paymentGatewayConfigId"));
        if (mapValue.containsKey("referenceCode")) setInReferenceCode((String) mapValue.get("referenceCode"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("creditAltRefNum")) setOutCreditAltRefNum((String) mapValue.get("creditAltRefNum"));
        if (mapValue.containsKey("creditAmount")) setOutCreditAmount((BigDecimal) mapValue.get("creditAmount"));
        if (mapValue.containsKey("creditCode")) setOutCreditCode((String) mapValue.get("creditCode"));
        if (mapValue.containsKey("creditFlag")) setOutCreditFlag((String) mapValue.get("creditFlag"));
        if (mapValue.containsKey("creditMessage")) setOutCreditMessage((String) mapValue.get("creditMessage"));
        if (mapValue.containsKey("creditRefNum")) setOutCreditRefNum((String) mapValue.get("creditRefNum"));
        if (mapValue.containsKey("creditResult")) setOutCreditResult((Boolean) mapValue.get("creditResult"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("internalRespMsgs")) setOutInternalRespMsgs((List) mapValue.get("internalRespMsgs"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>PaymentCreditInterfaceService</code> from the input values of the given <code>PaymentCreditInterfaceService</code>.
     * @param input a <code>PaymentCreditInterfaceService</code>
     */
    public static PaymentCreditInterfaceService fromInput(PaymentCreditInterfaceService input) {
        PaymentCreditInterfaceService service = new PaymentCreditInterfaceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>PaymentCreditInterfaceService</code> from the output values of the given <code>PaymentCreditInterfaceService</code>.
     * @param output a <code>PaymentCreditInterfaceService</code>
     */
    public static PaymentCreditInterfaceService fromOutput(PaymentCreditInterfaceService output) {
        PaymentCreditInterfaceService service = new PaymentCreditInterfaceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>PaymentCreditInterfaceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static PaymentCreditInterfaceService fromInput(Map<String, Object> mapValue) {
        PaymentCreditInterfaceService service = new PaymentCreditInterfaceService();
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
     * Construct a <code>PaymentCreditInterfaceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static PaymentCreditInterfaceService fromOutput(Map<String, Object> mapValue) {
        PaymentCreditInterfaceService service = new PaymentCreditInterfaceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
