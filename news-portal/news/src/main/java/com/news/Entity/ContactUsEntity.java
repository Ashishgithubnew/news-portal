package com.news.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class ContactUsEntity extends BaseEntity{
    private String username;
    private String email;
    private String contact;
    private String remarks;

}
