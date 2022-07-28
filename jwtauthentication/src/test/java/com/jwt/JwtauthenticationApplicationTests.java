package com.jwt;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jwt.controller.JwtController;
import com.jwt.services.CustomUserDetailsService;
import com.jwt.services.UserServices;

@SpringBootTest
class JwtauthenticationApplicationTests {

	@Autowired
	private JwtController jwtController;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsServcie;
	
	@Autowired
	private UserServices userServices;
	@Test
	void contextLoads() {
		assertThat(jwtController).isNotNull();
		assertThat(customUserDetailsServcie).isNotNull();
		assertThat(userServices).isNotNull();
		
	}

}
