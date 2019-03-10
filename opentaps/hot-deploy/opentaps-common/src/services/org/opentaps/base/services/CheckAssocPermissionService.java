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

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import javolution.util.FastMap;
import javolution.util.FastSet;
import org.ofbiz.content.content.PermissionRecorder;
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Check for permission to perform operation on Content.
 * Auto generated base service entity checkAssocPermission.
 *
 * Engine: java
 * Location: org.ofbiz.content.content.ContentPermissionServices
 * Invoke: checkAssocPermission
 * Defined in: applications/content/servicedef/services_content.xml
 */
public class CheckAssocPermissionService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "checkAssocPermission";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        contentAssocPredicateId("contentAssocPredicateId"),
        contentAssocTypeId("contentAssocTypeId"),
        contentIdFrom("contentIdFrom"),
        contentIdTo("contentIdTo"),
        contentPurposeList("contentPurposeList"),
        displayFailCond("displayFailCond"),
        entityOperation("entityOperation"),
        fromDate("fromDate"),
        locale("locale"),
        privilegeEnumId("privilegeEnumId"),
        roleTypeList("roleTypeList"),
        statusId("statusId"),
        targetOperationList("targetOperationList"),
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
        permissionRecorder("permissionRecorder"),
        permissionRecorderTo("permissionRecorderTo"),
        permissionStatus("permissionStatus"),
        responseMessage("responseMessage"),
        roleTypeList("roleTypeList"),
        successMessage("successMessage"),
        successMessageList("successMessageList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>CheckAssocPermissionService</code> instance.
     */
    public CheckAssocPermissionService() {
        super();
    }

    /**
     * Creates a new <code>CheckAssocPermissionService</code> instance.
     * @param user an <code>User</code> value
     */
    public CheckAssocPermissionService(User user) {
        super(user);
    }

    private String inContentAssocPredicateId;
    private String inContentAssocTypeId;
    private String inContentIdFrom;
    private String inContentIdTo;
    private List inContentPurposeList;
    private Boolean inDisplayFailCond;
    private String inEntityOperation;
    private String inFromDate;
    private Locale inLocale;
    private String inPrivilegeEnumId;
    private List inRoleTypeList;
    private String inStatusId;
    private List inTargetOperationList;
    private String inThruDate;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private PermissionRecorder outPermissionRecorder;
    private PermissionRecorder outPermissionRecorderTo;
    private String outPermissionStatus;
    private String outResponseMessage;
    private List outRoleTypeList;
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
    public String getInContentAssocPredicateId() {
        return this.inContentAssocPredicateId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentAssocTypeId() {
        return this.inContentAssocTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentIdFrom() {
        return this.inContentIdFrom;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInContentIdTo() {
        return this.inContentIdTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInContentPurposeList() {
        return this.inContentPurposeList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInDisplayFailCond() {
        return this.inDisplayFailCond;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInEntityOperation() {
        return this.inEntityOperation;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInFromDate() {
        return this.inFromDate;
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
    public String getInPrivilegeEnumId() {
        return this.inPrivilegeEnumId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInRoleTypeList() {
        return this.inRoleTypeList;
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
     * @return <code>List</code>
     */
    public List getInTargetOperationList() {
        return this.inTargetOperationList;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInThruDate() {
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
     * @return <code>PermissionRecorder</code>
     */
    public PermissionRecorder getOutPermissionRecorder() {
        return this.outPermissionRecorder;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>PermissionRecorder</code>
     */
    public PermissionRecorder getOutPermissionRecorderTo() {
        return this.outPermissionRecorderTo;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getOutPermissionStatus() {
        return this.outPermissionStatus;
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
     * @return <code>List</code>
     */
    public List getOutRoleTypeList() {
        return this.outRoleTypeList;
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
     * @param inContentAssocPredicateId the inContentAssocPredicateId to set
    */
    public void setInContentAssocPredicateId(String inContentAssocPredicateId) {
        this.inParameters.add("contentAssocPredicateId");
        this.inContentAssocPredicateId = inContentAssocPredicateId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentAssocTypeId the inContentAssocTypeId to set
    */
    public void setInContentAssocTypeId(String inContentAssocTypeId) {
        this.inParameters.add("contentAssocTypeId");
        this.inContentAssocTypeId = inContentAssocTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentIdFrom the inContentIdFrom to set
    */
    public void setInContentIdFrom(String inContentIdFrom) {
        this.inParameters.add("contentIdFrom");
        this.inContentIdFrom = inContentIdFrom;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentIdTo the inContentIdTo to set
    */
    public void setInContentIdTo(String inContentIdTo) {
        this.inParameters.add("contentIdTo");
        this.inContentIdTo = inContentIdTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inContentPurposeList the inContentPurposeList to set
    */
    public void setInContentPurposeList(List inContentPurposeList) {
        this.inParameters.add("contentPurposeList");
        this.inContentPurposeList = inContentPurposeList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDisplayFailCond the inDisplayFailCond to set
    */
    public void setInDisplayFailCond(Boolean inDisplayFailCond) {
        this.inParameters.add("displayFailCond");
        this.inDisplayFailCond = inDisplayFailCond;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inEntityOperation the inEntityOperation to set
    */
    public void setInEntityOperation(String inEntityOperation) {
        this.inParameters.add("entityOperation");
        this.inEntityOperation = inEntityOperation;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(String inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
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
     * @param inPrivilegeEnumId the inPrivilegeEnumId to set
    */
    public void setInPrivilegeEnumId(String inPrivilegeEnumId) {
        this.inParameters.add("privilegeEnumId");
        this.inPrivilegeEnumId = inPrivilegeEnumId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeList the inRoleTypeList to set
    */
    public void setInRoleTypeList(List inRoleTypeList) {
        this.inParameters.add("roleTypeList");
        this.inRoleTypeList = inRoleTypeList;
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
     * @param inTargetOperationList the inTargetOperationList to set
    */
    public void setInTargetOperationList(List inTargetOperationList) {
        this.inParameters.add("targetOperationList");
        this.inTargetOperationList = inTargetOperationList;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inThruDate the inThruDate to set
    */
    public void setInThruDate(String inThruDate) {
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
     * @param outPermissionRecorder the outPermissionRecorder to set
    */
    public void setOutPermissionRecorder(PermissionRecorder outPermissionRecorder) {
        this.outParameters.add("permissionRecorder");
        this.outPermissionRecorder = outPermissionRecorder;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPermissionRecorderTo the outPermissionRecorderTo to set
    */
    public void setOutPermissionRecorderTo(PermissionRecorder outPermissionRecorderTo) {
        this.outParameters.add("permissionRecorderTo");
        this.outPermissionRecorderTo = outPermissionRecorderTo;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param outPermissionStatus the outPermissionStatus to set
    */
    public void setOutPermissionStatus(String outPermissionStatus) {
        this.outParameters.add("permissionStatus");
        this.outPermissionStatus = outPermissionStatus;
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
     * @param outRoleTypeList the outRoleTypeList to set
    */
    public void setOutRoleTypeList(List outRoleTypeList) {
        this.outParameters.add("roleTypeList");
        this.outRoleTypeList = outRoleTypeList;
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
        if (inParameters.contains("contentAssocPredicateId")) mapValue.put("contentAssocPredicateId", getInContentAssocPredicateId());
        if (inParameters.contains("contentAssocTypeId")) mapValue.put("contentAssocTypeId", getInContentAssocTypeId());
        if (inParameters.contains("contentIdFrom")) mapValue.put("contentIdFrom", getInContentIdFrom());
        if (inParameters.contains("contentIdTo")) mapValue.put("contentIdTo", getInContentIdTo());
        if (inParameters.contains("contentPurposeList")) mapValue.put("contentPurposeList", getInContentPurposeList());
        if (inParameters.contains("displayFailCond")) mapValue.put("displayFailCond", getInDisplayFailCond());
        if (inParameters.contains("entityOperation")) mapValue.put("entityOperation", getInEntityOperation());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("privilegeEnumId")) mapValue.put("privilegeEnumId", getInPrivilegeEnumId());
        if (inParameters.contains("roleTypeList")) mapValue.put("roleTypeList", getInRoleTypeList());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("targetOperationList")) mapValue.put("targetOperationList", getInTargetOperationList());
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
        if (outParameters.contains("permissionRecorder")) mapValue.put("permissionRecorder", getOutPermissionRecorder());
        if (outParameters.contains("permissionRecorderTo")) mapValue.put("permissionRecorderTo", getOutPermissionRecorderTo());
        if (outParameters.contains("permissionStatus")) mapValue.put("permissionStatus", getOutPermissionStatus());
        if (outParameters.contains("responseMessage")) mapValue.put("responseMessage", getOutResponseMessage());
        if (outParameters.contains("roleTypeList")) mapValue.put("roleTypeList", getOutRoleTypeList());
        if (outParameters.contains("successMessage")) mapValue.put("successMessage", getOutSuccessMessage());
        if (outParameters.contains("successMessageList")) mapValue.put("successMessageList", getOutSuccessMessageList());
        if (outParameters.contains("timeZone")) mapValue.put("timeZone", getOutTimeZone());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("contentAssocPredicateId")) setInContentAssocPredicateId((String) mapValue.get("contentAssocPredicateId"));
        if (mapValue.containsKey("contentAssocTypeId")) setInContentAssocTypeId((String) mapValue.get("contentAssocTypeId"));
        if (mapValue.containsKey("contentIdFrom")) setInContentIdFrom((String) mapValue.get("contentIdFrom"));
        if (mapValue.containsKey("contentIdTo")) setInContentIdTo((String) mapValue.get("contentIdTo"));
        if (mapValue.containsKey("contentPurposeList")) setInContentPurposeList((List) mapValue.get("contentPurposeList"));
        if (mapValue.containsKey("displayFailCond")) setInDisplayFailCond((Boolean) mapValue.get("displayFailCond"));
        if (mapValue.containsKey("entityOperation")) setInEntityOperation((String) mapValue.get("entityOperation"));
        if (mapValue.containsKey("fromDate")) setInFromDate((String) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("privilegeEnumId")) setInPrivilegeEnumId((String) mapValue.get("privilegeEnumId"));
        if (mapValue.containsKey("roleTypeList")) setInRoleTypeList((List) mapValue.get("roleTypeList"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("targetOperationList")) setInTargetOperationList((List) mapValue.get("targetOperationList"));
        if (mapValue.containsKey("thruDate")) setInThruDate((String) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("errorMessage")) setOutErrorMessage((String) mapValue.get("errorMessage"));
        if (mapValue.containsKey("errorMessageList")) setOutErrorMessageList((List) mapValue.get("errorMessageList"));
        if (mapValue.containsKey("locale")) setOutLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("permissionRecorder")) setOutPermissionRecorder((PermissionRecorder) mapValue.get("permissionRecorder"));
        if (mapValue.containsKey("permissionRecorderTo")) setOutPermissionRecorderTo((PermissionRecorder) mapValue.get("permissionRecorderTo"));
        if (mapValue.containsKey("permissionStatus")) setOutPermissionStatus((String) mapValue.get("permissionStatus"));
        if (mapValue.containsKey("responseMessage")) setOutResponseMessage((String) mapValue.get("responseMessage"));
        if (mapValue.containsKey("roleTypeList")) setOutRoleTypeList((List) mapValue.get("roleTypeList"));
        if (mapValue.containsKey("successMessage")) setOutSuccessMessage((String) mapValue.get("successMessage"));
        if (mapValue.containsKey("successMessageList")) setOutSuccessMessageList((List) mapValue.get("successMessageList"));
        if (mapValue.containsKey("timeZone")) setOutTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>CheckAssocPermissionService</code> from the input values of the given <code>CheckAssocPermissionService</code>.
     * @param input a <code>CheckAssocPermissionService</code>
     */
    public static CheckAssocPermissionService fromInput(CheckAssocPermissionService input) {
        CheckAssocPermissionService service = new CheckAssocPermissionService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CheckAssocPermissionService</code> from the output values of the given <code>CheckAssocPermissionService</code>.
     * @param output a <code>CheckAssocPermissionService</code>
     */
    public static CheckAssocPermissionService fromOutput(CheckAssocPermissionService output) {
        CheckAssocPermissionService service = new CheckAssocPermissionService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CheckAssocPermissionService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CheckAssocPermissionService fromInput(Map<String, Object> mapValue) {
        CheckAssocPermissionService service = new CheckAssocPermissionService();
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
     * Construct a <code>CheckAssocPermissionService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CheckAssocPermissionService fromOutput(Map<String, Object> mapValue) {
        CheckAssocPermissionService service = new CheckAssocPermissionService();
        service.putAllOutput(mapValue);
        return service;
    }
}
