package com.spring.bluewalnut.api;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bluewalnut.vo.MidReqVO;
import com.spring.bluewalnut.vo.MidResponseVO;

import io.swagger.annotations.ApiOperation;

@RestController
public class TestRestApiController {
	
	@ApiOperation(value = "mid 조회", hidden = false, notes = "mid를 조회합니다.")
	@RequestMapping(value = "/api/payment", method = RequestMethod.POST)
	public ResponseEntity<?> payment(@RequestBody MidReqVO request) {
		
		MidResponseVO result = MidResponseVO.builder()
				.authenticatedAt("11111")
				.billingKey("11111111")
				.cardCompany("현대카드")
				.cardNumber("123141231231")
				.customerKey("nbioeghwpagno1131")
				.method("카드")
				.mId("fniongowgelf")
				.build();
		
		HttpHeaders header = new HttpHeaders();
		
		return new ResponseEntity<>(result, header, HttpStatus.OK);
	}
	
}
