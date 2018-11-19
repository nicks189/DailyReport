package com.nicksteger.dailyreport.rest.user;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
public class UserAPI {

    // @RequestMapping(value = "/register", method = RequestMethod.POST)
    @PostMapping(path = "/add")
    public Map createUser() {
        return new HashMap();
    }
}
