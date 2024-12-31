package com.news.Repo;

import com.news.Entity.HeadlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface HeadlineRepo extends JpaRepository<HeadlineEntity , UUID> {

    @Query("select a from HeadlineEntity a order by a.creationDateTime desc")
    List<HeadlineEntity> getNews();
}
