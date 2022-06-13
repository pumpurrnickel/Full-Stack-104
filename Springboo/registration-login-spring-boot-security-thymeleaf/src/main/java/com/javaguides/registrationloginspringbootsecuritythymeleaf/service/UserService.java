package com.javaguides.registrationloginspringbootsecuritythymeleaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.javaguides.registrationloginspringbootsecuritythymeleaf.model.User;
import com.javaguides.registrationloginspringbootsecuritythymeleaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}