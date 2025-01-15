package com.news.Controller;

import com.news.Dto.FeedBackDto;
import com.news.Service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feedBack")
public class FeedBackController {

    @Autowired
    FeedBackService feedBackService;

    @PostMapping("/save")
    public String saveFeedBack(@RequestBody FeedBackDto dto){
        return feedBackService.saveFeedBack(dto) ;
    }
}
