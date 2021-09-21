package com.es.EnginSimon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/egal")
    public String egal(){
        return "Engine und Simon's Spielfeld";
    }
}
