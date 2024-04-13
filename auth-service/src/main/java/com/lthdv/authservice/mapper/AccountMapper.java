package com.lthdv.authservice.mapper;

import com.lthdv.authservice.model.Account;
import com.lthdv.authservice.vo.response.AccountResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountResponse accountToAccountResponse(Account account);
}
