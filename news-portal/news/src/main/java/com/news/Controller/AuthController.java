package com.news.Controller;

import com.news.Dto.SignUpDto;
import com.news.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    SignUpService signUpService;

    @PostMapping("/signup")
    public String signUp(@RequestBody SignUpDto dto){
        return signUpService.signUp(dto);

    }

    @PostMapping("/login")
    public String login(@RequestParam String email , @RequestParam String password){
        return signUpService.login(email,password);
    }

}
