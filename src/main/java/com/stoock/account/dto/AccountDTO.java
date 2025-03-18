package com.stoock.account.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class AccountDTO {
    private String userId;                //유저아이디
    private String accountNumber;       //계좌번호
    private String accountPW;
    private String accountType;         // GENERAL(일반), INVESTMENT(투자)
    private BigDecimal balance;         // 잔액(소수점 포함 금액 저장)
    private String status;              // ACTIVE, CLOSED
    private String currency;            // KRW, USD (넣어야 할까...?)
    private String nickname;            // 계좌 별칭
    private LocalDateTime createdAt;    // 생성 날짜
    private LocalDateTime updatedAt;    // 업데이트 날짜
}
