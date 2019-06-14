package com.payment.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MpesaResponseObject {
    @JsonProperty("OriginatorConverstionID")
    private String OriginatorConverstionID;

    public String getOriginatorConverstionID() {
        return OriginatorConverstionID;
    }

    public MpesaResponseObject setOriginatorConverstionID(String originatorConverstionID) {
        OriginatorConverstionID = originatorConverstionID;
        return this;
    }

    public String getConversationID() {
        return ConversationID;
    }

    public MpesaResponseObject setConversationID(String conversationID) {
        ConversationID = conversationID;
        return this;
    }

    public String getResponseDescription() {
        return ResponseDescription;
    }

    public MpesaResponseObject setResponseDescription(String responseDescription) {
        ResponseDescription = responseDescription;
        return this;
    }

    @JsonProperty("ConversationID")
    private String ConversationID;

    @JsonProperty("ResponseDescription")
    private String ResponseDescription;

}
