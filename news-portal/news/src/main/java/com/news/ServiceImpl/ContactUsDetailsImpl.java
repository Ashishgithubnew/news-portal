package com.news.ServiceImpl;

import com.news.Dto.ContactUsDetailsDto;
import com.news.Entity.ContactUsEntity;
import com.news.Repo.ContactUsRepo;
import com.news.Security.BadRequestException;
import com.news.Service.ContactUsDetailsService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ContactUsDetailsImpl implements ContactUsDetailsService {
    @Autowired
    ContactUsRepo contactUsRepo;


    @Override
    public String saveService(ContactUsDetailsDto dto) {
        ContactUsEntity contactUsEntity = new ContactUsEntity();
        convertDtoToEntity(dto, contactUsEntity);
        contactUsRepo.save(contactUsEntity);
        return "save successfully";
    }

    public void convertDtoToEntity(ContactUsDetailsDto dto, ContactUsEntity entity) {
        entity.setEmail(dto.getEmail());
        entity.setContact(dto.getContact());
        entity.setUsername(dto.getUsername());
        entity.setRemarks(dto.getRemarks());
        entity.setRead(false);
    }

    @Override
    public List<ContactUsDetailsDto> findAllService(String isRead) {
        List<ContactUsEntity> contactUsEntities;

        if (!StringUtils.isNotEmpty(isRead) || isRead.equalsIgnoreCase("false")) {
            contactUsEntities = contactUsRepo.findAll();
        } else {
            contactUsEntities = contactUsRepo.isRead();
        }

        if (ObjectUtils.isEmpty(contactUsEntities)) {
            throw new BadRequestException("No data found");
        }
        List<ContactUsDetailsDto> dtos = new ArrayList<>();

        for (ContactUsEntity entity : contactUsEntities) {
            ContactUsDetailsDto dto = new ContactUsDetailsDto();
            dto.setId(entity.getId());
            dto.setContact(entity.getContact());
            dto.setEmail(entity.getEmail());
            dto.setRemarks(entity.getRemarks());
            dto.setUsername(entity.getUsername());
            dto.setRead(dto.isRead());
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public String editContactUs(UUID id, Boolean isRead) {
        ContactUsEntity Entity = contactUsRepo.getById(id);
        if (ObjectUtils.isEmpty(Entity)) {
            throw new BadRequestException("No record found");
        }
        Entity.setRead(isRead);
        contactUsRepo.save(Entity);
        return "Updated successfully";
    }
}

