
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
    "code",
    "name",
    "symbol",
    "digitsAfterDecimal",
    "currencySymbolPosition",
    "isBaseCurrency",
    "type",
    "creationDate",
    "lastModifiedDate"
})
@Generated("jsonschema2pojo")
public class Currency {

    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("digitsAfterDecimal")
    private Integer digitsAfterDecimal;
    @JsonProperty("currencySymbolPosition")
    private String currencySymbolPosition;
    @JsonProperty("isBaseCurrency")
    private Boolean isBaseCurrency;
    @JsonProperty("type")
    private String type;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("digitsAfterDecimal")
    public Integer getDigitsAfterDecimal() {
        return digitsAfterDecimal;
    }

    @JsonProperty("digitsAfterDecimal")
    public void setDigitsAfterDecimal(Integer digitsAfterDecimal) {
        this.digitsAfterDecimal = digitsAfterDecimal;
    }

    @JsonProperty("currencySymbolPosition")
    public String getCurrencySymbolPosition() {
        return currencySymbolPosition;
    }

    @JsonProperty("currencySymbolPosition")
    public void setCurrencySymbolPosition(String currencySymbolPosition) {
        this.currencySymbolPosition = currencySymbolPosition;
    }

    @JsonProperty("isBaseCurrency")
    public Boolean getIsBaseCurrency() {
        return isBaseCurrency;
    }

    @JsonProperty("isBaseCurrency")
    public void setIsBaseCurrency(Boolean isBaseCurrency) {
        this.isBaseCurrency = isBaseCurrency;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
