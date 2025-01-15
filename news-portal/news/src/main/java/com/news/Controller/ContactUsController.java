package com.news.Controller;


import com.news.Dto.ContactUsDetailsDto;
import com.news.Service.ContactUsDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    public List<ContactUsDetailsDto> findAll(@RequestParam(required = false) String isRead){
        return contactUsDetailsService.findAllService(isRead);
    }

    @PostMapping("/edit")
    public String editContactUs(@RequestParam UUID id , @RequestParam Boolean isRead){
        return contactUsDetailsService.editContactUs(id,isRead);

    }

    @PostMapping("/delete")
    public String deleteContactUs(@RequestParam UUID id){
        return contactUsDetailsService.deleteContactUs(id);
    }
}

