package com.codevargas.petsbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/info")
public class infoController {
    
    @GetMapping("")
    public String getInfo(){

        return "hello";
    }
}
