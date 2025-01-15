package com.news.ServiceImpl;

import com.news.Dto.FeedBackDto;
import com.news.Entity.FeedBackEntity;
import com.news.Repo.FeedBackRepo;
import com.news.Service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    FeedBackRepo feedBackRepo;
    @Override
    public String saveFeedBack(FeedBackDto dto) {
        FeedBackEntity entity = new FeedBackEntity();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.getFeedback(dto.getFeedback());

        feedBackRepo.save(entity);

        return "Save Successfully";
    }
}
