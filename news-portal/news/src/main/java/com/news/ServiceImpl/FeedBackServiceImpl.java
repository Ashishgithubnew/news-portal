package com.news.ServiceImpl;

import com.news.Dto.CustomFormDetailsDto;
import com.news.Dto.FeedBackDto;
import com.news.Entity.FeedBackEntity;
import com.news.Repo.FeedBackRepo;
import com.news.Service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    FeedBackRepo feedBackRepo;
    @Override
    public String saveFeedBack(FeedBackDto dto) {

        FeedBackEntity entity = new FeedBackEntity();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setFeedback(dto.getFeedback());


        feedBackRepo.save(entity);

        return "Save Successfully";
    }

    @Override
    public List<FeedBackDto> getAllFeedBack() {

        List<FeedBackEntity> entities = feedBackRepo.findAll();
        List<FeedBackDto> dtos = new ArrayList<>();
        for (FeedBackEntity  feedBackEntity:entities){
           FeedBackDto dto = new FeedBackDto();
           dto.setEmail(feedBackEntity.getEmail());
           dto.setFeedback(feedBackEntity.getFeedback());
           dto.setName(feedBackEntity.getName());
           dto.setId(feedBackEntity.getId());
           dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public String deleteFeedBack(UUID id) {
        feedBackRepo.deleteById(id);
        return "deleted succesfully";
    }
}
