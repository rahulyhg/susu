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
import org.ofbiz.entity.GenericValue;
import org.opentaps.foundation.infrastructure.User;

/**
 * Remotely Store Entity Sync Date.
 * Auto generated base service entity remoteStoreEntitySyncDataHttp.
 *
 * Engine: http
 * Location: entity-sync-http
 * Invoke: storeEntitySyncData
 * Defined in: framework/entityext/servicedef/services.xml
 */
public class RemoteStoreEntitySyncDataHttpService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "remoteStoreEntitySyncDataHttp";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.FALSE;

    /** The enumeration of input parameters. */
    public static enum In {
        delegatorName("delegatorName"),
        entitySyncId("entitySyncId"),
        keysToRemove("keysToRemove"),
        locale("locale"),
        timeZone("timeZone"),
        userLogin("userLogin"),
        valuesToCreate("valuesToCreate"),
        valuesToStore("valuesToStore");
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
        toCreateInserted("toCreateInserted"),
        toCreateNotUpdated("toCreateNotUpdated"),
        toCreateUpdated("toCreateUpdated"),
        toRemoveAlreadyDeleted("toRemoveAlreadyDeleted"),
        toRemoveDeleted("toRemoveDeleted"),
        toStoreInserted("toStoreInserted"),
        toStoreNotUpdated("toStoreNotUpdated"),
        toStoreUpdated("toStoreUpdated"),
        userLogin("userLogin");
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>RemoteStoreEntitySyncDataHttpService</code> instance.
     */
    public RemoteStoreEntitySyncDataHttpService() {
        super();
    }

    /**
     * Creates a new <code>RemoteStoreEntitySyncDataHttpService</code> instance.
     * @param user an <code>User</code> value
     */
    public RemoteStoreEntitySyncDataHttpService(User user) {
        super(user);
    }

    private String inDelegatorName;
    private String inEntitySyncId;
    private List inKeysToRemove;
    private Locale inLocale;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private List inValuesToCreate;
    private List inValuesToStore;
    private String outErrorMessage;
    private List outErrorMessageList;
    private Locale outLocale;
    private String outResponseMessage;
    private String outSuccessMessage;
    private List outSuccessMessageList;
    private TimeZone outTimeZone;
    private Long outToCreateInserted;
    private Long outToCreateNotUpdated;
    private Long outToCreateUpdated;
    private Long outToRemoveAlreadyDeleted;
    private Long outToRemoveDeleted;
    private Long outToStoreInserted;
    private Long outToStoreNotUpdated;
    private Long outToStoreUpdated;
    private GenericValue outUserLogin;

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDelegatorName() {
        return this.inDelegatorName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInEntitySyncId() {
        return this.inEntitySyncId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInKeysToRemove() {
        return this.inKeysToRemove;
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
     * @return <code>List</code>
     */
    public List getInValuesToCreate() {
        return this.inValuesToCreate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>List</code>
     */
    public List getInValuesToStore() {
        return this.inValuesToStore;
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
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToCreateInserted() {
        return this.outToCreateInserted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToCreateNotUpdated() {
        return this.outToCreateNotUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToCreateUpdated() {
        return this.outToCreateUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToRemoveAlreadyDeleted() {
        return this.outToRemoveAlreadyDeleted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToRemoveDeleted() {
        return this.outToRemoveDeleted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToStoreInserted() {
        return this.outToStoreInserted;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToStoreNotUpdated() {
        return this.outToStoreNotUpdated;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>Long</code>
     */
    public Long getOutToStoreUpdated() {
        return this.outToStoreUpdated;
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
     * @param inDelegatorName the inDelegatorName to set
    */
    public void setInDelegatorName(String inDelegatorName) {
        this.inParameters.add("delegatorName");
        this.inDelegatorName = inDelegatorName;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inEntitySyncId the inEntitySyncId to set
    */
    public void setInEntitySyncId(String inEntitySyncId) {
        this.inParameters.add("entitySyncId");
        this.inEntitySyncId = inEntitySyncId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inKeysToRemove the inKeysToRemove to set
    */
    public void setInKeysToRemove(List inKeysToRemove) {
        this.inParameters.add("keysToRemove");
        this.inKeysToRemove = inKeysToRemove;
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
     * @param inValuesToCreate the inValuesToCreate to set
    */
    public void setInValuesToCreate(List inValuesToCreate) {
        this.inParameters.add("valuesToCreate");
        this.inValuesToCreate = inValuesToCreate;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inValuesToStore the inValuesToStore to set
    */
    public void setInValuesToStore(List inValuesToStore) {
        this.inParameters.add("valuesToStore");
        this.inValuesToStore = inValuesToStore;
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
     * This parameter is required.
     * @param outToCreateInserted the outToCreateInserted to set
    */
    public void setOutToCreateInserted(Long outToCreateInserted) {
        this.outParameters.add("toCreateInserted");
        this.outToCreateInserted = outToCreateInserted;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToCreateNotUpdated the outToCreateNotUpdated to set
    */
    public void setOutToCreateNotUpdated(Long outToCreateNotUpdated) {
        this.outParameters.add("toCreateNotUpdated");
        this.outToCreateNotUpdated = outToCreateNotUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToCreateUpdated the outToCreateUpdated to set
    */
    public void setOutToCreateUpdated(Long outToCreateUpdated) {
        this.outParameters.add("toCreateUpdated");
        this.outToCreateUpdated = outToCreateUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToRemoveAlreadyDeleted the outToRemoveAlreadyDeleted to set
    */
    public void setOutToRemoveAlreadyDeleted(Long outToRemoveAlreadyDeleted) {
        this.outParameters.add("toRemoveAlreadyDeleted");
        this.outToRemoveAlreadyDeleted = outToRemoveAlreadyDeleted;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToRemoveDeleted the outToRemoveDeleted to set
    */
    public void setOutToRemoveDeleted(Long outToRemoveDeleted) {
        this.outParameters.add("toRemoveDeleted");
        this.outToRemoveDeleted = outToRemoveDeleted;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToStoreInserted the outToStoreInserted to set
    */
    public void setOutToStoreInserted(Long outToStoreInserted) {
        this.outParameters.add("toStoreInserted");
        this.outToStoreInserted = outToStoreInserted;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToStoreNotUpdated the outToStoreNotUpdated to set
    */
    public void setOutToStoreNotUpdated(Long outToStoreNotUpdated) {
        this.outParameters.add("toStoreNotUpdated");
        this.outToStoreNotUpdated = outToStoreNotUpdated;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outToStoreUpdated the outToStoreUpdated to set
    */
    public void setOutToStoreUpdated(Long outToStoreUpdated) {
        this.outParameters.add("toStoreUpdated");
        this.outToStoreUpdated = outToStoreUpdated;
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
        if (inParameters.contains("delegatorName")) mapValue.put("delegatorName", getInDelegatorName());
        if (inParameters.contains("entitySyncId")) mapValue.put("entitySyncId", getInEntitySyncId());
        if (inParameters.contains("keysToRemove")) mapValue.put("keysToRemove", getInKeysToRemove());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        if (inParameters.contains("valuesToCreate")) mapValue.put("valuesToCreate", getInValuesToCreate());
        if (inParameters.contains("valuesToStore")) mapValue.put("valuesToStore", getInValuesToStore());
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
        if (outParameters.contains("toCreateInserted")) mapValue.put("toCreateInserted", getOutToCreateInserted());
        if (outParameters.contains("toCreateNotUpdated")) mapValue.put("toCreateNotUpdated", getOutToCreateNotUpdated());
        if (outParameters.contains("toCreateUpdated")) mapValue.put("toCreateUpdated", getOutToCreateUpdated());
        if (outParameters.contains("toRemoveAlreadyDeleted")) mapValue.put("toRemoveAlreadyDeleted", getOutToRemoveAlreadyDeleted());
        if (outParameters.contains("toRemoveDeleted")) mapValue.put("toRemoveDeleted", getOutToRemoveDeleted());
        if (outParameters.contains("toStoreInserted")) mapValue.put("toStoreInserted", getOutToStoreInserted());
        if (outParameters.contains("toStoreNotUpdated")) mapValue.put("toStoreNotUpdated", getOutToStoreNotUpdated());
        if (outParameters.contains("toStoreUpdated")) mapValue.put("toStoreUpdated", getOutToStoreUpdated());
        if (outParameters.contains("userLogin")) mapValue.put("userLogin", getOutUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("delegatorName")) setInDelegatorName((String) mapValue.get("delegatorName"));
        if (mapValue.containsKey("entitySyncId")) setInEntitySyncId((String) mapValue.get("entitySyncId"));
        if (mapValue.containsKey("keysToRemove")) setInKeysToRemove((List) mapValue.get("keysToRemove"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
        if (mapValue.containsKey("valuesToCreate")) setInValuesToCreate((List) mapValue.get("valuesToCreate"));
        if (mapValue.containsKey("valuesToStore")) setInValuesToStore((List) mapValue.get("valuesToStore"));
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
        if (mapValue.containsKey("toCreateInserted")) setOutToCreateInserted((Long) mapValue.get("toCreateInserted"));
        if (mapValue.containsKey("toCreateNotUpdated")) setOutToCreateNotUpdated((Long) mapValue.get("toCreateNotUpdated"));
        if (mapValue.containsKey("toCreateUpdated")) setOutToCreateUpdated((Long) mapValue.get("toCreateUpdated"));
        if (mapValue.containsKey("toRemoveAlreadyDeleted")) setOutToRemoveAlreadyDeleted((Long) mapValue.get("toRemoveAlreadyDeleted"));
        if (mapValue.containsKey("toRemoveDeleted")) setOutToRemoveDeleted((Long) mapValue.get("toRemoveDeleted"));
        if (mapValue.containsKey("toStoreInserted")) setOutToStoreInserted((Long) mapValue.get("toStoreInserted"));
        if (mapValue.containsKey("toStoreNotUpdated")) setOutToStoreNotUpdated((Long) mapValue.get("toStoreNotUpdated"));
        if (mapValue.containsKey("toStoreUpdated")) setOutToStoreUpdated((Long) mapValue.get("toStoreUpdated"));
        if (mapValue.containsKey("userLogin")) setOutUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /**
     * Construct a <code>RemoteStoreEntitySyncDataHttpService</code> from the input values of the given <code>RemoteStoreEntitySyncDataHttpService</code>.
     * @param input a <code>RemoteStoreEntitySyncDataHttpService</code>
     */
    public static RemoteStoreEntitySyncDataHttpService fromInput(RemoteStoreEntitySyncDataHttpService input) {
        RemoteStoreEntitySyncDataHttpService service = new RemoteStoreEntitySyncDataHttpService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>RemoteStoreEntitySyncDataHttpService</code> from the output values of the given <code>RemoteStoreEntitySyncDataHttpService</code>.
     * @param output a <code>RemoteStoreEntitySyncDataHttpService</code>
     */
    public static RemoteStoreEntitySyncDataHttpService fromOutput(RemoteStoreEntitySyncDataHttpService output) {
        RemoteStoreEntitySyncDataHttpService service = new RemoteStoreEntitySyncDataHttpService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>RemoteStoreEntitySyncDataHttpService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static RemoteStoreEntitySyncDataHttpService fromInput(Map<String, Object> mapValue) {
        RemoteStoreEntitySyncDataHttpService service = new RemoteStoreEntitySyncDataHttpService();
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
     * Construct a <code>RemoteStoreEntitySyncDataHttpService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static RemoteStoreEntitySyncDataHttpService fromOutput(Map<String, Object> mapValue) {
        RemoteStoreEntitySyncDataHttpService service = new RemoteStoreEntitySyncDataHttpService();
        service.putAllOutput(mapValue);
        return service;
    }
}
