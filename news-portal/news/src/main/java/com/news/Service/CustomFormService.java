package com.news.Service;

import com.news.Dto.CustomFormDetailsDto;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface CustomFormService {
    String saveCustomFormData(MultipartFile image,  String cato,
                               String tittle,  String desc);

    String updateCustomService(CustomFormDetailsDto id);
}
