package com.news.Controller;

import com.news.Dto.FeedBackDto;
import com.news.Service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/feedBack")
public class FeedBackController {

    @Autowired
    FeedBackService feedBackService;

    @PostMapping("/save")
    public String saveFeedBack(@RequestBody FeedBackDto dto){
        return feedBackService.saveFeedBack(dto) ;
    }
    @GetMapping("/getAll")
    public List<FeedBackDto> getFeedBack(){
        return feedBackService.getAllFeedBack();

    }

    @PostMapping("/delete")
    public String deleteFeedBack(@RequestParam UUID id){
        return feedBackService.deleteFeedBack(id);
    }
}
