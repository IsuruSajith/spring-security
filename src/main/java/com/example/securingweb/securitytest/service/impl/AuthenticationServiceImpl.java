package com.example.securingweb.securitytest.service.impl;

import com.example.securingweb.securitytest.dto.SignUpRequest;
import com.example.securingweb.securitytest.entity.Role;
import com.example.securingweb.securitytest.entity.User;
import com.example.securingweb.securitytest.repository.UserRepository;
import com.example.securingweb.securitytest.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
private final UserRepository userRepository;
private final PasswordEncoder passwordEncoder;
public User signUp(SignUpRequest signUpRequest) {
    User user = new User();

    user.setEmail(signUpRequest.getEmail());
    user.setFirstName(signUpRequest.getFirstName());
    user.setLastName(signUpRequest.getLastName());
    user.setRole(Role.USER);
    user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

    userRepository.save(user);
}
}
