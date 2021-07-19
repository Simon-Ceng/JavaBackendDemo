package com.manager.system.config.security;

public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    private String currentAuthority;

    public JwtAuthenticationResponse(String accessToken, String authority) {
        this.accessToken = accessToken;
        this.currentAuthority = authority;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    
    public String getCurrentAuthority() {
        return currentAuthority;
    }

    public void setCurrentAuthority(String authority) {
        this.currentAuthority = authority;
    }
}