
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
    "defaultInterestRate",
    "minInterestRate",
    "encodedKey",
    "interestChargeFrequency",
    "interestChargeFrequencyCount",
    "interestRateSource",
    "interestRateTerms",
    "interestRateTiers",
    "accrueInterestAfterMaturity"
})
@Generated("jsonschema2pojo")
public class InterestRateSettings {

    @JsonProperty("defaultInterestRate")
    private String defaultInterestRate;
    @JsonProperty("minInterestRate")
    private String minInterestRate;
    @JsonProperty("encodedKey")
    private String encodedKey;
    @JsonProperty("interestChargeFrequency")
    private String interestChargeFrequency;
    @JsonProperty("interestChargeFrequencyCount")
    private Integer interestChargeFrequencyCount;
    @JsonProperty("interestRateSource")
    private String interestRateSource;
    @JsonProperty("interestRateTerms")
    private String interestRateTerms;
    @JsonProperty("interestRateTiers")
    private List<Object> interestRateTiers = null;
    @JsonProperty("accrueInterestAfterMaturity")
    private Boolean accrueInterestAfterMaturity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("defaultInterestRate")
    public String getDefaultInterestRate() {
        return defaultInterestRate;
    }

    @JsonProperty("defaultInterestRate")
    public void setDefaultInterestRate(String defaultInterestRate) {
        this.defaultInterestRate = defaultInterestRate;
    }

    @JsonProperty("minInterestRate")
    public String getMinInterestRate() {
        return minInterestRate;
    }

    @JsonProperty("minInterestRate")
    public void setMinInterestRate(String minInterestRate) {
        this.minInterestRate = minInterestRate;
    }

    @JsonProperty("encodedKey")
    public String getEncodedKey() {
        return encodedKey;
    }

    @JsonProperty("encodedKey")
    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    @JsonProperty("interestChargeFrequency")
    public String getInterestChargeFrequency() {
        return interestChargeFrequency;
    }

    @JsonProperty("interestChargeFrequency")
    public void setInterestChargeFrequency(String interestChargeFrequency) {
        this.interestChargeFrequency = interestChargeFrequency;
    }

    @JsonProperty("interestChargeFrequencyCount")
    public Integer getInterestChargeFrequencyCount() {
        return interestChargeFrequencyCount;
    }

    @JsonProperty("interestChargeFrequencyCount")
    public void setInterestChargeFrequencyCount(Integer interestChargeFrequencyCount) {
        this.interestChargeFrequencyCount = interestChargeFrequencyCount;
    }

    @JsonProperty("interestRateSource")
    public String getInterestRateSource() {
        return interestRateSource;
    }

    @JsonProperty("interestRateSource")
    public void setInterestRateSource(String interestRateSource) {
        this.interestRateSource = interestRateSource;
    }

    @JsonProperty("interestRateTerms")
    public String getInterestRateTerms() {
        return interestRateTerms;
    }

    @JsonProperty("interestRateTerms")
    public void setInterestRateTerms(String interestRateTerms) {
        this.interestRateTerms = interestRateTerms;
    }

    @JsonProperty("interestRateTiers")
    public List<Object> getInterestRateTiers() {
        return interestRateTiers;
    }

    @JsonProperty("interestRateTiers")
    public void setInterestRateTiers(List<Object> interestRateTiers) {
        this.interestRateTiers = interestRateTiers;
    }

    @JsonProperty("accrueInterestAfterMaturity")
    public Boolean getAccrueInterestAfterMaturity() {
        return accrueInterestAfterMaturity;
    }

    @JsonProperty("accrueInterestAfterMaturity")
    public void setAccrueInterestAfterMaturity(Boolean accrueInterestAfterMaturity) {
        this.accrueInterestAfterMaturity = accrueInterestAfterMaturity;
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
