package com.news.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
public class ContactUsEntity extends BaseEntity{
    private String username;
    private String email;
    private String contact;
    private String remarks;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
