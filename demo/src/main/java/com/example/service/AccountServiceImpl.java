package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public String createAccount(String phoneNumber) {
        return "Account created";
    }
}