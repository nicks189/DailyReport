package com.nicksteger.dailyreport.interfaces.twilio;

import com.nicksteger.dailyreport.data.entity.User;
import com.twilio.rest.api.v2010.account.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TwilioUtil_Test {

    @Autowired
    private TwilioUtil twilioUtil;

    @Test
    public void testNotifyUser_validNum() {
        User testUser = new User();
        testUser.setSmsNumber("+15634519000");
        String testMessage = "Sent from your Twilio trial account - Hello from DailyReport!";
        Message message = twilioUtil.sendMessage(testUser, testMessage);
        assertEquals(testMessage, message.getBody());
    }

}
