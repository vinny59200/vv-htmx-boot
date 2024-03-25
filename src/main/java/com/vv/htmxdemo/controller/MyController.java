package com.vv.htmxdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1")
public class MyController {

    @PostMapping("/some-endpoint")
    @ResponseBody
    public String handlePost() {
        // Generate the HTML response
        return "<div id='update-div'>Yihaa it works 🤣</div>";
    }
}

