package com.example.huy1.service;

import com.example.huy1.entity.Token;
import com.example.huy1.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;
    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
