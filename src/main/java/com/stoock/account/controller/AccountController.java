package com.stoock.account.controller;

import com.stoock.account.dto.AccountDTO;
import com.stoock.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    //일반 계좌
    @PostMapping("/createAccount")
    public AccountDTO createAccount(@RequestBody AccountDTO dto) {
        return accountService.createAccount(dto);
    }

    //투자 계좌
}
