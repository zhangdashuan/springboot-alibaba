package com.sidianle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/update")
    public void update(@RequestParam("username") String username) {
        System.out.println("插入一条用户信息");
    }

}
