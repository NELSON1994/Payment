package com.payment.demo.models;

public class MpesaAuthorizationResponse {
    private String access_token;
    private String expires_in;


    public String getAccess_token() {
        return access_token;
    }

    public MpesaAuthorizationResponse setAccess_token(String access_token) {
        this.access_token = access_token;
        return this;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public MpesaAuthorizationResponse setExpires_in(String expires_in) {
        this.expires_in = expires_in;
        return this;
    }


}
