package com.payment.demo.models;


import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ShortCode",
        "CommandID",
        "Amount",
        "Msisdn",
        "BillRefNumber"
})
public class MpesaSimulation {
    @JsonProperty("ShortCode")
    private String shortCode;
    @JsonProperty("CommandID")
    private String commandID;
    @JsonProperty("Amount")
    private String amount;
    @JsonProperty("Msisdn")
    private String msisdn;
    @JsonProperty("BillRefNumber")
    private String billRefNumber;
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

    @JsonProperty("CommandID")
    public String getCommandID() {
        return commandID;
    }

    @JsonProperty("CommandID")
    public void setCommandID(String commandID) {
        this.commandID = commandID;
    }

    @JsonProperty("Amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("Msisdn")
    public String getMsisdn() {
        return msisdn;
    }

    @JsonProperty("Msisdn")
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @JsonProperty("BillRefNumber")
    public String getBillRefNumber() {
        return billRefNumber;
    }

    @JsonProperty("BillRefNumber")
    public void setBillRefNumber(String billRefNumber) {
        this.billRefNumber = billRefNumber;
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
