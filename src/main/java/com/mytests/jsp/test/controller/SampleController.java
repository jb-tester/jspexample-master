package com.mytests.jsp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("index");
        return "index";
    }
}