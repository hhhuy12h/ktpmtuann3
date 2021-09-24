package com.example.huy1.service;


import com.example.huy1.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
