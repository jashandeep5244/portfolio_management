package com.jwt.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

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
		
		Mockito.when(userRepository.findByUsername("nachiketa")).thenReturn(null);
		
		Exception exception = assertThrows(UsernameNotFoundException.class, () -> {
			 customUserDetailsService.loadUserByUsername("nachiketa");
	    });
		
		assertTrue(exception.getMessage().contains("User not found"));
		
	}
	
	@Test
	public void loadByUsernameTestFail() {
		User user = new User(1L, "nachiketa", "nachiketa");
		Mockito.when(userRepository.findByUsername("jashan")).thenReturn(user);
		assertFalse("jashan" == customUserDetailsService.loadUserByUsername("jashan").getUsername());
	}
	
}
