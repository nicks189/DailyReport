package com.nicksteger.dailyreport.interfaces.twilio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TwilioUtil {

    private String sid;
    private String token;

    public TwilioUtil(@Value("${twilio.auth.sid}") String sid,
                      @Value("${twilio.auth.token}") String token) {
        this.sid = sid;
        this.token = token;
    }

}
