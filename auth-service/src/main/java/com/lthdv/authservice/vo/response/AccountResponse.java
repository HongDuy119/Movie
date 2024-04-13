package com.lthdv.authservice.vo.response;

import com.lthdv.authservice.vo.enums.Role;
import lombok.Data;

@Data
public class AccountResponse {

    private Long id;

    private String username;

    private Role role;

    private Long customerId;

}
