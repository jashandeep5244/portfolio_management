package com.jwt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.JwtRequest;
import com.jwt.model.JwtResponse;
import com.jwt.services.CustomUserDetailsService;
import com.jwt.services.UserServices;
import com.jwt.util.JwtUtil;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class JwtController {


	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Autowired
	private UserServices userServices;

	@Autowired
	private JwtUtil jwtUtil;
	
	Logger logger = LoggerFactory.getLogger(JwtController.class);

	@RequestMapping("/getusers")
	public String getUser() {
		logger.info("Getting Users");
		return "[{\"name\":\"Nachiketa\"},{\"name\":\"Jashandeep\"},{\"name\":\"Madhurima\"},{\"name\":\"Abhinav\"}]";
	}

	@RequestMapping("/getuname")
	public String hello() {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = userDetails.getUsername();
		logger.info("Returning username:" + username );
		return username;
	}

	@RequestMapping("/getid")
	public Long getUserId(@RequestHeader("Authorization") String authorization) {
		String token = authorization.substring(7);
		String uname = jwtUtil.extractUsername(token);
		logger.info("Returning userid");
		return userServices.findUserId(uname);

	}

	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		UserDetails userDetails = customUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());

		String token = "";

		if (userDetails.getPassword().equals(authenticationRequest.getPassword())) {
			token = jwtUtil.generateToken(userDetails);
			logger.info("Returning Token" + token);
			return ResponseEntity.ok(new JwtResponse(token));

		} else {
			logger.info("Forbidden Access");
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}

	}
}
