package com.news.ServiceImpl;

import org.apache.catalina.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;

@Service
public class NewsService {
    private static final String API_KEY = "pub_63560a0ad9915cb980d08a81e68265e11ee06";
    private static final String NEWS_API_URL =
            "https://newsdata.io/api/1/news?apikey=" + API_KEY;
    private static final String BASE_NEWS_API_URL = "https://newsdata.io/api/1/news";


    public List<Map<String, Object>> fetchNews(String category) {
        RestTemplate restTemplate = new RestTemplate();
        String url;
        if(StringUtils.isEmpty(category)){
            url = String.format("%s?apikey=%s&country=in&language=hi", BASE_NEWS_API_URL, API_KEY);
        }else {
            url = String.format("%s?apikey=%s&country=in&category=%s&language=hi", BASE_NEWS_API_URL, API_KEY, category);
        }

        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        return (List<Map<String, Object>>) response.get("results");
    }
}

