package com.news.ServiceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;

@Service
public class NewsService {
    private static final String API_KEY = "pub_63560a0ad9915cb980d08a81e68265e11ee06";
    private static final String NEWS_API_URL =
            "https://newsdata.io/api/1/news?apikey=" + API_KEY;

    public List<Map<String, Object>> fetchNews() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(NEWS_API_URL, Map.class);
        // Extract the list of articles from the API response
        return (List<Map<String, Object>>) response.get("results");
    }
}

