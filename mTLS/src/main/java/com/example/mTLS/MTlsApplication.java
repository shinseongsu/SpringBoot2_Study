package com.example.mTLS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MTlsApplication {

	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1.3");
//		System.setProperty("javax.net.debug", "all");

		SpringApplication.run(MTlsApplication.class, args);
	}

}
