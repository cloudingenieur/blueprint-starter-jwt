package com.cloudingenieur.blueprint.service;

import com.cloudingenieur.blueprint.entities.RefreshToken;
import com.cloudingenieur.blueprint.payload.response.RefreshTokenResponse;
import com.cloudingenieur.blueprint.payload.request.RefreshTokenRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseCookie;

import java.util.Optional;

public interface RefreshTokenService {

    RefreshToken createRefreshToken(Long userId);
    RefreshToken verifyExpiration(RefreshToken token);
    Optional<RefreshToken> findByToken(String token);
    RefreshTokenResponse generateNewToken(RefreshTokenRequest request);
    ResponseCookie generateRefreshTokenCookie(String token);
    String getRefreshTokenFromCookies(HttpServletRequest request);
    void deleteByToken(String token);
    ResponseCookie getCleanRefreshTokenCookie();
}
