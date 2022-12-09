package com.siezn.deify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping("/main")
    public String main(){
        return "";
    }
}
