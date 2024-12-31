package com.news.Controller;

import com.news.Service.HeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
    public Map<String, String> getHeadline() {
        String headline = headlineService.getHeadline();
        Map<String, String> response = new HashMap<>();
        response.put("title", headline);
        return response;
    }

}
