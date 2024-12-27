package com.news.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
public class CustomFormEntity extends BaseEntity{

    private String cato;
    private String tittle;

    @Column(name = "description", columnDefinition = "text")
    private String desc;

    @Lob
    private byte[] image;

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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
