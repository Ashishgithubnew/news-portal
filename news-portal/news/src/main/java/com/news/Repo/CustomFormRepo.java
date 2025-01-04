package com.news.Repo;

import com.news.Entity.CustomFormEntity;
import com.news.Entity.HeadlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CustomFormRepo extends JpaRepository<CustomFormEntity, UUID> {
    @Query("select a from CustomFormEntity a order by a.creationDateTime desc")
    List<CustomFormEntity> getNews();
}
