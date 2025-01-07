package com.news.Dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ContactUsDetailsDto {
    public String username;
    public String email;
    public String contact;

    @Column(columnDefinition = "Text")
    public String remarks;
}
