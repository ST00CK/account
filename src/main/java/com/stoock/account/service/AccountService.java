package com.stoock.account.service;

import com.stoock.account.dto.AccountDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AccountService {

    private static final SecureRandom random = new SecureRandom();

    //계좌 생성 파라미터 확인(조건문 다시 해야함)
    public boolean checkCreateAccount(AccountDTO dto){
        String userId = dto.getUserId();
        String accountPW = dto.getAccountPW();
        String accountType = dto.getAccountType();
        return userId != null && accountPW != null && accountType != null && !accountType.equals("GENERAL") && !accountType.equals("INVESTMENT");
    }

    //계좌번호 생성 로직 (추가 구현 필요)
    //계좌유형 + 생성날짜 + 난수 4자리
    public String createAccountNumber(String accountType){
        String typeCode = accountType.equals("GENERAL") ? "100" : "200"; //100 ->일반계좌, 200 -> 투자계좌
        String dateCode = new SimpleDateFormat("yyyyMMdd").format(new Date()); // 20240317
        int randomCode = 1000 + random.nextInt(9000);
        
        //중복 계좌번호 체크 로직 구현 해야함

        return typeCode + "-" + dateCode + "-" + randomCode;
    }

    //계좌 생성
    public AccountDTO createAccount(AccountDTO dto){
        if(!checkCreateAccount(dto)){
            return null;
        }
        String userId = dto.getUserId();
        String accountPW = dto.getAccountPW();
        String accountType = dto.getAccountType();

        //계좌번호 생성
        dto.setAccountNumber(createAccountNumber(accountType));
        dto.setStatus("ACTIVE");
        dto.setBalance(BigDecimal.ZERO);

        System.out.println(dto);

        return null;
    }
}
