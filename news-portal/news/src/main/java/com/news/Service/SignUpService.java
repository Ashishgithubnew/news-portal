package com.news.Service;

import com.news.Dto.SignUpDto;

public interface SignUpService {
    String signUp(SignUpDto dto);

    String login(String email, String password);
}
