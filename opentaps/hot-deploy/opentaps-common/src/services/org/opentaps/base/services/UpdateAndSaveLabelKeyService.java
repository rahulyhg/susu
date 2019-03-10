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
 * Update Label Key.
 * Auto generated base service entity updateAndSaveLabelKey.
 *
 * Engine: java
 * Location: org.ofbiz.webtools.labelmanager.LabelManagerFactory
 * Invoke: updateAndSaveLabelKey
 * Defined in: framework/webtools/servicedef/services.xml
 */
public class UpdateAndSaveLabelKeyService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateAndSaveLabelKey";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.FALSE;

    /** The enumeration of input parameters. */
    public static enum In {
        confirm("confirm"),
        fileName("fileName"),
        key("key"),
        keyComment("keyComment"),
        locale("locale"),
        localeComments("localeComments"),
        localeNames("localeNames"),
        localeValues("localeValues"),
        removeLabel("removeLabel"),
        timeZone("timeZone"),
        updateLabel("update_label"),
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
     * Creates a new <code>UpdateAndSaveLabelKeyService</code> instance.
     */
    public UpdateAndSaveLabelKeyService() {
        super();
    }

    /**
     * Creates a new <code>UpdateAndSaveLabelKeyService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateAndSaveLabelKeyService(User user) {
        super(user);
    }

    private String inConfirm;
    private String inFileName;
    private String inKey;
    private String inKeyComment;
    private Locale inLocale;
    private List inLocaleComments;
    private List inLocaleNames;
    private List inLocaleValues;
    private String inRemoveLabel;
    private TimeZone inTimeZone;
    private String inUpdateLabel;
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
    public String getInConfirm() {
        return this.inConfirm;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInFileName() {
        return this.inFileName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInKey() {
        return this.inKey;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInKeyComment() {
        return this.inKeyComment;
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
    public List getInLocaleComments() {
        return this.inLocaleComments;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInLocaleNames() {
        return this.inLocaleNames;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>List</code>
     */
    public List getInLocaleValues() {
        return this.inLocaleValues;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRemoveLabel() {
        return this.inRemoveLabel;
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
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInUpdateLabel() {
        return this.inUpdateLabel;
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
     * @param inConfirm the inConfirm to set
    */
    public void setInConfirm(String inConfirm) {
        this.inParameters.add("confirm");
        this.inConfirm = inConfirm;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inFileName the inFileName to set
    */
    public void setInFileName(String inFileName) {
        this.inParameters.add("fileName");
        this.inFileName = inFileName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inKey the inKey to set
    */
    public void setInKey(String inKey) {
        this.inParameters.add("key");
        this.inKey = inKey;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inKeyComment the inKeyComment to set
    */
    public void setInKeyComment(String inKeyComment) {
        this.inParameters.add("keyComment");
        this.inKeyComment = inKeyComment;
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
     * @param inLocaleComments the inLocaleComments to set
    */
    public void setInLocaleComments(List inLocaleComments) {
        this.inParameters.add("localeComments");
        this.inLocaleComments = inLocaleComments;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocaleNames the inLocaleNames to set
    */
    public void setInLocaleNames(List inLocaleNames) {
        this.inParameters.add("localeNames");
        this.inLocaleNames = inLocaleNames;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLocaleValues the inLocaleValues to set
    */
    public void setInLocaleValues(List inLocaleValues) {
        this.inParameters.add("localeValues");
        this.inLocaleValues = inLocaleValues;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRemoveLabel the inRemoveLabel to set
    */
    public void setInRemoveLabel(String inRemoveLabel) {
        this.inParameters.add("removeLabel");
        this.inRemoveLabel = inRemoveLabel;
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
     * This parameter is required.
     * @param inUpdateLabel the inUpdateLabel to set
    */
    public void setInUpdateLabel(String inUpdateLabel) {
        this.inParameters.add("update_label");
        this.inUpdateLabel = inUpdateLabel;
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
        if (inParameters.contains("confirm")) mapValue.put("confirm", getInConfirm());
        if (inParameters.contains("fileName")) mapValue.put("fileName", getInFileName());
        if (inParameters.contains("key")) mapValue.put("key", getInKey());
        if (inParameters.contains("keyComment")) mapValue.put("keyComment", getInKeyComment());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("localeComments")) mapValue.put("localeComments", getInLocaleComments());
        if (inParameters.contains("localeNames")) mapValue.put("localeNames", getInLocaleNames());
        if (inParameters.contains("localeValues")) mapValue.put("localeValues", getInLocaleValues());
        if (inParameters.contains("removeLabel")) mapValue.put("removeLabel", getInRemoveLabel());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("update_label")) mapValue.put("update_label", getInUpdateLabel());
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
        if (mapValue.containsKey("confirm")) setInConfirm((String) mapValue.get("confirm"));
        if (mapValue.containsKey("fileName")) setInFileName((String) mapValue.get("fileName"));
        if (mapValue.containsKey("key")) setInKey((String) mapValue.get("key"));
        if (mapValue.containsKey("keyComment")) setInKeyComment((String) mapValue.get("keyComment"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("localeComments")) setInLocaleComments((List) mapValue.get("localeComments"));
        if (mapValue.containsKey("localeNames")) setInLocaleNames((List) mapValue.get("localeNames"));
        if (mapValue.containsKey("localeValues")) setInLocaleValues((List) mapValue.get("localeValues"));
        if (mapValue.containsKey("removeLabel")) setInRemoveLabel((String) mapValue.get("removeLabel"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("update_label")) setInUpdateLabel((String) mapValue.get("update_label"));
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
     * Construct a <code>UpdateAndSaveLabelKeyService</code> from the input values of the given <code>UpdateAndSaveLabelKeyService</code>.
     * @param input a <code>UpdateAndSaveLabelKeyService</code>
     */
    public static UpdateAndSaveLabelKeyService fromInput(UpdateAndSaveLabelKeyService input) {
        UpdateAndSaveLabelKeyService service = new UpdateAndSaveLabelKeyService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateAndSaveLabelKeyService</code> from the output values of the given <code>UpdateAndSaveLabelKeyService</code>.
     * @param output a <code>UpdateAndSaveLabelKeyService</code>
     */
    public static UpdateAndSaveLabelKeyService fromOutput(UpdateAndSaveLabelKeyService output) {
        UpdateAndSaveLabelKeyService service = new UpdateAndSaveLabelKeyService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateAndSaveLabelKeyService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateAndSaveLabelKeyService fromInput(Map<String, Object> mapValue) {
        UpdateAndSaveLabelKeyService service = new UpdateAndSaveLabelKeyService();
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
     * Construct a <code>UpdateAndSaveLabelKeyService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateAndSaveLabelKeyService fromOutput(Map<String, Object> mapValue) {
        UpdateAndSaveLabelKeyService service = new UpdateAndSaveLabelKeyService();
        service.putAllOutput(mapValue);
        return service;
    }
}
