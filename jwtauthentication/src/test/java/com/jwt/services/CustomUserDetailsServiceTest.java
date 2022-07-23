package com.jwt.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.jwt.model.CustomUserDetails;
import com.jwt.model.User;
import com.jwt.repository.UserRepository;

@SpringBootTest
public class CustomUserDetailsServiceTest {
	
	@MockBean
	private UserRepository userRepository;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	@Test
	public void loadByUsernameTest() {
		
		User user = new User(1L, "nachiketa", "nachiketa");
		Mockito.when(userRepository.findByUsername("nachiketa")).thenReturn(user);
		assertEquals("nachiketa", customUserDetailsService.loadUserByUsername("nachiketa").getUsername());
		
	}
	
	@Test
	public void loadByUsernameTestNull() {
		
		User user = new User(1L, "nachiketa", "nachiketa");
		Mockito.when(userRepository.findByUsername("nachiketa")).thenReturn(null);
		assertEquals("User not found", customUserDetailsService.loadUserByUsername("nachiketa"));
		
	}
	
}
