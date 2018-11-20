package com.nicksteger.dailyreport.rest.user;

import com.nicksteger.dailyreport.data.entity.User;
import com.nicksteger.dailyreport.rest.user.dto.UserDTO;
import com.nicksteger.dailyreport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
public class UserAPI {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    @ResponseBody
    public User createUser(@RequestBody UserDTO userDTO) {
        return userService.saveUserDTO(userDTO);
    }
}
