package com.stoock.account.controller;

import com.stoock.account.dto.AccountDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    //일반 계좌
    @PostMapping("/createAccount")
    public String createAccount(@RequestBody AccountDTO dto) {
        String userId = dto.getUserId();
        String accountPW = dto.getAccountPW();
        String accountType = dto.getAccountType();
        String nickname = dto.getNickname();
        if( userId == null || accountPW == null || accountType == null) {
            return "입력 오류";
        }

        System.out.println(dto.getAccountNumber());
        return "Account created";
    }
    //투자 계좌

    //입금

    //송금

    //출금
}
