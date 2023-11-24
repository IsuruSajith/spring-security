package com.example.securingweb.securitytest;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class KeyGeneratorExample {
    public static void main(String[] args) throws Exception {
        // Generate a random 256-bit (32-byte) secret key
        SecretKey secretKey = KeyGenerator.getInstance("HmacSHA256").generateKey();

        // Convert the secret key to a base64-encoded string
        String base64Key = Base64.getEncoder().encodeToString(secretKey.getEncoded());

        // Print the base64-encoded key
        System.out.println("Base64-encoded key: " + base64Key);
    }
}
