package com.payment.demo.models;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ShortCode",
        "ResponseType",
        "ConfirmationURL",
        "ValidationURL"
})
public class MpesaRegister {
    @JsonProperty("ShortCode")
    private String shortCode;
    @JsonProperty("ResponseType")
    private String responseType;
    @JsonProperty("ConfirmationURL")
    private String confirmationURL;
    @JsonProperty("ValidationURL")
    private String validationURL;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ShortCode")
    public String getShortCode() {
        return shortCode;
    }

    @JsonProperty("ShortCode")
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    @JsonProperty("ResponseType")
    public String getResponseType() {
        return responseType;
    }

    @JsonProperty("ResponseType")
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    @JsonProperty("ConfirmationURL")
    public String getConfirmationURL() {
        return confirmationURL;
    }

    @JsonProperty("ConfirmationURL")
    public void setConfirmationURL(String confirmationURL) {
        this.confirmationURL = confirmationURL;
    }

    @JsonProperty("ValidationURL")
    public String getValidationURL() {
        return validationURL;
    }

    @JsonProperty("ValidationURL")
    public void setValidationURL(String validationURL) {
        this.validationURL = validationURL;
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
