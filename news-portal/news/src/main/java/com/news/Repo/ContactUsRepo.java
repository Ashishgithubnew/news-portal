package com.news.Repo;

import com.news.Entity.ContactUsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ContactUsRepo extends JpaRepository<ContactUsEntity, UUID> {
}
