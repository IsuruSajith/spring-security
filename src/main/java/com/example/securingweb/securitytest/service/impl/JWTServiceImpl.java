package com.example.securingweb.securitytest.service.impl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

@Service
public class JWTServiceImpl {

    private String generateToken(UserDetails userDetails) {
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
                .signWith(getSignKey(), SignatureAlgorithm.ES256)
                .compact();
    }

    private Key getSignKey() {
        byte[] key = Decoders.BASE64.decode("01q2U9WANskJw2LVozjjbi7Bb+DKHbdeciWLELQ1IhA=");
        return Keys.hmacShaKeyFor(key);
    }
}
