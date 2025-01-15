package com.news.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.UUID;


@Entity
public class FeedBackEntity extends BaseEntity{
    private String name;
    private String email;

    @Column(name = "feedBack", columnDefinition = "text")
    private String feedback;

    private UUID id;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
