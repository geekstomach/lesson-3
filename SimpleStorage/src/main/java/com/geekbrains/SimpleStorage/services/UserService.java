package com.geekbrains.SimpleStorage.services;


import com.geekbrains.SimpleStorage.entities.SystemUser;
import com.geekbrains.SimpleStorage.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String username);
    boolean save(SystemUser systemUser);
}
