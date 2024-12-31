package com.news.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class HeadlineEntity extends BaseEntity{

    @Column(columnDefinition = "Text")
    private String tittle;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
