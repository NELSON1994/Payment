package com.payment.demo.controllers;


import com.payment.demo.models.MpesaCallBackSimulate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class MpesaTrasactionController {
private Logger logger= LoggerFactory.getLogger(MpesaTrasactionController.class);
    @RequestMapping(value = "/api/v1/c2b/callback/validation", method = RequestMethod.POST)
    public Map<String , Object> MPESAC2BValidation(@RequestBody MpesaCallBackSimulate request) {
        return  new HashMap<>();
    }

    @RequestMapping(value = "/api/v1/c2b/callback/confirmation", method = RequestMethod.POST)
    public Map <String , Object> MPESAC2BConfirmation(@RequestBody MpesaCallBackSimulate request){
         Logger logger= LoggerFactory.getLogger(MpesaTrasactionController.class);
        logger.info("***************Confirmation************");
        logger.info("BILL REF NUMBER    :" + request.getBillRefNumber());
        logger.info("BUSINESS SHORT CODE    :" + request.getBusinessShortCode());
        logger.info("TRANSACTION AMOUNT    :" + request.getTransAmount());
        logger.info("INVOICE NUMBER     :" + request.getInvoiceNumber());
        logger.info("********END OF confirmation*****************");

        return  new HashMap<>();
    }
}
