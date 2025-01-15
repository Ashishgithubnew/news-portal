package com.news.Controller;


import com.news.Dto.ContactUsDetailsDto;
import com.news.Service.ContactUsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactUs")
public class ContactUsController {
    @Autowired
    ContactUsDetailsService contactUsDetailsService;

    @PostMapping("/save")
    public String saveContactDetails(@RequestBody ContactUsDetailsDto dto){
        return contactUsDetailsService.saveService(dto);
    }

    @GetMapping("/findAll")
    public List<ContactUsDetailsDto> findAll(){
        return contactUsDetailsService.findAllService();
    }
}

