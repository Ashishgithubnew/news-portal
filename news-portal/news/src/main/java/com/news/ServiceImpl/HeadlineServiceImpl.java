package com.news.ServiceImpl;

import com.news.Entity.HeadlineEntity;
import com.news.Repo.HeadlineRepo;
import com.news.Service.HeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadlineServiceImpl implements HeadlineService {

    @Autowired
    HeadlineRepo infoRepo;

    @Override
    public String saveHeadline(String tittle) {

        HeadlineEntity headlineEntity = new HeadlineEntity();
        headlineEntity.setTittle(tittle);
        infoRepo.save(headlineEntity);
        return "Save Successfully";

    }

    @Override
    public String getHeadline() {
        List<HeadlineEntity> savedData = infoRepo.getNews();
        return savedData.get(0).getTittle();
    }
}
