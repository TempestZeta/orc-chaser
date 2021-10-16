package com.testbed.orcchaser.controller;

import com.testbed.orcchaser.domain.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @PostMapping("/user")
    private Long registerUser(@RequestParam String name, @RequestParam String pwd) {
        User user = new User();

        return user.getId();
    }
}
