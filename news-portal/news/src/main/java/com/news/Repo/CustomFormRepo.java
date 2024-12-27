package com.news.Repo;

import com.news.Entity.CustomFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CustomFormRepo extends JpaRepository<CustomFormEntity, UUID> {
}
