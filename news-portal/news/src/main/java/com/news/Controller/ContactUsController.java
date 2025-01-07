package com.news.Controller;


import com.news.Dto.ContactUsDetailsDto;
import com.news.Service.ContactUsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contactUs")
public class ContactUsController {
    @Autowired
    ContactUsDetailsService contactUsDetailsService;

    @PostMapping("/save")
    public String saveContactDetails(@RequestBody ContactUsDetailsDto dto){
        return contactUsDetailsService.saveService(dto);
    }
}

