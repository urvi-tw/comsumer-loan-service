
package com.thoughtworks.consumerloanservice.model;

import java.util.HashMap;
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
    "isGuarantorsEnabled",
    "isCollateralEnabled",
    "isInvestorFundsEnabled"
})
@Generated("jsonschema2pojo")
public class ProductSecuritySettings {

    @JsonProperty("encodedKey")
    private String encodedKey;
    @JsonProperty("isGuarantorsEnabled")
    private Boolean isGuarantorsEnabled;
    @JsonProperty("isCollateralEnabled")
    private Boolean isCollateralEnabled;
    @JsonProperty("isInvestorFundsEnabled")
    private Boolean isInvestorFundsEnabled;
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

    @JsonProperty("isGuarantorsEnabled")
    public Boolean getIsGuarantorsEnabled() {
        return isGuarantorsEnabled;
    }

    @JsonProperty("isGuarantorsEnabled")
    public void setIsGuarantorsEnabled(Boolean isGuarantorsEnabled) {
        this.isGuarantorsEnabled = isGuarantorsEnabled;
    }

    @JsonProperty("isCollateralEnabled")
    public Boolean getIsCollateralEnabled() {
        return isCollateralEnabled;
    }

    @JsonProperty("isCollateralEnabled")
    public void setIsCollateralEnabled(Boolean isCollateralEnabled) {
        this.isCollateralEnabled = isCollateralEnabled;
    }

    @JsonProperty("isInvestorFundsEnabled")
    public Boolean getIsInvestorFundsEnabled() {
        return isInvestorFundsEnabled;
    }

    @JsonProperty("isInvestorFundsEnabled")
    public void setIsInvestorFundsEnabled(Boolean isInvestorFundsEnabled) {
        this.isInvestorFundsEnabled = isInvestorFundsEnabled;
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
