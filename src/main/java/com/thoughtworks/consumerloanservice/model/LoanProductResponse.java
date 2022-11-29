
package com.thoughtworks.consumerloanservice.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "encodedKey",
    "id",
    "creationDate",
    "lastModifiedDate",
    "productName",
    "productDescription",
    "loanProductType",
    "category",
    "defaultLoanAmount",
    "minLoanAmount",
    "maxLoanAmount",
    "maxNumberOfDisbursementTranches",
    "idGeneratorType",
    "idPattern",
    "accountInitialState",
    "activated",
    "repaymentScheduleMethod",
    "scheduleDueDatesMethod",
    "defaultRepaymentPeriodCount",
    "repaymentPeriodUnit",
    "fixedDaysOfMonth",
    "defaultNumInstallments",
    "minNumInstallments",
    "maxNumInstallments",
    "gracePeriodType",
    "defaultPrincipalRepaymentInterval",
    "roundingRepaymentScheduleMethod",
    "repaymentCurrencyRounding",
    "repaymentElementsRoundingMethod",
    "paymentMethod",
    "amortizationMethod",
    "latePaymentsRecalculationMethod",
    "prepaymentAcceptance",
    "futurePaymentsAcceptance",
    "repaymentAllocationOrder",
    "allowCustomRepaymentAllocation",
    "interestCalculationMethod",
    "interestRateSettings",
    "interestType",
    "interestBalanceCalculationMethod",
    "interestApplicationMethod",
    "daysInYear",
    "scheduleInterestDaysCountMethod",
    "loanPenaltyCalculationMethod",
    "arrearsSettings",
    "loanFees",
    "allowArbitraryFees",
    "accountingMethod",
    "loanProductRules",
    "interestAccruedAccountingMethod",
    "interestAccrualCalculation",
    "accountLinkingEnabled",
    "autoLinkAccounts",
    "autoCreateLinkedAccounts",
    "settlementOptions",
    "repaymentScheduleEditOptions",
    "taxesOnInterestEnabled",
    "taxesOnFeesEnabled",
    "taxesOnPenaltyEnabled",
    "cappingApplyAccruedChargesBeforeLocking",
    "lineOfCreditRequirement",
    "templates",
    "productSecuritySettings",
    "forIndividuals",
    "forPureGroups",
    "forHybridGroups",
    "forAllBranches",
    "availableProductBranches",
    "repaymentReschedulingMethod",
    "accrueLateInterest",
    "currency"
})
@Generated("jsonschema2pojo")
public class LoanProductResponse {

