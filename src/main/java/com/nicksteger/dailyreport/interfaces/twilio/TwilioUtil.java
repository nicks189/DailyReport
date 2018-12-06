package com.nicksteger.dailyreport.interfaces.twilio;

import com.nicksteger.dailyreport.data.entity.User;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.twilio.Twilio;

@Component
public class TwilioUtil {

    private String sid;
    private String token;
    private String fromNumber;

    public TwilioUtil(@Value("${twilio.auth.sid}") String sid,
                      @Value("${twilio.auth.token}") String token,
                      @Value("${twilio.account.number}") String fromNumber) {
        this.sid = sid;
        this.token = token;
        this.fromNumber = fromNumber;
        Twilio.init(sid, token);
    }

    public Message sendMessage(User user, String message) {
       return Message.creator(new PhoneNumber(user.getSmsNumber()), new PhoneNumber(fromNumber), message).create();
    }

}
