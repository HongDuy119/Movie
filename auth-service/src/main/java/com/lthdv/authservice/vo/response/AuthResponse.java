package com.lthdv.authservice.vo.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {
    private AccountResponse account;
    private String token;
}
