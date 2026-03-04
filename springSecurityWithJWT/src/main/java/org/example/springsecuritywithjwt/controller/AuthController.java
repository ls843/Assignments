package org.example.springsecuritywithjwt.controller;

import org.example.springsecuritywithjwt.dto.AuthRequest;
import org.example.springsecuritywithjwt.security.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest request) {

        if ("admin".equals(request.getUsername()) &&
                "admin123".equals(request.getPassword())) {

            return jwtUtil.generateToken(request.getUsername());
        }

        throw new RuntimeException("Invalid credentials");
    }
}