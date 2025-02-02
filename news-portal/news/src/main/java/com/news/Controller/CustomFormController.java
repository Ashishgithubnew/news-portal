package com.news.Controller;

import com.news.Dto.CustomFormDetailsDto;
import com.news.Service.CustomFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/custom")
public class CustomFormController {

    @Autowired
    CustomFormService customFormService;

    @PostMapping("/save")
    public String saveCustomNews(@RequestParam(required = false)  MultipartFile image, @RequestParam String cato,
                                 @RequestParam String tittle, @RequestParam String desc){
        return customFormService.saveCustomFormData(image, cato, tittle, desc);
    }

    @PostMapping("/edit")
    public String updateCustomNews(@RequestBody CustomFormDetailsDto id){
        return customFormService.updateCustomService(id); //@RequestParam("image") MultipartFile image
    }

    @GetMapping("/getNews")
    public List<CustomFormDetailsDto> getNews(){
        return customFormService.getData();

    }
    @PostMapping("/delete")
    public String delete(@RequestParam UUID id){
        return customFormService.delete(id);
    }
}
