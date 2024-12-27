package com.news.Dto;

import lombok.Data;

import java.util.UUID;


public class CustomFormDetailsDto {

    public UUID id;
    public String cato;
    public String tittle;
    public String desc;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCato() {
        return cato;
    }

    public void setCato(String cato) {
        this.cato = cato;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
