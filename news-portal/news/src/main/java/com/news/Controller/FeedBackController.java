package com.news.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedBack")
public class FeedBackController {

    @PostMapping("/save")
    public String saveFeedBack(){
        return "pk";
    }
}
