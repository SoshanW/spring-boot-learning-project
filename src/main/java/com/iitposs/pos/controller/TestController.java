package com.iitposs.pos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin//CrossOrigin Annotation is used for a security purpose.
// This will restrict data entering from unauthorised domains
@RequestMapping("api/v1/test") //this annotation defines the url of this
// particular controller
public class TestController {

    @GetMapping(path = "/get-test")
    public String getMyText (){
        return "Hello World";
    }

    @GetMapping(path = "/get-name")
    public String getMyName(){
        return "Soshan Wijayarathne";
    }
}
