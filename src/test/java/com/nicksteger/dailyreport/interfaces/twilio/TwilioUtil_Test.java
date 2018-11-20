package com.nicksteger.dailyreport.interfaces.twilio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TwilioUtil_Test {

    private TwilioUtil twilioUtil;

    @Autowired
    public TwilioUtil_Test(TwilioUtil twilioUtil) {
        this.twilioUtil = twilioUtil;
    }
}
