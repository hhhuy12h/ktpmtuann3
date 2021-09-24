package com.example.huy1.service;

import com.example.huy1.authen.UserPrincipal;
import com.example.huy1.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
