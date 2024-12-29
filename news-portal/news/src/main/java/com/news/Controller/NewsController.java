package com.news.Controller;

import com.news.ServiceImpl.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public List<Map<String, Object>> getNews(@RequestParam(value = "category", required = false) String category) {
        return newsService.fetchNews(category);
    }
}

