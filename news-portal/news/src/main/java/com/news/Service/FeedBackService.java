package com.news.Service;

import com.news.Dto.FeedBackDto;
import com.news.Repo.FeedBackRepo;
import org.springframework.beans.factory.annotation.Autowired;

public interface FeedBackService {
    String saveFeedBack(FeedBackDto dto);
}
