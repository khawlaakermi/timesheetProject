package com.bri.payload.response;

import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private int id;
    private String login;
    private String email;
    private String password;
    private List<String> roles;

    public JwtResponse(String accessToken, int id, String login, String email, String password) {
        this.token = accessToken;
        this.id = id;
        this.login = login;
        this.email = email;
        this.password=password;

    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String username) {
        this.login = login;
    }

    public List<String> getRoles() {
        return roles;
    }
}
