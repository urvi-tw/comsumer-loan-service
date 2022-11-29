
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
    "toleranceCalculationMethod",
    "dateCalculationMethod",
    "nonWorkingDaysMethod"
})
@Generated("jsonschema2pojo")
public class ArrearsSettings {

    @JsonProperty("encodedKey")
    private String encodedKey;
    @JsonProperty("toleranceCalculationMethod")
    private String toleranceCalculationMethod;
    @JsonProperty("dateCalculationMethod")
    private String dateCalculationMethod;
    @JsonProperty("nonWorkingDaysMethod")
    private String nonWorkingDaysMethod;
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

    @JsonProperty("toleranceCalculationMethod")
    public String getToleranceCalculationMethod() {
        return toleranceCalculationMethod;
    }

    @JsonProperty("toleranceCalculationMethod")
    public void setToleranceCalculationMethod(String toleranceCalculationMethod) {
        this.toleranceCalculationMethod = toleranceCalculationMethod;
    }

    @JsonProperty("dateCalculationMethod")
    public String getDateCalculationMethod() {
        return dateCalculationMethod;
    }

    @JsonProperty("dateCalculationMethod")
    public void setDateCalculationMethod(String dateCalculationMethod) {
        this.dateCalculationMethod = dateCalculationMethod;
    }

    @JsonProperty("nonWorkingDaysMethod")
    public String getNonWorkingDaysMethod() {
        return nonWorkingDaysMethod;
    }

    @JsonProperty("nonWorkingDaysMethod")
    public void setNonWorkingDaysMethod(String nonWorkingDaysMethod) {
        this.nonWorkingDaysMethod = nonWorkingDaysMethod;
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
