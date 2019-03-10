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
 * Reserve Inventory for a Product By Facility
            If requireInventory is Y the quantity not reserved is returned, if N then a negative
            availableToPromise will be used to track quantity ordered beyond what is in stock.
        .
 * Auto generated base service entity reserveProductInventoryByFacility.
 *
 * Engine: pojo
 * Location: org.opentaps.common.domain.inventory.OrderInventoryService
 * Invoke: reserveProductInventory
 * Defined in: hot-deploy/opentaps-common/servicedef/services_orders.xml
 */
public class ReserveProductInventoryByFacilityService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "reserveProductInventoryByFacility";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        facilityId("facilityId"),
        locale("locale"),
        orderId("orderId"),
        orderItemSeqId("orderItemSeqId"),
        priority("priority"),
        productId("productId"),
        quantity("quantity"),
        requireInventory("requireInventory"),
        reserveOrderEnumId("reserveOrderEnumId"),
        reservedDatetime("reservedDatetime"),
        sequenceId("sequenceId"),
        shipGroupSeqId("shipGroupSeqId"),
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
        quantityNotReserved("quantityNotReserved"),
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
     * Creates a new <code>ReserveProductInventoryByFacilityService</code> instance.
     */
    public ReserveProductInventoryByFacilityService() {
        super();
    }

    /**
     * Creates a new <code>ReserveProductInventoryByFacilityService</code> instance.
     * @param user an <code>User</code> value
     */
    public ReserveProductInventoryByFacilityService(User user) {
        super(user);
    }

    private String inFacilityId;
    private Locale inLocale;
    private String inOrderId;
    private String inOrderItemSeqId;
    private String inPriority;
    private String inProductId;
    private BigDecimal inQuantity;
    private String inRequireInventory;
    private String inReserveOrderEnumId;
    private Timestamp inReservedDatetime;
    private Long inSequenceId;
    private String inShipGroupSeqId;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private BigDecimal outQuantityNotReserved;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFacilityId() {
        return this.inFacilityId;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInOrderItemSeqId() {
        return this.inOrderItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInPriority() {
        return this.inPriority;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInQuantity() {
        return this.inQuantity;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInRequireInventory() {
        return this.inRequireInventory;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInReserveOrderEnumId() {
        return this.inReserveOrderEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInReservedDatetime() {
        return this.inReservedDatetime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInSequenceId() {
        return this.inSequenceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInShipGroupSeqId() {
        return this.inShipGroupSeqId;
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
     * This parameter is required.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getOutQuantityNotReserved() {
        return this.outQuantityNotReserved;
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
     * This parameter is required.
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
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
     * This parameter is required.
     * @param inOrderItemSeqId the inOrderItemSeqId to set
    */
    public void setInOrderItemSeqId(String inOrderItemSeqId) {
        this.inParameters.add("orderItemSeqId");
        this.inOrderItemSeqId = inOrderItemSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPriority the inPriority to set
    */
    public void setInPriority(String inPriority) {
        this.inParameters.add("priority");
        this.inPriority = inPriority;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inQuantity the inQuantity to set
    */
    public void setInQuantity(BigDecimal inQuantity) {
        this.inParameters.add("quantity");
        this.inQuantity = inQuantity;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inRequireInventory the inRequireInventory to set
    */
    public void setInRequireInventory(String inRequireInventory) {
        this.inParameters.add("requireInventory");
        this.inRequireInventory = inRequireInventory;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReserveOrderEnumId the inReserveOrderEnumId to set
    */
    public void setInReserveOrderEnumId(String inReserveOrderEnumId) {
        this.inParameters.add("reserveOrderEnumId");
        this.inReserveOrderEnumId = inReserveOrderEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReservedDatetime the inReservedDatetime to set
    */
    public void setInReservedDatetime(Timestamp inReservedDatetime) {
        this.inParameters.add("reservedDatetime");
        this.inReservedDatetime = inReservedDatetime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSequenceId the inSequenceId to set
    */
    public void setInSequenceId(Long inSequenceId) {
        this.inParameters.add("sequenceId");
        this.inSequenceId = inSequenceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inShipGroupSeqId the inShipGroupSeqId to set
    */
    public void setInShipGroupSeqId(String inShipGroupSeqId) {
        this.inParameters.add("shipGroupSeqId");
        this.inShipGroupSeqId = inShipGroupSeqId;
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
     * This parameter is required.
     * @param outQuantityNotReserved the outQuantityNotReserved to set
    */
    public void setOutQuantityNotReserved(BigDecimal outQuantityNotReserved) {
        this.outParameters.add("quantityNotReserved");
        this.outQuantityNotReserved = outQuantityNotReserved;
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
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("orderId")) mapValue.put("orderId", getInOrderId());
        if (inParameters.contains("orderItemSeqId")) mapValue.put("orderItemSeqId", getInOrderItemSeqId());
        if (inParameters.contains("priority")) mapValue.put("priority", getInPriority());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("quantity")) mapValue.put("quantity", getInQuantity());
        if (inParameters.contains("requireInventory")) mapValue.put("requireInventory", getInRequireInventory());
        if (inParameters.contains("reserveOrderEnumId")) mapValue.put("reserveOrderEnumId", getInReserveOrderEnumId());
        if (inParameters.contains("reservedDatetime")) mapValue.put("reservedDatetime", getInReservedDatetime());
        if (inParameters.contains("sequenceId")) mapValue.put("sequenceId", getInSequenceId());
        if (inParameters.contains("shipGroupSeqId")) mapValue.put("shipGroupSeqId", getInShipGroupSeqId());
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
        if (outParameters.contains("quantityNotReserved")) mapValue.put("quantityNotReserved", getOutQuantityNotReserved());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("orderId")) setInOrderId((String) mapValue.get("orderId"));
        if (mapValue.containsKey("orderItemSeqId")) setInOrderItemSeqId((String) mapValue.get("orderItemSeqId"));
        if (mapValue.containsKey("priority")) setInPriority((String) mapValue.get("priority"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("quantity")) setInQuantity((BigDecimal) mapValue.get("quantity"));
        if (mapValue.containsKey("requireInventory")) setInRequireInventory((String) mapValue.get("requireInventory"));
        if (mapValue.containsKey("reserveOrderEnumId")) setInReserveOrderEnumId((String) mapValue.get("reserveOrderEnumId"));
        if (mapValue.containsKey("reservedDatetime")) setInReservedDatetime((Timestamp) mapValue.get("reservedDatetime"));
        if (mapValue.containsKey("sequenceId")) setInSequenceId((Long) mapValue.get("sequenceId"));
        if (mapValue.containsKey("shipGroupSeqId")) setInShipGroupSeqId((String) mapValue.get("shipGroupSeqId"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("quantityNotReserved")) setOutQuantityNotReserved((BigDecimal) mapValue.get("quantityNotReserved"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>ReserveProductInventoryByFacilityService</code> from the input values of the given <code>ReserveProductInventoryByFacilityService</code>.
     * @param input a <code>ReserveProductInventoryByFacilityService</code>
     */
    public static ReserveProductInventoryByFacilityService fromInput(ReserveProductInventoryByFacilityService input) {
        ReserveProductInventoryByFacilityService service = new ReserveProductInventoryByFacilityService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>ReserveProductInventoryByFacilityService</code> from the output values of the given <code>ReserveProductInventoryByFacilityService</code>.
     * @param output a <code>ReserveProductInventoryByFacilityService</code>
     */
    public static ReserveProductInventoryByFacilityService fromOutput(ReserveProductInventoryByFacilityService output) {
        ReserveProductInventoryByFacilityService service = new ReserveProductInventoryByFacilityService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>ReserveProductInventoryByFacilityService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ReserveProductInventoryByFacilityService fromInput(Map<String, Object> mapValue) {
        ReserveProductInventoryByFacilityService service = new ReserveProductInventoryByFacilityService();
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
     * Construct a <code>ReserveProductInventoryByFacilityService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ReserveProductInventoryByFacilityService fromOutput(Map<String, Object> mapValue) {
        ReserveProductInventoryByFacilityService service = new ReserveProductInventoryByFacilityService();
        service.putAllOutput(mapValue);
        return service;
    }
}