    @JsonProperty("encodedKey")
    private String encodedKey;
    @JsonProperty("id")
    private String id;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("loanProductType")
    private String loanProductType;
    @JsonProperty("category")
    private String category;
    @JsonProperty("defaultLoanAmount")
    private String defaultLoanAmount;
    @JsonProperty("minLoanAmount")
    private String minLoanAmount;
    @JsonProperty("maxLoanAmount")
    private String maxLoanAmount;
    @JsonProperty("maxNumberOfDisbursementTranches")
    private Integer maxNumberOfDisbursementTranches;
    @JsonProperty("idGeneratorType")
    private String idGeneratorType;
    @JsonProperty("idPattern")
    private String idPattern;
    @JsonProperty("accountInitialState")
    private String accountInitialState;
    @JsonProperty("activated")
    private Boolean activated;
    @JsonProperty("repaymentScheduleMethod")
    private String repaymentScheduleMethod;
    @JsonProperty("scheduleDueDatesMethod")
    private String scheduleDueDatesMethod;
    @JsonProperty("defaultRepaymentPeriodCount")
    private Integer defaultRepaymentPeriodCount;
    @JsonProperty("repaymentPeriodUnit")
    private String repaymentPeriodUnit;
    @JsonProperty("fixedDaysOfMonth")
    private List<Object> fixedDaysOfMonth = null;
    @JsonProperty("defaultNumInstallments")
    private Integer defaultNumInstallments;
    @JsonProperty("minNumInstallments")
    private Integer minNumInstallments;
    @JsonProperty("maxNumInstallments")
    private Integer maxNumInstallments;
    @JsonProperty("gracePeriodType")
    private String gracePeriodType;
    @JsonProperty("defaultPrincipalRepaymentInterval")
    private Integer defaultPrincipalRepaymentInterval;
    @JsonProperty("roundingRepaymentScheduleMethod")
    private String roundingRepaymentScheduleMethod;
    @JsonProperty("repaymentCurrencyRounding")
    private String repaymentCurrencyRounding;
    @JsonProperty("repaymentElementsRoundingMethod")
    private String repaymentElementsRoundingMethod;
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    @JsonProperty("amortizationMethod")
    private String amortizationMethod;
    @JsonProperty("latePaymentsRecalculationMethod")
    private String latePaymentsRecalculationMethod;
    @JsonProperty("prepaymentAcceptance")
    private String prepaymentAcceptance;
    @JsonProperty("futurePaymentsAcceptance")
    private String futurePaymentsAcceptance;
    @JsonProperty("repaymentAllocationOrder")
    private List<String> repaymentAllocationOrder = null;
    @JsonProperty("allowCustomRepaymentAllocation")
    private Boolean allowCustomRepaymentAllocation;
    @JsonProperty("interestCalculationMethod")
    private String interestCalculationMethod;
    @JsonProperty("interestRateSettings")
    private InterestRateSettings interestRateSettings;
    @JsonProperty("interestType")
    private String interestType;
    @JsonProperty("interestBalanceCalculationMethod")
    private String interestBalanceCalculationMethod;
    @JsonProperty("interestApplicationMethod")
    private String interestApplicationMethod;
    @JsonProperty("daysInYear")
    private String daysInYear;
    @JsonProperty("scheduleInterestDaysCountMethod")
    private String scheduleInterestDaysCountMethod;
    @JsonProperty("loanPenaltyCalculationMethod")
    private String loanPenaltyCalculationMethod;
    @JsonProperty("arrearsSettings")
    private ArrearsSettings arrearsSettings;
    @JsonProperty("loanFees")
    private List<Object> loanFees = null;
    @JsonProperty("allowArbitraryFees")
    private Boolean allowArbitraryFees;
    @JsonProperty("accountingMethod")
    private String accountingMethod;
    @JsonProperty("loanProductRules")
    private List<Object> loanProductRules = null;
    @JsonProperty("interestAccruedAccountingMethod")
    private String interestAccruedAccountingMethod;
    @JsonProperty("interestAccrualCalculation")
    private String interestAccrualCalculation;
    @JsonProperty("accountLinkingEnabled")
    private Boolean accountLinkingEnabled;
    @JsonProperty("autoLinkAccounts")
    private Boolean autoLinkAccounts;
    @JsonProperty("autoCreateLinkedAccounts")
    private Boolean autoCreateLinkedAccounts;
    @JsonProperty("settlementOptions")
    private String settlementOptions;
    @JsonProperty("repaymentScheduleEditOptions")
    private List<Object> repaymentScheduleEditOptions = null;
    @JsonProperty("taxesOnInterestEnabled")
    private Boolean taxesOnInterestEnabled;
    @JsonProperty("taxesOnFeesEnabled")
    private Boolean taxesOnFeesEnabled;
    @JsonProperty("taxesOnPenaltyEnabled")
    private Boolean taxesOnPenaltyEnabled;
    @JsonProperty("cappingApplyAccruedChargesBeforeLocking")
    private Boolean cappingApplyAccruedChargesBeforeLocking;
    @JsonProperty("lineOfCreditRequirement")
    private String lineOfCreditRequirement;
    @JsonProperty("templates")
    private List<Object> templates = null;
    @JsonProperty("productSecuritySettings")
    private ProductSecuritySettings productSecuritySettings;
    @JsonProperty("forIndividuals")
    private Boolean forIndividuals;
    @JsonProperty("forPureGroups")
    private Boolean forPureGroups;
    @JsonProperty("forHybridGroups")
    private Boolean forHybridGroups;
    @JsonProperty("forAllBranches")
    private Boolean forAllBranches;
    @JsonProperty("availableProductBranches")
    private List<Object> availableProductBranches = null;
    @JsonProperty("repaymentReschedulingMethod")
    private String repaymentReschedulingMethod;
    @JsonProperty("accrueLateInterest")
    private Boolean accrueLateInterest;
    @JsonProperty("currency")
    private Currency currency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("encodedKey")
    public String getEncodedKey() {
        return encodedKey;
    }

