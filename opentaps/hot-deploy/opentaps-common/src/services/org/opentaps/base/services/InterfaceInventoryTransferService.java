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
 * Inventory Transfer Interface.
 * Auto generated base service entity interfaceInventoryTransfer.
 *
 * Engine: interface
 * Location: 
 * Invoke: 
 * Defined in: applications/product/servicedef/services_facility.xml
 */
public class InterfaceInventoryTransferService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "interfaceInventoryTransfer";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.FALSE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        comments("comments"),
        containerId("containerId"),
        containerIdTo("containerIdTo"),
        facilityId("facilityId"),
        facilityIdTo("facilityIdTo"),
        inventoryItemId("inventoryItemId"),
        itemIssuanceId("itemIssuanceId"),
        locale("locale"),
        locationSeqId("locationSeqId"),
        locationSeqIdTo("locationSeqIdTo"),
        receiveDate("receiveDate"),
        sendDate("sendDate"),
        statusId("statusId"),
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
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>InterfaceInventoryTransferService</code> instance.
     */
    public InterfaceInventoryTransferService() {
        super();
    }


    private String inComments;
    private String inContainerId;
    private String inContainerIdTo;
    private String inFacilityId;
    private String inFacilityIdTo;
    private String inInventoryItemId;
    private String inItemIssuanceId;
    private Locale inLocale;
    private String inLocationSeqId;
    private String inLocationSeqIdTo;
    private Timestamp inReceiveDate;
    private Timestamp inSendDate;
    private String inStatusId;
    private TimeZone inTimeZone;
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
    public String getInComments() {
        return this.inComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContainerId() {
        return this.inContainerId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContainerIdTo() {
        return this.inContainerIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFacilityId() {
        return this.inFacilityId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFacilityIdTo() {
        return this.inFacilityIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInInventoryItemId() {
        return this.inInventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInItemIssuanceId() {
        return this.inItemIssuanceId;
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
    public String getInLocationSeqId() {
        return this.inLocationSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLocationSeqIdTo() {
        return this.inLocationSeqIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInReceiveDate() {
        return this.inReceiveDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInSendDate() {
        return this.inSendDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInStatusId() {
        return this.inStatusId;
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
     * @param inContainerId the inContainerId to set
    */
    public void setInContainerId(String inContainerId) {
        this.inParameters.add("containerId");
        this.inContainerId = inContainerId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContainerIdTo the inContainerIdTo to set
    */
    public void setInContainerIdTo(String inContainerIdTo) {
        this.inParameters.add("containerIdTo");
        this.inContainerIdTo = inContainerIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFacilityId the inFacilityId to set
    */
    public void setInFacilityId(String inFacilityId) {
        this.inParameters.add("facilityId");
        this.inFacilityId = inFacilityId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFacilityIdTo the inFacilityIdTo to set
    */
    public void setInFacilityIdTo(String inFacilityIdTo) {
        this.inParameters.add("facilityIdTo");
        this.inFacilityIdTo = inFacilityIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inInventoryItemId the inInventoryItemId to set
    */
    public void setInInventoryItemId(String inInventoryItemId) {
        this.inParameters.add("inventoryItemId");
        this.inInventoryItemId = inInventoryItemId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inItemIssuanceId the inItemIssuanceId to set
    */
    public void setInItemIssuanceId(String inItemIssuanceId) {
        this.inParameters.add("itemIssuanceId");
        this.inItemIssuanceId = inItemIssuanceId;
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
     * @param inLocationSeqId the inLocationSeqId to set
    */
    public void setInLocationSeqId(String inLocationSeqId) {
        this.inParameters.add("locationSeqId");
        this.inLocationSeqId = inLocationSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocationSeqIdTo the inLocationSeqIdTo to set
    */
    public void setInLocationSeqIdTo(String inLocationSeqIdTo) {
        this.inParameters.add("locationSeqIdTo");
        this.inLocationSeqIdTo = inLocationSeqIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inReceiveDate the inReceiveDate to set
    */
    public void setInReceiveDate(Timestamp inReceiveDate) {
        this.inParameters.add("receiveDate");
        this.inReceiveDate = inReceiveDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSendDate the inSendDate to set
    */
    public void setInSendDate(Timestamp inSendDate) {
        this.inParameters.add("sendDate");
        this.inSendDate = inSendDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inStatusId the inStatusId to set
    */
    public void setInStatusId(String inStatusId) {
        this.inParameters.add("statusId");
        this.inStatusId = inStatusId;
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
        if (inParameters.contains("containerId")) mapValue.put("containerId", getInContainerId());
        if (inParameters.contains("containerIdTo")) mapValue.put("containerIdTo", getInContainerIdTo());
        if (inParameters.contains("facilityId")) mapValue.put("facilityId", getInFacilityId());
        if (inParameters.contains("facilityIdTo")) mapValue.put("facilityIdTo", getInFacilityIdTo());
        if (inParameters.contains("inventoryItemId")) mapValue.put("inventoryItemId", getInInventoryItemId());
        if (inParameters.contains("itemIssuanceId")) mapValue.put("itemIssuanceId", getInItemIssuanceId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("locationSeqId")) mapValue.put("locationSeqId", getInLocationSeqId());
        if (inParameters.contains("locationSeqIdTo")) mapValue.put("locationSeqIdTo", getInLocationSeqIdTo());
        if (inParameters.contains("receiveDate")) mapValue.put("receiveDate", getInReceiveDate());
        if (inParameters.contains("sendDate")) mapValue.put("sendDate", getInSendDate());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
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
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("containerId")) setInContainerId((String) mapValue.get("containerId"));
        if (mapValue.containsKey("containerIdTo")) setInContainerIdTo((String) mapValue.get("containerIdTo"));
        if (mapValue.containsKey("facilityId")) setInFacilityId((String) mapValue.get("facilityId"));
        if (mapValue.containsKey("facilityIdTo")) setInFacilityIdTo((String) mapValue.get("facilityIdTo"));
        if (mapValue.containsKey("inventoryItemId")) setInInventoryItemId((String) mapValue.get("inventoryItemId"));
        if (mapValue.containsKey("itemIssuanceId")) setInItemIssuanceId((String) mapValue.get("itemIssuanceId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("locationSeqId")) setInLocationSeqId((String) mapValue.get("locationSeqId"));
        if (mapValue.containsKey("locationSeqIdTo")) setInLocationSeqIdTo((String) mapValue.get("locationSeqIdTo"));
        if (mapValue.containsKey("receiveDate")) setInReceiveDate((Timestamp) mapValue.get("receiveDate"));
        if (mapValue.containsKey("sendDate")) setInSendDate((Timestamp) mapValue.get("sendDate"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
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
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>InterfaceInventoryTransferService</code> from the input values of the given <code>InterfaceInventoryTransferService</code>.
     * @param input a <code>InterfaceInventoryTransferService</code>
     */
    public static InterfaceInventoryTransferService fromInput(InterfaceInventoryTransferService input) {
        InterfaceInventoryTransferService service = new InterfaceInventoryTransferService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>InterfaceInventoryTransferService</code> from the output values of the given <code>InterfaceInventoryTransferService</code>.
     * @param output a <code>InterfaceInventoryTransferService</code>
     */
    public static InterfaceInventoryTransferService fromOutput(InterfaceInventoryTransferService output) {
        InterfaceInventoryTransferService service = new InterfaceInventoryTransferService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>InterfaceInventoryTransferService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static InterfaceInventoryTransferService fromInput(Map<String, Object> mapValue) {
        InterfaceInventoryTransferService service = new InterfaceInventoryTransferService();
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
     * Construct a <code>InterfaceInventoryTransferService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static InterfaceInventoryTransferService fromOutput(Map<String, Object> mapValue) {
        InterfaceInventoryTransferService service = new InterfaceInventoryTransferService();
        service.putAllOutput(mapValue);
        return service;
    }
}
