package com.nicksteger.dailyreport.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/general")
public class DailyReportAPI {

    @RequestMapping(value = "/hello")
    public Map hello() {
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("message", "Hello, World!");
        return responseBody;
    }
}
