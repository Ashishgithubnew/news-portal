package com.news.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class FeedBackEntity extends BaseEntity{
    private String name;
    private String email;

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

    public String getFeedback(String feedback) {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Column(name = "feedBack", columnDefinition = "text")
    private String feedback;
}
