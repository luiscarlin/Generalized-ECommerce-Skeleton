package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andrewburns on 11/2/16.
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        return "index";
    }

}
