package com.ce.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author c__e
 * @date 2020/12/5 22:31
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken() {
    }

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
