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
 * Get the total amount of all returns for an order: orderTotal, returnTotal - totals so far.  availableReturnTotal = orderTotal - returnTotal - adjustment.  Used for checking if the return total has gone over the order total.  If countNewReturnItems is set to Boolean.TRUE then return items in the CREATED state will be counted.  This should only be the case during quickRefundEntireOrder..
 * Auto generated base service entity getOrderAvailableReturnedTotal.
 *
 * Engine: java
 * Location: org.ofbiz.order.order.OrderReturnServices
 * Invoke: getOrderAvailableReturnedTotal
 * Defined in: applications/order/servicedef/services_return.xml
 */
public class GetOrderAvailableReturnedTotalService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "getOrderAvailableReturnedTotal";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        adjustment("adjustment"),
        countNewReturnItems("countNewReturnItems"),
        locale("locale"),
        orderId("orderId"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        availableReturnTotal("availableReturnTotal"),
        errorMessage("errorMessage"),
        errorMessageList("errorMessageList"),
        locale("locale"),
        orderTotal("orderTotal"),
        responseMessage("responseMessage"),
        returnTotal("returnTotal"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>GetOrderAvailableReturnedTotalService</code> instance.
     */
    public GetOrderAvailableReturnedTotalService() {
        super();
    }


    private BigDecimal inAdjustment;
    private Boolean inCountNewReturnItems;
    private Locale inLocale;
    private String inOrderId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private BigDecimal outAvailableReturnTotal;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private BigDecimal outOrderTotal;
    private String outResponseMessage;
    private BigDecimal outReturnTotal;
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
    public BigDecimal getInAdjustment() {
        return this.inAdjustment;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInCountNewReturnItems() {
        return this.inCountNewReturnItems;
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
    public String getInOrderId() {
        return this.inOrderId;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutAvailableReturnTotal() {
        return this.outAvailableReturnTotal;
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
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutOrderTotal() {
        return this.outOrderTotal;
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
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutReturnTotal() {
        return this.outReturnTotal;
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
     * @param inAdjustment the inAdjustment to set
    */
    public void setInAdjustment(BigDecimal inAdjustment) {
        this.inParameters.add("adjustment");
        this.inAdjustment = inAdjustment;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCountNewReturnItems the inCountNewReturnItems to set
    */
    public void setInCountNewReturnItems(Boolean inCountNewReturnItems) {
        this.inParameters.add("countNewReturnItems");
        this.inCountNewReturnItems = inCountNewReturnItems;
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
     * @param inOrderId the inOrderId to set
    */
    public void setInOrderId(String inOrderId) {
        this.inParameters.add("orderId");
        this.inOrderId = inOrderId;
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
     * @param outAvailableReturnTotal the outAvailableReturnTotal to set
    */
    public void setOutAvailableReturnTotal(BigDecimal outAvailableReturnTotal) {
        this.outParameters.add("availableReturnTotal");
        this.outAvailableReturnTotal = outAvailableReturnTotal;
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
     * This parameter is required.
     * @param outOrderTotal the outOrderTotal to set
    */
    public void setOutOrderTotal(BigDecimal outOrderTotal) {
        this.outParameters.add("orderTotal");
        this.outOrderTotal = outOrderTotal;
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
     * This parameter is required.
     * @param outReturnTotal the outReturnTotal to set
    */
    public void setOutReturnTotal(BigDecimal outReturnTotal) {
        this.outParameters.add("returnTotal");
        this.outReturnTotal = outReturnTotal;
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
        if (inParameters.contains("adjustment")) mapValue.put("adjustment", getInAdjustment());
        if (inParameters.contains("countNewReturnItems")) mapValue.put("countNewReturnItems", getInCountNewReturnItems());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("availableReturnTotal")) mapValue.put("availableReturnTotal", getOutAvailableReturnTotal());
        if (outParameters.contains("errorMessage")) mapValue.put("errorMessage", getOutErrorMessage());
        if (outParameters.contains("errorMessageList")) mapValue.put("errorMessageList", getOutErrorMessageList());
        if (outParameters.contains("locale")) mapValue.put("locale", getOutLocale());
        if (outParameters.contains("orderTotal")) mapValue.put("orderTotal", getOutOrderTotal());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("returnTotal")) mapValue.put("returnTotal", getOutReturnTotal());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("adjustment")) setInAdjustment((BigDecimal) mapValue.get("adjustment"));
        if (mapValue.containsKey("countNewReturnItems")) setInCountNewReturnItems((Boolean) mapValue.get("countNewReturnItems"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("availableReturnTotal")) setOutAvailableReturnTotal((BigDecimal) mapValue.get("availableReturnTotal"));
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderTotal")) setOutOrderTotal((BigDecimal) mapValue.get("orderTotal"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("returnTotal")) setOutReturnTotal((BigDecimal) mapValue.get("returnTotal"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>GetOrderAvailableReturnedTotalService</code> from the input values of the given <code>GetOrderAvailableReturnedTotalService</code>.
     * @param input a <code>GetOrderAvailableReturnedTotalService</code>
     */
    public static GetOrderAvailableReturnedTotalService fromInput(GetOrderAvailableReturnedTotalService input) {
        GetOrderAvailableReturnedTotalService service = new GetOrderAvailableReturnedTotalService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>GetOrderAvailableReturnedTotalService</code> from the output values of the given <code>GetOrderAvailableReturnedTotalService</code>.
     * @param output a <code>GetOrderAvailableReturnedTotalService</code>
     */
    public static GetOrderAvailableReturnedTotalService fromOutput(GetOrderAvailableReturnedTotalService output) {
        GetOrderAvailableReturnedTotalService service = new GetOrderAvailableReturnedTotalService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>GetOrderAvailableReturnedTotalService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static GetOrderAvailableReturnedTotalService fromInput(Map<String, Object> mapValue) {
        GetOrderAvailableReturnedTotalService service = new GetOrderAvailableReturnedTotalService();
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
     * Construct a <code>GetOrderAvailableReturnedTotalService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static GetOrderAvailableReturnedTotalService fromOutput(Map<String, Object> mapValue) {
        GetOrderAvailableReturnedTotalService service = new GetOrderAvailableReturnedTotalService();
        service.putAllOutput(mapValue);
        return service;
    }
}
