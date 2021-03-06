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
 * 
            Add a TimeEntry for the production run task and updates the relevant fields.
        .
 * Auto generated base service entity updateProductionRunTask.
 *
 * Engine: java
 * Location: org.ofbiz.manufacturing.jobshopmgt.ProductionRunServices
 * Invoke: updateProductionRunTask
 * Defined in: applications/manufacturing/servicedef/services_production_run.xml
 */
public class UpdateProductionRunTaskService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateProductionRunTask";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        addQuantityProduced("addQuantityProduced"),
        addQuantityRejected("addQuantityRejected"),
        addSetupTime("addSetupTime"),
        addTaskTime("addTaskTime"),
        comments("comments"),
        componentsLocationMap("componentsLocationMap"),
        fromDate("fromDate"),
        issueRequiredComponents("issueRequiredComponents"),
        locale("locale"),
        partyId("partyId"),
        productionRunId("productionRunId"),
        productionRunTaskId("productionRunTaskId"),
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
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>UpdateProductionRunTaskService</code> instance.
     */
    public UpdateProductionRunTaskService() {
        super();
    }

    /**
     * Creates a new <code>UpdateProductionRunTaskService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateProductionRunTaskService(User user) {
        super(user);
    }

    private BigDecimal inAddQuantityProduced;
    private BigDecimal inAddQuantityRejected;
    private BigDecimal inAddSetupTime;
    private BigDecimal inAddTaskTime;
    private String inComments;
    private Map inComponentsLocationMap;
    private Timestamp inFromDate;
    private Boolean inIssueRequiredComponents;
    private Locale inLocale;
    private String inPartyId;
    private String inProductionRunId;
    private String inProductionRunTaskId;
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
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAddQuantityProduced() {
        return this.inAddQuantityProduced;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAddQuantityRejected() {
        return this.inAddQuantityRejected;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAddSetupTime() {
        return this.inAddSetupTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInAddTaskTime() {
        return this.inAddTaskTime;
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
     * @return <code>Map</code>
     */
    public Map getInComponentsLocationMap() {
        return this.inComponentsLocationMap;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInFromDate() {
        return this.inFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Boolean</code>
     */
    public Boolean getInIssueRequiredComponents() {
        return this.inIssueRequiredComponents;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductionRunId() {
        return this.inProductionRunId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInProductionRunTaskId() {
        return this.inProductionRunTaskId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
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
     * This parameter is optional.
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutUserLogin() {
        return this.outUserLogin;
    }

    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAddQuantityProduced the inAddQuantityProduced to set
    */
    public void setInAddQuantityProduced(BigDecimal inAddQuantityProduced) {
        this.inParameters.add("addQuantityProduced");
        this.inAddQuantityProduced = inAddQuantityProduced;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAddQuantityRejected the inAddQuantityRejected to set
    */
    public void setInAddQuantityRejected(BigDecimal inAddQuantityRejected) {
        this.inParameters.add("addQuantityRejected");
        this.inAddQuantityRejected = inAddQuantityRejected;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAddSetupTime the inAddSetupTime to set
    */
    public void setInAddSetupTime(BigDecimal inAddSetupTime) {
        this.inParameters.add("addSetupTime");
        this.inAddSetupTime = inAddSetupTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAddTaskTime the inAddTaskTime to set
    */
    public void setInAddTaskTime(BigDecimal inAddTaskTime) {
        this.inParameters.add("addTaskTime");
        this.inAddTaskTime = inAddTaskTime;
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
     * @param inComponentsLocationMap the inComponentsLocationMap to set
    */
    public void setInComponentsLocationMap(Map inComponentsLocationMap) {
        this.inParameters.add("componentsLocationMap");
        this.inComponentsLocationMap = inComponentsLocationMap;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inFromDate the inFromDate to set
    */
    public void setInFromDate(Timestamp inFromDate) {
        this.inParameters.add("fromDate");
        this.inFromDate = inFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIssueRequiredComponents the inIssueRequiredComponents to set
    */
    public void setInIssueRequiredComponents(Boolean inIssueRequiredComponents) {
        this.inParameters.add("issueRequiredComponents");
        this.inIssueRequiredComponents = inIssueRequiredComponents;
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
     * This parameter is required.
     * @param inProductionRunId the inProductionRunId to set
    */
    public void setInProductionRunId(String inProductionRunId) {
        this.inParameters.add("productionRunId");
        this.inProductionRunId = inProductionRunId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inProductionRunTaskId the inProductionRunTaskId to set
    */
    public void setInProductionRunTaskId(String inProductionRunTaskId) {
        this.inParameters.add("productionRunTaskId");
        this.inProductionRunTaskId = inProductionRunTaskId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
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
        if (inParameters.contains("addQuantityProduced")) mapValue.put("addQuantityProduced", getInAddQuantityProduced());
        if (inParameters.contains("addQuantityRejected")) mapValue.put("addQuantityRejected", getInAddQuantityRejected());
        if (inParameters.contains("addSetupTime")) mapValue.put("addSetupTime", getInAddSetupTime());
        if (inParameters.contains("addTaskTime")) mapValue.put("addTaskTime", getInAddTaskTime());
        if (inParameters.contains("comments")) mapValue.put("comments", getInComments());
        if (inParameters.contains("componentsLocationMap")) mapValue.put("componentsLocationMap", getInComponentsLocationMap());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("issueRequiredComponents")) mapValue.put("issueRequiredComponents", getInIssueRequiredComponents());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("productionRunId")) mapValue.put("productionRunId", getInProductionRunId());
        if (inParameters.contains("productionRunTaskId")) mapValue.put("productionRunTaskId", getInProductionRunTaskId());
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
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("addQuantityProduced")) setInAddQuantityProduced((BigDecimal) mapValue.get("addQuantityProduced"));
        if (mapValue.containsKey("addQuantityRejected")) setInAddQuantityRejected((BigDecimal) mapValue.get("addQuantityRejected"));
        if (mapValue.containsKey("addSetupTime")) setInAddSetupTime((BigDecimal) mapValue.get("addSetupTime"));
        if (mapValue.containsKey("addTaskTime")) setInAddTaskTime((BigDecimal) mapValue.get("addTaskTime"));
        if (mapValue.containsKey("comments")) setInComments((String) mapValue.get("comments"));
        if (mapValue.containsKey("componentsLocationMap")) setInComponentsLocationMap((Map) mapValue.get("componentsLocationMap"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("issueRequiredComponents")) setInIssueRequiredComponents((Boolean) mapValue.get("issueRequiredComponents"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("productionRunId")) setInProductionRunId((String) mapValue.get("productionRunId"));
        if (mapValue.containsKey("productionRunTaskId")) setInProductionRunTaskId((String) mapValue.get("productionRunTaskId"));
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
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>UpdateProductionRunTaskService</code> from the input values of the given <code>UpdateProductionRunTaskService</code>.
     * @param input a <code>UpdateProductionRunTaskService</code>
     */
    public static UpdateProductionRunTaskService fromInput(UpdateProductionRunTaskService input) {
        UpdateProductionRunTaskService service = new UpdateProductionRunTaskService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateProductionRunTaskService</code> from the output values of the given <code>UpdateProductionRunTaskService</code>.
     * @param output a <code>UpdateProductionRunTaskService</code>
     */
    public static UpdateProductionRunTaskService fromOutput(UpdateProductionRunTaskService output) {
        UpdateProductionRunTaskService service = new UpdateProductionRunTaskService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateProductionRunTaskService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateProductionRunTaskService fromInput(Map<String, Object> mapValue) {
        UpdateProductionRunTaskService service = new UpdateProductionRunTaskService();
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
     * Construct a <code>UpdateProductionRunTaskService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateProductionRunTaskService fromOutput(Map<String, Object> mapValue) {
        UpdateProductionRunTaskService service = new UpdateProductionRunTaskService();
        service.putAllOutput(mapValue);
        return service;
    }
}
