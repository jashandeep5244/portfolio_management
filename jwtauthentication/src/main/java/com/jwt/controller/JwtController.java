package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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

@RestController
@CrossOrigin(origins = "*")
public class JwtController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	private UserServices userServices;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@RequestMapping("/getusers")
	public String getUser() {
		return "{\"name\":\"Nachiketa\"}";
	}
	
	@RequestMapping("/getuname")
	public String hello() {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication()
                .getPrincipal();
		String username = userDetails.getUsername();
		return username;
	}
	
	@RequestMapping("/getid")
	public Long getUserId(@RequestHeader("Authorization") String authorization) {
		String token = authorization.substring(7);
		String uname = jwtUtil.extractUsername(token);
		return userServices.findUserId(uname);

	}


	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		

		UserDetails userDetails = customUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
		
		String token ="";
		
		if(userDetails.getPassword().equals(authenticationRequest.getPassword())) {
			 token = jwtUtil.generateToken(userDetails);
			 return ResponseEntity.ok(new JwtResponse(token));
			
		}
		else {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}	

		
	}
	
	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}  catch (Exception e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}
