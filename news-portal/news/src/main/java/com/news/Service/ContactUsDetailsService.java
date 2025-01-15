package com.news.Service;

import com.news.Dto.ContactUsDetailsDto;

import java.util.List;

public interface ContactUsDetailsService {
    String saveService(ContactUsDetailsDto dto);

    List<ContactUsDetailsDto> findAllService();
}
