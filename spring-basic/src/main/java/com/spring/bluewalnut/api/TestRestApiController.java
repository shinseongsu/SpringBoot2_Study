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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "0. ALL", value = "전체 API")
@RestController
public class TestRestApiController {
	
	@ApiOperation(tags="1. Auth", value = "mid 조회", hidden = false, notes = "mid를 조회합니다.")
//	@ApiImplicitParams({
//		@ApiImplicitParam(name = "customerKey", value = "키", required = true, dataType = "string", paramType = "json", defaultValue = "")
//	})
	@ApiResponses(value= {
		@ApiResponse(code = 200, message = "success", response = MidResponseVO.class)	
	})
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
