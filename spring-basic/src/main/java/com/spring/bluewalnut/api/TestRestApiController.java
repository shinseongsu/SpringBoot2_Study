package com.spring.bluewalnut.api;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestRestApiController {
	
	@ResponseBody
	@RequestMapping(value = "/api/payment", method = RequestMethod.POST)
	public ResponseEntity<?> payment() {
		
		HttpHeaders header = new HttpHeaders();
		
		return new ResponseEntity<>("100", header, HttpStatus.OK);
	}
	
}
