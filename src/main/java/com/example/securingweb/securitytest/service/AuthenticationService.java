package com.example.securingweb.securitytest.service;

import com.example.securingweb.securitytest.dto.SignUpRequest;
import com.example.securingweb.securitytest.entity.User;

public interface AuthenticationService {
    User signUp(SignUpRequest signUpRequest);
}
