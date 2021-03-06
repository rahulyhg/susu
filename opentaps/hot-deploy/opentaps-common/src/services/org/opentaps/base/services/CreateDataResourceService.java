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
 * Create a DataResource.
 * Auto generated base service entity createDataResource.
 *
 * Engine: simple
 * Location: component://content/script/org/ofbiz/content/data/DataServices.xml
 * Invoke: createDataResource
 * Defined in: applications/content/servicedef/services_data.xml
 */
public class CreateDataResourceService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "createDataResource";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        characterSetId("characterSetId"),
        contentPurposeList("contentPurposeList"),
        createdByUserLogin("createdByUserLogin"),
        createdDate("createdDate"),
        dataCategoryId("dataCategoryId"),
        dataResourceId("dataResourceId"),
        dataResourceName("dataResourceName"),
        dataResourceTypeId("dataResourceTypeId"),
        dataSourceId("dataSourceId"),
        dataTemplateTypeId("dataTemplateTypeId"),
        isPublic("isPublic"),
        lastModifiedByUserLogin("lastModifiedByUserLogin"),
        lastModifiedDate("lastModifiedDate"),
        locale("locale"),
        localeString("localeString"),
        mimeTypeId("mimeTypeId"),
        objectInfo("objectInfo"),
        partyId("partyId"),
        relatedDetailId("relatedDetailId"),
        roleTypeId("roleTypeId"),
        skipPermissionCheck("skipPermissionCheck"),
        statusId("statusId"),
        surveyId("surveyId"),
        surveyResponseId("surveyResponseId"),
        targetOperationList("targetOperationList"),
        timeZone("timeZone"),
        userLogin("userLogin");
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
        dataResource("dataResource"),
        dataResourceId("dataResourceId"),
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
     * Creates a new <code>CreateDataResourceService</code> instance.
     */
    public CreateDataResourceService() {
        super();
    }

    /**
     * Creates a new <code>CreateDataResourceService</code> instance.
     * @param user an <code>User</code> value
     */
    public CreateDataResourceService(User user) {
        super(user);
    }

    private String inCharacterSetId;
    private List inContentPurposeList;
    private String inCreatedByUserLogin;
    private Timestamp inCreatedDate;
    private String inDataCategoryId;
    private String inDataResourceId;
    private String inDataResourceName;
    private String inDataResourceTypeId;
    private String inDataSourceId;
    private String inDataTemplateTypeId;
    private String inIsPublic;
    private String inLastModifiedByUserLogin;
    private Timestamp inLastModifiedDate;
    private Locale inLocale;
    private String inLocaleString;
    private String inMimeTypeId;
    private String inObjectInfo;
    private String inPartyId;
    private String inRelatedDetailId;
    private String inRoleTypeId;
    private String inSkipPermissionCheck;
    private String inStatusId;
    private String inSurveyId;
    private String inSurveyResponseId;
    private List inTargetOperationList;
    private TimeZone inTimeZone;
    private GenericValue inUserLogin;
    private GenericValue outDataResource;
    private String outDataResourceId;
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
    public String getInCharacterSetId() {
        return this.inCharacterSetId;
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
     * @return <code>String</code>
     */
    public String getInCreatedByUserLogin() {
        return this.inCreatedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInCreatedDate() {
        return this.inCreatedDate;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDataCategoryId() {
        return this.inDataCategoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDataResourceId() {
        return this.inDataResourceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDataResourceName() {
        return this.inDataResourceName;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDataResourceTypeId() {
        return this.inDataResourceTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDataSourceId() {
        return this.inDataSourceId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInDataTemplateTypeId() {
        return this.inDataTemplateTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInIsPublic() {
        return this.inIsPublic;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInLastModifiedByUserLogin() {
        return this.inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>Timestamp</code>
     */
    public Timestamp getInLastModifiedDate() {
        return this.inLastModifiedDate;
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
    public String getInLocaleString() {
        return this.inLocaleString;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInMimeTypeId() {
        return this.inMimeTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInObjectInfo() {
        return this.inObjectInfo;
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
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRelatedDetailId() {
        return this.inRelatedDetailId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInRoleTypeId() {
        return this.inRoleTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSkipPermissionCheck() {
        return this.inSkipPermissionCheck;
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
     * @return <code>String</code>
     */
    public String getInSurveyId() {
        return this.inSurveyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInSurveyResponseId() {
        return this.inSurveyResponseId;
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
     * @return <code>GenericValue</code>
     */
    public GenericValue getOutDataResource() {
        return this.outDataResource;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getOutDataResourceId() {
        return this.outDataResourceId;
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
     * @param inCharacterSetId the inCharacterSetId to set
    */
    public void setInCharacterSetId(String inCharacterSetId) {
        this.inParameters.add("characterSetId");
        this.inCharacterSetId = inCharacterSetId;
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
     * @param inCreatedByUserLogin the inCreatedByUserLogin to set
    */
    public void setInCreatedByUserLogin(String inCreatedByUserLogin) {
        this.inParameters.add("createdByUserLogin");
        this.inCreatedByUserLogin = inCreatedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inCreatedDate the inCreatedDate to set
    */
    public void setInCreatedDate(Timestamp inCreatedDate) {
        this.inParameters.add("createdDate");
        this.inCreatedDate = inCreatedDate;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDataCategoryId the inDataCategoryId to set
    */
    public void setInDataCategoryId(String inDataCategoryId) {
        this.inParameters.add("dataCategoryId");
        this.inDataCategoryId = inDataCategoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDataResourceId the inDataResourceId to set
    */
    public void setInDataResourceId(String inDataResourceId) {
        this.inParameters.add("dataResourceId");
        this.inDataResourceId = inDataResourceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDataResourceName the inDataResourceName to set
    */
    public void setInDataResourceName(String inDataResourceName) {
        this.inParameters.add("dataResourceName");
        this.inDataResourceName = inDataResourceName;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDataResourceTypeId the inDataResourceTypeId to set
    */
    public void setInDataResourceTypeId(String inDataResourceTypeId) {
        this.inParameters.add("dataResourceTypeId");
        this.inDataResourceTypeId = inDataResourceTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDataSourceId the inDataSourceId to set
    */
    public void setInDataSourceId(String inDataSourceId) {
        this.inParameters.add("dataSourceId");
        this.inDataSourceId = inDataSourceId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inDataTemplateTypeId the inDataTemplateTypeId to set
    */
    public void setInDataTemplateTypeId(String inDataTemplateTypeId) {
        this.inParameters.add("dataTemplateTypeId");
        this.inDataTemplateTypeId = inDataTemplateTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inIsPublic the inIsPublic to set
    */
    public void setInIsPublic(String inIsPublic) {
        this.inParameters.add("isPublic");
        this.inIsPublic = inIsPublic;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedByUserLogin the inLastModifiedByUserLogin to set
    */
    public void setInLastModifiedByUserLogin(String inLastModifiedByUserLogin) {
        this.inParameters.add("lastModifiedByUserLogin");
        this.inLastModifiedByUserLogin = inLastModifiedByUserLogin;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inLastModifiedDate the inLastModifiedDate to set
    */
    public void setInLastModifiedDate(Timestamp inLastModifiedDate) {
        this.inParameters.add("lastModifiedDate");
        this.inLastModifiedDate = inLastModifiedDate;
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
     * @param inLocaleString the inLocaleString to set
    */
    public void setInLocaleString(String inLocaleString) {
        this.inParameters.add("localeString");
        this.inLocaleString = inLocaleString;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMimeTypeId the inMimeTypeId to set
    */
    public void setInMimeTypeId(String inMimeTypeId) {
        this.inParameters.add("mimeTypeId");
        this.inMimeTypeId = inMimeTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inObjectInfo the inObjectInfo to set
    */
    public void setInObjectInfo(String inObjectInfo) {
        this.inParameters.add("objectInfo");
        this.inObjectInfo = inObjectInfo;
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
     * This parameter is optional.
     * @param inRelatedDetailId the inRelatedDetailId to set
    */
    public void setInRelatedDetailId(String inRelatedDetailId) {
        this.inParameters.add("relatedDetailId");
        this.inRelatedDetailId = inRelatedDetailId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inRoleTypeId the inRoleTypeId to set
    */
    public void setInRoleTypeId(String inRoleTypeId) {
        this.inParameters.add("roleTypeId");
        this.inRoleTypeId = inRoleTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSkipPermissionCheck the inSkipPermissionCheck to set
    */
    public void setInSkipPermissionCheck(String inSkipPermissionCheck) {
        this.inParameters.add("skipPermissionCheck");
        this.inSkipPermissionCheck = inSkipPermissionCheck;
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
     * @param inSurveyId the inSurveyId to set
    */
    public void setInSurveyId(String inSurveyId) {
        this.inParameters.add("surveyId");
        this.inSurveyId = inSurveyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inSurveyResponseId the inSurveyResponseId to set
    */
    public void setInSurveyResponseId(String inSurveyResponseId) {
        this.inParameters.add("surveyResponseId");
        this.inSurveyResponseId = inSurveyResponseId;
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
     * @param outDataResource the outDataResource to set
    */
    public void setOutDataResource(GenericValue outDataResource) {
        this.outParameters.add("dataResource");
        this.outDataResource = outDataResource;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param outDataResourceId the outDataResourceId to set
    */
    public void setOutDataResourceId(String outDataResourceId) {
        this.outParameters.add("dataResourceId");
        this.outDataResourceId = outDataResourceId;
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
        if (inParameters.contains("characterSetId")) mapValue.put("characterSetId", getInCharacterSetId());
        if (inParameters.contains("contentPurposeList")) mapValue.put("contentPurposeList", getInContentPurposeList());
        if (inParameters.contains("createdByUserLogin")) mapValue.put("createdByUserLogin", getInCreatedByUserLogin());
        if (inParameters.contains("createdDate")) mapValue.put("createdDate", getInCreatedDate());
        if (inParameters.contains("dataCategoryId")) mapValue.put("dataCategoryId", getInDataCategoryId());
        if (inParameters.contains("dataResourceId")) mapValue.put("dataResourceId", getInDataResourceId());
        if (inParameters.contains("dataResourceName")) mapValue.put("dataResourceName", getInDataResourceName());
        if (inParameters.contains("dataResourceTypeId")) mapValue.put("dataResourceTypeId", getInDataResourceTypeId());
        if (inParameters.contains("dataSourceId")) mapValue.put("dataSourceId", getInDataSourceId());
        if (inParameters.contains("dataTemplateTypeId")) mapValue.put("dataTemplateTypeId", getInDataTemplateTypeId());
        if (inParameters.contains("isPublic")) mapValue.put("isPublic", getInIsPublic());
        if (inParameters.contains("lastModifiedByUserLogin")) mapValue.put("lastModifiedByUserLogin", getInLastModifiedByUserLogin());
        if (inParameters.contains("lastModifiedDate")) mapValue.put("lastModifiedDate", getInLastModifiedDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("localeString")) mapValue.put("localeString", getInLocaleString());
        if (inParameters.contains("mimeTypeId")) mapValue.put("mimeTypeId", getInMimeTypeId());
        if (inParameters.contains("objectInfo")) mapValue.put("objectInfo", getInObjectInfo());
        if (inParameters.contains("partyId")) mapValue.put("partyId", getInPartyId());
        if (inParameters.contains("relatedDetailId")) mapValue.put("relatedDetailId", getInRelatedDetailId());
        if (inParameters.contains("roleTypeId")) mapValue.put("roleTypeId", getInRoleTypeId());
        if (inParameters.contains("skipPermissionCheck")) mapValue.put("skipPermissionCheck", getInSkipPermissionCheck());
        if (inParameters.contains("statusId")) mapValue.put("statusId", getInStatusId());
        if (inParameters.contains("surveyId")) mapValue.put("surveyId", getInSurveyId());
        if (inParameters.contains("surveyResponseId")) mapValue.put("surveyResponseId", getInSurveyResponseId());
        if (inParameters.contains("targetOperationList")) mapValue.put("targetOperationList", getInTargetOperationList());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("userLogin")) mapValue.put("userLogin", getInUserLogin());
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        if (outParameters.contains("dataResource")) mapValue.put("dataResource", getOutDataResource());
        if (outParameters.contains("dataResourceId")) mapValue.put("dataResourceId", getOutDataResourceId());
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
        if (mapValue.containsKey("characterSetId")) setInCharacterSetId((String) mapValue.get("characterSetId"));
        if (mapValue.containsKey("contentPurposeList")) setInContentPurposeList((List) mapValue.get("contentPurposeList"));
        if (mapValue.containsKey("createdByUserLogin")) setInCreatedByUserLogin((String) mapValue.get("createdByUserLogin"));
        if (mapValue.containsKey("createdDate")) setInCreatedDate((Timestamp) mapValue.get("createdDate"));
        if (mapValue.containsKey("dataCategoryId")) setInDataCategoryId((String) mapValue.get("dataCategoryId"));
        if (mapValue.containsKey("dataResourceId")) setInDataResourceId((String) mapValue.get("dataResourceId"));
        if (mapValue.containsKey("dataResourceName")) setInDataResourceName((String) mapValue.get("dataResourceName"));
        if (mapValue.containsKey("dataResourceTypeId")) setInDataResourceTypeId((String) mapValue.get("dataResourceTypeId"));
        if (mapValue.containsKey("dataSourceId")) setInDataSourceId((String) mapValue.get("dataSourceId"));
        if (mapValue.containsKey("dataTemplateTypeId")) setInDataTemplateTypeId((String) mapValue.get("dataTemplateTypeId"));
        if (mapValue.containsKey("isPublic")) setInIsPublic((String) mapValue.get("isPublic"));
        if (mapValue.containsKey("lastModifiedByUserLogin")) setInLastModifiedByUserLogin((String) mapValue.get("lastModifiedByUserLogin"));
        if (mapValue.containsKey("lastModifiedDate")) setInLastModifiedDate((Timestamp) mapValue.get("lastModifiedDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("localeString")) setInLocaleString((String) mapValue.get("localeString"));
        if (mapValue.containsKey("mimeTypeId")) setInMimeTypeId((String) mapValue.get("mimeTypeId"));
        if (mapValue.containsKey("objectInfo")) setInObjectInfo((String) mapValue.get("objectInfo"));
        if (mapValue.containsKey("partyId")) setInPartyId((String) mapValue.get("partyId"));
        if (mapValue.containsKey("relatedDetailId")) setInRelatedDetailId((String) mapValue.get("relatedDetailId"));
        if (mapValue.containsKey("roleTypeId")) setInRoleTypeId((String) mapValue.get("roleTypeId"));
        if (mapValue.containsKey("skipPermissionCheck")) setInSkipPermissionCheck((String) mapValue.get("skipPermissionCheck"));
        if (mapValue.containsKey("statusId")) setInStatusId((String) mapValue.get("statusId"));
        if (mapValue.containsKey("surveyId")) setInSurveyId((String) mapValue.get("surveyId"));
        if (mapValue.containsKey("surveyResponseId")) setInSurveyResponseId((String) mapValue.get("surveyResponseId"));
        if (mapValue.containsKey("targetOperationList")) setInTargetOperationList((List) mapValue.get("targetOperationList"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("userLogin")) setInUserLogin((GenericValue) mapValue.get("userLogin"));
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        if (mapValue.containsKey("dataResource")) setOutDataResource((GenericValue) mapValue.get("dataResource"));
        if (mapValue.containsKey("dataResourceId")) setOutDataResourceId((String) mapValue.get("dataResourceId"));
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
     * Construct a <code>CreateDataResourceService</code> from the input values of the given <code>CreateDataResourceService</code>.
     * @param input a <code>CreateDataResourceService</code>
     */
    public static CreateDataResourceService fromInput(CreateDataResourceService input) {
        CreateDataResourceService service = new CreateDataResourceService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>CreateDataResourceService</code> from the output values of the given <code>CreateDataResourceService</code>.
     * @param output a <code>CreateDataResourceService</code>
     */
    public static CreateDataResourceService fromOutput(CreateDataResourceService output) {
        CreateDataResourceService service = new CreateDataResourceService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>CreateDataResourceService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static CreateDataResourceService fromInput(Map<String, Object> mapValue) {
        CreateDataResourceService service = new CreateDataResourceService();
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
     * Construct a <code>CreateDataResourceService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static CreateDataResourceService fromOutput(Map<String, Object> mapValue) {
        CreateDataResourceService service = new CreateDataResourceService();
        service.putAllOutput(mapValue);
        return service;
    }
}
