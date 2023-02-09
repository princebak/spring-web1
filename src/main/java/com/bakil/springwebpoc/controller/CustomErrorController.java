package com.bakil.springwebpoc.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class CustomErrorController implements ErrorController {
    @GetMapping("/error")
    public HttpServletResponse handleError(HttpServletResponse response){
        System.out.println("==> Error 1: "+response.getStatus());
        return response;
    }
}
