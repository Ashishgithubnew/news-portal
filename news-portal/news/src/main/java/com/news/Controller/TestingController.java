package com.news.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testing")
public class TestingController {

    @GetMapping("/")
    public String save(){
        return "welcome Ashish and Gauri";
    }

}
