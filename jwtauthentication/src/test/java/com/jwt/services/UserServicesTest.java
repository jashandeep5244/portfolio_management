package com.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.jwt.model.User;
import com.jwt.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


@SpringBootTest
public class UserServicesTest {
	
	@MockBean
	private UserRepository userRepository;
	
	@Autowired
	private UserServices userServices;
	
	@Test
	public void findUserIdTestPass() {
		
		User user = new  User(1L,"nachiketa","nachiketa");
		Mockito.when(userRepository.findByUsername(user.getUsername())).thenReturn(user);
		assertEquals(1, userServices.findUserId(user.getUsername()));
	}
	
	@Test
	public void findUserIdTestFail() {
		
		User user = new  User(5L,"nachiketa","nachiketa");
		Mockito.when(userRepository.findByUsername(user.getUsername())).thenReturn(user);
		assertEquals(1, userServices.findUserId(user.getUsername()));
	}

}
