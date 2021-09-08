package com.spring.bluewalnut.vo;

import lombok.Data;

@Data
public class MidReqVO {
	
	private String customerKey;
	private String cardNumber;
	private String cardExpirationYear;
	private String cardExpirationMonth;
	private String cardPassword;
	private String customerBirthday;
	private String customerName;
	private String customerEmail;
	
}