    @JsonProperty("encodedKey")
    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("productName")
    public String getProductName() {
        return productName;
    }

    @JsonProperty("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("loanProductType")
    public String getLoanProductType() {
        return loanProductType;
    }

    @JsonProperty("loanProductType")
    public void setLoanProductType(String loanProductType) {
        this.loanProductType = loanProductType;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("defaultLoanAmount")
    public String getDefaultLoanAmount() {
        return defaultLoanAmount;
    }

    @JsonProperty("defaultLoanAmount")
    public void setDefaultLoanAmount(String defaultLoanAmount) {
        this.defaultLoanAmount = defaultLoanAmount;
    }

    @JsonProperty("minLoanAmount")
    public String getMinLoanAmount() {
        return minLoanAmount;
    }

    @JsonProperty("minLoanAmount")
    public void setMinLoanAmount(String minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    @JsonProperty("maxLoanAmount")
    public String getMaxLoanAmount() {
        return maxLoanAmount;
    }

    @JsonProperty("maxLoanAmount")
    public void setMaxLoanAmount(String maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    @JsonProperty("maxNumberOfDisbursementTranches")
    public Integer getMaxNumberOfDisbursementTranches() {
        return maxNumberOfDisbursementTranches;
    }

    @JsonProperty("maxNumberOfDisbursementTranches")
    public void setMaxNumberOfDisbursementTranches(Integer maxNumberOfDisbursementTranches) {
        this.maxNumberOfDisbursementTranches = maxNumberOfDisbursementTranches;
    }

    @JsonProperty("idGeneratorType")
    public String getIdGeneratorType() {
        return idGeneratorType;
    }

    @JsonProperty("idGeneratorType")
    public void setIdGeneratorType(String idGeneratorType) {
        this.idGeneratorType = idGeneratorType;
    }

    @JsonProperty("idPattern")
    public String getIdPattern() {
        return idPattern;
    }

    @JsonProperty("idPattern")
    public void setIdPattern(String idPattern) {
        this.idPattern = idPattern;
    }

    @JsonProperty("accountInitialState")
    public String getAccountInitialState() {
        return accountInitialState;
    }

    @JsonProperty("accountInitialState")
    public void setAccountInitialState(String accountInitialState) {
        this.accountInitialState = accountInitialState;
    }

    @JsonProperty("activated")
    public Boolean getActivated() {
        return activated;
    }

    @JsonProperty("activated")
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @JsonProperty("repaymentScheduleMethod")
    public String getRepaymentScheduleMethod() {
        return repaymentScheduleMethod;
    }

    @JsonProperty("repaymentScheduleMethod")
    public void setRepaymentScheduleMethod(String repaymentScheduleMethod) {
        this.repaymentScheduleMethod = repaymentScheduleMethod;
    }

    @JsonProperty("scheduleDueDatesMethod")
    public String getScheduleDueDatesMethod() {
        return scheduleDueDatesMethod;
    }

    @JsonProperty("scheduleDueDatesMethod")
    public void setScheduleDueDatesMethod(String scheduleDueDatesMethod) {
        this.scheduleDueDatesMethod = scheduleDueDatesMethod;
    }

    @JsonProperty("defaultRepaymentPeriodCount")
    public Integer getDefaultRepaymentPeriodCount() {
        return defaultRepaymentPeriodCount;
    }

    @JsonProperty("defaultRepaymentPeriodCount")
    public void setDefaultRepaymentPeriodCount(Integer defaultRepaymentPeriodCount) {
        this.defaultRepaymentPeriodCount = defaultRepaymentPeriodCount;
    }

    @JsonProperty("repaymentPeriodUnit")
    public String getRepaymentPeriodUnit() {
        return repaymentPeriodUnit;
    }

    @JsonProperty("repaymentPeriodUnit")
    public void setRepaymentPeriodUnit(String repaymentPeriodUnit) {
        this.repaymentPeriodUnit = repaymentPeriodUnit;
    }

    @JsonProperty("fixedDaysOfMonth")
    public List<Object> getFixedDaysOfMonth() {
        return fixedDaysOfMonth;
    }

    @JsonProperty("fixedDaysOfMonth")
    public void setFixedDaysOfMonth(List<Object> fixedDaysOfMonth) {
        this.fixedDaysOfMonth = fixedDaysOfMonth;
    }

    @JsonProperty("defaultNumInstallments")
    public Integer getDefaultNumInstallments() {
        return defaultNumInstallments;
    }

    @JsonProperty("defaultNumInstallments")
    public void setDefaultNumInstallments(Integer defaultNumInstallments) {
        this.defaultNumInstallments = defaultNumInstallments;
    }

    @JsonProperty("minNumInstallments")
    public Integer getMinNumInstallments() {
        return minNumInstallments;
    }

    @JsonProperty("minNumInstallments")
    public void setMinNumInstallments(Integer minNumInstallments) {
        this.minNumInstallments = minNumInstallments;
    }

    @JsonProperty("maxNumInstallments")
    public Integer getMaxNumInstallments() {
        return maxNumInstallments;
    }

    @JsonProperty("maxNumInstallments")
    public void setMaxNumInstallments(Integer maxNumInstallments) {
        this.maxNumInstallments = maxNumInstallments;
    }

    @JsonProperty("gracePeriodType")
    public String getGracePeriodType() {
        return gracePeriodType;
    }

    @JsonProperty("gracePeriodType")
    public void setGracePeriodType(String gracePeriodType) {
        this.gracePeriodType = gracePeriodType;
    }

    @JsonProperty("defaultPrincipalRepaymentInterval")
    public Integer getDefaultPrincipalRepaymentInterval() {
        return defaultPrincipalRepaymentInterval;
    }

    @JsonProperty("defaultPrincipalRepaymentInterval")
    public void setDefaultPrincipalRepaymentInterval(Integer defaultPrincipalRepaymentInterval) {
        this.defaultPrincipalRepaymentInterval = defaultPrincipalRepaymentInterval;
    }

    @JsonProperty("roundingRepaymentScheduleMethod")
    public String getRoundingRepaymentScheduleMethod() {
        return roundingRepaymentScheduleMethod;
    }

    @JsonProperty("roundingRepaymentScheduleMethod")
    public void setRoundingRepaymentScheduleMethod(String roundingRepaymentScheduleMethod) {
        this.roundingRepaymentScheduleMethod = roundingRepaymentScheduleMethod;
    }

    @JsonProperty("repaymentCurrencyRounding")
    public String getRepaymentCurrencyRounding() {
        return repaymentCurrencyRounding;
    }

    @JsonProperty("repaymentCurrencyRounding")
    public void setRepaymentCurrencyRounding(String repaymentCurrencyRounding) {
        this.repaymentCurrencyRounding = repaymentCurrencyRounding;
    }

    @JsonProperty("repaymentElementsRoundingMethod")
    public String getRepaymentElementsRoundingMethod() {
        return repaymentElementsRoundingMethod;
    }

    @JsonProperty("repaymentElementsRoundingMethod")
    public void setRepaymentElementsRoundingMethod(String repaymentElementsRoundingMethod) {
        this.repaymentElementsRoundingMethod = repaymentElementsRoundingMethod;
    }

    @JsonProperty("paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("amortizationMethod")
    public String getAmortizationMethod() {
        return amortizationMethod;
    }

    @JsonProperty("amortizationMethod")
    public void setAmortizationMethod(String amortizationMethod) {
        this.amortizationMethod = amortizationMethod;
    }

    @JsonProperty("latePaymentsRecalculationMethod")
    public String getLatePaymentsRecalculationMethod() {
        return latePaymentsRecalculationMethod;
    }

    @JsonProperty("latePaymentsRecalculationMethod")
    public void setLatePaymentsRecalculationMethod(String latePaymentsRecalculationMethod) {
        this.latePaymentsRecalculationMethod = latePaymentsRecalculationMethod;
    }

    @JsonProperty("prepaymentAcceptance")
    public String getPrepaymentAcceptance() {
        return prepaymentAcceptance;
    }

    @JsonProperty("prepaymentAcceptance")
    public void setPrepaymentAcceptance(String prepaymentAcceptance) {
        this.prepaymentAcceptance = prepaymentAcceptance;
    }

    @JsonProperty("futurePaymentsAcceptance")
    public String getFuturePaymentsAcceptance() {
        return futurePaymentsAcceptance;
    }

    @JsonProperty("futurePaymentsAcceptance")
    public void setFuturePaymentsAcceptance(String futurePaymentsAcceptance) {
        this.futurePaymentsAcceptance = futurePaymentsAcceptance;
    }

    @JsonProperty("repaymentAllocationOrder")
    public List<String> getRepaymentAllocationOrder() {
        return repaymentAllocationOrder;
    }

    @JsonProperty("repaymentAllocationOrder")
    public void setRepaymentAllocationOrder(List<String> repaymentAllocationOrder) {
        this.repaymentAllocationOrder = repaymentAllocationOrder;
    }

    @JsonProperty("allowCustomRepaymentAllocation")
    public Boolean getAllowCustomRepaymentAllocation() {
        return allowCustomRepaymentAllocation;
    }

    @JsonProperty("allowCustomRepaymentAllocation")
    public void setAllowCustomRepaymentAllocation(Boolean allowCustomRepaymentAllocation) {
        this.allowCustomRepaymentAllocation = allowCustomRepaymentAllocation;
    }

    @JsonProperty("interestCalculationMethod")
    public String getInterestCalculationMethod() {
        return interestCalculationMethod;
    }

    @JsonProperty("interestCalculationMethod")
    public void setInterestCalculationMethod(String interestCalculationMethod) {
        this.interestCalculationMethod = interestCalculationMethod;
    }

    @JsonProperty("interestRateSettings")
    public InterestRateSettings getInterestRateSettings() {
        return interestRateSettings;
    }

    @JsonProperty("interestRateSettings")
    public void setInterestRateSettings(InterestRateSettings interestRateSettings) {
        this.interestRateSettings = interestRateSettings;
    }

    @JsonProperty("interestType")
    public String getInterestType() {
        return interestType;
    }

    @JsonProperty("interestType")
    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    @JsonProperty("interestBalanceCalculationMethod")
    public String getInterestBalanceCalculationMethod() {
        return interestBalanceCalculationMethod;
    }

    @JsonProperty("interestBalanceCalculationMethod")
    public void setInterestBalanceCalculationMethod(String interestBalanceCalculationMethod) {
        this.interestBalanceCalculationMethod = interestBalanceCalculationMethod;
    }

    @JsonProperty("interestApplicationMethod")
    public String getInterestApplicationMethod() {
        return interestApplicationMethod;
    }

    @JsonProperty("interestApplicationMethod")
    public void setInterestApplicationMethod(String interestApplicationMethod) {
        this.interestApplicationMethod = interestApplicationMethod;
    }

    @JsonProperty("daysInYear")
    public String getDaysInYear() {
        return daysInYear;
    }

    @JsonProperty("daysInYear")
    public void setDaysInYear(String daysInYear) {
        this.daysInYear = daysInYear;
    }

    @JsonProperty("scheduleInterestDaysCountMethod")
    public String getScheduleInterestDaysCountMethod() {
        return scheduleInterestDaysCountMethod;
    }

    @JsonProperty("scheduleInterestDaysCountMethod")
    public void setScheduleInterestDaysCountMethod(String scheduleInterestDaysCountMethod) {
        this.scheduleInterestDaysCountMethod = scheduleInterestDaysCountMethod;
    }

    @JsonProperty("loanPenaltyCalculationMethod")
    public String getLoanPenaltyCalculationMethod() {
        return loanPenaltyCalculationMethod;
    }

    @JsonProperty("loanPenaltyCalculationMethod")
    public void setLoanPenaltyCalculationMethod(String loanPenaltyCalculationMethod) {
        this.loanPenaltyCalculationMethod = loanPenaltyCalculationMethod;
    }

    @JsonProperty("arrearsSettings")
    public ArrearsSettings getArrearsSettings() {
        return arrearsSettings;
    }

    @JsonProperty("arrearsSettings")
    public void setArrearsSettings(ArrearsSettings arrearsSettings) {
        this.arrearsSettings = arrearsSettings;
    }

    @JsonProperty("loanFees")
    public List<Object> getLoanFees() {
        return loanFees;
    }

    @JsonProperty("loanFees")
    public void setLoanFees(List<Object> loanFees) {
        this.loanFees = loanFees;
    }

    @JsonProperty("allowArbitraryFees")
    public Boolean getAllowArbitraryFees() {
        return allowArbitraryFees;
    }

    @JsonProperty("allowArbitraryFees")
    public void setAllowArbitraryFees(Boolean allowArbitraryFees) {
        this.allowArbitraryFees = allowArbitraryFees;
    }

    @JsonProperty("accountingMethod")
    public String getAccountingMethod() {
        return accountingMethod;
    }

    @JsonProperty("accountingMethod")
    public void setAccountingMethod(String accountingMethod) {
        this.accountingMethod = accountingMethod;
    }

    @JsonProperty("loanProductRules")
    public List<Object> getLoanProductRules() {
        return loanProductRules;
    }

    @JsonProperty("loanProductRules")
    public void setLoanProductRules(List<Object> loanProductRules) {
        this.loanProductRules = loanProductRules;
    }

    @JsonProperty("interestAccruedAccountingMethod")
    public String getInterestAccruedAccountingMethod() {
        return interestAccruedAccountingMethod;
    }

    @JsonProperty("interestAccruedAccountingMethod")
    public void setInterestAccruedAccountingMethod(String interestAccruedAccountingMethod) {
        this.interestAccruedAccountingMethod = interestAccruedAccountingMethod;
    }

    @JsonProperty("interestAccrualCalculation")
    public String getInterestAccrualCalculation() {
        return interestAccrualCalculation;
    }

    @JsonProperty("interestAccrualCalculation")
    public void setInterestAccrualCalculation(String interestAccrualCalculation) {
        this.interestAccrualCalculation = interestAccrualCalculation;
    }

    @JsonProperty("accountLinkingEnabled")
    public Boolean getAccountLinkingEnabled() {
        return accountLinkingEnabled;
    }

    @JsonProperty("accountLinkingEnabled")
    public void setAccountLinkingEnabled(Boolean accountLinkingEnabled) {
        this.accountLinkingEnabled = accountLinkingEnabled;
    }

    @JsonProperty("autoLinkAccounts")
    public Boolean getAutoLinkAccounts() {
        return autoLinkAccounts;
    }

    @JsonProperty("autoLinkAccounts")
    public void setAutoLinkAccounts(Boolean autoLinkAccounts) {
        this.autoLinkAccounts = autoLinkAccounts;
    }

    @JsonProperty("autoCreateLinkedAccounts")
    public Boolean getAutoCreateLinkedAccounts() {
        return autoCreateLinkedAccounts;
    }

    @JsonProperty("autoCreateLinkedAccounts")
    public void setAutoCreateLinkedAccounts(Boolean autoCreateLinkedAccounts) {
        this.autoCreateLinkedAccounts = autoCreateLinkedAccounts;
    }

    @JsonProperty("settlementOptions")
    public String getSettlementOptions() {
        return settlementOptions;
    }

    @JsonProperty("settlementOptions")
    public void setSettlementOptions(String settlementOptions) {
        this.settlementOptions = settlementOptions;
    }

    @JsonProperty("repaymentScheduleEditOptions")
    public List<Object> getRepaymentScheduleEditOptions() {
        return repaymentScheduleEditOptions;
    }

    @JsonProperty("repaymentScheduleEditOptions")
    public void setRepaymentScheduleEditOptions(List<Object> repaymentScheduleEditOptions) {
        this.repaymentScheduleEditOptions = repaymentScheduleEditOptions;
    }

    @JsonProperty("taxesOnInterestEnabled")
    public Boolean getTaxesOnInterestEnabled() {
        return taxesOnInterestEnabled;
    }

    @JsonProperty("taxesOnInterestEnabled")
    public void setTaxesOnInterestEnabled(Boolean taxesOnInterestEnabled) {
        this.taxesOnInterestEnabled = taxesOnInterestEnabled;
    }

    @JsonProperty("taxesOnFeesEnabled")
    public Boolean getTaxesOnFeesEnabled() {
        return taxesOnFeesEnabled;
    }

    @JsonProperty("taxesOnFeesEnabled")
    public void setTaxesOnFeesEnabled(Boolean taxesOnFeesEnabled) {
        this.taxesOnFeesEnabled = taxesOnFeesEnabled;
    }

    @JsonProperty("taxesOnPenaltyEnabled")
    public Boolean getTaxesOnPenaltyEnabled() {
        return taxesOnPenaltyEnabled;
    }

    @JsonProperty("taxesOnPenaltyEnabled")
    public void setTaxesOnPenaltyEnabled(Boolean taxesOnPenaltyEnabled) {
        this.taxesOnPenaltyEnabled = taxesOnPenaltyEnabled;
    }

    @JsonProperty("cappingApplyAccruedChargesBeforeLocking")
    public Boolean getCappingApplyAccruedChargesBeforeLocking() {
        return cappingApplyAccruedChargesBeforeLocking;
    }

    @JsonProperty("cappingApplyAccruedChargesBeforeLocking")
    public void setCappingApplyAccruedChargesBeforeLocking(Boolean cappingApplyAccruedChargesBeforeLocking) {
        this.cappingApplyAccruedChargesBeforeLocking = cappingApplyAccruedChargesBeforeLocking;
    }

    @JsonProperty("lineOfCreditRequirement")
    public String getLineOfCreditRequirement() {
        return lineOfCreditRequirement;
    }

    @JsonProperty("lineOfCreditRequirement")
    public void setLineOfCreditRequirement(String lineOfCreditRequirement) {
        this.lineOfCreditRequirement = lineOfCreditRequirement;
    }

    @JsonProperty("templates")
    public List<Object> getTemplates() {
        return templates;
    }

    @JsonProperty("templates")
    public void setTemplates(List<Object> templates) {
        this.templates = templates;
    }

    @JsonProperty("productSecuritySettings")
    public ProductSecuritySettings getProductSecuritySettings() {
        return productSecuritySettings;
    }

    @JsonProperty("productSecuritySettings")
    public void setProductSecuritySettings(ProductSecuritySettings productSecuritySettings) {
        this.productSecuritySettings = productSecuritySettings;
    }

    @JsonProperty("forIndividuals")
    public Boolean getForIndividuals() {
        return forIndividuals;
    }

    @JsonProperty("forIndividuals")
    public void setForIndividuals(Boolean forIndividuals) {
        this.forIndividuals = forIndividuals;
    }

    @JsonProperty("forPureGroups")
    public Boolean getForPureGroups() {
        return forPureGroups;
    }

    @JsonProperty("forPureGroups")
    public void setForPureGroups(Boolean forPureGroups) {
        this.forPureGroups = forPureGroups;
    }

    @JsonProperty("forHybridGroups")
    public Boolean getForHybridGroups() {
        return forHybridGroups;
    }

    @JsonProperty("forHybridGroups")
    public void setForHybridGroups(Boolean forHybridGroups) {
        this.forHybridGroups = forHybridGroups;
    }

    @JsonProperty("forAllBranches")
    public Boolean getForAllBranches() {
        return forAllBranches;
    }

    @JsonProperty("forAllBranches")
    public void setForAllBranches(Boolean forAllBranches) {
        this.forAllBranches = forAllBranches;
    }

    @JsonProperty("availableProductBranches")
    public List<Object> getAvailableProductBranches() {
        return availableProductBranches;
    }

    @JsonProperty("availableProductBranches")
    public void setAvailableProductBranches(List<Object> availableProductBranches) {
        this.availableProductBranches = availableProductBranches;
    }

    @JsonProperty("repaymentReschedulingMethod")
    public String getRepaymentReschedulingMethod() {
        return repaymentReschedulingMethod;
    }

    @JsonProperty("repaymentReschedulingMethod")
    public void setRepaymentReschedulingMethod(String repaymentReschedulingMethod) {
        this.repaymentReschedulingMethod = repaymentReschedulingMethod;
    }

    @JsonProperty("accrueLateInterest")
    public Boolean getAccrueLateInterest() {
        return accrueLateInterest;
    }

    @JsonProperty("accrueLateInterest")
    public void setAccrueLateInterest(Boolean accrueLateInterest) {
        this.accrueLateInterest = accrueLateInterest;
    }

    @JsonProperty("currency")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
