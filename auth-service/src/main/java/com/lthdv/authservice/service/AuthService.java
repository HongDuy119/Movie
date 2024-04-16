package com.lthdv.authservice.service;

import com.lthdv.authservice.mapper.AccountMapper;
import com.lthdv.authservice.model.Account;
import com.lthdv.authservice.repository.AccountRepository;
import com.lthdv.authservice.vo.Customer;
import com.lthdv.authservice.vo.request.RegisterRequest;
import com.lthdv.authservice.vo.response.AccountResponse;
import com.lthdv.authservice.vo.response.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final RestTemplate customerServiceRestTemplate;
    private final AccountMapper accountMapper;

    public AuthResponse login(String username) {
        Optional<Account> accountOptional = accountRepository.findByUsername(username);
        return accountOptional.map(account -> AuthResponse.builder()
                .account(accountMapper.accountToAccountResponse(account))
                .token(jwtService.generateToken(account))
                .build()).orElse(null);
    }

    public AccountResponse saveAccount(RegisterRequest request) {
        Account account = request.getAccount();
        account.setPassword(passwordEncoder.encode(account.getPassword()));

//        Customer savedCustomer = saveCustomer(request.getCustomer());
//        account.setCustomerId(savedCustomer.getId());

        Account savedAccount = accountRepository.save(account);
        return accountMapper.accountToAccountResponse(savedAccount);
    }

    private Customer saveCustomer(Customer customer) {
        return customerServiceRestTemplate
                .postForEntity("/customer/create", customer, Customer.class)
                .getBody();
    }
}
