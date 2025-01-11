package com.news.Service;

import com.news.Dto.CustomFormDetailsDto;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

public interface CustomFormService {
    String saveCustomFormData(MultipartFile image,  String cato,
                               String tittle,  String desc);

    String updateCustomService(CustomFormDetailsDto id);
    List<CustomFormDetailsDto> getData();

    String delete(UUID id);
}
