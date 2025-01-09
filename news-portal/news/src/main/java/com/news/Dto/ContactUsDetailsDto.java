package com.news.Dto;

import jakarta.persistence.Column;
import lombok.Data;


public class ContactUsDetailsDto {
    public String username;
    public String email;
    public String contact;

    @Column(columnDefinition = "Text")
    public String remarks;

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
