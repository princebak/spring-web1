package com.bakil.springwebpoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {
    @GetMapping("/home")
    public String getHome() throws RuntimeException {
        throw new RuntimeException();
        //return "index";
    }
}
