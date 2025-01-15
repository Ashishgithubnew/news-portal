package com.news.Service;

import com.news.Dto.ContactUsDetailsDto;

import java.util.List;
import java.util.UUID;

public interface ContactUsDetailsService {
    String saveService(ContactUsDetailsDto dto);

    List<ContactUsDetailsDto> findAllService(boolean isRead);



    String editContactUs(UUID id, Boolean isRead);
}
