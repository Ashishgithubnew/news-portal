package com.news.ServiceImpl;

import com.news.Dto.CustomFormDetailsDto;
import com.news.Entity.BaseEntity;
import com.news.Entity.CustomFormEntity;
import com.news.Repo.CustomFormRepo;
import com.news.Service.CustomFormService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
public class CustomFormServiceImpl implements CustomFormService {

    @Autowired
    CustomFormRepo customFormRepo;


    @Override
    public String saveCustomFormData(MultipartFile image,  String cato,
                                     String tittle,  String desc) {

        CustomFormEntity customFormEntity = new CustomFormEntity();
        customFormEntity.setCato(cato);
        customFormEntity.setTittle(tittle);
        customFormEntity.setDesc(desc);

        try {
            customFormEntity.setImage(image.getBytes());
        } catch (IOException e) {
            return "Failed to save image: " + e.getMessage();
        }
        customFormRepo.save(customFormEntity);

        return "Saved successfully";
    }

    @Override
    @Transactional
    public String updateCustomService(CustomFormDetailsDto id) {
        CustomFormEntity saveCustomNew = customFormRepo.getById(id.getId());
        updateCustomService(saveCustomNew, id);
        customFormRepo.save(saveCustomNew);
        return "saved successfully";
    }

    void updateCustomService(CustomFormEntity customFormEntity , CustomFormDetailsDto details){
        customFormEntity.setTittle(details.getTittle());
        customFormEntity.setDesc(details.getDesc());
        customFormEntity.setCato(details.getCato());

    }
}
