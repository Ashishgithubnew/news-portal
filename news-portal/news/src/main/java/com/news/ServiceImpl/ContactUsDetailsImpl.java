package com.news.ServiceImpl;

import com.news.Dto.ContactUsDetailsDto;
import com.news.Entity.ContactUsEntity;
import com.news.Repo.ContactUsRepo;
import com.news.Service.ContactUsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsDetailsImpl implements ContactUsDetailsService {
    @Autowired
    ContactUsRepo contactUsRepo;


    @Override
    public String saveService(ContactUsDetailsDto dto) {
        ContactUsEntity contactUsEntity = new ContactUsEntity();
        convertDtoToEntity(dto , contactUsEntity);
        contactUsRepo.save(contactUsEntity);
        return "save successfully";
    }
    public void convertDtoToEntity(ContactUsDetailsDto dto , ContactUsEntity entity){
        entity.setEmail(dto.getEmail());
        entity.setContact(dto.getContact());
        entity.setUsername(dto.getUsername());
        entity.setRemarks(dto.getRemarks());
    }
}

