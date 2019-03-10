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
 * Delete a paymentApplication record..
 * Auto generated base service entity removePaymentApplication.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/invoice/InvoiceServices.xml
 * Invoke: removePaymentApplication
 * Defined in: applications/accounting/servicedef/services_payment.xml
 */
public class RemovePaymentApplicationService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "removePaymentApplication";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        locale("locale"),
        paymentApplicationId("paymentApplicationId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        acctgTagEnumId1("acctgTagEnumId1"),
        acctgTagEnumId10("acctgTagEnumId10"),
        acctgTagEnumId2("acctgTagEnumId2"),
        acctgTagEnumId3("acctgTagEnumId3"),
        acctgTagEnumId4("acctgTagEnumId4"),
        acctgTagEnumId5("acctgTagEnumId5"),
        acctgTagEnumId6("acctgTagEnumId6"),
        acctgTagEnumId7("acctgTagEnumId7"),
        acctgTagEnumId8("acctgTagEnumId8"),
        acctgTagEnumId9("acctgTagEnumId9"),
        amountApplied("amountApplied"),
        billingAccountId("billingAccountId"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        invoiceId("invoiceId"),
        invoiceItemSeqId("invoiceItemSeqId"),
        locale("locale"),
        note("note"),
        overrideGlAccountId("overrideGlAccountId"),
        paymentId("paymentId"),
        responseMessage("responseMessage"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        taxAuthGeoId("taxAuthGeoId"),
        timeZone("timeZone"),
        toPaymentId("toPaymentId"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>RemovePaymentApplicationService</code> instance.
     */
    public RemovePaymentApplicationService() {
        super();
    }

    /**
     * Creates a new <code>RemovePaymentApplicationService</code> instance.
     * @param user an <code>User</code> value
     */
    public RemovePaymentApplicationService(User user) {
        super(user);
    }

    private Locale inLocale;
    private String inPaymentApplicationId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outAcctgTagEnumId1;
    private String outAcctgTagEnumId10;
    private String outAcctgTagEnumId2;
    private String outAcctgTagEnumId3;
    private String outAcctgTagEnumId4;
    private String outAcctgTagEnumId5;
    private String outAcctgTagEnumId6;
    private String outAcctgTagEnumId7;
    private String outAcctgTagEnumId8;
    private String outAcctgTagEnumId9;
    private BigDecimal outAmountApplied;
    private String outBillingAccountId;
    private String outErrorMessage;
    private List outErrorMessageList;
    private String outInvoiceId;
    private String outInvoiceItemSeqId;
    private Locale outLocale;
    private String outNote;
    private String outOverrideGlAccountId;
    private String outPaymentId;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private String outTaxAuthGeoId;
    private TimeZone outTimeZone;
    private String outToPaymentId;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

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
    public String getInPaymentApplicationId() {
        return this.inPaymentApplicationId;
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
    public String getOutAcctgTagEnumId1() {
        return this.outAcctgTagEnumId1;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId10() {
        return this.outAcctgTagEnumId10;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId2() {
        return this.outAcctgTagEnumId2;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId3() {
        return this.outAcctgTagEnumId3;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId4() {
        return this.outAcctgTagEnumId4;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId5() {
        return this.outAcctgTagEnumId5;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId6() {
        return this.outAcctgTagEnumId6;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId7() {
        return this.outAcctgTagEnumId7;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId8() {
        return this.outAcctgTagEnumId8;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutAcctgTagEnumId9() {
        return this.outAcctgTagEnumId9;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutAmountApplied() {
        return this.outAmountApplied;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutBillingAccountId() {
        return this.outBillingAccountId;
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
    public String getOutInvoiceId() {
        return this.outInvoiceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutInvoiceItemSeqId() {
        return this.outInvoiceItemSeqId;
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
    public String getOutNote() {
        return this.outNote;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutOverrideGlAccountId() {
        return this.outOverrideGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutPaymentId() {
        return this.outPaymentId;
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
     * @return <code>String</code>
     */
    public String getOutTaxAuthGeoId() {
        return this.outTaxAuthGeoId;
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
     * @return <code>String</code>
     */
    public String getOutToPaymentId() {
        return this.outToPaymentId;
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
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inPaymentApplicationId the inPaymentApplicationId to set
    */
    public void setInPaymentApplicationId(String inPaymentApplicationId) {
        this.inParameters.add("paymentApplicationId");
        this.inPaymentApplicationId = inPaymentApplicationId;
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
     * @param outAcctgTagEnumId1 the outAcctgTagEnumId1 to set
    */
    public void setOutAcctgTagEnumId1(String outAcctgTagEnumId1) {
        this.outParameters.add("acctgTagEnumId1");
        this.outAcctgTagEnumId1 = outAcctgTagEnumId1;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId10 the outAcctgTagEnumId10 to set
    */
    public void setOutAcctgTagEnumId10(String outAcctgTagEnumId10) {
        this.outParameters.add("acctgTagEnumId10");
        this.outAcctgTagEnumId10 = outAcctgTagEnumId10;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId2 the outAcctgTagEnumId2 to set
    */
    public void setOutAcctgTagEnumId2(String outAcctgTagEnumId2) {
        this.outParameters.add("acctgTagEnumId2");
        this.outAcctgTagEnumId2 = outAcctgTagEnumId2;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId3 the outAcctgTagEnumId3 to set
    */
    public void setOutAcctgTagEnumId3(String outAcctgTagEnumId3) {
        this.outParameters.add("acctgTagEnumId3");
        this.outAcctgTagEnumId3 = outAcctgTagEnumId3;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId4 the outAcctgTagEnumId4 to set
    */
    public void setOutAcctgTagEnumId4(String outAcctgTagEnumId4) {
        this.outParameters.add("acctgTagEnumId4");
        this.outAcctgTagEnumId4 = outAcctgTagEnumId4;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId5 the outAcctgTagEnumId5 to set
    */
    public void setOutAcctgTagEnumId5(String outAcctgTagEnumId5) {
        this.outParameters.add("acctgTagEnumId5");
        this.outAcctgTagEnumId5 = outAcctgTagEnumId5;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId6 the outAcctgTagEnumId6 to set
    */
    public void setOutAcctgTagEnumId6(String outAcctgTagEnumId6) {
        this.outParameters.add("acctgTagEnumId6");
        this.outAcctgTagEnumId6 = outAcctgTagEnumId6;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId7 the outAcctgTagEnumId7 to set
    */
    public void setOutAcctgTagEnumId7(String outAcctgTagEnumId7) {
        this.outParameters.add("acctgTagEnumId7");
        this.outAcctgTagEnumId7 = outAcctgTagEnumId7;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId8 the outAcctgTagEnumId8 to set
    */
    public void setOutAcctgTagEnumId8(String outAcctgTagEnumId8) {
        this.outParameters.add("acctgTagEnumId8");
        this.outAcctgTagEnumId8 = outAcctgTagEnumId8;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAcctgTagEnumId9 the outAcctgTagEnumId9 to set
    */
    public void setOutAcctgTagEnumId9(String outAcctgTagEnumId9) {
        this.outParameters.add("acctgTagEnumId9");
        this.outAcctgTagEnumId9 = outAcctgTagEnumId9;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outAmountApplied the outAmountApplied to set
    */
    public void setOutAmountApplied(BigDecimal outAmountApplied) {
        this.outParameters.add("amountApplied");
        this.outAmountApplied = outAmountApplied;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outBillingAccountId the outBillingAccountId to set
    */
    public void setOutBillingAccountId(String outBillingAccountId) {
        this.outParameters.add("billingAccountId");
        this.outBillingAccountId = outBillingAccountId;
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
     * @param outInvoiceId the outInvoiceId to set
    */
    public void setOutInvoiceId(String outInvoiceId) {
        this.outParameters.add("invoiceId");
        this.outInvoiceId = outInvoiceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outInvoiceItemSeqId the outInvoiceItemSeqId to set
    */
    public void setOutInvoiceItemSeqId(String outInvoiceItemSeqId) {
        this.outParameters.add("invoiceItemSeqId");
        this.outInvoiceItemSeqId = outInvoiceItemSeqId;
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
     * @param outNote the outNote to set
    */
    public void setOutNote(String outNote) {
        this.outParameters.add("note");
        this.outNote = outNote;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outOverrideGlAccountId the outOverrideGlAccountId to set
    */
    public void setOutOverrideGlAccountId(String outOverrideGlAccountId) {
        this.outParameters.add("overrideGlAccountId");
        this.outOverrideGlAccountId = outOverrideGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPaymentId the outPaymentId to set
    */
    public void setOutPaymentId(String outPaymentId) {
        this.outParameters.add("paymentId");
        this.outPaymentId = outPaymentId;
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
     * @param outTaxAuthGeoId the outTaxAuthGeoId to set
    */
    public void setOutTaxAuthGeoId(String outTaxAuthGeoId) {
        this.outParameters.add("taxAuthGeoId");
        this.outTaxAuthGeoId = outTaxAuthGeoId;
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
     * @param outToPaymentId the outToPaymentId to set
    */
    public void setOutToPaymentId(String outToPaymentId) {
        this.outParameters.add("toPaymentId");
        this.outToPaymentId = outToPaymentId;
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
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("paymentApplicationId")) mapValue.put("paymentApplicationId", getInPaymentApplicationId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("acctgTagEnumId1")) mapValue.put("acctgTagEnumId1", getOutAcctgTagEnumId1());
        if (outParameters.contains("acctgTagEnumId10")) mapValue.put("acctgTagEnumId10", getOutAcctgTagEnumId10());
        if (outParameters.contains("acctgTagEnumId2")) mapValue.put("acctgTagEnumId2", getOutAcctgTagEnumId2());
        if (outParameters.contains("acctgTagEnumId3")) mapValue.put("acctgTagEnumId3", getOutAcctgTagEnumId3());
        if (outParameters.contains("acctgTagEnumId4")) mapValue.put("acctgTagEnumId4", getOutAcctgTagEnumId4());
        if (outParameters.contains("acctgTagEnumId5")) mapValue.put("acctgTagEnumId5", getOutAcctgTagEnumId5());
        if (outParameters.contains("acctgTagEnumId6")) mapValue.put("acctgTagEnumId6", getOutAcctgTagEnumId6());
        if (outParameters.contains("acctgTagEnumId7")) mapValue.put("acctgTagEnumId7", getOutAcctgTagEnumId7());
        if (outParameters.contains("acctgTagEnumId8")) mapValue.put("acctgTagEnumId8", getOutAcctgTagEnumId8());
        if (outParameters.contains("acctgTagEnumId9")) mapValue.put("acctgTagEnumId9", getOutAcctgTagEnumId9());
        if (outParameters.contains("amountApplied")) mapValue.put("amountApplied", getOutAmountApplied());
        if (outParameters.contains("billingAccountId")) mapValue.put("billingAccountId", getOutBillingAccountId());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("invoiceId")) mapValue.put("invoiceId", getOutInvoiceId());
        if (outParameters.contains("invoiceItemSeqId")) mapValue.put("invoiceItemSeqId", getOutInvoiceItemSeqId());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("note")) mapValue.put("note", getOutNote());
        if (outParameters.contains("overrideGlAccountId")) mapValue.put("overrideGlAccountId", getOutOverrideGlAccountId());
        if (outParameters.contains("paymentId")) mapValue.put("paymentId", getOutPaymentId());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("taxAuthGeoId")) mapValue.put("taxAuthGeoId", getOutTaxAuthGeoId());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("toPaymentId")) mapValue.put("toPaymentId", getOutToPaymentId());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("paymentApplicationId")) setInPaymentApplicationId((String) mapValue.get("paymentApplicationId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("acctgTagEnumId1")) setOutAcctgTagEnumId1((String) mapValue.get("acctgTagEnumId1"));
        if (mapValue.containsKey("acctgTagEnumId10")) setOutAcctgTagEnumId10((String) mapValue.get("acctgTagEnumId10"));
        if (mapValue.containsKey("acctgTagEnumId2")) setOutAcctgTagEnumId2((String) mapValue.get("acctgTagEnumId2"));
        if (mapValue.containsKey("acctgTagEnumId3")) setOutAcctgTagEnumId3((String) mapValue.get("acctgTagEnumId3"));
        if (mapValue.containsKey("acctgTagEnumId4")) setOutAcctgTagEnumId4((String) mapValue.get("acctgTagEnumId4"));
        if (mapValue.containsKey("acctgTagEnumId5")) setOutAcctgTagEnumId5((String) mapValue.get("acctgTagEnumId5"));
        if (mapValue.containsKey("acctgTagEnumId6")) setOutAcctgTagEnumId6((String) mapValue.get("acctgTagEnumId6"));
        if (mapValue.containsKey("acctgTagEnumId7")) setOutAcctgTagEnumId7((String) mapValue.get("acctgTagEnumId7"));
        if (mapValue.containsKey("acctgTagEnumId8")) setOutAcctgTagEnumId8((String) mapValue.get("acctgTagEnumId8"));
        if (mapValue.containsKey("acctgTagEnumId9")) setOutAcctgTagEnumId9((String) mapValue.get("acctgTagEnumId9"));
        if (mapValue.containsKey("amountApplied")) setOutAmountApplied((BigDecimal) mapValue.get("amountApplied"));
        if (mapValue.containsKey("billingAccountId")) setOutBillingAccountId((String) mapValue.get("billingAccountId"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("invoiceId")) setOutInvoiceId((String) mapValue.get("invoiceId"));
        if (mapValue.containsKey("invoiceItemSeqId")) setOutInvoiceItemSeqId((String) mapValue.get("invoiceItemSeqId"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("note")) setOutNote((String) mapValue.get("note"));
        if (mapValue.containsKey("overrideGlAccountId")) setOutOverrideGlAccountId((String) mapValue.get("overrideGlAccountId"));
        if (mapValue.containsKey("paymentId")) setOutPaymentId((String) mapValue.get("paymentId"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("taxAuthGeoId")) setOutTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("toPaymentId")) setOutToPaymentId((String) mapValue.get("toPaymentId"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>RemovePaymentApplicationService</code> from the input values of the given <code>RemovePaymentApplicationService</code>.
     * @param input a <code>RemovePaymentApplicationService</code>
     */
    public static RemovePaymentApplicationService fromInput(RemovePaymentApplicationService input) {
        RemovePaymentApplicationService service = new RemovePaymentApplicationService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>RemovePaymentApplicationService</code> from the output values of the given <code>RemovePaymentApplicationService</code>.
     * @param output a <code>RemovePaymentApplicationService</code>
     */
    public static RemovePaymentApplicationService fromOutput(RemovePaymentApplicationService output) {
        RemovePaymentApplicationService service = new RemovePaymentApplicationService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>RemovePaymentApplicationService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static RemovePaymentApplicationService fromInput(Map<String, Object> mapValue) {
        RemovePaymentApplicationService service = new RemovePaymentApplicationService();
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
     * Construct a <code>RemovePaymentApplicationService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static RemovePaymentApplicationService fromOutput(Map<String, Object> mapValue) {
        RemovePaymentApplicationService service = new RemovePaymentApplicationService();
        service.putAllOutput(mapValue);
        return service;
    }
}
