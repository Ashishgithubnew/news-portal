package com.news.Controller;

import com.news.Service.HeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/headline")
public class HeadlineController {

    @Autowired
    HeadlineService headlineService;

    @PostMapping("/save")
    public String saveHeadline(@RequestParam String tittle){
        return headlineService.saveHeadline(tittle);
    }

    @GetMapping("/getHeadline")
    public String getHeadline(){
        return headlineService.getHeadline();
    }
}
