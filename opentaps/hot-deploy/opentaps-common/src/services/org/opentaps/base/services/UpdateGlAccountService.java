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
 * Update a GlAccount record.
 * Auto generated base service entity updateGlAccount.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/ledger/GeneralLedgerServices.xml
 * Invoke: updateGlAccount
 * Defined in: applications/accounting/servicedef/services_ledger.xml
 */
public class UpdateGlAccountService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "updateGlAccount";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        accountCode("accountCode"),
        accountName("accountName"),
        description("description"),
        glAccountClassId("glAccountClassId"),
        glAccountId("glAccountId"),
        glAccountTypeId("glAccountTypeId"),
        glResourceTypeId("glResourceTypeId"),
        glXbrlClassId("glXbrlClassId"),
        locale("locale"),
        parentGlAccountId("parentGlAccountId"),
        postedBalance("postedBalance"),
        productId("productId"),
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
     * Creates a new <code>UpdateGlAccountService</code> instance.
     */
    public UpdateGlAccountService() {
        super();
    }

    /**
     * Creates a new <code>UpdateGlAccountService</code> instance.
     * @param user an <code>User</code> value
     */
    public UpdateGlAccountService(User user) {
        super(user);
    }

    private String inAccountCode;
    private String inAccountName;
    private String inDescription;
    private String inGlAccountClassId;
    private String inGlAccountId;
    private String inGlAccountTypeId;
    private String inGlResourceTypeId;
    private String inGlXbrlClassId;
    private Locale inLocale;
    private String inParentGlAccountId;
    private BigDecimal inPostedBalance;
    private String inProductId;
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
    public String getInAccountCode() {
        return this.inAccountCode;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInAccountName() {
        return this.inAccountName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDescription() {
        return this.inDescription;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlAccountClassId() {
        return this.inGlAccountClassId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInGlAccountId() {
        return this.inGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlAccountTypeId() {
        return this.inGlAccountTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlResourceTypeId() {
        return this.inGlResourceTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInGlXbrlClassId() {
        return this.inGlXbrlClassId;
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
    public String getInParentGlAccountId() {
        return this.inParentGlAccountId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInPostedBalance() {
        return this.inPostedBalance;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductId() {
        return this.inProductId;
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
     * @param inAccountCode the inAccountCode to set
    */
    public void setInAccountCode(String inAccountCode) {
        this.inParameters.add("accountCode");
        this.inAccountCode = inAccountCode;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inAccountName the inAccountName to set
    */
    public void setInAccountName(String inAccountName) {
        this.inParameters.add("accountName");
        this.inAccountName = inAccountName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlAccountClassId the inGlAccountClassId to set
    */
    public void setInGlAccountClassId(String inGlAccountClassId) {
        this.inParameters.add("glAccountClassId");
        this.inGlAccountClassId = inGlAccountClassId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inGlAccountId the inGlAccountId to set
    */
    public void setInGlAccountId(String inGlAccountId) {
        this.inParameters.add("glAccountId");
        this.inGlAccountId = inGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlAccountTypeId the inGlAccountTypeId to set
    */
    public void setInGlAccountTypeId(String inGlAccountTypeId) {
        this.inParameters.add("glAccountTypeId");
        this.inGlAccountTypeId = inGlAccountTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlResourceTypeId the inGlResourceTypeId to set
    */
    public void setInGlResourceTypeId(String inGlResourceTypeId) {
        this.inParameters.add("glResourceTypeId");
        this.inGlResourceTypeId = inGlResourceTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inGlXbrlClassId the inGlXbrlClassId to set
    */
    public void setInGlXbrlClassId(String inGlXbrlClassId) {
        this.inParameters.add("glXbrlClassId");
        this.inGlXbrlClassId = inGlXbrlClassId;
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
     * @param inParentGlAccountId the inParentGlAccountId to set
    */
    public void setInParentGlAccountId(String inParentGlAccountId) {
        this.inParameters.add("parentGlAccountId");
        this.inParentGlAccountId = inParentGlAccountId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inPostedBalance the inPostedBalance to set
    */
    public void setInPostedBalance(BigDecimal inPostedBalance) {
        this.inParameters.add("postedBalance");
        this.inPostedBalance = inPostedBalance;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductId the inProductId to set
    */
    public void setInProductId(String inProductId) {
        this.inParameters.add("productId");
        this.inProductId = inProductId;
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
        if (inParameters.contains("accountCode")) mapValue.put("accountCode", getInAccountCode());
        if (inParameters.contains("accountName")) mapValue.put("accountName", getInAccountName());
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("glAccountClassId")) mapValue.put("glAccountClassId", getInGlAccountClassId());
        if (inParameters.contains("glAccountId")) mapValue.put("glAccountId", getInGlAccountId());
        if (inParameters.contains("glAccountTypeId")) mapValue.put("glAccountTypeId", getInGlAccountTypeId());
        if (inParameters.contains("glResourceTypeId")) mapValue.put("glResourceTypeId", getInGlResourceTypeId());
        if (inParameters.contains("glXbrlClassId")) mapValue.put("glXbrlClassId", getInGlXbrlClassId());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("parentGlAccountId")) mapValue.put("parentGlAccountId", getInParentGlAccountId());
        if (inParameters.contains("postedBalance")) mapValue.put("postedBalance", getInPostedBalance());
        if (inParameters.contains("productId")) mapValue.put("productId", getInProductId());
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
        if (mapValue.containsKey("accountCode")) setInAccountCode((String) mapValue.get("accountCode"));
        if (mapValue.containsKey("accountName")) setInAccountName((String) mapValue.get("accountName"));
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("glAccountClassId")) setInGlAccountClassId((String) mapValue.get("glAccountClassId"));
        if (mapValue.containsKey("glAccountId")) setInGlAccountId((String) mapValue.get("glAccountId"));
        if (mapValue.containsKey("glAccountTypeId")) setInGlAccountTypeId((String) mapValue.get("glAccountTypeId"));
        if (mapValue.containsKey("glResourceTypeId")) setInGlResourceTypeId((String) mapValue.get("glResourceTypeId"));
        if (mapValue.containsKey("glXbrlClassId")) setInGlXbrlClassId((String) mapValue.get("glXbrlClassId"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("parentGlAccountId")) setInParentGlAccountId((String) mapValue.get("parentGlAccountId"));
        if (mapValue.containsKey("postedBalance")) setInPostedBalance((BigDecimal) mapValue.get("postedBalance"));
        if (mapValue.containsKey("productId")) setInProductId((String) mapValue.get("productId"));
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
     * Construct a <code>UpdateGlAccountService</code> from the input values of the given <code>UpdateGlAccountService</code>.
     * @param input a <code>UpdateGlAccountService</code>
     */
    public static UpdateGlAccountService fromInput(UpdateGlAccountService input) {
        UpdateGlAccountService service = new UpdateGlAccountService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>UpdateGlAccountService</code> from the output values of the given <code>UpdateGlAccountService</code>.
     * @param output a <code>UpdateGlAccountService</code>
     */
    public static UpdateGlAccountService fromOutput(UpdateGlAccountService output) {
        UpdateGlAccountService service = new UpdateGlAccountService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>UpdateGlAccountService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static UpdateGlAccountService fromInput(Map<String, Object> mapValue) {
        UpdateGlAccountService service = new UpdateGlAccountService();
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
     * Construct a <code>UpdateGlAccountService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static UpdateGlAccountService fromOutput(Map<String, Object> mapValue) {
        UpdateGlAccountService service = new UpdateGlAccountService();
        service.putAllOutput(mapValue);
        return service;
    }
}
