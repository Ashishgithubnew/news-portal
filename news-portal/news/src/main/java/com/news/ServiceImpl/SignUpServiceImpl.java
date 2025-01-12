package com.news.ServiceImpl;

import com.news.Dto.SignUpDto;
import com.news.Entity.UserEntity;
import com.news.Repo.UserRepo;
import com.news.Security.BadRequestException;
import com.news.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class SignUpServiceImpl implements SignUpService { 
   
    @Autowired
    UserRepo infoRepo;
    
    @Override
    public String signUp(SignUpDto dto) {
        UserEntity savedData = infoRepo.findByEmail(dto.getEmail());

        if (ObjectUtils.isEmpty(savedData)){
            UserEntity userEntity = new UserEntity();
            extracted(dto, userEntity);

            infoRepo.save(userEntity);
            return "Save successfully";
        }else {
            return "Email already present";
        }
    }

    @Override
    public String login(String email, String password) {
        UserEntity savedData =  infoRepo.getLoginCheck(email,password);
        if (ObjectUtils.isEmpty(savedData)){
            throw new BadRequestException("no user found");
        } else {
            return "login successfully";
        }
    }

    private  void extracted(SignUpDto dto, UserEntity userEntity) {
        userEntity.setName(dto.getName());
        userEntity.setCity(dto.getCity());
        userEntity.setAge(dto.getAge());
        userEntity.setGender(dto.getGender());
        userEntity.setEmail(dto.getEmail());
        userEntity.setPassword(dto.getPassword());
        userEntity.setPhoneNo(dto.getPhoneNo());
    }
}
