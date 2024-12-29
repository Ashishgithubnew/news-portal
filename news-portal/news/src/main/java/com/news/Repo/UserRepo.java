package com.news.Repo;

import com.news.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepo extends JpaRepository<UserEntity , UUID> {

    @Query("select a from UserEntity a where a.email = :email and a.password = :password")
    UserEntity getLoginCheck(@Param("email") String email,@Param("password") String pass);

    @Query("select a from UserEntity a where a.email = :email ")
    UserEntity findByEmail(String email);
}
