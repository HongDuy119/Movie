package com.lthdv.authservice.vo.request;

import com.lthdv.authservice.model.Account;
import com.lthdv.authservice.vo.Customer;
import lombok.Data;

@Data
public class RegisterRequest {

    private Account account;

    private Customer customer;

}
