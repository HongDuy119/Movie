package com.lthdv.authservice.vo;

import lombok.Data;

@Data
public class Customer {
    private Long id;

    private String name;

    private String phoneNumber;

    private String email;
}
