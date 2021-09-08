package com.spring.bluewalnut.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MidReqVO {
	
	@ApiModelProperty(value = "키", required = true)
	private String customerKey;
	
	@ApiModelProperty(value = "카드 번호", required = true)
	private String cardNumber;
	
	@ApiModelProperty(value = "카드 유효년도", required = true)
	private String cardExpirationYear;
	
	@ApiModelProperty(value = "카드 유효 달", required = true)
	private String cardExpirationMonth;
	
	@ApiModelProperty(value = "카드 비밀번호", required = true)
	private String cardPassword;
	
	@ApiModelProperty(value = "생년월일", required = true)
	private String customerBirthday;
	
	@ApiModelProperty(value = "이름", required = true)
	private String customerName;
	
	@ApiModelProperty(value = "이메일", required = false)
	private String customerEmail;
	
}
