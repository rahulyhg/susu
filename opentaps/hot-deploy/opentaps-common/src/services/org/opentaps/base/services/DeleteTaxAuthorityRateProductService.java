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
 * Delete TaxAuthorityRateProduct.
 * Auto generated base service entity deleteTaxAuthorityRateProduct.
 *
 * Engine: simple
 * Location: component://accounting/script/org/ofbiz/accounting/tax/TaxAuthorityServices.xml
 * Invoke: deleteTaxAuthorityRateProduct
 * Defined in: applications/accounting/servicedef/services_tax.xml
 */
public class DeleteTaxAuthorityRateProductService extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "deleteTaxAuthorityRateProduct";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.TRUE;
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.FALSE;
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.TRUE;

    /** The enumeration of input parameters. */
    public static enum In {
        description("description"),
        fromDate("fromDate"),
        locale("locale"),
        minItemPrice("minItemPrice"),
        minPurchase("minPurchase"),
        productCategoryId("productCategoryId"),
        productStoreId("productStoreId"),
        taxAuthGeoId("taxAuthGeoId"),
        taxAuthPartyId("taxAuthPartyId"),
        taxAuthorityRateSeqId("taxAuthorityRateSeqId"),
        taxAuthorityRateTypeId("taxAuthorityRateTypeId"),
        taxPercentage("taxPercentage"),
        taxPromotions("taxPromotions"),
        taxShipping("taxShipping"),
        thruDate("thruDate"),
        timeZone("timeZone"),
        titleTransferEnumId("titleTransferEnumId"),
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
     * Creates a new <code>DeleteTaxAuthorityRateProductService</code> instance.
     */
    public DeleteTaxAuthorityRateProductService() {
        super();
    }

    /**
     * Creates a new <code>DeleteTaxAuthorityRateProductService</code> instance.
     * @param user an <code>User</code> value
     */
    public DeleteTaxAuthorityRateProductService(User user) {
        super(user);
    }

    private String inDescription;
    private Timestamp inFromDate;
    private Locale inLocale;
    private BigDecimal inMinItemPrice;
    private BigDecimal inMinPurchase;
    private String inProductCategoryId;
    private String inProductStoreId;
    private String inTaxAuthGeoId;
    private String inTaxAuthPartyId;
    private String inTaxAuthorityRateSeqId;
    private String inTaxAuthorityRateTypeId;
    private BigDecimal inTaxPercentage;
    private String inTaxPromotions;
    private String inTaxShipping;
    private Timestamp inThruDate;
    private TimeZone inTimeZone;
    private String inTitleTransferEnumId;
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
    public String getInDescription() {
        return this.inDescription;
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
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMinItemPrice() {
        return this.inMinItemPrice;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInMinPurchase() {
        return this.inMinPurchase;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductCategoryId() {
        return this.inProductCategoryId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInProductStoreId() {
        return this.inProductStoreId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthGeoId() {
        return this.inTaxAuthGeoId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthPartyId() {
        return this.inTaxAuthPartyId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is required.
     * @return <code>String</code>
     */
    public String getInTaxAuthorityRateSeqId() {
        return this.inTaxAuthorityRateSeqId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxAuthorityRateTypeId() {
        return this.inTaxAuthorityRateTypeId;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getInTaxPercentage() {
        return this.inTaxPercentage;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxPromotions() {
        return this.inTaxPromotions;
    }
    /**
     * Auto generated value accessor.
     * This parameter is optional.
     * @return <code>String</code>
     */
    public String getInTaxShipping() {
        return this.inTaxShipping;
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
     * @return <code>String</code>
     */
    public String getInTitleTransferEnumId() {
        return this.inTitleTransferEnumId;
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
     * @param inDescription the inDescription to set
    */
    public void setInDescription(String inDescription) {
        this.inParameters.add("description");
        this.inDescription = inDescription;
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
     * @param inMinItemPrice the inMinItemPrice to set
    */
    public void setInMinItemPrice(BigDecimal inMinItemPrice) {
        this.inParameters.add("minItemPrice");
        this.inMinItemPrice = inMinItemPrice;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inMinPurchase the inMinPurchase to set
    */
    public void setInMinPurchase(BigDecimal inMinPurchase) {
        this.inParameters.add("minPurchase");
        this.inMinPurchase = inMinPurchase;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductCategoryId the inProductCategoryId to set
    */
    public void setInProductCategoryId(String inProductCategoryId) {
        this.inParameters.add("productCategoryId");
        this.inProductCategoryId = inProductCategoryId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inProductStoreId the inProductStoreId to set
    */
    public void setInProductStoreId(String inProductStoreId) {
        this.inParameters.add("productStoreId");
        this.inProductStoreId = inProductStoreId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthGeoId the inTaxAuthGeoId to set
    */
    public void setInTaxAuthGeoId(String inTaxAuthGeoId) {
        this.inParameters.add("taxAuthGeoId");
        this.inTaxAuthGeoId = inTaxAuthGeoId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthPartyId the inTaxAuthPartyId to set
    */
    public void setInTaxAuthPartyId(String inTaxAuthPartyId) {
        this.inParameters.add("taxAuthPartyId");
        this.inTaxAuthPartyId = inTaxAuthPartyId;
    }
    /**
     * Auto generated value setter.
     * This parameter is required.
     * @param inTaxAuthorityRateSeqId the inTaxAuthorityRateSeqId to set
    */
    public void setInTaxAuthorityRateSeqId(String inTaxAuthorityRateSeqId) {
        this.inParameters.add("taxAuthorityRateSeqId");
        this.inTaxAuthorityRateSeqId = inTaxAuthorityRateSeqId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxAuthorityRateTypeId the inTaxAuthorityRateTypeId to set
    */
    public void setInTaxAuthorityRateTypeId(String inTaxAuthorityRateTypeId) {
        this.inParameters.add("taxAuthorityRateTypeId");
        this.inTaxAuthorityRateTypeId = inTaxAuthorityRateTypeId;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxPercentage the inTaxPercentage to set
    */
    public void setInTaxPercentage(BigDecimal inTaxPercentage) {
        this.inParameters.add("taxPercentage");
        this.inTaxPercentage = inTaxPercentage;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxPromotions the inTaxPromotions to set
    */
    public void setInTaxPromotions(String inTaxPromotions) {
        this.inParameters.add("taxPromotions");
        this.inTaxPromotions = inTaxPromotions;
    }
    /**
     * Auto generated value setter.
     * This parameter is optional.
     * @param inTaxShipping the inTaxShipping to set
    */
    public void setInTaxShipping(String inTaxShipping) {
        this.inParameters.add("taxShipping");
        this.inTaxShipping = inTaxShipping;
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
     * @param inTitleTransferEnumId the inTitleTransferEnumId to set
    */
    public void setInTitleTransferEnumId(String inTitleTransferEnumId) {
        this.inParameters.add("titleTransferEnumId");
        this.inTitleTransferEnumId = inTitleTransferEnumId;
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
        if (inParameters.contains("description")) mapValue.put("description", getInDescription());
        if (inParameters.contains("fromDate")) mapValue.put("fromDate", getInFromDate());
        if (inParameters.contains("locale")) mapValue.put("locale", getInLocale());
        if (inParameters.contains("minItemPrice")) mapValue.put("minItemPrice", getInMinItemPrice());
        if (inParameters.contains("minPurchase")) mapValue.put("minPurchase", getInMinPurchase());
        if (inParameters.contains("productCategoryId")) mapValue.put("productCategoryId", getInProductCategoryId());
        if (inParameters.contains("productStoreId")) mapValue.put("productStoreId", getInProductStoreId());
        if (inParameters.contains("taxAuthGeoId")) mapValue.put("taxAuthGeoId", getInTaxAuthGeoId());
        if (inParameters.contains("taxAuthPartyId")) mapValue.put("taxAuthPartyId", getInTaxAuthPartyId());
        if (inParameters.contains("taxAuthorityRateSeqId")) mapValue.put("taxAuthorityRateSeqId", getInTaxAuthorityRateSeqId());
        if (inParameters.contains("taxAuthorityRateTypeId")) mapValue.put("taxAuthorityRateTypeId", getInTaxAuthorityRateTypeId());
        if (inParameters.contains("taxPercentage")) mapValue.put("taxPercentage", getInTaxPercentage());
        if (inParameters.contains("taxPromotions")) mapValue.put("taxPromotions", getInTaxPromotions());
        if (inParameters.contains("taxShipping")) mapValue.put("taxShipping", getInTaxShipping());
        if (inParameters.contains("thruDate")) mapValue.put("thruDate", getInThruDate());
        if (inParameters.contains("timeZone")) mapValue.put("timeZone", getInTimeZone());
        if (inParameters.contains("titleTransferEnumId")) mapValue.put("titleTransferEnumId", getInTitleTransferEnumId());
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
        if (mapValue.containsKey("description")) setInDescription((String) mapValue.get("description"));
        if (mapValue.containsKey("fromDate")) setInFromDate((Timestamp) mapValue.get("fromDate"));
        if (mapValue.containsKey("locale")) setInLocale((Locale) mapValue.get("locale"));
        if (mapValue.containsKey("minItemPrice")) setInMinItemPrice((BigDecimal) mapValue.get("minItemPrice"));
        if (mapValue.containsKey("minPurchase")) setInMinPurchase((BigDecimal) mapValue.get("minPurchase"));
        if (mapValue.containsKey("productCategoryId")) setInProductCategoryId((String) mapValue.get("productCategoryId"));
        if (mapValue.containsKey("productStoreId")) setInProductStoreId((String) mapValue.get("productStoreId"));
        if (mapValue.containsKey("taxAuthGeoId")) setInTaxAuthGeoId((String) mapValue.get("taxAuthGeoId"));
        if (mapValue.containsKey("taxAuthPartyId")) setInTaxAuthPartyId((String) mapValue.get("taxAuthPartyId"));
        if (mapValue.containsKey("taxAuthorityRateSeqId")) setInTaxAuthorityRateSeqId((String) mapValue.get("taxAuthorityRateSeqId"));
        if (mapValue.containsKey("taxAuthorityRateTypeId")) setInTaxAuthorityRateTypeId((String) mapValue.get("taxAuthorityRateTypeId"));
        if (mapValue.containsKey("taxPercentage")) setInTaxPercentage((BigDecimal) mapValue.get("taxPercentage"));
        if (mapValue.containsKey("taxPromotions")) setInTaxPromotions((String) mapValue.get("taxPromotions"));
        if (mapValue.containsKey("taxShipping")) setInTaxShipping((String) mapValue.get("taxShipping"));
        if (mapValue.containsKey("thruDate")) setInThruDate((Timestamp) mapValue.get("thruDate"));
        if (mapValue.containsKey("timeZone")) setInTimeZone((TimeZone) mapValue.get("timeZone"));
        if (mapValue.containsKey("titleTransferEnumId")) setInTitleTransferEnumId((String) mapValue.get("titleTransferEnumId"));
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
     * Construct a <code>DeleteTaxAuthorityRateProductService</code> from the input values of the given <code>DeleteTaxAuthorityRateProductService</code>.
     * @param input a <code>DeleteTaxAuthorityRateProductService</code>
     */
    public static DeleteTaxAuthorityRateProductService fromInput(DeleteTaxAuthorityRateProductService input) {
        DeleteTaxAuthorityRateProductService service = new DeleteTaxAuthorityRateProductService();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>DeleteTaxAuthorityRateProductService</code> from the output values of the given <code>DeleteTaxAuthorityRateProductService</code>.
     * @param output a <code>DeleteTaxAuthorityRateProductService</code>
     */
    public static DeleteTaxAuthorityRateProductService fromOutput(DeleteTaxAuthorityRateProductService output) {
        DeleteTaxAuthorityRateProductService service = new DeleteTaxAuthorityRateProductService();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>DeleteTaxAuthorityRateProductService</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static DeleteTaxAuthorityRateProductService fromInput(Map<String, Object> mapValue) {
        DeleteTaxAuthorityRateProductService service = new DeleteTaxAuthorityRateProductService();
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
     * Construct a <code>DeleteTaxAuthorityRateProductService</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static DeleteTaxAuthorityRateProductService fromOutput(Map<String, Object> mapValue) {
        DeleteTaxAuthorityRateProductService service = new DeleteTaxAuthorityRateProductService();
        service.putAllOutput(mapValue);
        return service;
    }
}
