package com.Authenticat.dto;


public record AuthResponse(
        String accessToken,
        String refreshToken,
        long expiresInSeconds
) {}