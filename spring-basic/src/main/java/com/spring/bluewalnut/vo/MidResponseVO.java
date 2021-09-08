package com.spring.bluewalnut.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MidResponseVO {
	
	private String mId;
	private String customerKey;
	private String authenticatedAt;
	private String method;
	private String billingKey;
	private String cardCompany;
	private String cardNumber;

}
