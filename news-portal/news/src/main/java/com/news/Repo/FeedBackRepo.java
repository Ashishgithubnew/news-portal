package com.news.Repo;

import com.news.Entity.FeedBackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface FeedBackRepo extends JpaRepository<FeedBackEntity , UUID> {
}
