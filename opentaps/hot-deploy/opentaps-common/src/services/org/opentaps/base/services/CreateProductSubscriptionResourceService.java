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
 * Create a ProductSubscriptionResource Record.
 * Auto generated base service entity createProductSubscriptionResource.
 *
 * Engine: simple
 * Location: component://product/script/org/ofbiz/product/subscription/SubscriptionServices.xml
 * Invoke: createProductSubscriptionResource
 * Defined in: applications/product/servicedef/services_subscription.xml
 */
public class CreateProductSubscriptionResourceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createProductSubscriptionResource";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        automaticExtend("automaticExtend"),
        availableTime("availableTime"),
        availableTimeUomId("availableTimeUomId"),
        canclAutmExtTime("canclAutmExtTime"),
        canclAutmExtTimeUomId("canclAutmExtTimeUomId"),
        fromDate("fromDate"),
        locale("locale"),
        maxLifeTime("maxLifeTime"),
        maxLifeTimeUomId("maxLifeTimeUomId"),
        productId("productId"),
        purchaseFromDate("purchaseFromDate"),
        purchaseThruDate("purchaseThruDate"),
        subscriptionResourceId("subscriptionResourceId"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        useCountLimit("useCountLimit"),
        useRoleTypeId("useRoleTypeId"),
        useTime("useTime"),
        useTimeUomId("useTimeUomId"),
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
     * Creates a new <code>CreateProductSubscriptionResourceService</code> instance.
     */
    public CreateProductSubscriptionResourceService() {
        super();
    }

    /**
     * Creates a new <code>CreateProductSubscriptionResourceService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateProductSubscriptionResourceService(User user) {
        super(user);
    }

    private String inAutomaticExtend;
    private Long inAvailableTime;
    private String inAvailableTimeUomId;
    private Long inCanclAutmExtTime;
    private String inCanclAutmExtTimeUomId;
    private Timestamp inFromDate;
    private Locale inLocale;
    private Long inMaxLifeTime;
    private String inMaxLifeTimeUomId;
    private String inProductId;
    private Timestamp inPurchaseFromDate;
    private Timestamp inPurchaseThruDate;
    private String inSubscriptionResourceId;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private Long inUseCountLimit;
    private String inUseRoleTypeId;
    private Long inUseTime;
    private String inUseTimeUomId;
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
    public String getInAutomaticExtend() {
        return this.inAutomaticExtend;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInAvailableTime() {
        return this.inAvailableTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAvailableTimeUomId() {
        return this.inAvailableTimeUomId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInCanclAutmExtTime() {
        return this.inCanclAutmExtTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInCanclAutmExtTimeUomId() {
        return this.inCanclAutmExtTimeUomId;
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
     * @return <code>Locale</code>
     */
    public Locale getInLocale() {
        return this.inLocale;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInMaxLifeTime() {
        return this.inMaxLifeTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInMaxLifeTimeUomId() {
        return this.inMaxLifeTimeUomId;
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
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPurchaseFromDate() {
        return this.inPurchaseFromDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInPurchaseThruDate() {
        return this.inPurchaseThruDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInSubscriptionResourceId() {
        return this.inSubscriptionResourceId;
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
     * @return <code>Long</code>
     */
    public Long getInUseCountLimit() {
        return this.inUseCountLimit;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUseRoleTypeId() {
        return this.inUseRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Long</code>
     */
    public Long getInUseTime() {
        return this.inUseTime;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInUseTimeUomId() {
        return this.inUseTimeUomId;
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
     * @param inAutomaticExtend the inAutomaticExtend to set
    */
    public void setInAutomaticExtend(String inAutomaticExtend) {
        this.inParameters.add("automaticExtend");
        this.inAutomaticExtend = inAutomaticExtend;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAvailableTime the inAvailableTime to set
    */
    public void setInAvailableTime(Long inAvailableTime) {
        this.inParameters.add("availableTime");
        this.inAvailableTime = inAvailableTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAvailableTimeUomId the inAvailableTimeUomId to set
    */
    public void setInAvailableTimeUomId(String inAvailableTimeUomId) {
        this.inParameters.add("availableTimeUomId");
        this.inAvailableTimeUomId = inAvailableTimeUomId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCanclAutmExtTime the inCanclAutmExtTime to set
    */
    public void setInCanclAutmExtTime(Long inCanclAutmExtTime) {
        this.inParameters.add("canclAutmExtTime");
        this.inCanclAutmExtTime = inCanclAutmExtTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCanclAutmExtTimeUomId the inCanclAutmExtTimeUomId to set
    */
    public void setInCanclAutmExtTimeUomId(String inCanclAutmExtTimeUomId) {
        this.inParameters.add("canclAutmExtTimeUomId");
        this.inCanclAutmExtTimeUomId = inCanclAutmExtTimeUomId;
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
     * @param inLocale the inLocale to set
    */
    public void setInLocale(Locale inLocale) {
        this.inParameters.add("locale");
        this.inLocale = inLocale;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaxLifeTime the inMaxLifeTime to set
    */
    public void setInMaxLifeTime(Long inMaxLifeTime) {
        this.inParameters.add("maxLifeTime");
        this.inMaxLifeTime = inMaxLifeTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMaxLifeTimeUomId the inMaxLifeTimeUomId to set
    */
    public void setInMaxLifeTimeUomId(String inMaxLifeTimeUomId) {
        this.inParameters.add("maxLifeTimeUomId");
        this.inMaxLifeTimeUomId = inMaxLifeTimeUomId;
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
     * This parameter is optional.
     * @param inPurchaseFromDate the inPurchaseFromDate to set
    */
    public void setInPurchaseFromDate(Timestamp inPurchaseFromDate) {
        this.inParameters.add("purchaseFromDate");
        this.inPurchaseFromDate = inPurchaseFromDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPurchaseThruDate the inPurchaseThruDate to set
    */
    public void setInPurchaseThruDate(Timestamp inPurchaseThruDate) {
        this.inParameters.add("purchaseThruDate");
        this.inPurchaseThruDate = inPurchaseThruDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inSubscriptionResourceId the inSubscriptionResourceId to set
    */
    public void setInSubscriptionResourceId(String inSubscriptionResourceId) {
        this.inParameters.add("subscriptionResourceId");
        this.inSubscriptionResourceId = inSubscriptionResourceId;
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
     * @param inUseCountLimit the inUseCountLimit to set
    */
    public void setInUseCountLimit(Long inUseCountLimit) {
        this.inParameters.add("useCountLimit");
        this.inUseCountLimit = inUseCountLimit;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseRoleTypeId the inUseRoleTypeId to set
    */
    public void setInUseRoleTypeId(String inUseRoleTypeId) {
        this.inParameters.add("useRoleTypeId");
        this.inUseRoleTypeId = inUseRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseTime the inUseTime to set
    */
    public void setInUseTime(Long inUseTime) {
        this.inParameters.add("useTime");
        this.inUseTime = inUseTime;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inUseTimeUomId the inUseTimeUomId to set
    */
    public void setInUseTimeUomId(String inUseTimeUomId) {
        this.inParameters.add("useTimeUomId");
        this.inUseTimeUomId = inUseTimeUomId;
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
        if (inParameters.contains("automaticExtend")) mapValue.put("automaticExtend", getInAutomaticExtend());
        if (inParameters.contains("availableTime")) mapValue.put("availableTime", getInAvailableTime());
        if (inParameters.contains("availableTimeUomId")) mapValue.put("availableTimeUomId", getInAvailableTimeUomId());
        if (inParameters.contains("canclAutmExtTime")) mapValue.put("canclAutmExtTime", getInCanclAutmExtTime());
        if (inParameters.contains("canclAutmExtTimeUomId")) mapValue.put("canclAutmExtTimeUomId", getInCanclAutmExtTimeUomId());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("maxLifeTime")) mapValue.put("maxLifeTime", getInMaxLifeTime());
        if (inParameters.contains("maxLifeTimeUomId")) mapValue.put("maxLifeTimeUomId", getInMaxLifeTimeUomId());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
        if (inParameters.contains("purchaseFromDate")) mapValue.put("purchaseFromDate", getInPurchaseFromDate());
        if (inParameters.contains("purchaseThruDate")) mapValue.put("purchaseThruDate", getInPurchaseThruDate());
        if (inParameters.contains("subscriptionResourceId")) mapValue.put("subscriptionResourceId", getInSubscriptionResourceId());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("useCountLimit")) mapValue.put("useCountLimit", getInUseCountLimit());
        if (inParameters.contains("useRoleTypeId")) mapValue.put("useRoleTypeId", getInUseRoleTypeId());
        if (inParameters.contains("useTime")) mapValue.put("useTime", getInUseTime());
        if (inParameters.contains("useTimeUomId")) mapValue.put("useTimeUomId", getInUseTimeUomId());
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
        if (mapValue.containsKey("automaticExtend")) setInAutomaticExtend((String) mapValue.get("automaticExtend"));
        if (mapValue.containsKey("availableTime")) setInAvailableTime((Long) mapValue.get("availableTime"));
        if (mapValue.containsKey("availableTimeUomId")) setInAvailableTimeUomId((String) mapValue.get("availableTimeUomId"));
        if (mapValue.containsKey("canclAutmExtTime")) setInCanclAutmExtTime((Long) mapValue.get("canclAutmExtTime"));
        if (mapValue.containsKey("canclAutmExtTimeUomId")) setInCanclAutmExtTimeUomId((String) mapValue.get("canclAutmExtTimeUomId"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("maxLifeTime")) setInMaxLifeTime((Long) mapValue.get("maxLifeTime"));
        if (mapValue.containsKey("maxLifeTimeUomId")) setInMaxLifeTimeUomId((String) mapValue.get("maxLifeTimeUomId"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
        if (mapValue.containsKey("purchaseFromDate")) setInPurchaseFromDate((Timestamp) mapValue.get("purchaseFromDate"));
        if (mapValue.containsKey("purchaseThruDate")) setInPurchaseThruDate((Timestamp) mapValue.get("purchaseThruDate"));
        if (mapValue.containsKey("subscriptionResourceId")) setInSubscriptionResourceId((String) mapValue.get("subscriptionResourceId"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("useCountLimit")) setInUseCountLimit((Long) mapValue.get("useCountLimit"));
        if (mapValue.containsKey("useRoleTypeId")) setInUseRoleTypeId((String) mapValue.get("useRoleTypeId"));
        if (mapValue.containsKey("useTime")) setInUseTime((Long) mapValue.get("useTime"));
        if (mapValue.containsKey("useTimeUomId")) setInUseTimeUomId((String) mapValue.get("useTimeUomId"));
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
     * Construct a <code>CreateProductSubscriptionResourceService</code> from the input values of the given <code>CreateProductSubscriptionResourceService</code>.
     * @param input a <code>CreateProductSubscriptionResourceService</code>
     */
    public static CreateProductSubscriptionResourceService fromInput(CreateProductSubscriptionResourceService input) {
        CreateProductSubscriptionResourceService service = new CreateProductSubscriptionResourceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateProductSubscriptionResourceService</code> from the output values of the given <code>CreateProductSubscriptionResourceService</code>.
     * @param output a <code>CreateProductSubscriptionResourceService</code>
     */
    public static CreateProductSubscriptionResourceService fromOutput(CreateProductSubscriptionResourceService output) {
        CreateProductSubscriptionResourceService service = new CreateProductSubscriptionResourceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateProductSubscriptionResourceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateProductSubscriptionResourceService fromInput(Map<String, Object> mapValue) {
        CreateProductSubscriptionResourceService service = new CreateProductSubscriptionResourceService();
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
     * Construct a <code>CreateProductSubscriptionResourceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateProductSubscriptionResourceService fromOutput(Map<String, Object> mapValue) {
        CreateProductSubscriptionResourceService service = new CreateProductSubscriptionResourceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
