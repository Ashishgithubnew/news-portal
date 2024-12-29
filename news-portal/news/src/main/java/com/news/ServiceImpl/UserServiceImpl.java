//package com.news.ServiceImpl;
//
//
//import com.google.gson.Gson;
//import com.news.Dto.UsersDto;
//import com.news.Entity.User;
//import com.news.Repo.UsersRepo;
//import com.news.Security.JWTService;
//import com.news.Security.UserDeatilsServices;
//import com.news.Service.UserService;
//import org.apache.coyote.BadRequestException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.security.SecureRandom;
//import java.time.LocalDateTime;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    private BCryptPasswordEncoder encoder  = new BCryptPasswordEncoder(11);
//
//    // Character pool for the password
//    private static final String CHARACTERS =
//            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
//                    "abcdefghijklmnopqrstuvwxyz" +
//                    "0123456789" +
//                    "!@#$%^&*()-_+=<>?";
//
//    private static final SecureRandom RANDOM = new SecureRandom();
//
//
//    @Autowired
//    AuthenticationManager authManager;
//
//    @Autowired
//    JWTService jwtService ;
//    @Autowired
//    private UserDeatilsServices userDeatilsServices;
//
////    @Autowired
////    private  MailService mailService;
////
////    @Autowired
////    DatabaseService databaseService;
//
//    @Autowired
//    Gson gson;
//
//    @Autowired
//    UsersRepo usersRepo;
//
//    @Override
//    public String registerUser(UsersDto userDto) {
//        User users = new User();
//        users.setEmail(userDto.getEmail().toLowerCase());
//        users.setSchoolCode(userDto.getEmail().substring(1,4).toUpperCase()+RANDOM.nextInt(9999));
//        users.setPassword(encoder.encode(userDto.getPassword()));
//        users.setPermission(userDto.getPermission());
//        usersRepo.save(users);
//        return "Register Successfully !";
//    }
//
//    @Override
//    public String loginUser(UsersDto dto) throws BadRequestException {
//        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getEmail().toLowerCase(), dto.getPassword()));
//        System.out.println(authentication.getAuthorities().toString());
//        return jwtService.generateToken(dto.getEmail().toLowerCase() , String.valueOf(authentication.getAuthorities().stream().toList().get(0)), dto.getSchoolCode());
//
//    }
//
//    @Override
//    public String forgetUserPassword(UsersDto userDto) {
//
//        User users = usersRepo.findUsersByEmail(userDto.getEmail());
//        String newPassword = generatePassword();
//        users.setPassword(encoder.encode(newPassword));
//        usersRepo.save(users);
////      usersRepo.save(users);
////      mailService.newPasswordMail(users.getEmail() , "New Password " , newPassword , " ... ");
//        return "New Password sent to your email";
//    }
//
//
//
//    public static String generatePassword() {
//        StringBuilder password = new StringBuilder(10); // Fixed length: 10
//
//        // Generate 10 random characters from the pool
//        for (int i = 0; i < 10; i++) {
//            password.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
//        }
//
//        return password.toString();
//    }
//
//}
//
